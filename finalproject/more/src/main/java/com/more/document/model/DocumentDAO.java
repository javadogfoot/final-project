package com.more.document.model;

import java.util.List;
import java.util.Map;

public interface DocumentDAO {

	// 의뢰인의 레슨 목록
	public List<DocumentDTO> m_documentList(String sessionId);
	
	// 전문가의 레슨 목록
	public List<DocumentDTO> e_documentList(Map map);
	
	// 전문가 레슨수
	public int e_documentCnt(String e_id);
	
	// 체결레슨 본문
	public DocumentDTO documentContent(int d_idx);
	
	// 결제 완료시 document 테이블에 저장
	public int saveDocument(DocumentDTO dto);
}
