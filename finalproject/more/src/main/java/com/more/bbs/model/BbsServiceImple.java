package com.more.bbs.model;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

public class BbsServiceImple implements BbsService {

	private BbsDAO bbsDao;

	public BbsDAO getBbsDao() {
		return bbsDao;
	}

	public void setBbsDao(BbsDAO bbsDao) {
		this.bbsDao = bbsDao;
	}

	public List<BbsDTO> bbsList(int cp, int ls, String keyWord) {

		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashedMap();

		map.put("start", start);
		map.put("end", end);
		map.put("keyWord", keyWord);

		List<BbsDTO> list = bbsDao.bbsList(map);

		return list;
	}

	public int bbstotalCnt() {
		int count = bbsDao.bbsgetTotalCnt();
		return count;
	}

	public int bbsSearchTotalCnt(String keyWord) {
		Map map = new HashedMap();
		map.put("keyWord", keyWord);
		int count = bbsDao.bbsgetSearchTotalCnt(map);

		return count;
	}

	public int bbsWrite(BbsDTO dto) {
		dto.setContent(dto.getContent().replace("\n", "<br>"));
		int result = bbsDao.bbsWrite(dto);

		return result;
	}

	public BbsDTO bbsContent(int b_idx) {

		BbsDTO dto = bbsDao.bbsContent(b_idx);
		return dto;
	}

	public int bbsUpdate(BbsDTO dto) {

		int count = bbsDao.bbsUpdate(dto);
		return count;
	}

	public int bbsDel(int b_idx) {

		int count = bbsDao.bbsDel(b_idx);
		return count;
	}

	public void bbsCount(int b_idx) {
		bbsDao.bbsCount(b_idx);

	}
}
