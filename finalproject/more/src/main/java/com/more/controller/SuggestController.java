package com.more.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.more.document.model.DocumentDTO;
import com.more.document.model.DocumentService;
import com.more.member.model.MemberDTO;
import com.more.payhistory.model.PayhistoryDTO;
import com.more.suggest.model.SuggestDTO;
import com.more.suggest.model.SuggestService;

@Controller
public class SuggestController {

	@Autowired
	private SuggestService suggestService;
	
	@Autowired
	private DocumentService documentService;

	@RequestMapping("/suggestList.do") // 제안서 목록
	public ModelAndView suggestList(@RequestParam(value = "cp", defaultValue = "1") int cp,
			@RequestParam(value = "cate1", defaultValue = "외국어") String cate1,
			@RequestParam(value = "cate2", defaultValue = "영어") String cate2) {
		System.out.println(cate1);
		System.out.println(cate2);
		int listSize = 3;
		int pageSize = 5;
		int totalCnt = suggestService.suggestCount(cate1, cate2);
		System.out.println("totalCnt = " + totalCnt);
		List<SuggestDTO> list = suggestService.suggestList(cp, listSize, cate1, cate2);
		String pagestr = com.more.paging.SuggestPageModule.makePage("suggestList.do?cate1=" + cate1 + "&cate2=" + cate2,
				totalCnt, listSize, pageSize, cp);
		ModelAndView mav = new ModelAndView("suggest/suggestList");
		mav.addObject("list", list);
		mav.addObject("cate1", cate1);
		mav.addObject("cate2", cate2);
		mav.addObject("pagestr", pagestr);
		return mav;
	}

	@RequestMapping(value = "/suggest.do", method = RequestMethod.GET) // 제안서 작성 페이지 이동
	public String suggestWriteForm() {
		return "suggest/suggestWrite";
	}

	@RequestMapping(value = "/suggest.do", method = RequestMethod.POST) // 제안서 작성
	public ModelAndView suggestWrite(SuggestDTO dto) {

		int result = suggestService.suggestWrite(dto);
		String msg = result > 0 ? "제안서 등록 성공" : "제안서 등록 실패";
		String url = "index.do";

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("msg");
		return mav;
	}
	
	@RequestMapping(value="/suggestUpdate.do",method=RequestMethod.GET) // 제안서 수정 페이지 
	public ModelAndView suggestUpdateForm(@RequestParam("s_idx")int s_idx) {
		SuggestDTO dto=suggestService.suggestInfo(s_idx);
		dto.setStart_date(dto.getStart_date().substring(0, 10));
		dto.setEnd_date(dto.getEnd_date().substring(0, 10));
		ModelAndView mav=new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("suggest/suggestUpdate");
		return mav;
	}
	@RequestMapping(value="/suggestUpdate.do",method=RequestMethod.POST) // 제안서 수정
	public ModelAndView suggestUpdate(SuggestDTO dto) {

		int result=suggestService.suggestUpdate(dto);
		String msg=result>0?"제안서 수정 성공":"제안서 수정 실패";
		String url="index.do";
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("msg");
		return mav;
	}
	@RequestMapping("/suggestDelete.do") // 제안서 삭제
	public ModelAndView suggestDelete(@RequestParam("s_idx")int s_idx) {
		int result=suggestService.suggestDelete(s_idx);
		String msg = result > 0 ? "제안서 삭제 성공" : "제안서 삭제 실패";
		String url = "index.do";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("msg");
		return mav;
	}

	@RequestMapping(value = "/requestSuggest.do", method = RequestMethod.GET) // 요청서에 제안하기 페이지 이동
	public ModelAndView requestSuggest(@RequestParam("id") String m_id) {
		ModelAndView mav = new ModelAndView("suggest/requestSuggest");
		mav.addObject("m_id", m_id);
		return mav;
	}

	@RequestMapping(value = "/requestSuggestAction.do", method = RequestMethod.POST) // 요청서에 제안하기
	public ModelAndView requestSuggestAction(SuggestDTO dto) {
		ModelAndView mav = new ModelAndView("msg");
		int result = suggestService.requestSuggest(dto);
		String msg = result > 0 ? "제안서 등록 성공" : "제안서 등록 실패";
		String url = "index.do";
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		return mav;
	}

	   @RequestMapping("/sugContent.do") // 제안서 본문보기
	   public ModelAndView sugContent(@RequestParam("s_idx") int s_idx,
	         HttpSession session) {
	      
	      ModelAndView mav = new ModelAndView("suggest/suggestContent");
	      
	      String sessionId = (String)session.getAttribute("sessionId");
	      MemberDTO m_dto = suggestService.costMemberInfo(sessionId);
	      
	      SuggestDTO dto = suggestService.sugContent(s_idx);
	      SuggestDTO dto2 = suggestService.sugContent2(s_idx);
	      mav.addObject("dto", dto);
	      mav.addObject("dto2", dto2);
	      mav.addObject("m_dto", m_dto);
	      return mav;
	   }
	   
		/*
		 * // 결제 성공 페이지
		 * 
		 * @RequestMapping("/paymentsSuccess.do") public ModelAndView
		 * paymentsSuccess(PayhistoryDTO dto, @RequestParam("m_id") String
		 * m_id, @RequestParam("e_id") String e_id, @RequestParam("cost") int cost) {
		 * ModelAndView mav = new ModelAndView(); dto.setM_id(m_id); dto.setE_id(e_id);
		 * dto.setCost(cost); int count = suggestService.savePayHistory(dto);
		 * if(count>0) { mav.setViewName("suggest/paymentsSuccess"); }else {
		 * mav.addObject("msg", "결제 실패, 고객센터로 문의 바랍니다."); mav.addObject("url",
		 * "qnabbsList.do"); mav.setViewName("msg"); } return mav; }
		 */
		/*
		 * // 결제 성공 페이지
		 * 
		 * @RequestMapping("/paymentsSuccess.do") public ModelAndView
		 * paymentsSuccess(PayhistoryDTO dto, DocumentDTO ddto, @RequestParam("m_id")
		 * String m_id,
		 * 
		 * @RequestParam("e_id") String e_id, @RequestParam("cost") int
		 * cost, @RequestParam("s_idx") int s_idx,
		 * 
		 * @RequestParam("cate1") String cate1, @RequestParam("cate2") String cate2) {
		 * ModelAndView mav = new ModelAndView();
		 * 
		 * dto.setM_id(m_id); dto.setE_id(e_id); dto.setCost(cost);
		 * 
		 * ddto.setM_id(m_id); ddto.setE_id(e_id); ddto.setS_idx(s_idx);
		 * ddto.setCate1(cate1); ddto.setCate2(cate2);
		 * 
		 * int count = suggestService.savePayHistory(dto);
		 * 
		 * int count2 = documentService.saveDocument(ddto);
		 * 
		 * if ((count > 0) && (count2 > 0)) {
		 * mav.setViewName("suggest/paymentsSuccess"); } else { mav.addObject("msg",
		 * "결제 실패, 고객센터로 문의 바랍니다."); mav.addObject("url", "qnabbsList.do");
		 * mav.setViewName("msg"); } return mav; }
		 */
	// 결제 성공 페이지
	   @RequestMapping("/paymentsSuccess.do")
       public ModelAndView paymentsSuccess(PayhistoryDTO dto, DocumentDTO ddto, @RequestParam("m_id") String m_id,
             @RequestParam("e_id") String e_id, @RequestParam("cost") int cost, @RequestParam("s_idx") int s_idx,
             @RequestParam("cate1") String cate1, @RequestParam("cate2") String cate2) {
          ModelAndView mav = new ModelAndView();

          ddto.setM_id(m_id);
          ddto.setE_id(e_id);
          ddto.setS_idx(s_idx);
          ddto.setCate1(cate1);
          ddto.setCate2(cate2);


          int count = documentService.saveDocument(ddto);

          int didx = suggestService.getDidx(ddto);
          dto.setM_id(m_id);
          dto.setE_id(e_id);
          dto.setCost(cost);
          dto.setD_idx(didx);

          int count2 = suggestService.savePayHistory(dto);

          if ((count > 0) && (count2>0)) {
             mav.setViewName("suggest/paymentsSuccess");
          } else {
             mav.addObject("msg", "결제 실패, 고객센터로 문의 바랍니다.");
             mav.addObject("url", "qnabbsList.do");
             mav.setViewName("msg");
          }
          return mav;
       }
	      
	      @RequestMapping("/sentsuggest.do") // 보낸 제안
	      public ModelAndView sentSuggest(@RequestParam(value = "cp", defaultValue = "1") int cp, @RequestParam("id") String id) {
	         ModelAndView mav = new ModelAndView("suggest/sentSuggest");
	         int listSize = 3;
	         int pageSize = 5;
	         int totalCnt = suggestService.sentSuggestCount(id);
	         List<SuggestDTO> list = suggestService.sentSuggest(cp, listSize, id);
	         String pagestr = com.more.paging.SuggestPageModule.makePage("sentsuggest.do?id=" + id, totalCnt, listSize, pageSize, cp);
	         mav.addObject("list", list);
	         mav.addObject("pagestr", pagestr);
	         return mav;
	      }
	      
	      @RequestMapping("/receiveSuggest.do") // 받은 제안
	      public ModelAndView receiveSuggest(@RequestParam(value = "cp", defaultValue = "1") int cp, @RequestParam("id") String id) {
	         ModelAndView mav = new ModelAndView("suggest/receiveSuggest");
	         int listSize = 3;
	         int pageSize = 5;
	         int totalCnt = suggestService.receiveSuggestCount(id);
	         List<SuggestDTO> list = suggestService.receiveSuggest(cp, listSize, id);
	         String pagestr = com.more.paging.SuggestPageModule.makePage("receiveSuggest.do?id=" + id, totalCnt, listSize, pageSize, cp);
	         mav.addObject("list", list);
	         mav.addObject("pagestr", pagestr);
	         return mav;
	      }
	
}
