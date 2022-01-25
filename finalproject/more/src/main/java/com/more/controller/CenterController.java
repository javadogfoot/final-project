package com.more.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.more.center.model.CenterDTO;
import com.more.center.model.CenterService;

@Controller
public class CenterController {
   
   @Autowired
   private CenterService centerService;
   
   // 공지사항 목록
   @RequestMapping("/noticeList.do")
   public ModelAndView noticeList(@RequestParam(value = "cp", defaultValue = "1") int cp) {
      ModelAndView mav = new ModelAndView("center/notice");
      int listSize = 5;
      int pageSize = 5;
      int totalCnt = centerService.noticeCount();
      List<CenterDTO> list = centerService.noticeList(cp, listSize);
      String pagestr = com.more.paging.PageModule.makePage("noticeList.do",totalCnt, listSize, pageSize, cp);
      mav.addObject("list", list);
      mav.addObject("pagestr", pagestr);
      return mav;
   }
   // 공지사항 본문보기
   @RequestMapping("/noticeContent.do")
   public ModelAndView noticeContent(@RequestParam("n_idx") int n_idx) {
      ModelAndView mav = new ModelAndView("center/noticeContent");
      CenterDTO dto = centerService.noticeContent(n_idx);
      centerService.noticeReadCnt(n_idx);
      mav.addObject("dto", dto);
      return mav;
   }
   // QNA 목록
   @RequestMapping("/qnaList.do")
   public ModelAndView qnaList(@RequestParam(value = "cp", defaultValue = "1") int cp) {
      ModelAndView mav = new ModelAndView("center/qna");
      int listSize = 5;
      int pageSize = 5;
      int totalCnt = centerService.qnaCount();
      List<CenterDTO> list = centerService.qnaList(cp, listSize);
      String pagestr = com.more.paging.PageModule.makePage("qnaList.do", totalCnt, listSize, pageSize, cp);
      mav.addObject("list", list);
      mav.addObject("pagestr", pagestr);
      return mav;
   }
   // QNA 질문 작성 페이지 이동
   @RequestMapping(value = "/qnaWrite.do", method = RequestMethod.GET)
   public String qnaWrite() {
      return "center/qnaWrite";
   }
   // QNA 질문 작성
   @RequestMapping(value = "/qnaWrite.do", method = RequestMethod.POST)
   public ModelAndView qnaWriteAction(HttpServletRequest request, CenterDTO dto) {
      HttpSession session = request.getSession();
      ModelAndView mav = new ModelAndView("msg");
      int result = centerService.qnaWrite((String) session.getAttribute("sessionId"), dto);
      String msg = result > 0 ? "Q&A 질문 성공!" : "Q&A 질문 실패!";
      String url = result > 0 ? "qnaList.do" : "qnaWrite.do";
      mav.addObject("msg", msg);
      mav.addObject("url", url);
      return mav;
   }
   // QNA 답변
   @ResponseBody
   @RequestMapping(value = "/qnaAnswer.do", method = RequestMethod.POST)
   public CenterDTO qnaAnswer(@RequestParam("a_no") String a_no) {
      CenterDTO dto = centerService.qnaAnswer(a_no);
      System.out.println(dto);
      return dto;
   }
}