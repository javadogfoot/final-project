package com.more.center.model;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

import com.more.review.model.ReviewDTO;

public class CenterServiceImple implements CenterService {

   private CenterDAO centerDao;

   public CenterDAO getCenterDao() {
      return centerDao;
   }

   public void setCenterDao(CenterDAO centerDao) {
      this.centerDao = centerDao;
   }
   
   public List<CenterDTO> noticeList(int cp, int ls) {
      int start = (cp - 1) * ls + 1;
      int end = cp * ls;
      Map map = new HashedMap();
      map.put("start", start);
      map.put("end", end);
      List<CenterDTO> list = centerDao.noticeList(map);
      return list;
   }
   
   public int noticeCount() {
      int result = centerDao.noticeCount();
      return result;
   }
   
   public List<CenterDTO> qnaList(int cp, int ls) {
      int start = (cp - 1) * ls + 1;
      int end = cp * ls;
      Map map = new HashedMap();
      map.put("start", start);
      map.put("end", end);
      List<CenterDTO> list = centerDao.qnaList(map);
      return list;
   }
   
   public int qnaCount() {
      int result = centerDao.qnaCount();
      return result;
   }
   
   public CenterDTO qnaAnswer(String a_no) {
      CenterDTO dto = new CenterDTO();
      dto = centerDao.qnaAnswer(a_no);
      return dto;
   }
   
   public CenterDTO noticeContent(int n_idx) {
      CenterDTO dto = new CenterDTO();
      dto = centerDao.noticeContent(n_idx);
      return dto;
   }
   
   public void noticeReadCnt(int n_idx) {
      centerDao.noticeReadCnt(n_idx);
   }
   
   public int qnaWrite(String id, CenterDTO dto) {
      Map map = new HashMap();
      System.out.println("id = " + id);
      map.put("writer", id);
      System.out.println(map.get("writer"));
      map.put("cate", dto.getCate());
      System.out.println(map.get("cate"));
      map.put("title", dto.getTitle());
      System.out.println(map.get("title"));
      map.put("content", dto.getContent());
      System.out.println(map.get("content"));
      int result = centerDao.qnaWrite(map);
      return result;
   }
   
   public int noticeSearchCount(String keyWord) {
		Map map = new HashedMap();
		map.put("keyWord", keyWord);
		int count = centerDao.noticeSearchCount(map);
		return count;
	}

   public int qnaSearchCount(String keyWord) {
 		Map map = new HashedMap();
 		map.put("keyWord", keyWord);
 		int count = centerDao.qnaSearchCount(map);
 		return count;
 	}
   public List<CenterDTO> adminNoticeList(int cp, int ls, String keyWord) {
		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		map.put("keyWord", keyWord);
		List<CenterDTO> list = centerDao.adminNoticeList(map);
		return list;
	}
   public List<CenterDTO> adminQnaList(int cp, int ls, String keyWord) {
		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		map.put("keyWord", keyWord);
		List<CenterDTO> list = centerDao.adminQnaList(map);
		return list;
	}
   public int noticeDel(int n_idx) {
	   int result=centerDao.noticeDel(n_idx);
	   return result;
   }
   public int qnaDel(int q_idx) {
	   int result=centerDao.qnaDel(q_idx);
	   return result;
   }
   public int noticeWrite(CenterDTO dto) {
	   int result=centerDao.noticeWrite(dto);
	   return result;
	}
   public int noticeUpdate(CenterDTO dto) {
	   int result=centerDao.noticeUpdate(dto);
	   return result;
	}
   public CenterDTO qnaInfo(int q_idx) {
		CenterDTO dto=centerDao.qnaInfo(q_idx);
		return dto;
	}
   public int qnaAnswerWrite(CenterDTO dto) {
		int result=centerDao.qnaAnswerWrite(dto);
		return result;
	}
}






















