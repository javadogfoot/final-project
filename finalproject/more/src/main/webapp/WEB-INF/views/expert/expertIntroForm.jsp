<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
      <h3>전문가 소개 수정</h3>
      <form name="expertIntroForm" action="expertIntro.do?id=${sessionScope.sessionId}" method="post" id="texta">
        <div class="mb-2"> 
            <textarea class="form-control" name="intro">${dto.intro}</textarea>
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