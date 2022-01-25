package com.more.review.model;

import java.util.List;

public interface ReviewService {

	public int getTotalCnt();
	
	public int reviewSearchTotalCnt(String keyWord);

	public int totalExpertCnt();
	
	public int totalRequestCnt();

	public List<ReviewDTO> reviewList(int cp, int ls);
	
	public List<ReviewDTO> mainReviewList();
	
	public List<ReviewDTO> adminReviewList(int cp, int ls, String keyWord);

	public int reviewWrite(ReviewDTO dto);

	public ReviewDTO reviewContent(int rv_idx);

	public int reviewUpdate(ReviewDTO dto);

	public int reviewDelete(int rv_idx);
}
