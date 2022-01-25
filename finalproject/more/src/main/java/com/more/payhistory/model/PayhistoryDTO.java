package com.more.payhistory.model;

import java.sql.Date;

public class PayhistoryDTO {

	   private int p_idx;
	   private int d_idx;
	   private String m_id;
	   private String e_id;
	   private int cost;
	   private Date paydate;
	   private int status;
	public PayhistoryDTO() {
		super();
	}
	
	public PayhistoryDTO(int p_idx, int d_idx, String m_id, String e_id, int cost, Date paydate, int status) {
		super();
		this.p_idx = p_idx;
		this.d_idx = d_idx;
		this.m_id = m_id;
		this.e_id = e_id;
		this.cost = cost;
		this.paydate = paydate;
		this.status = status;
	}

	public int getP_idx() {
		return p_idx;
	}
	public void setP_idx(int p_idx) {
		this.p_idx = p_idx;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getE_id() {
		return e_id;
	}
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Date getPaydate() {
		return paydate;
	}
	public void setPaydate(Date paydate) {
		this.paydate = paydate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public int getD_idx() {
		return d_idx;
	}

	public void setD_idx(int d_idx) {
		this.d_idx = d_idx;
	}
	
	   

}
