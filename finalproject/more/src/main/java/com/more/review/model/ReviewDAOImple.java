package com.more.review.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

public class ReviewDAOImple implements ReviewDAO {

	private SqlSessionTemplate sqlmap;

	public ReviewDAOImple(SqlSessionTemplate sqlmap) {
		this.sqlmap = sqlmap;
	}

	public int getTotalCnt() {
		int count = sqlmap.selectOne("totalCnt");
		return count;
	}
	public int reviewSearchTotalCnt(Map map) {
		int count = sqlmap.selectOne("reviewSearchTotalCnt", map);
		return count;
	}
	
	public int totalExpertCnt() {
		int count = sqlmap.selectOne("totalExpertCnt");
		return count;
	}
	
	public int totalRequestCnt() {
		int count = sqlmap.selectOne("totalRequestCnt");
		return count;
	}

	public List<ReviewDTO> reviewList(Map map) {
		List<ReviewDTO> list = sqlmap.selectList("reviewList", map);
		return list;
	}
	public List<ReviewDTO> mainReviewList() {
		List<ReviewDTO> list = sqlmap.selectList("mainReviewList");
		return list;
	}
	public List<ReviewDTO> adminReviewList(Map map) {
		List<ReviewDTO> list = sqlmap.selectList("adminReviewList", map);
		return list;
	}

	public int reviewWrite(ReviewDTO dto) {
		int result = sqlmap.insert("reviewWrite", dto);
		return result;
	}

	public ReviewDTO reviewContent(int rv_idx) {
		ReviewDTO dto = sqlmap.selectOne("reviewContent", rv_idx);
		return dto;
	}

	public int reviewUpdate(ReviewDTO dto) {
		int result = sqlmap.update("reviewUpdate", dto);
		return result;
	}

	public int reviewDelete(int rv_idx) {
		int result = sqlmap.delete("reviewDelete", rv_idx);
		return result;
	}
}
