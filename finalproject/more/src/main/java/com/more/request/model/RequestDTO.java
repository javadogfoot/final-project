package com.more.request.model;

public class RequestDTO {

	private int r_idx;
	private String id;
	private String cate1;
	private String cate2;
	private String period;
	private String day;
	private String time;
	private String cost;
	private String process;
	private String ls_location;
	private String intro;

	private String name;
	private String email;
	private String tel;
	private String zip_code;
	private String addr;
	private String d_addr;
	private String pic_path;

	public RequestDTO() {

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

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		System.out.println("period = " + period);
		this.period = period;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		System.out.println("day = " + day);
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		System.out.println("time = " + time);
		this.time = time;
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

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		System.out.println("intro = " + intro);
		this.intro = intro;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		System.out.println("cost = " + cost);
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name = " + name);
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("email = " + email);
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		System.out.println("tel = " + tel);
		this.tel = tel;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		System.out.println("zip_code = " + zip_code);
		this.zip_code = zip_code;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		System.out.println("addr = " + addr);
		this.addr = addr;
	}

	public String getD_addr() {
		return d_addr;
	}

	public void setD_addr(String d_addr) {
		System.out.println("d_addr = " + d_addr);
		this.d_addr = d_addr;
	}

	public String getPic_path() {
		return pic_path;
	}

	public void setPic_path(String pic_path) {
		System.out.println("pic_path = " + pic_path);
		this.pic_path = pic_path;
	}

	public int getR_idx() {
		return r_idx;
	}

	public void setR_idx(int r_idx) {
		System.out.println("r_idx = " + r_idx);
		this.r_idx = r_idx;
	}
}
