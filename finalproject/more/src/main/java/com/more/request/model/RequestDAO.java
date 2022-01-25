package com.more.request.model;

import java.util.List;
import java.util.Map;

public interface RequestDAO {

	// 요청서 글쓰기
	public int requestWrite(RequestDTO dto);

	// 요청서 본문
	public RequestDTO requestContent(int r_idx);

	//요청서 수정
	public int requestUpdate(RequestDTO dto);
	
	//요청서 삭제
	public int requestDelete(int r_idx);
		
	// 요청서 목록
	public List<RequestDTO> requestList(Map map);
	
	// 총 요청서 수
	public int requestCount(Map map);
	
	// 보낸 요청
	public List<RequestDTO> sentRequest(Map map);
	
	// 총 보낸 요청서 수
	public int sentRequestCount(String id);
}
