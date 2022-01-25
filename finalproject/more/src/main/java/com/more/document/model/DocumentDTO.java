package com.more.document.model;


public class DocumentDTO {

	private int d_idx;
	private String e_id;
	private String m_id;
	private int s_idx;
	private String cate1;
	private String cate2;
	private int status;
	//제안서 내용
    private String start_date;
    private String end_date;
	private String day;
	private String start_time;
	private String end_time;
	private int cost;
	private String process;
	private String ls_location;
	private String s_intro;
	//의뢰인 정보
	private String m_name;
	private String m_email;
	private String m_tel;
	private String m_pic_path;
	//전문가 정보
	private String e_name;
	private String e_email;
	private String e_tel;
	private String e_pic_path;
	//결제내역 정보
	private int p_idx;
	private int p_status;
	//우민씨가 추가함
	private String name;
	private String pic_path;
	private String intro;
	
	public DocumentDTO() {
		super();
	}
	public DocumentDTO(int d_idx, String e_id, String m_id, int s_idx, String cate1, String cate2, int status) {
		super();
		this.d_idx = d_idx;
		this.e_id = e_id;
		this.m_id = m_id;
		this.s_idx = s_idx;
		this.cate1 = cate1;
		this.cate2 = cate2;
		this.status = status;
	}
	


	
	public DocumentDTO(int d_idx, String e_id, String m_id, int s_idx, String cate1, String cate2, int status,
			String start_date, String end_date, String day, String start_time, String end_time, int cost,
			String process, String ls_location, String s_intro, String m_name, String m_email, String m_tel,
			String m_pic_path, String e_name, String e_email, String e_tel, String e_pic_path, int p_idx,
			int p_status) {
		super();
		this.d_idx = d_idx;
		this.e_id = e_id;
		this.m_id = m_id;
		this.s_idx = s_idx;
		this.cate1 = cate1;
		this.cate2 = cate2;
		this.status = status;
		this.start_date = start_date;
		this.end_date = end_date;
		this.day = day;
		this.start_time = start_time;
		this.end_time = end_time;
		this.cost = cost;
		this.process = process;
		this.ls_location = ls_location;
		this.s_intro = s_intro;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_tel = m_tel;
		this.m_pic_path = m_pic_path;
		this.e_name = e_name;
		this.e_email = e_email;
		this.e_tel = e_tel;
		this.e_pic_path = e_pic_path;
		this.p_idx = p_idx;
		this.p_status = p_status;
	}
	public DocumentDTO(int d_idx, String e_id, String m_id, int s_idx, String cate1, String cate2, int status,
			String start_date, String end_date, String day, String start_time, String end_time, int cost,
			String process, String ls_location, String s_intro, String m_name, String m_email, String m_tel,
			String e_name, String e_email, String e_tel, int p_idx, int p_status, String name, String pic_path,
			String intro) {
		super();
		this.d_idx = d_idx;
		this.e_id = e_id;
		this.m_id = m_id;
		this.s_idx = s_idx;
		this.cate1 = cate1;
		this.cate2 = cate2;
		this.status = status;
		this.start_date = start_date;
		this.end_date = end_date;
		this.day = day;
		this.start_time = start_time;
		this.end_time = end_time;
		this.cost = cost;
		this.process = process;
		this.ls_location = ls_location;
		this.s_intro = s_intro;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_tel = m_tel;
		this.e_name = e_name;
		this.e_email = e_email;
		this.e_tel = e_tel;
		this.p_idx = p_idx;
		this.p_status = p_status;
		this.name = name;
		this.pic_path = pic_path;
		this.intro = intro;
	}
	public int getD_idx() {
		return d_idx;
	}
	public void setD_idx(int d_idx) {
		this.d_idx = d_idx;
	}
	public String getE_id() {
		return e_id;
	}
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public int getS_idx() {
		return s_idx;
	}
	public void setS_idx(int s_idx) {
		this.s_idx = s_idx;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	public String getLs_location() {
		return ls_location;
	}
	public void setLs_location(String ls_location) {
		this.ls_location = ls_location;
	}
	public String getS_intro() {
		return s_intro;
	}
	public void setS_intro(String s_intro) {
		this.s_intro = s_intro;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_tel() {
		return m_tel;
	}
	public void setM_tel(String m_tel) {
		this.m_tel = m_tel;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_email() {
		return e_email;
	}
	public void setE_email(String e_email) {
		this.e_email = e_email;
	}
	public String getE_tel() {
		return e_tel;
	}
	public void setE_tel(String e_tel) {
		this.e_tel = e_tel;
	}
	public int getP_idx() {
		return p_idx;
	}
	public void setP_idx(int p_idx) {
		this.p_idx = p_idx;
	}
	public int getP_status() {
		return p_status;
	}
	public void setP_status(int p_status) {
		this.p_status = p_status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPic_path() {
		return pic_path;
	}
	public void setPic_path(String pic_path) {
		this.pic_path = pic_path;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getM_pic_path() {
		return m_pic_path;
	}
	public void setM_pic_path(String m_pic_path) {
		this.m_pic_path = m_pic_path;
	}
	public String getE_pic_path() {
		return e_pic_path;
	}
	public void setE_pic_path(String e_pic_path) {
		this.e_pic_path = e_pic_path;
	}
	
	
	
}
