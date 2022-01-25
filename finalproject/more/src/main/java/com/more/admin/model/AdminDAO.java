package com.more.admin.model;

import java.util.*;

import com.more.member.model.MemberDTO;
import com.more.payhistory.model.PayhistoryDTO;
import com.more.suggest.model.SuggestDTO;

public interface AdminDAO {
   
   //관리자 로그인
   public String adminLogin(String id, String pwd);
   
   //관리자 세션확인
   public int sessionAdminStatus(String id);
   
   //마스터 권한 매니저 계정 추가
   public int addManager(AdminDTO dto);
   
   //마스터 권한 매니저 계정 리스트 출력
   public List<AdminDTO> listManager();
   
   //마스터 권한 매니저 계정 삭제
   public int delManager(String id);
   
   //관리자 개인정보 확인
   public List<AdminDTO> showAdminInfo(String id);
   
   //관리자 개인정보 수정
   public int updateAdminInfo(AdminDTO dto);
   
   //관리자 유저관리 의뢰인 총목록수
   public int getClientTotalCnt();
   
   //관리자 유저관리 의뢰인 총목록수(검색)
   public int getClientSearchTotalCnt(Map map);
   
   //관리자 유저관리 의뢰인 리스트 출력
   public List<MemberDTO> listClient(Map map);
   
   //관리자 유저관리 의뢰인 리스트 출력(검색)
   public List<MemberDTO> listSearchClient(Map map);
   
   //관리자 유저관리 의뢰인 삭제 status = 3
   public int delClient(String id);
   
   
// 관리자 수익현황 결제 완료 테이블 리스트 총 목록 수
   public int getPaymentCompleteTotalCnt();

   // 관리자 수익현황 결제 완료 테이블 리스트
   public List<PayhistoryDTO> listPayComplete(Map map);

   // 관리자 수익현황 총 결제 완료 금액 출력
   public int getSumPaymentCompleteCost();

   // 관리자 수익현황 환불 요청 테이블 리스트 총 목록 수
   public int getRequestRefundTotalCnt();

   // 관리자 수익현황 환불 요청 테이블 리스트
   public List<PayhistoryDTO> listRequestRefund(Map map);

   // 관리자 수익현황 총 환불 요청 금액 출력
   public int getSumRequestRefundCost();
   
   // 관리자 수익현황 환불 완료 테이블 리스트 총 목록 수
   public int getRefundDoneTotalCnt();
   
   // 관리자 수익현황 환불 완료 테이블 리스트
   public List<PayhistoryDTO> listRefundDone(Map map);
   
   // 관리자 수익현황 총 환불 완료 금액 출력
   public int getSumRefundDoneCost();
   
   // 관리자 환불완료 버튼 status = 3
   public int refundDone(int p_idx);
   
   
   // 관리자 유저관리 전문가 리스트
   public List<SuggestDTO> expertList(Map map);
   
   //관리자 유저관리 전문가 리스트(검색)
   public List<SuggestDTO> expertSearchList(Map map);
   
   // 총 전문가 수
   public int adminExpertTotalCnt();
	
   // 검색했을떄 전문가 수 
   public int adminExpertSearchTotalCnt(Map map);
   
   //전문가 탈퇴(status = 3)
   public int expertDel(String id);
   
   //탈퇴회원 리스트
   public List<MemberDTO> outMemberList(Map map);
   
   //탈퇴회원 리스트(검색)
   public List<MemberDTO> outMemberSearchList(Map map);
   
   // 탈퇴회원 총수
   public int outMemberTotalCnt();
	
   // 검색했을떄 탈퇴회원 수
   public int outMemberSearchTotalCnt(Map map);
   
   // 관리자 환불완료 버튼 doc delete
   public int refundDoneDoc(int d_idx);
   
}