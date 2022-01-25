<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/expert/expertUpdate.css" rel="stylesheet">
<style>
   .container {
     width: 500px;
     margin-top: 50px;
     height: 620px;
   }
   .mb-2 input {
     width: 450px;
   }
   .mb-2 textarea {
     width: 450px;
     height: 150px;
     padding: 10px;
     margin: 0 auto;
   }
   #texta{
      text-align: center;
   }
</style>
<title>모래-전문가수정</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="container">
  <div class="col-md-12 order-md-1">
      <h3 style="margin: 30px;">전문가 계좌 수정</h3>
      <form name="expertAccountForm" action="expertAccount.do?id=${sessionScope.sessionId}" method="post">
        <div class="mb-3">
            <select class="form-control" name="bank" style="width: 120px; float: left; margin-right: 20px;" required="required">
               <option value="" selected="selected">은행선택</option>
               <option value="국민은행" <c:if test="${dto.bank eq '국민은행'}">selected</c:if>>국민은행</option>
               <option value="기업은행" <c:if test="${dto.bank eq '기업은행'}">selected</c:if>>기업은행</option>
               <option value="농협은행" <c:if test="${dto.bank eq '농협은행'}">selected</c:if>>농협은행</option>
               <option value="신한은행" <c:if test="${dto.bank eq '신한은행'}">selected</c:if>>신한은행</option>
               <option value="대구은행" <c:if test="${dto.bank eq '대구은행'}">selected</c:if>>대구은행</option>
               <option value="광주은행" <c:if test="${dto.bank eq '광주은행'}">selected</c:if>>광주은행</option>
               <option value="수협은행" <c:if test="${dto.bank eq '수협은행'}">selected</c:if>>수협은행</option>
               <option value="제주은행" <c:if test="${dto.bank eq '제주은행'}">selected</c:if>>제주은행</option>
            </select>
            <input type="text" class="form-control" name="account" placeholder="  계좌번호입력('-'제외)" style="width: 300px; height: 38px;" onkeyup="check(this)" required="required" value="${dto.account}">
         </div>
        <div style="margin-top: 50px;">
           <button class="btn btn-lg btn-primary" type="submit" style="width: 450px; margin-bottom:20px; background-color: #ff9797; border-color: #ff9797;" >수정</button>
           <button class="btn btn-lg btn-primary" type="button" style="width: 450px; background-color: #ff9797; border-color: #ff9797;" onclick="location.href='expertProfile.do?id=${sessionScope.sessionId}'">뒤로</button>
        </div>
     </form>
  </div>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>