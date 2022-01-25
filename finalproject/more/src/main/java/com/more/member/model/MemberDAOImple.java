package com.more.member.model;

import org.mybatis.spring.SqlSessionTemplate;

import oracle.net.aso.e;

public class MemberDAOImple implements MemberDAO {

	private SqlSessionTemplate sqlmap;

	public MemberDAOImple(SqlSessionTemplate sqlmap) {
		this.sqlmap = sqlmap;
	}

	public int memberJoin(MemberDTO dto) {
		if (dto.getPic_path().equals("") || dto.getPic_path() == null) {
			dto.setPic_path("profile_default.png");
		}
		int result = sqlmap.insert("memberJoin", dto);
		return result;
	}

	public int idCheck(String id) {
		int result = sqlmap.selectOne("idCheck", id);
		return result;
	}

	public String login(String id, String pwd) {
		String password = sqlmap.selectOne("login", id);
		return password;
	}
	
	public String sessionName(String id) {
		String result = sqlmap.selectOne("sessionName", id);
		return result;
	}
	
	public int sessionStatus(String id) {
		int result = sqlmap.selectOne("sessionStatus", id);
		return result;
	}
	
	public MemberDTO setting(String id) {
		MemberDTO dto = (MemberDTO) sqlmap.selectOne("setting", id);
		return dto;
	}
	
	public int accountRevise(MemberDTO dto) {
		int result = sqlmap.update("accountRevise", dto);
		return result;
	}
	
	public String accountRevisePic_path(String id) {
		String result = sqlmap.selectOne("accountRevisePic_path", id);
		return result;
	}
	
	public int memberDelete(String id) {
		int result = sqlmap.update("memberDelete", id);
		return result;
	}
	
	public String findId(String email) {
		String result = sqlmap.selectOne("findId", email);
		return result;
	}
	
	public String mailIdCheck(String id) {
		String result = sqlmap.selectOne("mailIdCheck",id);
		return result;
	}
	
	public String findPassword(String id) {
		String result = sqlmap.selectOne("findPassword",id);
		return result;
	}
	
	public int emailCount(String email) {
		int result = sqlmap.selectOne("emailCount", email);
		return result;
	}
}
