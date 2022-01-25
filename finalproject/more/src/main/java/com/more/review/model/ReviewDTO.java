package com.more.review.model;

import java.sql.Date;

public class ReviewDTO {

	private int rv_idx;
	private String id;
	private String name;
	private String lessonlist;
	private String e_id;
	private String cate1;
	private String cate2;
	private String content;
	private Date regdate;
	private int grade1;
	private int grade2;
	private int grade3;
	private int gradesum;
	//체결서
	private int d_idx;
	private int s_idx;
	private int status;
	public ReviewDTO() {
		super();
	}
	public ReviewDTO(int rv_idx, String id, String name, String lessonlist, String e_id, String cate1, String cate2,
			String content, Date regdate, int grade1, int grade2, int grade3, int gradesum, int d_idx, int s_idx,
			int status) {
		super();
		this.rv_idx = rv_idx;
		this.id = id;
		this.name = name;
		this.lessonlist = lessonlist;
		this.e_id = e_id;
		this.cate1 = cate1;
		this.cate2 = cate2;
		this.content = content;
		this.regdate = regdate;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.gradesum = gradesum;
		this.d_idx = d_idx;
		this.s_idx = s_idx;
		this.status = status;
	}
	public int getRv_idx() {
		return rv_idx;
	}
	public void setRv_idx(int rv_idx) {
		this.rv_idx = rv_idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLessonlist() {
		return lessonlist;
	}
	public void setLessonlist(String lessonlist) {
		this.lessonlist = lessonlist;
	}
	public String getE_id() {
		return e_id;
	}
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}
	public String getCate1() {
		return cate1;
	}
	public void setCate1(String cate1) {
		this.cate1 = cate1;
	}
	public String getCate2() {
		return cate2;
	}
	public void setCate2(String cate2) {
		this.cate2 = cate2;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getGrade1() {
		return grade1;
	}
	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}
	public int getGrade2() {
		return grade2;
	}
	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}
	public int getGrade3() {
		return grade3;
	}
	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}
	public int getGradesum() {
		return gradesum;
	}
	public void setGradesum(int gradesum) {
		this.gradesum = gradesum;
	}
	public int getD_idx() {
		return d_idx;
	}
	public void setD_idx(int d_idx) {
		this.d_idx = d_idx;
	}
	public int getS_idx() {
		return s_idx;
	}
	public void setS_idx(int s_idx) {
		this.s_idx = s_idx;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
