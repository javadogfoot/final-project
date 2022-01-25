package com.more.suggest.model;

import java.util.List;
import java.util.Map;

import com.more.document.model.DocumentDTO;
import com.more.member.model.MemberDTO;
import com.more.payhistory.model.PayhistoryDTO;

public interface SuggestDAO {

	// 제안서 목록
	public List<SuggestDTO> suggestList(Map map);

	// 총 제안서 수
	public int suggestCount(Map map);

	// 제안서 작성
	public int suggestWrite(SuggestDTO dto);

	// 제안서 정보
	public SuggestDTO suggestInfo(int s_idx);

	// 제안서 수정
	public int suggestUpdate(SuggestDTO dto);

	// 제안서 삭제
	public int suggestDelete(int s_idx);

	// 요청서에 제안서 작성
	public int requestSuggest(SuggestDTO dto);

	// 맴버 조인
	public SuggestDTO sugContent(int s_idx);

	// 전문가 조인
	public SuggestDTO sugContent2(int s_idx);

	// 결제 의뢰인 정보
	public MemberDTO costMemberInfo(String sessionId);

	// 결제 내역 저장
	public int savePayHistory(PayhistoryDTO dto);

	// 보낸 제안
	public List<SuggestDTO> sentSuggest(Map map);

	// 총 보낸 제안서 수
	public int sentSuggestCount(String id);

	// 받은 제안
	public List<SuggestDTO> receiveSuggest(Map map);

	// 총 받은 제안서 수
	public int receiveSuggestCount(String id);
	
	// d_idx 가져오기
    public int getDidx(DocumentDTO dto);

}
