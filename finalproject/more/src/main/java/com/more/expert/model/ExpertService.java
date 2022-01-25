package com.more.expert.model;

import java.util.List;

import com.more.review.model.ReviewDTO;
import com.more.suggest.model.SuggestDTO;

public interface ExpertService {

	public int expertJoin(String id, ExpertDTO dto);

	public ExpertDTO expertProfile(String id);
	
	public List<ReviewDTO> expertReviewList(int cp, int ls, String id);
	
	public int reviewCnt(String id);
	
	public List<SuggestDTO> expertSuggestList(int cp, int ls, String id);
	
	public int suggestCnt(String id);

	public ExpertDTO expertInfo(String id);

	public int expertIntro(ExpertDTO dto);

	public int expertSpec(ExpertDTO dto);

	public int expertLocation(ExpertDTO dto);

	public int expertCate(ExpertDTO dto);
	
	public int expertAccount(ExpertDTO dto);
}
