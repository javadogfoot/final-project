package com.more.member.model;

public interface MemberService {

	public int memberJoin(MemberDTO dto);
	
	public int idCheck(String id);
	
	public boolean login(String id, String pwd);
	
	public String sessionName(String id);
	
	public int sessionStatus(String id);
	
	public MemberDTO setting(String id);
	
	public int accountRevise(MemberDTO dto);
	
	public String accountRevisePic_path(String id);
	
	public int memberDelete(String id);
	
	public String mailIdCheck(String id);
	
	public String findPassword(String id);
	
	public String findId(String email);
	
	public int emailCount(String email);
}
