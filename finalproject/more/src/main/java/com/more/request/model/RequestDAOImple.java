package com.more.request.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

public class RequestDAOImple implements RequestDAO {

	private SqlSessionTemplate sqlmap;

	public RequestDAOImple(SqlSessionTemplate sqlmap) {
		super();
		this.sqlmap = sqlmap;
	}

	public int requestWrite(RequestDTO dto) {
		int result = sqlmap.insert("requestWrite", dto);
		return result;
	}

	public RequestDTO requestContent(int r_idx) {
		RequestDTO dto = sqlmap.selectOne("requestInfo", r_idx);
		return dto;
	}
	
	public int requestUpdate(RequestDTO dto) {
		int result=sqlmap.update("requestUpdate", dto);
		return result;
	}
	public int requestDelete(int r_idx) {
		int result=sqlmap.delete("requestDelete", r_idx);
		return result;
	}

	public List<RequestDTO> requestList(Map map) {
		List<RequestDTO> list = sqlmap.selectList("requestList", map);
		return list;
	}

	public int requestCount(Map map) {
		int result = sqlmap.selectOne("requestCount", map);
		return result;
	}
	
	public List<RequestDTO> sentRequest(Map map) {
		List<RequestDTO> list = sqlmap.selectList("sentRequest", map);
		return list;
	}
	
	public int sentRequestCount(String id) {
		int result = sqlmap.selectOne("sentRequestCount", id);
		return result;
	}
}
