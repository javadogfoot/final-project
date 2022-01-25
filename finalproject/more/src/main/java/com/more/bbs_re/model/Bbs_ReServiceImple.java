package com.more.bbs_re.model;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

public class Bbs_ReServiceImple implements Bbs_ReService {

	private Bbs_ReDAO bbs_reDao;

	public Bbs_ReDAO getBbs_reDao() {
		return bbs_reDao;
	}

	public void setBbs_reDao(Bbs_ReDAO bbs_reDao) {
		this.bbs_reDao = bbs_reDao;
	}

	public List<Bbs_ReDTO> bbs_reList(int cp, int ls, int b_idx) {
		int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashedMap();

		map.put("start", start);
		map.put("end", end);
		map.put("b_idx", b_idx);

		List<Bbs_ReDTO> list = bbs_reDao.bbs_reList(map);

		return list;
	}

	public List<Bbs_ReDTO> bbs_rereList(int b_idx) {

		List<Bbs_ReDTO> list = bbs_reDao.bbs_rereList(b_idx);

		return list;
	}

	public int re_write(Bbs_ReDTO dto) {

		int count = bbs_reDao.re_Write(dto);
		dto.setContent(dto.getContent().replace("\n", "<br>"));

		return count;
	}

	public int rere_write(Bbs_ReDTO dto) {

		int count = bbs_reDao.bbs_rereWrite(dto);

		return count;
	}

	public int maxref() {

		int result = bbs_reDao.maxref();

		return result;
	}

	public int re_update(Bbs_ReDTO dto) {

		int count = bbs_reDao.re_update(dto);

		return count;
	}

	public int bbs_reCount(int b_idx) {

		int result = bbs_reDao.bbs_reCount(b_idx);

		return result;
	}

	public int bbs_rereCount(int re_idx) {

		int result = bbs_reDao.bbs_rereCount(re_idx);

		return result;
	}

	public int bbs_reTotalCnt(int b_idx) {
		int result = bbs_reDao.bbs_reTotalCnt(b_idx);
		return result;
	}

	public int re_delete(int ref) {

		int count = bbs_reDao.re_delete(ref);

		return count;
	}

	public int rere_delete(int re_idx) {

		int count = bbs_reDao.rere_delete(re_idx);

		return count;
	}

}
