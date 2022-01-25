<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모레-요청하기</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/request/request.css?after">
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp"%>
   <div class="revMainContainer">
      <div class="revMainTextBox">
         <div class="revMainText">
            <h1>
               ${dto.cate1}<br>
               <span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">원하는 레슨을 선택해보세요</span>
            </h1>   
         </div>
      </div>
   </div>
   <br>
   <br>
   <div id="revListContainer">
      <c:forEach var="list_pic" items="${pic_arr}" varStatus="statusListp">
         <div class="listItem">
            <c:forEach var="list_name" items="${arr[statusListp.index]}">
              <a href="requestWrite.do?cate1=${dto.cate1}&cate2=${list_name}&pic=${list_pic}">
                 <div class="img">
                  	<img alt="img" src="${list_pic}">
                  	<div class="hidden">요청하기</div>
                 </div>
                   <div class="name">${list_name}</div>
                </a>
            </c:forEach>
            </div>
         </c:forEach>
   </div>

<%@ include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>