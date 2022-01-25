package com.more.expert.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.more.review.model.ReviewDTO;
import com.more.suggest.model.SuggestDTO;

public class ExpertServiceImple implements ExpertService {

	private ExpertDAO expertDao;

	public ExpertDAO getExpertDao() {
		return expertDao;
	}

	public void setExpertDao(ExpertDAO expertDao) {
		this.expertDao = expertDao;
	}

	public int expertJoin(String id, ExpertDTO dto) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("cate1", dto.getCate1());
		map.put("cate2", dto.getCate2());
		map.put("ls_location", dto.getLs_location());
		map.put("process", dto.getProcess());
		map.put("intro", dto.getIntro());
		map.put("univ", dto.getUniv());
		map.put("major", dto.getMajor());
		map.put("career", dto.getCareer());
		map.put("cer", dto.getCer());
		map.put("bank", dto.getBank());
		map.put("account", dto.getAccount());
		int result = expertDao.expertJoin(map);
		int result2 = expertDao.expertStatus(id);
		System.out.println("전문가 결과 = " + result);
		System.out.println("전문가 상태 변경 = " + result2);
		return result;
	}

	public ExpertDTO expertProfile(String id) {
		ExpertDTO dto = expertDao.expertProfile(id);
		return dto;
	}
	
	public List<ReviewDTO> expertReviewList(int cp, int ls, String id) {
		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashMap();
		map.put("id", id);
		map.put("start", start);
		map.put("end", end);
		List<ReviewDTO> list=expertDao.expertReviewList(map);
		return list;
	}
	
	public int reviewCnt(String id) {
		int count=expertDao.reviewCnt(id);
		return count;
	}
	
	public List<SuggestDTO> expertSuggestList(int cp, int ls, String id) {
		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashMap();
		map.put("id", id);
		map.put("start", start);
		map.put("end", end);
		List<SuggestDTO> list=expertDao.expertSuggestList(map);
		return list;
	}
	
	public int suggestCnt(String id) {
		int count=expertDao.suggestCnt(id);
		return count;
	}

	public ExpertDTO expertInfo(String id) {
		ExpertDTO dto = expertDao.expertInfo(id);
		return dto;
	}

	public int expertIntro(ExpertDTO dto) {
		int result = expertDao.expertIntro(dto);
		return result;
	}

	public int expertSpec(ExpertDTO dto) {
		int result = expertDao.expertSpec(dto);
		return result;
	}

	public int expertLocation(ExpertDTO dto) {
		int result = expertDao.expertLocation(dto);
		return result;
	}
	
	public int expertCate(ExpertDTO dto) {
		int result = expertDao.expertCate(dto);
		return result;
	}
	
	public int expertAccount(ExpertDTO dto) {
		int result = expertDao.expertAccount(dto);
		return result;
	}
}
