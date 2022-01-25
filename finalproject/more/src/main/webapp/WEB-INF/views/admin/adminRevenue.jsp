<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<style>
table{
	text-align: center;
}
</style>
<body>
   <%@ include file="/WEB-INF/views/adminSidebar.jsp"%>
   <h3><b>수익현황</b></h3><br>
   <h4 style="color: red;"><b>이번달 현재 예상 수익은 '${(getSumPaymentCompleteCost - getSumRefundDoneCost)*10000}'원 입니다.</b></h4>
   <div style="margin-bottom: 50px;"><a href="https://admin.iamport.kr/" target="_blank">PG사 통합 수익관리 페이지로 이동</a></div>
   <div style="margin-bottom: 60px;">
      <div>
         <div><h5><b>결제 완료</b></h5> <h5 style="color:red;">총 결제 금액은 '${getSumPaymentCompleteCost*10000}' 원 입니다.</h5>
         </div>
      </div>
      <div style="width:1200px; margin-bottom: 40px;">
         <table class="table table-hover table-bordered">
            <thead>
               <tr style="background-color: #dcdcdc;">
                  <th>No.</th>
                  <th>의뢰인ID</th>
                  <th>전문가ID</th>
                  <th>비용(만원)</th>
                  <th>결제일</th>
               </tr>
            </thead>
            <tbody>
               <c:if test="${empty listPayComplete}">
                  <td colspan="7" align="center">결재완료 내역 없음</td>
               </c:if>
               <c:if test="${!empty listPayComplete}">
                  <c:forEach var="pDto" items="${listPayComplete}">
                     <tr>
                        <td>${pDto.p_idx}</td>
                        <td>${pDto.m_id}</td>
                        <td>${pDto.e_id}</td>
                        <td>${pDto.cost}</td>
                        <td>${pDto.paydate}</td>
                     </tr>
                  </c:forEach>
               </c:if>
            </tbody>
            <tfoot>
               <tr>
                  <td colspan="5" align="center">${pageStrP}</td>
               </tr>
            </tfoot>
         </table>
      </div>
   </div>
   <div style="margin-bottom: 60px;">
      <div>
         <div><h5><b>환불 요청</b></h5><h5 style="color:red;">총 환불요청 금액은 '${getSumRequestRefundCost*10000}' 원 입니다.</h5>
         </div>
      </div>
      <div style="width:1200px;">
         <table class="table table-hover table-bordered">
            <thead>
               <tr style="background-color: #dcdcdc;">
                  <th>No.</th>
                  <th>의뢰인ID</th>
                  <th>전문가ID</th>
                  <th>비용(만원)</th>
                  <th>결제일</th>
                  <th>환불완료</th>
               </tr>
            </thead>
            <tbody>
               <c:if test="${empty listRequestRefund}">
                  <td colspan="7" align="center">환불요청 내역 없음</td>
               </c:if>
               <c:if test="${!empty listRequestRefund}">
                  <c:forEach var="rDto" items="${listRequestRefund}">
                     <tr>
                        <td>${rDto.p_idx}</td>
                        <td>${rDto.m_id}</td>
                        <td>${rDto.e_id}</td>
                        <td>${rDto.cost}</td>
                        <td>${rDto.paydate}</td>
                        <td><input type="button" value="환불완료" class="btn btn-outline-primary btn-sm" onclick="javascript:location.href='refundDone.do?p_idx=${rDto.p_idx}&d_idx=${rDto.d_idx}'"></td>
                     </tr>
                  </c:forEach>
               </c:if>
            </tbody>
            <tfoot>
               <tr>
                  <td colspan="6" align="center">${pageStrR}</td>
               </tr>
            </tfoot>
         </table>
         <div>
      </div>
      </div>
      
   </div>
   <div style="margin-bottom: 60px;">
      <div>
         <div><h5><b>환불 완료</b></h5><h5 style="color:red;">총 환불완료 금액은 '${getSumRefundDoneCost*10000}' 원 입니다.</h5>
         </div>
      </div>
      <div style="width:1200px;">
         <table class="table table-hover table-bordered">
            <thead>
               <tr style="background-color: #dcdcdc;">
                  <th>No.</th>
                  <th>의뢰인ID</th>
                  <th>전문가ID</th>
                  <th>비용(만원)</th>
                  <th>결제일</th>
               </tr>
            </thead>
            <tbody>
               <c:if test="${empty listRefundDone}">
                  <td colspan="7" align="center">환불완료 내역 없음</td>
               </c:if>
               <c:if test="${!empty listRefundDone}">
                  <c:forEach var="rdDto" items="${listRefundDone}">
                     <tr>
                        <td>${rdDto.p_idx}</td>
                        <td>${rdDto.m_id}</td>
                        <td>${rdDto.e_id}</td>
                        <td>${rdDto.cost}</td>
                        <td>${rdDto.paydate}</td>
                     </tr>
                  </c:forEach>
               </c:if>
            </tbody>
            <tfoot>
               <tr>
                  <td colspan="6" align="center">${pageStrRd}</td>
               </tr>
            </tfoot>
         </table>
         <div>
      </div>
      </div>
      
   </div>
</body>
</html>