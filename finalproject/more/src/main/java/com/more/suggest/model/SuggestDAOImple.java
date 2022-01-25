package com.more.suggest.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import com.more.document.model.DocumentDTO;
import com.more.member.model.MemberDTO;
import com.more.payhistory.model.PayhistoryDTO;

public class SuggestDAOImple implements SuggestDAO {

	private SqlSessionTemplate sqlmap;

	public SuggestDAOImple(SqlSessionTemplate sqlmap) {
		super();
		this.sqlmap = sqlmap;
	}

	public List<SuggestDTO> suggestList(Map map) {
		List<SuggestDTO> list = sqlmap.selectList("suggestList", map);
		return list;
	}

	public int suggestCount(Map map) {
		int result = sqlmap.selectOne("suggestCount", map);
		return result;
	}

	public int suggestWrite(SuggestDTO dto) {
		int result = sqlmap.insert("suggestWrite", dto);
		return result;
	}

	public SuggestDTO suggestInfo(int s_idx) {
		SuggestDTO dto = sqlmap.selectOne("suggestInfo", s_idx);
		return dto;
	}

	public int suggestUpdate(SuggestDTO dto) {
		int result = sqlmap.update("suggestUpdate", dto);
		return result;
	}

	public int suggestDelete(int s_idx) {
		int result = sqlmap.delete("suggestDelete", s_idx);
		return result;
	}

	public int requestSuggest(SuggestDTO dto) {
		int result = sqlmap.insert("requestSuggest", dto);
		return result;
	}

	public SuggestDTO sugContent(int s_idx) {
		SuggestDTO dto = sqlmap.selectOne("sugContent", s_idx);
		return dto;
	}

	public SuggestDTO sugContent2(int s_idx) {
		SuggestDTO dto = sqlmap.selectOne("sugContent2", s_idx);
		return dto;
	}

	public MemberDTO costMemberInfo(String sessionId) {

		MemberDTO dto = sqlmap.selectOne("costMemberInfo", sessionId);

		return dto;
	}

	public int savePayHistory(PayhistoryDTO dto) {
		int result = sqlmap.insert("savePayHistory", dto);
		return result;
	}

	public List<SuggestDTO> sentSuggest(Map map) {
		List<SuggestDTO> list = sqlmap.selectList("sentSuggest", map);
		return list;
	}

	public int sentSuggestCount(String id) {
		int result = sqlmap.selectOne("sentSuggestCount", id);
		return result;
	}

	public List<SuggestDTO> receiveSuggest(Map map) {
		List<SuggestDTO> list = sqlmap.selectList("receiveSuggest", map);
		return list;
	}

	public int receiveSuggestCount(String id) {
		int result = sqlmap.selectOne("receiveSuggestCount", id);
		return result;
	}
	
	public int getDidx(DocumentDTO dto) {
        int result = sqlmap.selectOne("getDidx", dto);
        return result;
    }

}
