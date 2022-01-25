package com.more.document.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentServiceImple implements DocumentService {

	DocumentDAO documentDao;
	

	public DocumentDAO getDocumentDao() {
		return documentDao;
	}


	public void setDocumentDao(DocumentDAO documentDao) {
		this.documentDao = documentDao;
	}

	public List<DocumentDTO> m_documentList(String sessionId) {
	      
	      List<DocumentDTO> list=documentDao.m_documentList(sessionId);
	      return list;
	   }
	
	public List<DocumentDTO> e_documentList(int cp, int ls, String id) {
		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		map.put("id", id);
		List<DocumentDTO> list=documentDao.e_documentList(map);
		return list;
	}
	
	public int e_documentCnt(String id) {
		int count=documentDao.e_documentCnt(id);
		return count;
	}
	
	public DocumentDTO documentContent(int d_idx) {
		DocumentDTO dto=documentDao.documentContent(d_idx);
		return dto;
	}
	public int saveDocument(DocumentDTO dto) {
	    int result = documentDao.saveDocument(dto);
	    return result;
	}

}
