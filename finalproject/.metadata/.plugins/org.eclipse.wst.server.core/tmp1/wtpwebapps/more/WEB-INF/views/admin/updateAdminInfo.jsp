<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<style>
table{
	text-align: center;
}

</style>
<body>
<%@ include file="/WEB-INF/views/adminSidebar.jsp"%>
   <h3>내 정보 수정</h3>
   
   <div style="width: 400px;">
   <form name="fm" action="updateAdminInfo.do" method="post">
      <table class="table table-hover table-bordered">
      <c:if test="${empty list}">
         <tr>
            <td dolspan="5" align="center">ERROR</td>
         </tr>
      </c:if>
      <c:if test="${!empty list}">
      <c:forEach var="dto" items="${list}">
         <tr>
            <th style="background-color: #dcdcdc;">ID</th>
            <td><input type="text" name="id" value="${dto.id}" readonly></td>
         </tr>
         <tr>
            <th style="background-color: #dcdcdc;">PWD</th>
            <td><input type="password" name="pwd" value="${dto.pwd}"></td>
         </tr>
         <tr>
            <th style="background-color: #dcdcdc;">NAME</th>
            <td><input type="text" name="name" value="${dto.name}"></td>
         </tr>
         <tr>
            <th style="background-color: #dcdcdc;">EMAIL</th>
            <td><input type="text" name="email" value="${dto.email}"></td>
         </tr>
         <tr>
            <th style="background-color: #dcdcdc;">TEL</th>
            <td><input type="text" name="tel" value="${dto.tel}"></td>
         </tr>
         <tr>
         	<td colspan="2">
         	<div align="center"><input type="submit" class="btn btn-outline-primary mt-3" value="수정하기"></div>
         	</td>
         </tr>
      </c:forEach>
      </c:if>
      </table>
   </form>
   </div>
</body>
</html>