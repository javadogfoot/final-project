package com.more.review.model;

import java.util.List;
import java.util.Map;

public interface ReviewDAO {

	// 총 리뷰수
	public int getTotalCnt();
	
	// 검색 게시물 수 
	public int reviewSearchTotalCnt(Map map);
	
	// 총 전문가수
	public int totalExpertCnt();
	// 총 요청서수
	public int totalRequestCnt();
	
	// 리뷰 목록 
	public List<ReviewDTO> reviewList(Map map);
	public List<ReviewDTO> mainReviewList();
	
	// 관리자 리뷰 목록
	public List<ReviewDTO> adminReviewList(Map map);
	
	// 리뷰 글쓰기
	public int reviewWrite(ReviewDTO dto);
	
	// 리뷰 본문 보기
	public ReviewDTO reviewContent(int rv_idx);
	
    // 리뷰 수정
    public int reviewUpdate(ReviewDTO dto);
   
    // 리뷰 삭제
    public int reviewDelete(int rv_idx);
}
