package com.more.expert.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.more.review.model.ReviewDTO;
import com.more.suggest.model.SuggestDTO;

public interface ExpertDAO {

	// 전문가 등록
	public int expertJoin(HashMap<String, String> map);

	// 전문가 등록후 상태변경
	public int expertStatus(String id);

	// 전문가 프로필
	public ExpertDTO expertProfile(String id);
	
	// 전문가 리뷰 목록
	public List<ReviewDTO> expertReviewList(Map map);
	
	// 전문가 리뷰 총 수
	public int reviewCnt(String id);
	
	// 전문가 제안서 목록
	public List<SuggestDTO> expertSuggestList(Map map);
	
	// 전문가 제안서 총 수
	public int suggestCnt(String id);

	// 전문가 프로필 정보
	public ExpertDTO expertInfo(String id);

	// 전문가 소개 수정
	public int expertIntro(ExpertDTO dto);

	// 전문가 학력 수정
	public int expertSpec(ExpertDTO dto);

	// 전문가 주소 수정
	public int expertLocation(ExpertDTO dto);

	//전문가 카테고리 수정
	public int expertCate(ExpertDTO dto);
	
	// 전문가 계좌 수정
	public int expertAccount(ExpertDTO dto);
}
