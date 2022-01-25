package com.more.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.more.admin.model.*;
import com.more.bbs.model.BbsDTO;
import com.more.bbs.model.BbsService;
import com.more.bbs_re.model.Bbs_ReDTO;
import com.more.bbs_re.model.Bbs_ReService;
import com.more.center.model.CenterDTO;
import com.more.center.model.CenterService;
import com.more.document.model.DocumentDTO;
import com.more.expert.model.ExpertDTO;
import com.more.member.model.MemberDTO;
import com.more.payhistory.model.PayhistoryDTO;
import com.more.review.model.ReviewDTO;
import com.more.review.model.ReviewService;
import com.more.suggest.model.SuggestDTO;

import java.util.*;

@Controller
public class AdminController {

   @Autowired
   private AdminService adminService;
   
   @Autowired
   private BbsService bbsService;

   @Autowired
   private Bbs_ReService bbs_reService;
   
   @Autowired
   private ReviewService reviewService;
   
   @Autowired
   private CenterService centerService;

   // 관리자 로그인 페이지 이동
   @RequestMapping("/adminLogin.do")
   public String adminLogin() {
      return "admin/adminLogin";
   }

   // 대시보드 진입 - 로그인후 메인 페이지
   @RequestMapping("/adminDashboard.do")
   public String adminDashboard() {
      return "admin/adminDashboard";
   }

   // 관리자 로그인
   @RequestMapping(value = "/adminLoginAction.do", method = RequestMethod.POST)
   public ModelAndView adminLoginAction(@RequestParam("id") String id, @RequestParam("pwd") String pwd,
         HttpSession session) {
      ModelAndView mav = new ModelAndView("msg");
      boolean result = adminService.adminLogin(id, pwd);
      if (result == true) {
         session.setAttribute("sessionId", id);
         session.setAttribute("sessionStatus", adminService.sessionAdminStatus(id));
      }
      String msg = result == true ? "관리자 로그인" : "관리자 로그인 실패";
      String url = result == true ? "adminDashboard.do" : "adminLogin.do";
      mav.addObject("msg", msg);
      mav.addObject("url", url);
      return mav;
   }

   // 관리자 로그아웃
   @RequestMapping("/adminLogout.do")
   public ModelAndView logout(HttpServletRequest request) {
      HttpSession session = request.getSession();
      session.invalidate();
      ModelAndView mav = new ModelAndView("msg");
      mav.addObject("msg", "로그아웃");
      mav.addObject("url", "adminLogin.do");
      return mav;
   }

   // 매니저관리진입(마스터권한)
   @RequestMapping("/adminManager.do")
   public ModelAndView adminManager() {
      List<AdminDTO> list = adminService.listManager();
      ModelAndView mav = new ModelAndView();
      mav.addObject("list", list);
      mav.setViewName("admin/adminManager");
      return mav;
   }

   // 매니저 추가
   @RequestMapping(value = "/addManager.do", method = RequestMethod.POST)
   public ModelAndView addManager(AdminDTO dto) {
      ModelAndView mav = new ModelAndView();
      int result = adminService.addManager(dto);
      String msg = "";
      if (result > 0) {
         msg = "매니저 계정 생성 성공";
      } else {
         msg = "매니저 계정 생성 실패";
      }
      mav.addObject("msg", msg);
      mav.addObject("url", "adminManager.do");
      mav.setViewName("msg");
      return mav;
   }

   // 매니저 삭제
   @RequestMapping("/delManager.do")
   public ModelAndView delManager(@RequestParam("id") String id) {
      ModelAndView mav = new ModelAndView("msg");
      int result = adminService.delManager(id);
      String msg = result > 0 ? id+"님이 탈퇴처리 되었습니다.":"회원탈퇴 처리를 실패했습니다.";
      mav.addObject("msg", msg);
      mav.addObject("url", "adminManager.do");
      return mav;
   }

   // 관리자 내 정보 수정 진입
   @RequestMapping("/updateAdminInfoForm.do")
   public ModelAndView updateAdminInfoForm(String id, HttpSession session) {
      id = (String) session.getAttribute("sessionId");
      List<AdminDTO> list = adminService.showAdminInfo(id);
      ModelAndView mav = new ModelAndView();
      mav.addObject("list", list);
      mav.setViewName("admin/updateAdminInfo");
      return mav;
   }

   // 관리자 내 정보 수정 진입
   @RequestMapping(value = "/updateAdminInfo.do", method = RequestMethod.POST)
   public ModelAndView updateAdminInfoSubmit(AdminDTO dto) {
      ModelAndView mav = new ModelAndView("msg");
      int result = adminService.updateAdminInfo(dto);
      String msg = result > 0 ? "수정되었습니다" : "수정실패";
      mav.addObject("msg", msg);
      mav.addObject("url", "updateAdminInfoForm.do");
      return mav;
   }   

   // 관리자 유저관리 의뢰인 삭제
   @RequestMapping("/delClient.do")
   public ModelAndView delClient(@RequestParam("id") String id) {
      int result = adminService.delClient(id);
      ModelAndView mav = new ModelAndView("msg");
      String msg = result > 0 ? "회원 삭제 완료" : "회원 삭제 실패";
      mav.addObject("msg", msg);
      mav.addObject("url", "manageClient.do");
      return mav;
   }
   
// 관리자 수익관리 진입 - 결제완료, 환불요청, 환불완료 테이블
   @RequestMapping("/adminRevenue.do")
   public ModelAndView adminRevenueHome(@RequestParam(value = "cp", defaultValue = "1") int cp,
         @RequestParam(value = "cpr", defaultValue = "1") int cpr, @RequestParam(value = "cprd", defaultValue = "1") int cprd) {
      int listSize = 10;
      int PageSize = 5;

      //결제완료테이블
      int totalCntP = adminService.getPaymentCompleteTotalCnt();
      String pageStrP = com.more.paging.PageModule.makePage("adminRevenue.do", totalCntP, listSize, PageSize, cp);
      List<PayhistoryDTO> listPayComplete = adminService.listPayComplete(cp, listSize);
      int getSumPaymentCompleteCost = adminService.getSumPaymentCompleteCost();
      
      //환불요청테이블
      int totalCntR = adminService.getRequestRefundTotalCnt();
      String pageStrR = com.more.paging.RequestRefundPageModule.makePageR("adminRevenue.do", totalCntR, listSize, PageSize, cpr);
      List<PayhistoryDTO> listRequestRefund = adminService.listRequestRefund(cpr, listSize);
      int getSumRequestRefundCost = adminService.getSumRequestRefundCost();
      
      //환불완료테이블
      int totalCntRd = adminService.getRefundDoneTotalCnt();
      String pageStrRd = com.more.paging.RefundDonePageModule.makePageRd("adminRevenue.do", totalCntRd, listSize, PageSize, cprd);
      List<PayhistoryDTO> listRefundDone = adminService.listRefundDone(cprd, listSize);
      int getSumRefundDoneCost = adminService.getSumRefundDoneCost();
      
      //mav
      ModelAndView mav = new ModelAndView();

      mav.addObject("listPayComplete", listPayComplete);
      mav.addObject("pageStrP", pageStrP);
      mav.addObject("getSumPaymentCompleteCost", getSumPaymentCompleteCost);

      mav.addObject("listRequestRefund", listRequestRefund);
      mav.addObject("pageStrR", pageStrR);
      mav.addObject("getSumRequestRefundCost", getSumRequestRefundCost);
      
      mav.addObject("listRefundDone", listRefundDone);
      mav.addObject("pageStrRd", pageStrRd);
      mav.addObject("getSumRefundDoneCost", getSumRefundDoneCost);
      
      mav.setViewName("admin/adminRevenue");
      return mav;
   }
   
	/*
	 * // 환불완료 버튼
	 * 
	 * @RequestMapping("/refundDone.do") public ModelAndView
	 * refundDone(@RequestParam("p_idx") int p_idx) { int result =
	 * adminService.refundDone(p_idx); String msg = result > 0 ? "환불 완료 처리되었습니다." :
	 * "에러발생"; ModelAndView mav = new ModelAndView("msg"); mav.addObject("msg",
	 * msg); mav.addObject("url", "adminRevenue.do"); return mav; }
	 */
   //환불완료 버튼
   @RequestMapping("/refundDone.do")
   public ModelAndView refundDone(@RequestParam("p_idx") int p_idx, @RequestParam("d_idx") int d_idx) {
      int result = adminService.refundDone(p_idx);
      int result2 = adminService.refundDoneDoc(d_idx);
      String msg = "";
      if((result>0) && (result2>0)) {
          msg = "환불 완료 처리되었습니다.";
      }else {
          msg = "에러발생";
      }
      ModelAndView mav = new ModelAndView("msg");
      mav.addObject("msg", msg);
      mav.addObject("url", "adminRevenue.do");
      return mav;
   }
   
   
   /**------------------------------------------------------------------------------------
   --------------------------------------------------------------------------------------*/
   // 관리자 유저관리 의뢰인 리스트 출력 - 유저관리 의뢰인 진입점
   @RequestMapping("/manageClient.do")
   public ModelAndView manageClient(@RequestParam(value = "cp", defaultValue = "1") int cp,
         @RequestParam(value = "keyWord", defaultValue = "") String keyWord) {
      
     String pageStr;
      int listSize = 10;
      int pageSize = 5;
      int totalCnt = adminService.getClientTotalCnt();
      int SearchTotalCnt = adminService.getClientSearchTotalCnt(keyWord);
      
      if (keyWord == "") {
         pageStr = com.more.paging.BbsPageModule.makePage("manageClient.do", totalCnt, listSize, pageSize, cp, keyWord);
      } else {
         pageStr = com.more.paging.BbsPageModule.makePage("manageClient.do", SearchTotalCnt, listSize, pageSize, cp, keyWord);
      }
      
      ModelAndView mav = new ModelAndView();
      if(keyWord == "") {
         List<MemberDTO> list = adminService.listClient(cp, listSize);
         mav.addObject("list", list);
         mav.addObject("pageStr", pageStr);
         mav.setViewName("admin/adminMemberClient");
      }else {
         List<MemberDTO> list = adminService.listSearchClient(cp, listSize, keyWord);
         mav.addObject("list", list);
         mav.addObject("pageStr", pageStr);
         mav.setViewName("admin/adminMemberClient");
         
      }
      
      return mav;
   }
   
   // 게시판 관리 게시글 리스트
   @RequestMapping("/adminBbsList.do")
   public ModelAndView adminBbsList(@RequestParam(value = "cp", defaultValue = "1") int cp,
         @RequestParam(value = "keyWord", defaultValue = "") String keyWord) {
      String pageStr;
      int listSize = 10;
      int pageSize = 5;
      int totalCnt = bbsService.bbstotalCnt();
      int SearchTotalCnt = bbsService.bbsSearchTotalCnt(keyWord);

      List<BbsDTO> list = bbsService.bbsList(cp, listSize, keyWord);

      int reCount[] = new int[5];
      for (int i = 0; i < list.size(); i++) {
         reCount[i] = bbs_reService.bbs_reCount(list.get(i).getB_idx());
      }

      if (keyWord == "") {
         pageStr = com.more.paging.BbsPageModule.makePage("bbsList.do", totalCnt, listSize, pageSize, cp, keyWord);
      } else {
         pageStr = com.more.paging.BbsPageModule.makePage("bbsList.do", SearchTotalCnt, listSize, pageSize, cp,
               keyWord);
      }
      ModelAndView mav = new ModelAndView();
      mav.addObject("keyWord", keyWord);
      mav.addObject("list", list);
      mav.addObject("reCount", reCount);
      mav.addObject("pageStr", pageStr);
      mav.setViewName("admin/adminBbsList");

      return mav;
   }
   
   // 게시판 관리 본문
   @RequestMapping("/adminBbsContent.do")
   public ModelAndView bbsContent(@RequestParam(value = "cp", defaultValue = "1") int cp,
         @RequestParam(value = "b_idx") int b_idx) {

      String pageStr;
      int listSize = 5;
      int pageSize = 5;
      int bbs_retotalCnt = bbs_reService.bbs_reTotalCnt(b_idx);

      pageStr = com.more.paging.BbsPageModule.makePage2("bbsContent.do?b_idx=" + b_idx, bbs_retotalCnt, listSize,
            pageSize, cp);

      List<Bbs_ReDTO> list = bbs_reService.bbs_reList(cp, listSize, b_idx);
      List<Bbs_ReDTO> list2 = bbs_reService.bbs_rereList(b_idx);

      int rereCount[] = new int[5];
      for (int i = 0; i < list.size(); i++) {
         rereCount[i] = bbs_reService.bbs_rereCount(list.get(i).getRef());
      }

      BbsDTO dto = bbsService.bbsContent(b_idx);
      int reCount = bbs_reService.bbs_reCount(b_idx);

      ModelAndView mav = new ModelAndView();
      mav.addObject("dto", dto);
      mav.addObject("list", list);
      mav.addObject("list2", list2);
      mav.addObject("reCount", reCount);
      mav.addObject("rereCount", rereCount);
      mav.addObject("pageStr", pageStr);
      mav.addObject("cp", cp);
      mav.setViewName("admin/adminBbsContent");
      return mav;
   }
   
   // 게시판 관리 게시글 삭제
   @RequestMapping("/adminBbsDel.do")
   public ModelAndView adminBbsDel(@RequestParam("b_idx") int b_idx) {
      int result = bbsService.bbsDel(b_idx);

      String msg = result > 0 ? "게시글이 삭제 되었습니다." : "게시글 삭제를 실패했습니다.";
      String url = "adminBbsList.do";

      ModelAndView mav = new ModelAndView();
      mav.addObject("msg", msg);
      mav.addObject("url", url);
      mav.setViewName("msg");

      return mav;
   }
   
   // 게시판 관리 댓글삭제
   @RequestMapping("/adminBbs_reDel.do")
   public ModelAndView adminBbs_reDel(@RequestParam(value = "ref", defaultValue = "0")int ref,
         @RequestParam("re_idx") int re_idx, @RequestParam("b_idx") int b_idx) {
      int result=0;
      
      if(ref==0) {
         result = bbs_reService.rere_delete(re_idx);
      }else {
         
         result = bbs_reService.re_delete(ref);
      }
      
      String msg = result > 0 ? "댓글이 삭제 되었습니다." : "댓글 삭제를 실패했습니다.";
      String url = "adminBbsContent.do?b_idx=" + b_idx + "#reply";

      ModelAndView mav = new ModelAndView();
      mav.addObject("msg", msg);
      mav.addObject("url", url);
      mav.setViewName("msg");

      return mav;
   }

   // 전문가 관리 전문가 리스트
   @RequestMapping("/adminExpert.do")
   public ModelAndView adminExpert(@RequestParam(value = "cp", defaultValue = "1") int cp,
         @RequestParam(value = "keyWord", defaultValue = "") String keyWord) {
      
      String pageStr;
      int listSize = 10;
      int pageSize = 5;
      int totalCnt = adminService.adminExpertTotalCnt();
      int SearchTotalCnt = adminService.adminExpertSearchTotalCnt(keyWord);
      
      if (keyWord == "") {
         pageStr = com.more.paging.BbsPageModule.makePage("adminExpert.do", totalCnt, listSize, pageSize, cp, keyWord);
      } else {
         pageStr = com.more.paging.BbsPageModule.makePage("adminExpert.do", SearchTotalCnt, listSize, pageSize, cp, keyWord);
      }
      
      ModelAndView mav = new ModelAndView();
     if(keyWord == "") {
         List<SuggestDTO> list = adminService.expertList(cp, listSize);
         mav.addObject("list", list);
         mav.addObject("pageStr", pageStr);
         mav.setViewName("admin/adminExpert");
      }else {
         List<SuggestDTO> list = adminService.expertSearchList(cp, listSize, keyWord);
         mav.addObject("list", list);
         mav.addObject("pageStr", pageStr);
         mav.setViewName("admin/adminExpert");
      }
     
      return mav;
   }
   
    // 전문가 관리 전문가 삭제(status = 3)
   @RequestMapping("/adminExpertDel.do")
   public ModelAndView expertDel(@RequestParam("id")String id) {

      ModelAndView mav = new ModelAndView();
      
      int result = adminService.expertDel(id);
      String msg = result>0?id+"님이 탈퇴처리 되었습니다.":"회원탈퇴 처리를 실패했습니다.";
      String url = "adminExpert.do";
      
      mav.addObject("msg", msg);
      mav.addObject("url", url);
      mav.setViewName("msg");
      
      return mav;
   }
   
   // 유저관리 - 탈퇴회원 리스트
   @RequestMapping("/adminOutMember.do")
      public ModelAndView adminOutMember(@RequestParam(value = "cp", defaultValue = "1") int cp,
            @RequestParam(value = "keyWord", defaultValue = "") String keyWord) {
         
         String pageStr;
         int listSize = 10;
         int pageSize = 5;
         int totalCnt = adminService.outMemberTotalCnt();
         int SearchTotalCnt = adminService.outMemberSearchTotalCnt(keyWord);
         
         if (keyWord == "") {
            pageStr = com.more.paging.BbsPageModule.makePage("adminOutMember.do", totalCnt, listSize, pageSize, cp, keyWord);
         } else {
            pageStr = com.more.paging.BbsPageModule.makePage("adminOutMember.do", SearchTotalCnt, listSize, pageSize, cp,
                  keyWord);
         }
         
         ModelAndView mav = new ModelAndView();
        if(keyWord == "") {
            List<MemberDTO> list = adminService.outMemberList(cp, listSize);
            mav.addObject("list", list);
            mav.addObject("pageStr", pageStr);
            mav.setViewName("admin/adminOutMember");
         }else {
            List<MemberDTO> list = adminService.outMemberSearchList(cp, listSize, keyWord);
            mav.addObject("list", list);
            mav.addObject("pageStr", pageStr);
            mav.setViewName("admin/adminOutMember");
         }
        
         return mav;
      }
   
   // -----------------------------------------------관리자 후기 게시판
   // 리뷰 관리 리스트
   @RequestMapping("/adminReviewList.do")
   public ModelAndView adminReviewList(@RequestParam(value = "cp", defaultValue = "1") int cp,
         @RequestParam(value = "keyWord", defaultValue = "") String keyWord) {
      String pageStr;
      int listSize = 10;
      int pageSize = 5;
      int totalCnt = reviewService.getTotalCnt();
      int SearchTotalCnt = reviewService.reviewSearchTotalCnt(keyWord);

      if (keyWord == "") {
         pageStr = com.more.paging.BbsPageModule.makePage("adminReviewList.do", totalCnt, listSize, pageSize, cp, keyWord);
      } else {
         pageStr = com.more.paging.BbsPageModule.makePage("adminReviewList.do", SearchTotalCnt, listSize, pageSize, cp,
               keyWord);
      }
      ModelAndView mav = new ModelAndView();
      if(keyWord == "") {
          List<ReviewDTO> list = reviewService.reviewList(cp, listSize);
          mav.addObject("list", list);
          mav.addObject("pageStr", pageStr);
          mav.setViewName("admin/adminReviewList");
       }else {
          List<ReviewDTO> list = reviewService.adminReviewList(cp, listSize, keyWord);
          mav.addObject("list", list);
          mav.addObject("pageStr", pageStr);
          mav.setViewName("admin/adminReviewList");
       }
      
       return mav;

   }
   // QNA 본문 보기
   @RequestMapping("/adminReviewContent.do")
   public ModelAndView adminReviewContent(@RequestParam("rv_idx")int rv_idx) {
	   ReviewDTO dto=reviewService.reviewContent(rv_idx);
	   ModelAndView mav = new ModelAndView();
	   mav.addObject("dto", dto);
	   mav.setViewName("admin/adminReviewContent");
	   return mav;
   }

   // 리뷰 관리 삭제
   @RequestMapping("/adminReviewDel.do")
   public ModelAndView adminReviewDel(@RequestParam("rv_idx") int rv_idx) {
      int result = reviewService.reviewDelete(rv_idx);

      String msg = result > 0 ? "리뷰가 삭제 되었습니다." : "리뷰 삭제를 실패했습니다.";
      String url = "adminReviewList.do";

      ModelAndView mav = new ModelAndView();
      mav.addObject("msg", msg);
      mav.addObject("url", url);
      mav.setViewName("msg");

      return mav;
   }
   
   //---------------------qna-----------------------------
// 공지사항 관리 리스트
   @RequestMapping("/adminNoticeList.do")
   public ModelAndView adminNoticeList(@RequestParam(value = "cp", defaultValue = "1") int cp,
         @RequestParam(value = "keyWord", defaultValue = "") String keyWord) {
      String pageStr;
      int listSize = 10;
      int pageSize = 5;
      int totalCnt = centerService.noticeCount();
      int SearchTotalCnt = centerService.noticeSearchCount(keyWord);

      if (keyWord == "") {
         pageStr = com.more.paging.BbsPageModule.makePage("adminNoticeList.do", totalCnt, listSize, pageSize, cp, keyWord);
      } else {
         pageStr = com.more.paging.BbsPageModule.makePage("adminNoticeList.do", SearchTotalCnt, listSize, pageSize, cp,
               keyWord);
      }
      ModelAndView mav = new ModelAndView();
      if(keyWord == "") {
          List<CenterDTO> list = centerService.noticeList(cp, listSize);
          mav.addObject("list", list);
          mav.addObject("pageStr", pageStr);
          mav.setViewName("admin/adminNoticeList");
       }else {
          List<CenterDTO> list = centerService.adminNoticeList(cp, listSize, keyWord);
          mav.addObject("list", list);
          mav.addObject("pageStr", pageStr);
          mav.setViewName("admin/adminNoticeList");
       }
      
       return mav;

   }
   //공지사항 본문 보기
   @RequestMapping("/adminNoticeContent.do")
   public ModelAndView adminNoticeContent(@RequestParam("n_idx")int n_idx) {
	   CenterDTO dto=centerService.noticeContent(n_idx);
	   ModelAndView mav = new ModelAndView();
	   mav.addObject("dto", dto);
	   mav.setViewName("admin/adminNoticeContent");
	   return mav;
   }
   // 공지사항 관리 삭제
   @RequestMapping("/adminNoticeDel.do")
   public ModelAndView adminNoticeDel(@RequestParam("n_idx") int n_idx) {
      int result = centerService.noticeDel(n_idx);

      String msg = result > 0 ? "공지사항이 삭제 되었습니다." : "공지사항 삭제를 실패했습니다.";
      String url = "adminNoticeList.do";

      ModelAndView mav = new ModelAndView();
      mav.addObject("msg", msg);
      mav.addObject("url", url);
      mav.setViewName("msg");

      return mav;
   }
   // 공지사항 글쓰기
	@RequestMapping(value = "/adminNoticeWrite.do", method = RequestMethod.GET) // 리뷰 글쓰기 페이지 이동
	public String adminNoticeWriteForm() {
		return "admin/adminNoticeWrite";
	}
	@RequestMapping(value = "/adminNoticeWrite.do", method = RequestMethod.POST) /// 리뷰 글쓰기
	public ModelAndView adminNoticeWriteSubmit(CenterDTO dto) {
		int result = centerService.noticeWrite(dto);
		String msg = result > 0 ? "공지사항 글쓰기 성공" : "공지사항 글쓰기 실패";
		String url = "adminNoticeList.do";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("msg");
		return mav;
	}
	 // 공지사항 수정
		@RequestMapping(value = "/adminNoticeUpdate.do", method = RequestMethod.GET) // 리뷰 글쓰기 페이지 이동
		public ModelAndView adminUpdateForm(@RequestParam("n_idx")int n_idx) {
			CenterDTO dto = centerService.noticeContent(n_idx);
			ModelAndView mav = new ModelAndView();
			mav.addObject("dto", dto);
			mav.setViewName("admin/adminNoticeUpdate");
			return mav;
		}
		@RequestMapping(value = "/adminNoticeUpdate.do", method = RequestMethod.POST) /// 리뷰 글쓰기
		public ModelAndView adminUpdateSubmit(CenterDTO dto) {
			int result = centerService.noticeUpdate(dto);
			String msg = result > 0 ? "공지사항 글수정 성공" : "공지사항 글수정 실패";
			String url = "adminNoticeList.do";
			ModelAndView mav = new ModelAndView();
			mav.addObject("msg", msg);
			mav.addObject("url", url);
			mav.setViewName("msg");
			return mav;
		}
// QNA 리뷰 리스트
   @RequestMapping("/adminQnaList.do")
      public ModelAndView adminQnaList(@RequestParam(value = "cp", defaultValue = "1") int cp, 
      @RequestParam(value = "keyWord", defaultValue = "") String keyWord) {
      String pageStr;
      int listSize = 10;
      int pageSize = 5;
      int totalCnt = centerService.qnaCount();
      int SearchTotalCnt = centerService.qnaSearchCount(keyWord);

      if (keyWord == "") {
         pageStr = com.more.paging.BbsPageModule.makePage("adminQnaList.do", totalCnt, listSize, pageSize, cp, keyWord);
      } else {
         pageStr = com.more.paging.BbsPageModule.makePage("adminQnaList.do", SearchTotalCnt, listSize, pageSize, cp,
               keyWord);
      }
      ModelAndView mav = new ModelAndView();
      if(keyWord == "") {
          List<CenterDTO> list = centerService.adminQnaList(cp, listSize, keyWord);
          mav.addObject("list", list);
          mav.addObject("pageStr", pageStr);
          mav.setViewName("admin/adminQnaList");
       }else {
          List<CenterDTO> list = centerService.adminQnaList(cp, listSize, keyWord);
          mav.addObject("list", list);
          mav.addObject("pageStr", pageStr);
          mav.setViewName("admin/adminQnaList");
       }
      
       return mav;

   }
   // QNA 본문 보기
   @RequestMapping("/adminQnaContent.do")
   public ModelAndView adminQnaContent(@RequestParam("q_idx")int q_idx) {
	   CenterDTO dto=centerService.qnaInfo(q_idx);
	   ModelAndView mav = new ModelAndView();
	   mav.addObject("dto", dto);
	   mav.setViewName("admin/adminQnaContent");
	   return mav;
   }
   // QNA 관리 삭제
   @RequestMapping("/adminQnaDel.do")
   public ModelAndView adminQnaDel(@RequestParam("q_idx") int q_idx) {
      int result = centerService.qnaDel(q_idx);

      String msg = result > 0 ? "QNA가 삭제 되었습니다." : "QNA 삭제를 실패했습니다.";
      String url = "adminQnaList.do";

      ModelAndView mav = new ModelAndView();
      mav.addObject("msg", msg);
      mav.addObject("url", url);
      mav.setViewName("msg");

      return mav;
   }
   // QNA 답변하기
  	@RequestMapping(value = "/adminQnaWrite.do", method = RequestMethod.GET) // QNA 답변쓰기 페이지 이동
  	public ModelAndView adminQnaWriteForm(@RequestParam("q_idx")int q_idx) {
  		CenterDTO dto = centerService.qnaInfo(q_idx);
  		ModelAndView mav = new ModelAndView();
  		mav.addObject("dto", dto);
  		mav.setViewName("admin/adminQnaWrite");
  		return mav;
  	}
  	@RequestMapping(value = "/adminQnaWrite.do", method = RequestMethod.POST) /// QNA 답변쓰기
  	public ModelAndView adminQnaWriteSubmit(CenterDTO dto) {
  		int result = centerService.qnaAnswerWrite(dto);
  		String msg = result > 0 ? "QNA 답변 성공" : "QNA 답변 실패";
  		String url = "adminQnaList.do";
  		ModelAndView mav = new ModelAndView();
  		mav.addObject("msg", msg);
  		mav.addObject("url", url);
  		mav.setViewName("msg");
  		return mav;
  	}
  //관리자 차트
    @RequestMapping("/adminChart.do")
   public String adminChart() {
      return "admin/adminChart";
   }
}




















































