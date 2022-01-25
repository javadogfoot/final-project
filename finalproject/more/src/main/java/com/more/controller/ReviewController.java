package com.more.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.more.document.model.DocumentDTO;
import com.more.document.model.DocumentService;
import com.more.review.model.ReviewDTO;
import com.more.review.model.ReviewService;

@Controller
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	@Autowired
	private DocumentService documentService;

	@RequestMapping("/reviewList.do") // 리뷰 목록
	public ModelAndView reviewList(@RequestParam(value = "cp", defaultValue = "1") int cp) {
		int listSize = 6;
		int pageSize = 5;
		int totalCnt = reviewService.getTotalCnt();
		int expertCnt = reviewService.totalExpertCnt();
		int requestCnt = reviewService.totalRequestCnt();

		List<ReviewDTO> list = reviewService.reviewList(cp, listSize);
		String pageStr = com.more.paging.PageModule.makePage("reviewList.do", totalCnt, listSize, pageSize, cp);

//		for(int i=0;i<list.size();i++) {
//			int result = list.get(i).getContent().length() >= 100 ?  1 : 2 ;
//			//list.get(i).getContent().length()>=100?   list.get(i).getContent().substring(0, 100)+"...":list.get(i).getContent();
//		}
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.addObject("pageStr", pageStr);
		mav.addObject("totalCnt", totalCnt);
		mav.addObject("expertCnt", expertCnt);
		mav.addObject("requestCnt", requestCnt);
		mav.setViewName("review/reviewList");
		return mav;
	}

	@RequestMapping(value = "/reviewWrite.do", method = RequestMethod.GET) // 리뷰 글쓰기 페이지 이동
	public ModelAndView reviewWriteForm(@RequestParam("id")String m_id) {
		List<DocumentDTO> list=documentService.m_documentList(m_id);
		ModelAndView mav=new ModelAndView();
		mav.addObject("list",list);
		mav.setViewName("review/reviewWrite");
		return mav;
	}

	@RequestMapping(value = "/reviewWrite.do", method = RequestMethod.POST) /// 리뷰 글쓰기
	public ModelAndView reviewWriteSubmit(ReviewDTO dto) {
		int result = reviewService.reviewWrite(dto);
		String msg = result > 0 ? "글쓰기 성공" : "글쓰기 실패";
		String url = "reviewList.do";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("msg");
		return mav;
	}
	
	@RequestMapping(value = "/reviewUpdate.do", method = RequestMethod.GET) //리뷰 수정 페이지 이동
	public ModelAndView reviewUpdateForm(@RequestParam("rv_idx")int rv_idx) {
		ReviewDTO dto=reviewService.reviewContent(rv_idx);
		ModelAndView mav=new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("review/reviewUpdate");
		return mav;
	}

	@RequestMapping(value = "/reviewUpdate.do", method = RequestMethod.POST) // 리뷰 수정
	public ModelAndView reviewUpdateSubmit(ReviewDTO dto) {
		System.out.println("들어옴");
		int result = reviewService.reviewUpdate(dto);
		String msg = result > 0 ? "글수정 성공" : "글수정 실패";
		String url = "reviewList.do";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("msg");
		return mav;
	}
	
	@RequestMapping("/reviewDelete.do") // 리뷰 삭제
	public ModelAndView reviewDelete(@RequestParam("rv_idx")int rv_idx) {
		int result=reviewService.reviewDelete(rv_idx);
		String msg = result > 0 ? "글삭제 성공" : "글삭제 실패";
		String url = "reviewList.do";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		mav.setViewName("msg");
		return mav;
	}
}
