package com.more.payhistory.model;

import org.mybatis.spring.SqlSessionTemplate;

public class PayhistoryDAOImple implements PayhistoryDAO {
	
	SqlSessionTemplate sqlmap;
	

	public PayhistoryDAOImple(SqlSessionTemplate sqlmap) {
		super();
		this.sqlmap = sqlmap;
	}


	public int statusUpdate(int p_idx) {
		int result=sqlmap.update("statusUpdate", p_idx);
		return result;
	}
	
	public int docStatusUpdate(int d_idx) {
		int result=sqlmap.update("docStatusUpdate", d_idx);
		return result;
	}

}
