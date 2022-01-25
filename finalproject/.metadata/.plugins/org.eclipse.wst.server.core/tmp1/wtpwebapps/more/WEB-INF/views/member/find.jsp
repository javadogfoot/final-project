<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<c:if test="${!empty id}">
   <title>모레-아이디찾기</title>
</c:if>
<c:if test="${!empty pwd}">
   <title>모레-비밀번호찾기</title>
</c:if>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<c:if test="${!empty id}">
  <div style="margin-top: 300px;">
    <h3 class="text-center">회원님의 아이디는 ${id } 입니다</h3>
  </div>
  <div style="text-align: center; margin-top: 50px; margin-bottom: 300px;">
    <input type="button" class="btn btn-primary" value="비밀번호 찾기" onclick="location.href='findPassword.do'">
  </div>
</c:if>
<c:if test="${!empty pwd}">
  <div style="margin-top: 300px;">
    <h3 class="text-center">회원님의 비밀번호는 <span style="color: blue">${pwd }</span> 입니다</h3>
  </div>
  <div style="text-align: center; margin-top: 50px; margin-bottom: 300px;">
    <input type="button" class="btn btn-primary" value="로그인 하러가기" onclick="location.href='login.do'">
  </div>
</c:if>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>