package com.more.suggest.model;

import java.sql.Date;

public class SuggestDTO {

	private int s_idx;
	private String id;
	private String cate1;
	private String cate2;
    private String start_date;
    private String end_date;
	private String day;
	private String start_time;
	private String end_time;
	private int cost;
	private String process;
	private String ls_location;
	private String s_intro;
	private String m_id;
	
    private String name;
    private String addr;
    private String intro;
    private String tel;
    private String pic_path;
    
    private int e_idx;
    private String univ;
    private String major;
    private String career;
    private String cer;

	public SuggestDTO() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		System.out.println("id = " + id);
		this.id = id;
	}

	public String getCate1() {
		return cate1;
	}

	public void setCate1(String cate1) {
		System.out.println("cate1 = " + cate1);
		this.cate1 = cate1;
	}

	public String getCate2() {
		return cate2;
	}

	public void setCate2(String cate2) {
		System.out.println("cate2 = " + cate2);
		this.cate2 = cate2;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		System.out.println("start_date = " + start_date);
		this.start_date = start_date;
	}
	
	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		System.out.println("end_date = " + end_date);
		this.end_date = end_date;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		System.out.println("day = " + day);
		this.day = day;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		System.out.println("start_time = " + start_time);
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		System.out.println("end_time = " + end_time);
		this.end_time = end_time;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		System.out.println("cost = " + cost);
		this.cost = cost;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		System.out.println("process = " + process);
		this.process = process;
	}

	public String getLs_location() {
		return ls_location;
	}

	public void setLs_location(String ls_location) {
		System.out.println("ls_location = " + ls_location);
		this.ls_location = ls_location;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		System.out.println("m_id = " + m_id);
		this.m_id = m_id;
	}

	public String getS_intro() {
		return s_intro;
	}

	public void setS_intro(String s_intro) {
		this.s_intro = s_intro;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPic_path() {
		return pic_path;
	}

	public void setPic_path(String pic_path) {
		this.pic_path = pic_path;
	}

	public int getE_idx() {
		return e_idx;
	}

	public void setE_idx(int e_idx) {
		this.e_idx = e_idx;
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getCer() {
		return cer;
	}

	public void setCer(String cer) {
		this.cer = cer;
	}

	public int getS_idx() {
		return s_idx;
	}

	public void setS_idx(int s_idx) {
		this.s_idx = s_idx;
	}
	
}
