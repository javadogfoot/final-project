package com.more.admin.model;

import java.util.*;


import com.more.bbs.model.BbsDTO;
import com.more.expert.model.ExpertDTO;
import com.more.member.model.MemberDTO;
import com.more.payhistory.model.PayhistoryDTO;
import com.more.suggest.model.SuggestDTO;

public interface AdminService {
   
   //관리자 로그인
   public boolean adminLogin(String id, String pwd);
   
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
   
   //관리자 유저관리 의뢰인 리스트 총 수
   public int getClientTotalCnt();
   
   //관리자 유저관리 의뢰인 리스트 총 수(검색)
   public int getClientSearchTotalCnt(String keyWord);
   
   //관리자 유저관리 의뢰인 리스트 출력
   public List<MemberDTO> listClient(int cp, int ls);
   
   //관리자 유저관리 의뢰인 리스트 출력(검색)
   public List<MemberDTO> listSearchClient(int cp, int ls, String keyWord);
   
   //관리자 유저관리 의뢰인 삭제 status = 3
   public int delClient(String id);
   
   
// 관리자 수익현황 결제 완료 테이블 리스트 총 수
   public int getPaymentCompleteTotalCnt();

   // 관리자 수익현황 결제 완료 테이블 리스트
   public List<PayhistoryDTO> listPayComplete(int cp, int ls);

   // 관리자 수익현황 총 결제 완료 금액 출력
   public int getSumPaymentCompleteCost();

   // 관리자 수익현황 환불 요청 테이블 리스트 총 수
   public int getRequestRefundTotalCnt();

   // 관리자 수익현황 환불 요청 테이블 리스트
   public List<PayhistoryDTO> listRequestRefund(int cp, int ls);

   // 관리자 수익현황 총 환불 요청 금액 출력
   public int getSumRequestRefundCost();

   // 관리자 수익현황 환불 완료 테이블 리스트 총 목록 수
   public int getRefundDoneTotalCnt();

   // 관리자 수익현황 환불 완료 테이블 리스트
   public List<PayhistoryDTO> listRefundDone(int cp, int ls);

   // 관리자 수익현황 총 환불 완료 금액 출력
   public int getSumRefundDoneCost();
   
// 관리자 환불완료 버튼 status = 3
   public int refundDone(int p_idx);
   
// 관리자 환불완료 버튼 DOC delete
   public int refundDoneDoc(int p_idx);
   
   
   //전문가 관리
   public List<SuggestDTO> expertList(int cp, int ls);

   public List<SuggestDTO> expertSearchList(int cp, int ls, String keyWord);
   
   public int adminExpertTotalCnt();

   public int adminExpertSearchTotalCnt(String keyWord);

   public int expertDel(String id);
   
   //탈퇴회원 관리
   
   public List<MemberDTO> outMemberList(int cp, int ls);

   public List<MemberDTO> outMemberSearchList(int cp, int ls, String keyWord);
   
   public int outMemberTotalCnt();

   public int outMemberSearchTotalCnt(String keyWord);
}