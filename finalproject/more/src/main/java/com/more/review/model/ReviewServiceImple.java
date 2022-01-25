package com.more.review.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

public class ReviewServiceImple implements ReviewService {

	private ReviewDAO reviewDao;

	public ReviewDAO getReviewDao() {
		return reviewDao;
	}
	
	public int reviewSearchTotalCnt(String keyWord) {
		Map map = new HashedMap();
		map.put("keyWord", keyWord);
		int count = reviewDao.reviewSearchTotalCnt(map);

		return count;
	}

	public void setReviewDao(ReviewDAO reviewDao) {
		this.reviewDao = reviewDao;
	}

	public int getTotalCnt() {
		int count = reviewDao.getTotalCnt();
		return count;
	}
	
	public int totalExpertCnt() {
		int count = reviewDao.totalExpertCnt();
		return count;
	}
	
	public int totalRequestCnt() {
		int count = reviewDao.totalRequestCnt();
		return count;
	}

	public List<ReviewDTO> reviewList(int cp, int ls) {
		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<ReviewDTO> list = reviewDao.reviewList(map);
		return list;
	}
	
	public List<ReviewDTO> mainReviewList() {
		List<ReviewDTO> list = reviewDao.mainReviewList();
		return list;
	}
	
	public List<ReviewDTO> adminReviewList(int cp, int ls, String keyWord) {
		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		map.put("keyWord", keyWord);
		List<ReviewDTO> list = reviewDao.adminReviewList(map);
		return list;
	}

	public int reviewWrite(ReviewDTO dto) {
		int result = reviewDao.reviewWrite(dto);
		return result;
	}

	public ReviewDTO reviewContent(int rv_idx) {
		ReviewDTO dto = reviewDao.reviewContent(rv_idx);
		return dto;
	}

	public int reviewUpdate(ReviewDTO dto) {
		int result = reviewDao.reviewUpdate(dto);
		return result;
	}

	public int reviewDelete(int rv_idx) {
		int result = reviewDao.reviewDelete(rv_idx);
		return result;
	}
}
