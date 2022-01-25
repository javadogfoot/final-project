package com.more.member.model;

public class MemberDTO {

	private String id;
	private String pwd;
	private String name;
	private String email;
	private String tel;
	private String zip_code;
	private String addr;
	private String d_addr;
	private String pic_path;
	private int status;

	public MemberDTO() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		System.out.println("id = " + id);
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		System.out.println("pwd = " + pwd);
		this.pwd = pwd;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
