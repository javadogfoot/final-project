package com.more.center.model;

import java.util.List;
import java.util.Map;

public interface CenterService {

   public List<CenterDTO> noticeList(int cp, int ls);
   
   public int noticeCount();
   
   public List<CenterDTO> qnaList(int cp, int ls);
   
   public int qnaCount();
   
   public CenterDTO qnaAnswer(String a_no);
   
   public CenterDTO noticeContent(int n_idx);
   
   public void noticeReadCnt(int n_idx);
   
   public int qnaWrite(String id, CenterDTO dto);
   
   public int noticeSearchCount(String keyWord);

   public int qnaSearchCount(String keyWord);
   
   public List<CenterDTO> adminNoticeList(int cp, int ls, String keyWord);
   
   public List<CenterDTO> adminQnaList(int cp, int ls, String keyWord);
   
   public int noticeDel(int n_idx);
   
   public int qnaDel(int q_idx);
   
   public int noticeWrite(CenterDTO dto);
   
   public int noticeUpdate(CenterDTO dto);
   
   public CenterDTO qnaInfo(int q_idx);
   
   public int qnaAnswerWrite(CenterDTO dto);
}