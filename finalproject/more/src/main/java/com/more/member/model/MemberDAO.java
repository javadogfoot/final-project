package com.more.member.model;

public interface MemberDAO {
	// 회원가입
	public int memberJoin(MemberDTO dto);
	
	// 아이디 중복
	public int idCheck(String id);
	
	// 로그인
	public String login(String id, String pwd);
	
	// 세션 회원 이름
	public String sessionName(String id);
	
	// 세션 회원 상태
	public int sessionStatus(String id);
	
	// 내 설정
	public MemberDTO setting(String id);
	
	// 계정 수정
	public int accountRevise(MemberDTO dto);
	
	// 계정 수정 현재 사진
	public String accountRevisePic_path(String id);
	
	// 회원 탈퇴
	public int memberDelete(String id);
	
	// 아이디 찾기
	public String findId(String email);
	
	// 이메일 존재 여부
	public int emailCount(String email);
	
	// 회원 아이디와 메일 일치 체크
	public String mailIdCheck(String id);
	
	// 비밀번호 찾기
	public String findPassword(String id);
}
