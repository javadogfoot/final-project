<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/suggest/paymentsSuccess.css" rel="stylesheet">
</head>
<body>
   <%@include file="/WEB-INF/views/header.jsp"%>

   <div id="section" style="min-height: 443.172px;">
      <div class="container more-width">
         <div class="ment">
            <h1>결제가 완료되었습니다.</h1>
            <br> <br>
         </div>
         <a href="index.do" class="cash-btn">메인으로</a>
      </div>
   </div>
   <%@include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>