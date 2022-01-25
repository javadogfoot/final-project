package com.more.request.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

public class RequestServiceImple implements RequestService {

	private RequestDAO requestDao;

	public RequestDAO getRequestDao() {
		return requestDao;
	}

	public void setRequestDao(RequestDAO requestDao) {
		this.requestDao = requestDao;
	}

	public int requestWrite(RequestDTO dto) {
		int result = requestDao.requestWrite(dto);
		return result;
	}

	public RequestDTO requestContent(int r_idx) {
		RequestDTO dto = requestDao.requestContent(r_idx);
		return dto;
	}
	
	public int requestUpdate(RequestDTO dto) {
		int result=requestDao.requestUpdate(dto);
		return result;
	}
	public int requestDelete(int r_idx) {
		int result=requestDao.requestDelete(r_idx);
		return result;
	}
	
	public List<RequestDTO> reqeustList(int cp, int ls, String ct1, String ct2) {
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
		List<RequestDTO> list = requestDao.requestList(map);
		return list;
	}
	
	public int requestCount(String ct1, String ct2) {
		Map map = new HashMap();
		map.put("cate1", ct1);
		map.put("cate2", ct2);
		int result = requestDao.requestCount(map);
		return result;
	}
	
	public List<RequestDTO> sentRequest(int cp, int ls, String id) {
		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashedMap();
		map.put("start", start);
		map.put("end", end);
		map.put("id", id);
		List<RequestDTO> list = requestDao.sentRequest(map);
		return list;
	}
	
	 public int sentRequestCount(String id) {
	    int result = requestDao.sentRequestCount(id);
	  return result;
	}
}
