package com.more.suggest.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

import com.more.document.model.DocumentDTO;
import com.more.member.model.MemberDTO;
import com.more.payhistory.model.PayhistoryDTO;

public class SuggestServiceImple implements SuggestService {

	private SuggestDAO suggestDao;

	public SuggestDAO getSuggestDao() {
		return suggestDao;
	}

	public void setSuggestDao(SuggestDAO suggestDao) {
		this.suggestDao = suggestDao;
	}

	public List<SuggestDTO> suggestList(int cp, int ls, String ct1, String ct2) {
		String cate1 = ct1;
		String cate2 = ct2;
		if (cate1.equals("카테고리")) {
			cate1 = "";
		}
		if (cate2.equals("세부분야")) {
			cate2 = "";
		}
		System.out.println(cate1 + "ct1");
		System.out.println(cate2 + "ct2");
		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashedMap();
		map.put("start", start);
		map.put("end", end);
		map.put("cate1", cate1);
		map.put("cate2", cate2);
		List<SuggestDTO> list = suggestDao.suggestList(map);
		return list;
	}

	public int suggestCount(String ct1, String ct2) {
		Map map = new HashMap();
		map.put("cate1", ct1);
		map.put("cate2", ct2);
		int result = suggestDao.suggestCount(map);
		return result;
	}

	public int suggestWrite(SuggestDTO dto) {
		int result = suggestDao.suggestWrite(dto);
		return result;
	}

	public SuggestDTO suggestInfo(int s_idx) {
		SuggestDTO dto = suggestDao.suggestInfo(s_idx);
		return dto;
	}

	public int suggestUpdate(SuggestDTO dto) {
		int result = suggestDao.suggestUpdate(dto);
		return result;
	}

	public int suggestDelete(int s_idx) {
		int result = suggestDao.suggestDelete(s_idx);
		return result;
	}

	public int requestSuggest(SuggestDTO dto) {
		int result = suggestDao.requestSuggest(dto);
		return result;
	}

	public SuggestDTO sugContent(int s_idx) {
		SuggestDTO dto = suggestDao.sugContent(s_idx);
		return dto;
	}

	public SuggestDTO sugContent2(int s_idx) {
		SuggestDTO dto = suggestDao.sugContent2(s_idx);
		return dto;
	}

	public MemberDTO costMemberInfo(String sessionId) {
		MemberDTO dto = suggestDao.costMemberInfo(sessionId);
		return dto;
	}

	public int savePayHistory(PayhistoryDTO dto) {
		int result = suggestDao.savePayHistory(dto);
		return result;
	}

	public List<SuggestDTO> sentSuggest(int cp, int ls, String id) {
		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashedMap();
		map.put("start", start);
		map.put("end", end);
		map.put("id", id);
		List<SuggestDTO> list = suggestDao.sentSuggest(map);
		return list;
	}

	public int sentSuggestCount(String id) {
		int result = suggestDao.sentSuggestCount(id);
		return result;
	}

	public List<SuggestDTO> receiveSuggest(int cp, int ls, String id) {
		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashedMap();
		map.put("start", start);
		map.put("end", end);
		map.put("id", id);
		List<SuggestDTO> list = suggestDao.receiveSuggest(map);
		return list;
	}

	public int receiveSuggestCount(String id) {
		int result = suggestDao.receiveSuggestCount(id);
		return result;
	}
	
	public int getDidx(DocumentDTO dto) {
        int result = suggestDao.getDidx(dto);
        return result;
    }
}
