package com.more.bbs.model;

import java.util.List;
import java.util.Map;

public interface BbsDAO {
	
	// 게시판 목록
	List<BbsDTO> bbsList(Map map);
	
	// 총 게시물 수
	public int bbsgetTotalCnt();
	
	// 검색했을떄 게시물 수 
	public int bbsgetSearchTotalCnt(Map map);
	
	// 게시판 글 쓰기
	public int bbsWrite(BbsDTO dto);
	
	// 게시판 본문보기
	public BbsDTO bbsContent(int b_idx);
	
	// 게시판 수정
	public int bbsUpdate(BbsDTO dto);
	
	// 게시판 삭제
	public int bbsDel(int b_idx);
	
	// 게시판 조회수
	public void bbsCount(int b_idx);
}
