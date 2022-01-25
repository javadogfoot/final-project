package com.more.bbs.model;

import java.util.List;

public interface BbsService {

	public List<BbsDTO> bbsList(int cp, int ls, String keyWord);

	public int bbstotalCnt();

	public int bbsSearchTotalCnt(String keyWord);

	public int bbsWrite(BbsDTO dto);

	public BbsDTO bbsContent(int b_idx);

	public int bbsUpdate(BbsDTO dto);

	public int bbsDel(int b_idx);

	public void bbsCount(int b_idx);
}
