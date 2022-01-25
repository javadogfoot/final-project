package com.more.suggest.model;

import java.util.List;
import java.util.Map;

import com.more.document.model.DocumentDTO;
import com.more.member.model.MemberDTO;
import com.more.payhistory.model.PayhistoryDTO;

public interface SuggestService {

	public List<SuggestDTO> suggestList(int cp, int ls, String cate1, String cate2);

	public int suggestCount(String ct1, String ct2);

	public int suggestWrite(SuggestDTO dto);
	
	public SuggestDTO suggestInfo(int s_idx);
	
	public int suggestUpdate(SuggestDTO dto);
	
	public int suggestDelete(int s_idx);
	
	public int requestSuggest(SuggestDTO dto);

    public SuggestDTO sugContent(int s_idx);
    
    public SuggestDTO sugContent2(int s_idx);
    
    public MemberDTO costMemberInfo(String sessionId);
    
    public int savePayHistory(PayhistoryDTO dto);
    
    public List<SuggestDTO> sentSuggest(int cp, int ls, String id);
    
    public int sentSuggestCount(String id);
    
    public List<SuggestDTO> receiveSuggest(int cp, int ls, String id);
   
    public int receiveSuggestCount(String id);
    
    public int getDidx(DocumentDTO dto);
}
