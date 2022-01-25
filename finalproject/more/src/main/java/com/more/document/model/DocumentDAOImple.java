package com.more.document.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

public class DocumentDAOImple implements DocumentDAO {

	SqlSessionTemplate sqlmap;
	

	public DocumentDAOImple(SqlSessionTemplate sqlmap) {
		super();
		this.sqlmap = sqlmap;
	}


	public List<DocumentDTO> m_documentList(String sessionId) {
	      List<DocumentDTO> list=sqlmap.selectList("m_documentList", sessionId);
	      return list;
	   }
	public List<DocumentDTO> e_documentList(Map map) {
		List<DocumentDTO> list=sqlmap.selectList("e_documentList", map);
		return list;
	}

	public int e_documentCnt(String e_id) {
		int count = sqlmap.selectOne("e_documentCnt",e_id);
		return count;
	}
	public DocumentDTO documentContent(int d_idx) {
		DocumentDTO dto=sqlmap.selectOne("documentContent", d_idx);
		return dto;
	}
	public int saveDocument(DocumentDTO dto) {
	    int result = sqlmap.insert("saveDocument", dto);
	    return result;
	}
}
