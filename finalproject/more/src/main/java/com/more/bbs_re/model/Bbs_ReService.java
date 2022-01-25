package com.more.bbs_re.model;

import java.util.List;

public interface Bbs_ReService {

	public List<Bbs_ReDTO> bbs_reList(int cp, int listSize, int b_idx);

	public List<Bbs_ReDTO> bbs_rereList(int b_idx);

	public int re_write(Bbs_ReDTO dto);

	public int rere_write(Bbs_ReDTO dto);

	public int maxref();

	public int re_update(Bbs_ReDTO dto);

	public int re_delete(int ref);

	public int bbs_reCount(int b_idx);

	public int bbs_rereCount(int re_idx);

	public int bbs_reTotalCnt(int b_idx);
	
	public int rere_delete(int re_idx);
}
