package com.more.bbs_re.model;

import java.util.List;
import java.util.Map;

public interface Bbs_ReDAO {

	// 댓글 리스트
	public List<Bbs_ReDTO> bbs_reList(Map map);

	// 대댓글 리스트
	public List<Bbs_ReDTO> bbs_rereList(int b_idx);

	// 댓글 작성
	public int re_Write(Bbs_ReDTO dto);

	// 대댓글 작성
	public int bbs_rereWrite(Bbs_ReDTO dto);

	// ref 최대값
	public int maxref();

	// 댓글 수정
	public int re_update(Bbs_ReDTO dto);

	// 댓글 삭제
    public int re_delete(int ref);

	// 댓글 갯수
	public int bbs_reCount(int b_idx);

	// 대댓글 갯수
	public int bbs_rereCount(int re_idx);

	// 댓글 총갯수
	public int bbs_reTotalCnt(int b_idx);
	
    //대댓글 삭제
    public int rere_delete(int re_idx);
}
