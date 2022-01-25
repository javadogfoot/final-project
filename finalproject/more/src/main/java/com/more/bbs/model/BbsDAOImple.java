package com.more.bbs.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

public class BbsDAOImple implements BbsDAO {

	private SqlSessionTemplate sqlmap;

	public BbsDAOImple(SqlSessionTemplate sqlmap) {
		super();
		this.sqlmap = sqlmap;
	}

	public List<BbsDTO> bbsList(Map map) {

		List<BbsDTO> list = sqlmap.selectList("bbsList", map);

		return list;
	}

	public int bbsgetTotalCnt() {

		int count = sqlmap.selectOne("bbstotalCnt");
		return count;
	}

	public int bbsgetSearchTotalCnt(Map map) {
		int count = sqlmap.selectOne("bbssearchTotalCnt", map);
		return count;
	}

	public int bbsWrite(BbsDTO dto) {

		int result = sqlmap.insert("bbsWrite", dto);
		return result;
	}

	public BbsDTO bbsContent(int b_idx) {

		BbsDTO dto = sqlmap.selectOne("bbsContent", b_idx);

		return dto;
	}

	public int bbsUpdate(BbsDTO dto) {
		int count = sqlmap.update("bbsUpdate", dto);

		return count;
	}

	public int bbsDel(int b_idx) {
		int count = sqlmap.delete("bbsDel", b_idx);
		return count;
	}

	public void bbsCount(int b_idx) {
		sqlmap.update("bbsCount", b_idx);

	}
}
