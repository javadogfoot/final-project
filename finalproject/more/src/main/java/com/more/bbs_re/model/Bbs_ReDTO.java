package com.more.bbs_re.model;

import java.sql.Date;

public class Bbs_ReDTO {

	private int re_idx;
	private int b_idx;
	private String writer;
	private String content;
	private Date regdate;
	private int del;
	private int ref;
	private int lev;

	public Bbs_ReDTO() {
		super();
	}

	public int getRe_idx() {
		return re_idx;
	}

	public void setRe_idx(int re_idx) {
		System.out.println("re_idx = " + re_idx);
		this.re_idx = re_idx;
	}

	public int getB_idx() {
		return b_idx;
	}

	public void setB_idx(int b_idx) {
		System.out.println("b_idx = " + b_idx);
		this.b_idx = b_idx;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		System.out.println("writer = " + writer);
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		System.out.println("content = " + content);
		this.content = content;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		System.out.println("regdate = " + regdate);
		this.regdate = regdate;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		System.out.println("ref = " + ref);
		this.ref = ref;
	}

	public int getLev() {
		return lev;
	}

	public void setLev(int lev) {
		this.lev = lev;
	}
}
