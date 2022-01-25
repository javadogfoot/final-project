package com.more.bbs_re.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

public class Bbs_ReDAOImple implements Bbs_ReDAO {

	private SqlSessionTemplate sqlmap;

	public Bbs_ReDAOImple(SqlSessionTemplate sqlmap) {
		super();
		this.sqlmap = sqlmap;
	}

	public List<Bbs_ReDTO> bbs_reList(Map map) {

		List<Bbs_ReDTO> list = sqlmap.selectList("bbs_reList", map);

		return list;
	}

	public List<Bbs_ReDTO> bbs_rereList(int b_idx) {

		List<Bbs_ReDTO> list = sqlmap.selectList("rereList", b_idx);

		return list;
	}

	public int re_Write(Bbs_ReDTO dto) {

		int count = sqlmap.insert("re_write", dto);
		System.out.println("count = " + count);
		return count;
	}

	public int bbs_rereWrite(Bbs_ReDTO dto) {

		int count = sqlmap.insert("rere_write", dto);

		return count;
	}

	public int maxref() {

		int count = 0;
		String result = sqlmap.selectOne("maxref");
		if (result == null) {
			result = "0";
			count = Integer.parseInt(result);
		} else if (result != null) {
			int a = Integer.parseInt(result);
			count = a;
		}
		return count;
	}

	public int re_update(Bbs_ReDTO dto) {

		int count = sqlmap.update("bbs_reUpdate", dto);

		return count;
	}

	public int bbs_reCount(int b_idx) {

		int result = sqlmap.selectOne("bbs_reCount", b_idx);

		return result;
	}

	public int bbs_rereCount(int re_idx) {

		int result = sqlmap.selectOne("bbs_rereCount", re_idx);

		return result;
	}

	public int bbs_reTotalCnt(int b_idx) {

		int result = sqlmap.selectOne("bbs_reTotalCnt", b_idx);

		return result;
	}

	public List<Bbs_ReDTO> bbs_reUpdateList(int b_idx) {

		List<Bbs_ReDTO> list = sqlmap.selectList("bbs_reUpdateList", b_idx);

		return list;
	}

	public int re_delete(int ref) {

		int count = sqlmap.update("bbs_reDel", ref);

		return count;
	}

	public int rere_delete(int re_idx) {

		int count = sqlmap.update("bbs_rereDel", re_idx);

		return count;
	}
}
