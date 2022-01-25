package com.more.center.model;

import java.util.List;
import java.util.Map;

import com.more.review.model.ReviewDTO;

public interface CenterDAO {

   // 공지사항 목록
   public List<CenterDTO> noticeList(Map map);
   
   // 총 공지사항 수
   public int noticeCount();
   
   // QNA 목록
   public List<CenterDTO> qnaList(Map map);
   
   // 총 QNA 수
   public int qnaCount();
   
   // QNA 답변
   public CenterDTO qnaAnswer(String a_no);
   
   // 공지사항 본문보기
   public CenterDTO noticeContent(int n_idx);
   
   // 공지사항 조회수
   public void noticeReadCnt(int n_idx);
   
   // QNA 질문
   public int qnaWrite(Map map);
   
   // 검색 공지사항 수 
   public int noticeSearchCount(Map map);
   
   // 검색 QNA 수 
   public int qnaSearchCount(Map map);
   
   // 관리자 공지사항 목록
   public List<CenterDTO> adminNoticeList(Map map);
   
   // 관리자 QNA 목록
   public List<CenterDTO> adminQnaList(Map map);
   
   // 공지사항 삭제
   public int noticeDel(int n_idx);
   
   // QNA 삭제
   public int qnaDel(int q_idx);
   
   // 공지사항 글쓰기
   public int noticeWrite(CenterDTO dto);
   
   // 공지사항 수정
   public int noticeUpdate(CenterDTO dto);
   
   // QNA 질문 내용
   public CenterDTO qnaInfo(int q_idx);
   
   // QNA 답변 글쓰기
   public int qnaAnswerWrite(CenterDTO dto);
}























