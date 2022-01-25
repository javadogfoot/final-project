package com.more.controller;

import java.io.*;

import java.util.List;
import java.util.UUID;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.more.bbs.model.BbsDTO;
import com.more.bbs.model.BbsService;
import com.more.bbs_re.model.Bbs_ReDTO;
import com.more.bbs_re.model.Bbs_ReService;

@Controller
public class BbsController {

   @Autowired
   private BbsService bbsService;

   @Autowired
   private Bbs_ReService bbs_reService;

   @RequestMapping("/bbsList.do")
   public ModelAndView bbsList(@RequestParam(value = "cp", defaultValue = "1") int cp,
         @RequestParam(value = "keyWord", defaultValue = "") String keyWord) {
      String pageStr;
      int listSize = 5;
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
//      mav.addObject("bbs_cnt", bbs_cnt);
      mav.addObject("pageStr", pageStr);
      mav.setViewName("bbs/bbsList");

      return mav;
   }

   @RequestMapping("/bbsContent.do")
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
      bbsService.bbsCount(b_idx);

      ModelAndView mav = new ModelAndView();
      mav.addObject("dto", dto);
      mav.addObject("list", list);
      mav.addObject("list2", list2);
      mav.addObject("reCount", reCount);
      mav.addObject("rereCount", rereCount);
      mav.addObject("pageStr", pageStr);
      mav.addObject("cp", cp);
      mav.setViewName("bbs/bbsContent");
      return mav;
   }

   @RequestMapping("/bbsWriteForm.do")
   public String bbsWriteForm() {
      return "bbs/bbsWrite";
   }

   @RequestMapping("/bbsWrite.do")
   public ModelAndView bbsWrite(BbsDTO dto, @RequestParam("file") MultipartFile file) {

      ModelAndView mav = new ModelAndView();

      if (dto.getTitle() == null || dto.getTitle().equals("")) {
         String msg = "제목을 입력해 주세요.";
         mav.addObject("msg", msg);
         mav.setViewName("bbsmsg");
         return mav;
      } else if (dto.getContent() == null || dto.getContent().equals("")) {
         String msg = "내용을 입력해 주세요.";
         mav.addObject("msg", msg);
         mav.setViewName("bbsmsg");
         return mav;
      }

      if (file.getSize() != 0) {
         UUID uuid = UUID.randomUUID();

         try {
            byte[] bytes = file.getBytes(); // 원본

            // 복사본 정보
            File outFile = new File("C:/Users/고주환/Desktop/project/more/src/main/webapp/bbsfileUpload/" + uuid
                  + file.getOriginalFilename());

            FileOutputStream fos = new FileOutputStream(outFile);
            fos.write(bytes);
            fos.close();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }

         dto.setFile_path(uuid + file.getOriginalFilename());
      } else {
         dto.setFile_path("");
      }

      int result = bbsService.bbsWrite(dto);
      String msg = result > 0 ? "게시글이 등록되었습니다." : "게시글 등록을 실패했습니다.";
      String url = "bbsList.do";

      mav.addObject("msg", msg);
      mav.addObject("url", url);
      mav.setViewName("msg");

      return mav;
   }

   @RequestMapping("/re_Write.do")
   public ModelAndView re_Write(Bbs_ReDTO dto, HttpSession session) {
      ModelAndView mav = new ModelAndView();

      if(dto.getContent()==null || dto.getContent().equals("")) {
         String msg = "내용을 입력해 주세요.";
         mav.addObject("msg", msg);
         mav.setViewName("bbsmsg");
         return mav;
      }
      
      if (session.getAttribute("sessionId") == null) {
         String msg = "로그인 후 이용가능 합니다.";
         mav.addObject("msg", msg);
         mav.addObject("url", "bbsContent.do?b_idx=" + (Integer) dto.getB_idx());
         mav.setViewName("msg");
      } else {

         int maxref = getMaxRef();
         maxref++;
         dto.setRef(maxref);
         int result = bbs_reService.re_write(dto);
         String msg = result > 0 ? "댓글을 등록했습니다." : "댓글 등록을 실패했습니다.";
         String url = "bbsContent.do?b_idx=" + (Integer) dto.getB_idx() + "#reply";

         mav.addObject("msg", msg);
         mav.addObject("url", url);
         mav.setViewName("msg");
      }
      return mav;
   }

   @RequestMapping("/rere_Write.do")
   public ModelAndView rere_Write(Bbs_ReDTO dto, HttpSession session) {
      ModelAndView mav = new ModelAndView();
      
      if(dto.getContent()==null || dto.getContent().equals("")) {
         String msg = "내용을 입력해 주세요.";
         mav.addObject("msg", msg);
         mav.setViewName("bbsmsg");
         return mav;
      }
      
      if (session.getAttribute("sessionId") == null) {
         String msg = "로그인 후 이용가능 합니다.";
         mav.addObject(msg);
         mav.setViewName("msg");
      } else {

         int result = bbs_reService.rere_write(dto);
         String msg = result > 0 ? "댓글을 등록했습니다." : "댓글 등록을 실패했습니다.";
         String url = "bbsContent.do?b_idx=" + (Integer) dto.getB_idx() + "#reply";

         mav.addObject("msg", msg);
         mav.addObject("url", url);

         mav.setViewName("msg");

         return mav;
      }

      return mav;

   }

   public int getMaxRef() {

      int result = bbs_reService.maxref();

      return result;
   }

   @RequestMapping("/bbsUpdateForm.do")
   public ModelAndView bbsUpdateForm(@RequestParam(value = "b_idx") int b_idx) {
      
      ModelAndView mav = new ModelAndView();
      BbsDTO dto = bbsService.bbsContent(b_idx);   
      
      mav.addObject("dto", dto);
      mav.setViewName("bbs/bbsUpdate");

      return mav;
   }

   @RequestMapping("/bbsUpdate.do")
   public ModelAndView bbsUpdate(BbsDTO dto, @RequestParam("file") MultipartFile file) {
      
      ModelAndView mav = new ModelAndView();
      
      if(dto.getTitle()==null || dto.getTitle().equals("")) {
         String msg = "제목을 입력해 주세요.";
         mav.addObject("msg", msg);
         mav.setViewName("bbsmsg");
         return mav;
      } else if (dto.getContent() == null || dto.getContent().equals("")) {
         String msg = "내용을 입력해 주세요.";
         mav.addObject("msg", msg);
         mav.setViewName("bbsmsg");
         return mav;
      }
      
      if (dto.getFile_path() == null) {
         dto.setFile_path("");
      }

      if (file.getSize() != 0) {
         UUID uuid = UUID.randomUUID();

         try {
            byte[] bytes = file.getBytes(); // 원본

            // 복사본 정보
            File outFile = new File("C:/Users/고주환/Desktop/project/more/src/main/webapp/bbsfileUpload/" + uuid
                  + file.getOriginalFilename());

            FileOutputStream fos = new FileOutputStream(outFile);
            fos.write(bytes);
            fos.close();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         dto.setFile_path(uuid + file.getOriginalFilename());
      }

      int result = bbsService.bbsUpdate(dto);
      String msg = result > 0 ? "게시글 수정이 완료 되었습니다." : "게시글 수정을 실패했습니다.";
      String url = "bbsContent.do?b_idx=" + (Integer) dto.getB_idx();

      
      mav.addObject("dto", dto);
      mav.addObject("msg", msg);
      mav.addObject("url", url);
      mav.setViewName("msg");

      return mav;
   }

   @RequestMapping("/bbsDelete.do")
   public ModelAndView bbsDel(@RequestParam("b_idx") int b_idx) {

      int result = bbsService.bbsDel(b_idx);

      String msg = result > 0 ? "게시글이 삭제 되었습니다." : "게시글 삭제를 실패했습니다.";
      String url = "bbsList.do";

      ModelAndView mav = new ModelAndView();
      mav.addObject("msg", msg);
      mav.addObject("url", url);
      mav.setViewName("msg");

      return mav;
   }

   @RequestMapping("/bbs_reUpdateForm")
   public ModelAndView bbs_reUpdateForm(@RequestParam(value = "cp", defaultValue = "1") int cp,
         @RequestParam("re_idx") int re_idx, @RequestParam("b_idx") int b_idx) {
      
      ModelAndView mav = new ModelAndView();
      BbsDTO dto = bbsService.bbsContent(b_idx);
      
      int listSize = 5;
      int pageSize = 5;
      int bbs_retotalCnt = bbs_reService.bbs_reTotalCnt(b_idx);

      List<Bbs_ReDTO> list = bbs_reService.bbs_reList(cp, listSize, b_idx);
      List<Bbs_ReDTO> list2 = bbs_reService.bbs_rereList(b_idx);
      
      int reCount = bbs_reService.bbs_reCount(b_idx);

      
      mav.addObject("dto", dto);
      mav.addObject("list", list);
      mav.addObject("list2", list2);
      mav.addObject("re_idx", re_idx);
      mav.addObject("reCount", reCount);
      mav.addObject("cp", cp);
      mav.setViewName("bbs/bbs_reUpdate");

      return mav;
   }

   @RequestMapping("/bbs_reUpdate.do")
   public ModelAndView bbs_reUpdate(Bbs_ReDTO dto, @RequestParam("b_idx") int b_idx, @RequestParam("cp") int cp) {
      ModelAndView mav = new ModelAndView();
      
      if (dto.getContent() == null || dto.getContent().equals("")) {
         String msg = "내용을 입력해 주세요.";
         mav.addObject("msg", msg);
         mav.setViewName("bbsmsg");
         return mav;
      }
      
      int result = bbs_reService.re_update(dto);

      
      String msg = result > 0 ? "댓글이 수정 되었습니다." : "댓글 수정을 실패했습니다.";
      String url = "bbsContent.do?b_idx=" + b_idx + "&cp=" + cp + "#re_content";

      mav.addObject("msg", msg);
      mav.addObject("url", url);
      mav.setViewName("msg");

      return mav;
   }

   @RequestMapping("/bbs_reDelete.do")
   public ModelAndView bbs_reDel(@RequestParam(value = "ref", defaultValue = "0")int ref,
         @RequestParam("re_idx") int re_idx, @RequestParam("b_idx") int b_idx) {
      System.out.println("refref="+ref);
      int result=0;
      
      if(ref==0) {
         result = bbs_reService.rere_delete(re_idx);
      }else {
         
         result = bbs_reService.re_delete(ref);
      }
      
      String msg = result > 0 ? "댓글이 삭제 되었습니다." : "댓글 삭제를 실패했습니다.";
      String url = "bbsContent.do?b_idx=" + b_idx + "#reply";

      ModelAndView mav = new ModelAndView();
      mav.addObject("msg", msg);
      mav.addObject("url", url);
      mav.setViewName("msg");

      return mav;

   }

}