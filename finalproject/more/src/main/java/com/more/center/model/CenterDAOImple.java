package com.more.center.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

public class CenterDAOImple implements CenterDAO {

   private SqlSessionTemplate sqlmap;

   public CenterDAOImple(SqlSessionTemplate sqlmap) {
      this.sqlmap = sqlmap;
   }
   
   public List<CenterDTO> noticeList(Map map) {
      List<CenterDTO> list = sqlmap.selectList("noticeList", map);
      return list;
   }
   
   public int noticeCount() {
      int result = sqlmap.selectOne("noticeCount");
      return result;
   }
   
   public List<CenterDTO> qnaList(Map map) {
      List<CenterDTO> list = sqlmap.selectList("qnaList", map);
      return list;
   }
   
   public int qnaCount() {
      int result = sqlmap.selectOne("qnaCount");
      return result;
   }
   
   public CenterDTO qnaAnswer(String a_no) {
      CenterDTO dto = new CenterDTO();
      dto = sqlmap.selectOne("qnaAnswer", a_no);
      return dto;
   }
   
   public CenterDTO noticeContent(int n_idx) {
      CenterDTO dto = new CenterDTO();
      dto = sqlmap.selectOne("noticeContent", n_idx);
      return dto;
   }
   
   public void noticeReadCnt(int n_idx) {
      sqlmap.update("noticeReadCnt", n_idx);
   }
   
   public int qnaWrite(Map map) {
      int result = sqlmap.insert("qnaWrite", map);
      return result;
   }
   public int noticeSearchCount(Map map) {
		int count = sqlmap.selectOne("noticeSearchCount", map);
		return count;
   }
   public int qnaSearchCount(Map map) {
		int count = sqlmap.selectOne("qnaSearchCount", map);
		return count;
	}
   public List<CenterDTO> adminNoticeList(Map map) {
		List<CenterDTO> list = sqlmap.selectList("adminNoticeList", map);
		return list;
	}
   public List<CenterDTO> adminQnaList(Map map) {
		List<CenterDTO> list = sqlmap.selectList("adminQnaList", map);
		return list;
	}
   public int noticeDel(int n_idx) {
		int result = sqlmap.delete("noticeDel", n_idx);
		return result;
	}
   public int qnaDel(int q_idx) {
	   int result = sqlmap.delete("qnaDel", q_idx);
		return result;
	}
   public int noticeWrite(CenterDTO dto) {
	   int result = sqlmap.insert("noticeWrite", dto);
		return result;
	}
   public int noticeUpdate(CenterDTO dto) {
	   int result = sqlmap.update("noticeUpdate", dto);
		return result;
	}
   public CenterDTO qnaInfo(int q_idx) {
		CenterDTO dto = sqlmap.selectOne("qnaInfo", q_idx);
		return dto;
	}
   public int qnaAnswerWrite(CenterDTO dto) {
		int result = sqlmap.insert("qnaAnswerWrite", dto);
		return result;
	}
}













