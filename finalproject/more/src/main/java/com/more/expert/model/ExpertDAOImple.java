package com.more.expert.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import com.more.review.model.ReviewDTO;
import com.more.suggest.model.SuggestDTO;

public class ExpertDAOImple implements ExpertDAO {

	private SqlSessionTemplate sqlmap;

	public ExpertDAOImple(SqlSessionTemplate sqlmap) {
		this.sqlmap = sqlmap;
	}

	public int expertJoin(HashMap<String, String> map) {
		int result = sqlmap.insert("expertJoin", map);
		return result;
	}

	public int expertStatus(String id) {
		int result = sqlmap.update("expertStatus", id);
		return result;
	}

	public ExpertDTO expertProfile(String id) {
		ExpertDTO dto = sqlmap.selectOne("expertProfile", id);
		return dto;
	}
	
	public List<ReviewDTO> expertReviewList(Map map) {
		List<ReviewDTO> list=sqlmap.selectList("expertReviewList", map);
		return list;
	}
	
	public int reviewCnt(String id) {
		int count=sqlmap.selectOne("reviewCnt", id);
		return count;
	}
	
	public List<SuggestDTO> expertSuggestList(Map map) {
		List<SuggestDTO> list=sqlmap.selectList("expertSuggestList", map);
		return list;
	}
	
	public int suggestCnt(String id) {
		int count=sqlmap.selectOne("suggestCnt", id);
		return count;
	}
	
	public ExpertDTO expertInfo(String id) {
		ExpertDTO dto = sqlmap.selectOne("expertInfo", id);
		return dto;
	}

	public int expertIntro(ExpertDTO dto) {
		int result = sqlmap.update("expertIntro", dto);
		return result;
	}

	public int expertSpec(ExpertDTO dto) {
		int result = sqlmap.update("expertSpec", dto);
		return result;
	}

	public int expertLocation(ExpertDTO dto) {
		int result = sqlmap.update("expertLocation", dto);
		return result;
	}
	
	public int expertCate(ExpertDTO dto) {
		int result = sqlmap.update("expertCate", dto);
		return result;
	}
	
	public int expertAccount(ExpertDTO dto) {
		int result = sqlmap.update("expertAccount", dto);
		return result;
	}
	
}
