package com.more.admin.model;

import java.util.List;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import com.more.expert.model.ExpertDTO;
import com.more.member.model.MemberDTO;
import com.more.payhistory.model.PayhistoryDTO;
import com.more.suggest.model.SuggestDTO;

public class AdminDAOImple implements AdminDAO {

   private SqlSessionTemplate sqlMap;

   public AdminDAOImple(SqlSessionTemplate sqlMap) {
      this.sqlMap = sqlMap;
   }

   public String adminLogin(String id, String pwd) {
      String password = sqlMap.selectOne("adminLogin", id);
      return password;
   }

   public int sessionAdminStatus(String id) {
      int result = sqlMap.selectOne("sessionAdminStatus", id);
      return result;
   }

   public int addManager(AdminDTO dto) {
      int result = sqlMap.insert("addManager", dto);
      return result;
   }

   public List<AdminDTO> listManager() {
      List<AdminDTO> list = sqlMap.selectList("listManager");
      return list;
   }

   public int delManager(String id) {
      int result = sqlMap.delete("delManager", id);
      return result;
   }
   
   public List<AdminDTO> showAdminInfo(String id) {
      List<AdminDTO> list = sqlMap.selectList("showAdminInfo", id);
      return list;
   }
   
   public int updateAdminInfo(AdminDTO dto) {
      int result = sqlMap.update("updateAdminInfo", dto);
      return result;
   }
   
   public int getClientTotalCnt() {
      int result = sqlMap.selectOne("clientTotalCnt");
      return result;
   }
   
   public int getClientSearchTotalCnt(Map map) {
	   int count = sqlMap.selectOne("clientSearchTotalCnt", map);
	   return count;
	}
   
   public List<MemberDTO> listClient(Map map) {
      List<MemberDTO> list = sqlMap.selectList("listClient", map);
      return list;
   }
   
   public List<MemberDTO> listSearchClient(Map map) {
	   List<MemberDTO> list = sqlMap.selectList("listSearchClient", map);
	   return list;
	}

   public int delClient(String id) {
      int result = sqlMap.update("delClient", id);
      return result;
   }
   
   public int getPaymentCompleteTotalCnt() {
	      int result = sqlMap.selectOne("paymentCompleteTotalCnt");
	      return result;
	   }
	   
	   public List<PayhistoryDTO> listPayComplete(Map map) {
	      List<PayhistoryDTO> list = sqlMap.selectList("listPaymentComplete", map);
	      return list;
	   }
	   
	   public int getSumPaymentCompleteCost() {
	      int result = sqlMap.selectOne("getSumPaymentCompleteCost");
	      return result;
	   }
	   
	   public int getRequestRefundTotalCnt() {
	      int result = sqlMap.selectOne("requestRefundTotalCnt");
	      return result;
	   }
	   
	   public List<PayhistoryDTO> listRequestRefund(Map map) {
	      List<PayhistoryDTO> list = sqlMap.selectList("listRequestRefund", map);
	      return list;
	   }
	   
	   public int getSumRequestRefundCost() {
	      int result = sqlMap.selectOne("getSumRequestRefundCost");
	      return result;
	   }
	   
	   public int getRefundDoneTotalCnt() {
	      int result = sqlMap.selectOne("refundDoneTotalCnt");
	      return result;
	   }
	   
	   public List<PayhistoryDTO> listRefundDone(Map map) {
	      List<PayhistoryDTO> list = sqlMap.selectList("listRefundDone", map);
	      return list;
	   }
	   
	   public int getSumRefundDoneCost() {
	      int result = sqlMap.selectOne("getSumRefundDoneCost");
	      return result;
	   }
	   
	   public int refundDone(int p_idx) {
		      int result = sqlMap.update("refundComplete", p_idx);
		      return result;
		   }
   
   
   public List<SuggestDTO> expertList(Map map) {
	   List<SuggestDTO> list = sqlMap.selectList("expertList", map);
	   return list;
	}
   
   public List<SuggestDTO> expertSearchList(Map map) {
		List<SuggestDTO> list = sqlMap.selectList("expertSearchList", map);
		return list;
	}
   
   public int adminExpertTotalCnt() {
	   	int count = sqlMap.selectOne("adminExpertTotalCnt");
		return count;
	}
   
   public int adminExpertSearchTotalCnt(Map map) {
	   int count = sqlMap.selectOne("adminExpertSearchTotalCnt", map);
	   return count;
	}
   
   public int expertDel(String id) {
		int result = sqlMap.update("expertDel", id);
		return result;
	}
   
   public List<MemberDTO> outMemberList(Map map) {
	   List<MemberDTO> list = sqlMap.selectList("outMemberList", map);
	   return list;
	}
   
   public List<MemberDTO> outMemberSearchList(Map map) {
	   List<MemberDTO> list = sqlMap.selectList("outMemberSearchList", map);
	   return list;
	}
   
   public int outMemberTotalCnt() {
	   int count = sqlMap.selectOne("outMemberTotalCnt");
		return count;
	}
   
   public int outMemberSearchTotalCnt(Map map) {
	   int count = sqlMap.selectOne("outMemberSearchTotalCnt", map);
		return count;
	}
   
   public int refundDoneDoc(int d_idx) {
       int result = sqlMap.delete("refundCompleteDoc", d_idx);
       return result;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
}