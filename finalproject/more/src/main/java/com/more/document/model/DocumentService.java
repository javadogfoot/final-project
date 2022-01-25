package com.more.document.model;

import java.util.List;
import java.util.Map;

public interface DocumentService {

	public List<DocumentDTO> m_documentList(String sessionId);
	
	public List<DocumentDTO> e_documentList(int cp, int ls, String id);
	
	public int e_documentCnt(String id);
	
	public DocumentDTO documentContent(int d_idx);
	
	public int saveDocument(DocumentDTO dto);
}
