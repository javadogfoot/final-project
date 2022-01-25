package com.more.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.more.document.model.DocumentDTO;
import com.more.document.model.DocumentService;
import com.more.expert.model.ExpertDTO;
import com.more.expert.model.ExpertService;
import com.more.review.model.ReviewDTO;
import com.more.suggest.model.SuggestDTO;

@Controller
public class ExpertController {

	@Autowired
	private ExpertService expertService;
	@Autowired
	private DocumentService documentService;

	@RequestMapping("/regist1.do") // 큰 카테고리
	public String regist1() {
		return "expert/regist1";
	}

	@RequestMapping("/regist2.do") // 작은 카테고리
	public ModelAndView regist2(ExpertDTO dto) {
		System.out.println(dto.getCate1());
		ModelAndView mav = new ModelAndView("expert/regist2");
		mav.addObject("dto", dto);
		return mav;
	}

	@RequestMapping("/regist3.do") // 주소
	public ModelAndView regist3(ExpertDTO dto) {
		System.out.println(dto.getCate1());
		System.out.println(dto.getCate2());
		ModelAndView mav = new ModelAndView("expert/regist3");
		mav.addObject("dto", dto);
		return mav;
	}

	@RequestMapping("/regist4.do") // 레슨 방식
	public ModelAndView regist4(ExpertDTO dto) {
		System.out.println(dto.getCate1());
		System.out.println(dto.getCate2());
		System.out.println(dto.getLs_location());
		ModelAndView mav = new ModelAndView("expert/regist4");
		mav.addObject("dto", dto);
		return mav;
	}

	@RequestMapping("/regist5.do") // 전문가 이력
	public ModelAndView regist5(ExpertDTO dto) {
		System.out.println(dto.getCate1());
		System.out.println(dto.getCate2());
		System.out.println(dto.getLs_location());
		System.out.println(dto.getProcess());
		ModelAndView mav = new ModelAndView("expert/regist5");
		mav.addObject("dto", dto);
		return mav;
	}

	   @RequestMapping("/regist.do") // 전문가 등록 완료
	   public ModelAndView regist(@RequestParam("id") String id, ExpertDTO dto, HttpServletRequest request) {
	      System.out.println("id = " + id);
	      System.out.println(dto.getCate1());
	      System.out.println(dto.getCate2());
	      System.out.println(dto.getLs_location());
	      System.out.println(dto.getProcess());
	      System.out.println(dto.getIntro());
	      System.out.println(dto.getUniv());
	      System.out.println(dto.getMajor());
	      System.out.println(dto.getCareer());
	      System.out.println(dto.getCer());
	      ModelAndView mav = new ModelAndView("expert/regist");
	      expertService.expertJoin(id, dto);
	      HttpSession session = request.getSession();
	      session.invalidate();
	      return mav;
	   }

	@RequestMapping("/expertProfile.do") // 전문가 프로필
	public ModelAndView expertProfile(@RequestParam(value = "cpa", defaultValue = "1") int cpa,
			  @RequestParam(value = "cpb", defaultValue = "1") int cpb,
			  @RequestParam(value = "cpc", defaultValue = "1") int cpc,
			  @RequestParam("id")String id) {
		int listSize = 5;
		int pageSize = 5;
		int reviewCnt = expertService.reviewCnt(id);
		int suggestCnt = expertService.suggestCnt(id);
		int documentCnt = documentService.e_documentCnt(id);
		
		List<ReviewDTO> reviewList = expertService.expertReviewList(cpa, listSize, id);
		String reviewPageStr = com.more.paging.ExpertPageModule.makePage("expertProfile.do?id="+id, reviewCnt, listSize, pageSize, cpa);
		List<SuggestDTO> suggestList = expertService.expertSuggestList(cpb, listSize, id);
		String suggestPageStr = com.more.paging.ExpertPageModule.makePage("expertProfile.do?id="+id, suggestCnt, listSize, pageSize, cpb);
		List<DocumentDTO> documentList = documentService.e_documentList(cpc, listSize, id);
		String documentPageStr = com.more.paging.ExpertPageModule.makePage("expertProfile.do?id"+id, documentCnt, listSize, pageSize, cpc);
		
		int grade1Sum=0;
		int grade2Sum=0;
		int grade3Sum=0;
		int gradeSum=0;
		for(int i=0;i<reviewList.size();i++) {
			grade1Sum+=reviewList.get(i).getGrade1();
			grade2Sum+=reviewList.get(i).getGrade2();
			grade3Sum+=reviewList.get(i).getGrade3();
			gradeSum+=reviewList.get(i).getGradesum();
		}
	      int gr1avg = 0;
	      int gr2avg = 0;
	      int gr3avg = 0;
	      int grsumavg = 0;
	      
	      if (!(reviewList.size() == 0)) {
	         gr1avg=grade1Sum/reviewList.size();
	         gr2avg=grade2Sum/reviewList.size();
	         gr3avg=grade3Sum/reviewList.size();
	         grsumavg=gradeSum/reviewList.size();         
	      }

		ExpertDTO dto = expertService.expertProfile(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("reviewList" , reviewList);
		mav.addObject("reviewPageStr", reviewPageStr);
		mav.addObject("gr1avg", gr1avg);
		mav.addObject("gr2avg", gr2avg);
		mav.addObject("gr3avg", gr3avg);
		mav.addObject("grsumavg", grsumavg);
		mav.addObject("suggestList" , suggestList);
		mav.addObject("suggestPageStr", suggestPageStr);
		mav.addObject("documentList", documentList);
		mav.addObject("documentPageStr", documentPageStr);
		mav.addObject("reviewCnt", reviewCnt);
		mav.addObject("suggestCnt", suggestCnt);
		mav.addObject("documentCnt", documentCnt);
		mav.addObject("dto", dto);
		mav.setViewName("expert/expertProfile");
		return mav;
	}

	@RequestMapping(value = "/expertIntro.do", method = RequestMethod.GET) // 전문가 소개 수정 페이지 이동
	public ModelAndView expertIntroForm(@RequestParam("id") String id) {
		ExpertDTO dto = expertService.expertInfo(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("expert/expertIntroForm");
		return mav;
	}

	@RequestMapping(value = "/expertIntro.do", method = RequestMethod.POST) // 전문가 소개 수정
	public ModelAndView expertIntro(ExpertDTO dto) {
		int result = expertService.expertIntro(dto);
		String msg = result > 0 ? "수정 완료" : "수정 실패";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", "expertProfile.do?id=" + dto.getId());
		mav.setViewName("msg");
		return mav;
	}

	@RequestMapping(value = "/expertSpec.do", method = RequestMethod.GET) // 전문가 학력 경력 페이지 이동
	public ModelAndView expertSpecForm(@RequestParam("id") String id) {
		ExpertDTO dto = expertService.expertInfo(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("expert/expertSpecForm");
		return mav;
	}

	@RequestMapping(value = "/expertSpec.do", method = RequestMethod.POST) // 전문가 학력 경력 수정
	public ModelAndView expertSpec(ExpertDTO dto) {
		int result = expertService.expertSpec(dto);
		String msg = result > 0 ? "수정 완료" : "수정 실패";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", "expertProfile.do?id=" + dto.getId());
		mav.setViewName("msg");
		return mav;
	}

	@RequestMapping(value = "/expertLocation.do", method = RequestMethod.GET) // 전문가 지역 수정 페이지 이동
	public ModelAndView expertLocationForm(@RequestParam("id") String id) {
		ExpertDTO dto = expertService.expertInfo(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("expert/expertLocationForm");
		return mav;
	}

	@RequestMapping(value = "/expertLocation.do", method = RequestMethod.POST) // 전문가 지역 수정
	public ModelAndView expertLocation(ExpertDTO dto) {
		int result = expertService.expertLocation(dto);
		String msg = result > 0 ? "수정 완료" : "수정 실패";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", "expertProfile.do?id=" + dto.getId());
		mav.setViewName("msg");
		return mav;
	}

	@RequestMapping(value = "/expertCate.do", method = RequestMethod.GET) // 전문가 카테고리 수정 페이지 이동
	public ModelAndView experCateForm(@RequestParam("id") String id) {
		ExpertDTO dto = expertService.expertInfo(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("expert/expertCateForm");
		return mav;
	}
	@RequestMapping(value = "/expertCate.do",method = RequestMethod.POST) //전문가 카테고리 수정
	public ModelAndView expertCate(ExpertDTO dto) {
		int result = expertService.expertCate(dto);
		String msg = result > 0 ? "카테고리 수정 완료" : "카테고리 수정 실패";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", "expertProfile.do?id=" + dto.getId());
		mav.setViewName("msg");
		return mav;
	}
	
	@RequestMapping(value = "/expertAccount.do", method = RequestMethod.GET) // 전문가 계좌 수정 페이지 이동
	public ModelAndView experAccountForm(@RequestParam("id") String id) {
		ExpertDTO dto = expertService.expertInfo(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("expert/expertAccountForm");
		return mav;
	}
	@RequestMapping(value = "/expertAccount.do",method = RequestMethod.POST) //전문가 계좌 수정
	public ModelAndView expertAccount(ExpertDTO dto) {
		int result = expertService.expertAccount(dto);
		String msg = result > 0 ? "계좌 수정 완료" : "계좌 수정 실패";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", "expertProfile.do?id=" + dto.getId());
		mav.setViewName("msg");
		return mav;
	}
}



















