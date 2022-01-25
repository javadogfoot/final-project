package com.more.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.more.document.model.DocumentDTO;
import com.more.document.model.DocumentService;
import com.more.payhistory.model.PayhistoryService;
import com.more.suggest.model.SuggestDTO;

@Controller
public class DocumentController {

	@Autowired
	private DocumentService documentService;
	
	@Autowired
	private PayhistoryService payhistoryService;
	
	@RequestMapping("/documentContent.do")
	public ModelAndView documentContent(@RequestParam("d_idx")int d_idx) {
		DocumentDTO dto=documentService.documentContent(d_idx);
		dto.setStart_date(dto.getStart_date().substring(0, 10));
		dto.setEnd_date(dto.getEnd_date().substring(0, 10));
		ModelAndView mav=new ModelAndView();
		mav.addObject("dto", dto);
		mav.setViewName("document/documentContent");
		return mav;
	}
	@RequestMapping("/statusUpdate.do")
	public ModelAndView statusUpdate(@RequestParam("p_idx")int p_idx,@RequestParam("d_idx")int d_idx) {
		int result=payhistoryService.statusUpdate(p_idx);
		payhistoryService.docStatusUpdate(d_idx);
		String msg=result>0?"수강취소를 신청했습니다.":"수강취소를 실패했습니다.";
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", msg);
		mav.addObject("url", "documentContent.do?d_idx="+d_idx);
		mav.setViewName("msg");
		return mav;
	}
   @RequestMapping("/m_documentList.do")
   public ModelAndView documentList(HttpSession session) {
      String sessionId = (String)session.getAttribute("sessionId"); 
      List<DocumentDTO> list = documentService.m_documentList(sessionId);
      
      ModelAndView mav = new ModelAndView();
      mav.addObject("list", list);
      mav.setViewName("document/m_documentList");
      
      return mav;
   }
}
