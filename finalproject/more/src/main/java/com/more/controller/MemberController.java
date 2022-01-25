package com.more.controller;

import javax.mail.internet.MimeMessage;



import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.more.member.model.MemberDTO;
import com.more.member.model.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	@Autowired
	private JavaMailSenderImpl mailSender;

	@RequestMapping("/login.do") // 로그인 페이지 이동
	public String login() {
		return "member/login";
	}
	
	@RequestMapping("/loginAction.do") // 로그인
	public ModelAndView loginAction(@RequestParam("id") String id, @RequestParam("pwd") String pwd, @RequestParam(value = "saveId", required = false) String saveId , HttpSession session, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("msg");
		boolean result = memberService.login(id, pwd);
		if (result == true) {
			session.setAttribute("sessionId", id);
			session.setAttribute("sessionStatus", memberService.sessionStatus(id));
			session.setAttribute("sessionName", memberService.sessionName(id));
			if (saveId == null) {
				Cookie ck = new Cookie("ckId", id);
				ck.setMaxAge(0);
				response.addCookie(ck);
			} else {
				Cookie ck = new Cookie("ckId", id);
				ck.setMaxAge(60*60*24);
				response.addCookie(ck);
			}
		}
		String msg = result == true ? "로그인 성공!" : "로그인 실패!";
		String url = result == true ? "index.do" : "login.do";
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		return mav;
	}
	
	@RequestMapping("/join.do") // 회원가입 페이지 이동
	public String join() {
		return "member/join";
	}
	
	@RequestMapping("/joinAction.do") // 회원가입 action
	public ModelAndView joinAcion(MemberDTO dto) {
		ModelAndView mav = new ModelAndView("msg");
		int result = memberService.memberJoin(dto);
		String msg = result > 0 ? "회원 가입 성공!" : "회원 가입 실패!";
		String url = result > 0 ? "index.do" : "join.do";
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value = "/idCheck.do", method = RequestMethod.POST) // 회원가입 아이디 중복 체크
	public int idCheck(@RequestParam("id") String id) {
		return memberService.idCheck(id);
	}
	
	@RequestMapping("/logout.do") // 로그아웃
	public ModelAndView logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		ModelAndView mav = new ModelAndView("msg");
		mav.addObject("msg", "로그아웃 되셨습니다!");
		mav.addObject("url", "index.do");
		return mav;
	}
	
	@RequestMapping("/setting.do") // 내 설정
	public ModelAndView setting(HttpServletRequest request) {
		HttpSession session = request.getSession();
		MemberDTO dto = memberService.setting((String) session.getAttribute("sessionId"));
		System.out.println("세션 = " + session.getAttribute("sessionId"));
		System.out.println("세션 = " + session.getAttribute("sessionStatus"));
		ModelAndView mav = new ModelAndView("member/setting");
		mav.addObject("dto", dto);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping("/mailCheck.do") // 이메일 인증
	public String mailCheck(@RequestParam("email") String email) throws Exception {
		System.out.println(mailSender);
		System.out.println("들어옴");
		int serti = (int)((Math.random()* (99999 - 10000 + 1)) + 10000);
		String from = "more@gmail.com";
		String to = email;
		String title = "회원가입시 필요한 인증번호 입니다.";
		String content = "[인증번호] " + serti + " 입니다. <br/> 인증번호 확인란에 기입해주십시오.";
		String num = "";
		System.out.println(email);
		try {
			System.out.println(0);
	    	MimeMessage mail = mailSender.createMimeMessage();
	    	System.out.println(1);
	        MimeMessageHelper mailHelper = new MimeMessageHelper(mail, true, "UTF-8");
	        System.out.println(2);
	        mailHelper.setFrom(from);
	        mailHelper.setTo(to);
	        mailHelper.setSubject(title);
	        mailHelper.setText(content, true);       
	        mailSender.send(mail);
	        System.out.println(3);
	        num = Integer.toString(serti);
	        System.out.println("num = " + num);
		} catch (Exception e) {
			e.printStackTrace();
			num = "error";
		}
		return num;
	}
	
	@RequestMapping("/account.do") // 계정 설정
	public ModelAndView account(HttpServletRequest request) {
		HttpSession session = request.getSession();
		MemberDTO dto = memberService.setting((String) session.getAttribute("sessionId"));
		System.out.println("세션 = " + session.getAttribute("sessionId"));
		System.out.println("세션 = " + session.getAttribute("sessionStatus"));
		ModelAndView mav = new ModelAndView("member/account");
		mav.addObject("dto", dto);
		return mav;
	}
	
	@RequestMapping("/accountRevise.do") // 계정 수정
	public ModelAndView accountRevise(MemberDTO dto) {
		if (dto.getPic_path() == null || dto.getPic_path() == "") {
			System.out.println("0");
			System.out.println(memberService.accountRevisePic_path(dto.getId()));
			dto.setPic_path(memberService.accountRevisePic_path(dto.getId()));
		}
		ModelAndView mav = new ModelAndView("msg");
		System.out.println("1");
		int result = memberService.accountRevise(dto);
		System.out.println("2");
		String msg = result > 0 ? "계정 수정 성공!" : "계정 수정 실패!";
		String url = result > 0 ? "setting.do" : "account.do";
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		return mav;
	}
	
	@RequestMapping("/memberDelete.do") // 회원 삭제
	public ModelAndView memberDelete(@RequestParam("id") String id, HttpServletRequest request) {
		int result = memberService.memberDelete(id);
		ModelAndView mav = new ModelAndView("msg");
		String msg = result > 0 ? "회원 탈퇴 성공!" : "회원 탈퇴 실패";
		String url = result > 0 ? "index.do" : "account.do";
		mav.addObject("msg", msg);
		mav.addObject("url", url);
		if (result > 0) {
			HttpSession session = request.getSession();
			session.invalidate();
		}
		return mav;
	}
	
	@RequestMapping("/findId.do") // 아이디 찾기
	public String findId() {
		return "member/findId";
	}
	
	@ResponseBody
	@RequestMapping("/idMailCheck.do") // 아이디 찾기 이메일 체크
	public int idMailCheck(@RequestParam("email") String email) {
		System.out.println(email);
		return memberService.emailCount(email);
	}
	
	@RequestMapping(value = "/findId.do", method = RequestMethod.POST)
	public ModelAndView findId(String email) {
		ModelAndView mav = new ModelAndView("member/find");
		String id = memberService.findId(email);
		mav.addObject("id", id);
		return mav;
	}
	
	@RequestMapping("/findPassword.do") // 비밀번호 찾기 페이지 이동
	public String findPassword() {
		return "member/findPassword";
	}
	
	@RequestMapping(value = "/findPassword.do", method = RequestMethod.POST) // 비밀번호 찾기
	public ModelAndView findPasswordAction(@RequestParam("id") String id) {
		ModelAndView mav = new ModelAndView("member/find");
		String pwd = memberService.findPassword(id);
		mav.addObject("pwd", pwd);
		return mav;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/mailIdCheck.do") // 비밀번호 찾기 이메일 정보확인
	public String mailIdCheck(@RequestParam("id") String id) {
		System.out.println("들어옴");
		System.out.println(memberService.mailIdCheck(id));
		return memberService.mailIdCheck(id);
	}

}