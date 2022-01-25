package com.more.payhistory.model;

public class PayhistoryServiceImple implements PayhistoryService {
	
	PayhistoryDAO payhistoryDao;
	

	public PayhistoryDAO getPayhistoryDao() {
		return payhistoryDao;
	}


	public void setPayhistoryDao(PayhistoryDAO payhistoryDao) {
		this.payhistoryDao = payhistoryDao;
	}


	public int statusUpdate(int p_idx) {
		int result=payhistoryDao.statusUpdate(p_idx);
		return result;
	}
	
	public int docStatusUpdate(int d_idx) {
		int result=payhistoryDao.docStatusUpdate(d_idx);
		return result;
	}

}
