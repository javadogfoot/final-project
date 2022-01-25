package com.more.member.model;

public class MemberServiceImple implements MemberService {

	private MemberDAO memberDao;

	public MemberDAO getMemberDao() {
		return memberDao;
	}

	public void setMemberDao(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}

	public int memberJoin(MemberDTO dto) {
		int result = memberDao.memberJoin(dto);
		return result;
	}

	public int idCheck(String id) {
		int result = memberDao.idCheck(id);
		return result;
	}
	
	public boolean login(String id, String pwd) {
		boolean result = false;
		if (memberDao.login(id, pwd) == null) {
			result = false;
		} else if (memberDao.login(id, pwd).equals(pwd)) {
			result = true;
		}
		return result;
	}
	
	public String sessionName(String id) {
		String result = memberDao.sessionName(id);
		return result;
	}
	
	public int sessionStatus(String id) {
		int result = memberDao.sessionStatus(id);
		return result;
	}
	
	public MemberDTO setting(String id) {
		MemberDTO dto = memberDao.setting(id);
		return dto;
	}
	
	public int accountRevise(MemberDTO dto) {
		int result = memberDao.accountRevise(dto);
		return result;
	}
	
	public String accountRevisePic_path(String id) {
		String result = memberDao.accountRevisePic_path(id);
		return result;
	}
	
	public int memberDelete(String id) {
		int result = memberDao.memberDelete(id);
		return result;
	}
	
	public String findId(String email) {
		String result = memberDao.findId(email);
		return result;
	}
	
	public String mailIdCheck(String id) {
		String result = memberDao.mailIdCheck(id);
		return result;
	}
	
	public String findPassword(String id) {
		String result = memberDao.findPassword(id);
		return result;
	}
	
	public int emailCount(String email) {
		int result = memberDao.emailCount(email);
		return result;
	}
}
