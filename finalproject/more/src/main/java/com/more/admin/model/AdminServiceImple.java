package com.more.admin.model;

import java.util.*;


import org.apache.commons.collections.map.HashedMap;

import com.more.expert.model.ExpertDTO;
import com.more.member.model.MemberDTO;
import com.more.payhistory.model.PayhistoryDTO;
import com.more.suggest.model.SuggestDTO;

public class AdminServiceImple implements AdminService {

   private AdminDAO adminDao;

   public AdminDAO getAdminDao() {
      return adminDao;
   }

   public void setAdminDao(AdminDAO adminDao) {
      this.adminDao = adminDao;
   }
   
   public boolean adminLogin(String id, String pwd) {
      String password = adminDao.adminLogin(id, pwd);
      boolean result;
      if(password==null) {
         result = false;
      }else {
         result = password.equals(pwd);
      }
      return result;
   }
   
   public int sessionAdminStatus(String id) {
      int result = adminDao.sessionAdminStatus(id);
      return result;
   }
   
   public int addManager(AdminDTO dto) {
      int result = adminDao.addManager(dto);
      return result;
   }
   
   public List<AdminDTO> listManager() {
      List<AdminDTO> list = adminDao.listManager();      
      return list;
   }
   
   public int delManager(String id) {   
      int result = adminDao.delManager(id);
      return result;
   }
   
   public List<AdminDTO> showAdminInfo(String id) {
      List<AdminDTO> list = adminDao.showAdminInfo(id);
      return list;
   }
   
   public int updateAdminInfo(AdminDTO dto) {
      int result = adminDao.updateAdminInfo(dto);
      return result;
   }
   
   public int getClientTotalCnt() {
      int result = adminDao.getClientTotalCnt();
      return result;
   }
   
   public int getClientSearchTotalCnt(String keyWord) {
	   Map map = new HashedMap();
	   map.put("keyWord", keyWord);
	   
	   int result = adminDao.getClientSearchTotalCnt(map);
		return result;
	}
   
   public List<MemberDTO> listClient(int cp, int ls) {
      int start = (cp-1)*ls+1;
      int end = cp*ls;
      Map map = new HashedMap();
      map.put("start", start);
      map.put("end", end);
      List<MemberDTO> list = adminDao.listClient(map);
      return list;
   }
   public List<MemberDTO> listSearchClient(int cp, int ls, String keyWord) {
	   int start = (cp-1)*ls+1;
	   int end = cp*ls;
	   Map map = new HashedMap();
	   map.put("start", start);
	   map.put("end", end);
	   map.put("keyWord", keyWord);
	   List<MemberDTO> list = adminDao.listSearchClient(map);
	   return list;
   }
   
   public int delClient(String id) {
      int result = adminDao.delClient(id);
      return result;
   }
   
   
   public int getPaymentCompleteTotalCnt() {
	      int result = adminDao.getPaymentCompleteTotalCnt();
	      return result;
	   }
	   
	   public List<PayhistoryDTO> listPayComplete(int cp, int ls) {
	      int startP = (cp-1)*ls+1;
	      int endP = cp*ls;
	      Map map = new HashedMap();
	      map.put("startP", startP);
	      map.put("endP", endP);
	      List<PayhistoryDTO> list = adminDao.listPayComplete(map);
	      return list;
	   }
	   
	   public int getSumPaymentCompleteCost() {
	      int result = adminDao.getSumPaymentCompleteCost();
	      return result;
	   }
	   
	   public int getRequestRefundTotalCnt() {
	      int result = adminDao.getRequestRefundTotalCnt();
	      return result;
	   }
	   
	   public List<PayhistoryDTO> listRequestRefund(int cp, int ls) {
	      int startR = (cp-1)*ls+1;
	      int endR = cp*ls;
	      Map map = new HashedMap();
	      map.put("startR", startR);
	      map.put("endR", endR);
	      List<PayhistoryDTO> list = adminDao.listRequestRefund(map);
	      return list;
	   }
	   
	   public int getSumRequestRefundCost() {
	      int result = adminDao.getSumRequestRefundCost();
	      return result;
	   }
	   
	   public int getRefundDoneTotalCnt() {
	      int result = adminDao.getRefundDoneTotalCnt();
	      return result;
	   }
	   
	   public List<PayhistoryDTO> listRefundDone(int cp, int ls) {
	      int startRd = (cp-1)*ls+1;
	      int endRd = cp*ls;
	      Map map = new HashedMap();
	      map.put("startRd", startRd);
	      map.put("endRd", endRd);
	      List<PayhistoryDTO> list = adminDao.listRefundDone(map);
	      return list;
	   }
	   
	   public int getSumRefundDoneCost() {
	      int result = adminDao.getSumRefundDoneCost();
	      return result;
	   }
	   
	   public int refundDone(int p_idx) {
		      int result = adminDao.refundDone(p_idx);
		      return result;
		   }
	   
   
   
   public List<SuggestDTO> expertList(int cp, int ls) {
	   
	   int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashedMap();
	
		map.put("start", start);
		map.put("end", end);
	   
	   List<SuggestDTO> list = adminDao.expertList(map);
	   return list;
	}
   
   public List<SuggestDTO> expertSearchList(int cp, int ls, String keyWord) {
	   
	   int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashedMap();

		map.put("start", start);
		map.put("end", end);
		map.put("keyWord", keyWord);
		
		List<SuggestDTO> list = adminDao.expertSearchList(map);
		return list;
	}
   
   public int adminExpertTotalCnt() {
	   int count = adminDao.adminExpertTotalCnt();
	   return count;
	}
   
   public int adminExpertSearchTotalCnt(String keyWord) {
	   Map map = new HashedMap();
	   map.put("keyWord", keyWord);
	   
	   int count = adminDao.adminExpertSearchTotalCnt(map);
	   
	   return count;
	}
   
   public int expertDel(String id) {
		int result = adminDao.expertDel(id);
		return result;
	}
   
   public List<MemberDTO> outMemberList(int cp, int ls) {
	    int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashedMap();
	
		map.put("start", start);
		map.put("end", end);
	   
	   List<MemberDTO> list = adminDao.outMemberList(map);
	   return list;
	}
   
   public List<MemberDTO> outMemberSearchList(int cp, int ls, String keyWord) {
	   int start = (cp - 1) * ls + 1;
		int end = cp * ls;
		Map map = new HashedMap();
	
		map.put("keyWord", keyWord);
		map.put("start", start);
		map.put("end", end);
	   
	   List<MemberDTO> list = adminDao.outMemberSearchList(map);
	   return list;
	}
   
   public int outMemberTotalCnt() {
	  
	   int count = adminDao.outMemberTotalCnt();
	   
	   return count;
	}
   
   public int outMemberSearchTotalCnt(String keyWord) {
	   Map map = new HashedMap();
	   map.put("keyWord", keyWord);
	   
	   int count = adminDao.outMemberSearchTotalCnt(map);
	   
	   return count;
	}
   
   public int refundDoneDoc(int d_idx) {
       int result = adminDao.refundDoneDoc(d_idx);
       return result;
   }
   
   
   
   
}