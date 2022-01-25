<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/expert/expertUpdate.css" rel="stylesheet">
<style>
   .container {
     width: 500px;
     margin-top: 50px;
   }
   .mb-2 input {
     width: 450px;
   }
   .mb-2 textarea {
     width: 450px;
     height: 150px;
     padding: 10px;
   }
   input{
   	margin-top:10px;
   }
</style>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="container">
  <div class="col-md-12 order-md-1">
      <h3 style="margin: 30px;">전문가 정보</h3>
      <form name="expertSpecForm" action="expertSpec.do?id=${sessionScope.sessionId}" method="post">
        <div class="mb-2">
            <label class="subject">대학교</label> 
            <input type="text" class="form-control" name="univ" value="${dto.univ}" placeholder="예) 서울대학교">
            <div id="id_check"></div>
        </div>
        <div class="mb-2">
            <label class="subject">학과</label> 
            <input type="text" class="form-control" name="major" value="${dto.major}" placeholder="예) 컴퓨터공학과">
            <div id="pwd_check"></div>
        </div>
        <div class="mb-2">
            <label class="subject">레슨 경력</label> 
            <input type="text" class="form-control" name="career" value="${dto.career}" placeholder="예) 1년">
        </div>
        <div class="mb-2">
            <label class="subject">자격증</label> 
            <input type="text" class="form-control" name="cer" value="${dto.cer}" placeholder="예) 정보처리기사">
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