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
th{
	style="background-color: #dcdcdc;"
}

</style>
<body>
   <%@ include file="/WEB-INF/views/adminSidebar.jsp"%>
   <div id="main-comtents">
      <div id="manager-list">
         <div id="manager-add" style="width:1100px; display:flex; flex-direction: row; justify-content: space-between;">
            <div>
         <div>
         <form name="fmManagerList">
            <h3>매니저 리스트</h3>
            <table class="table table-hover table-bordered">
               <thead style="background-color: #dcdcdc;">
                  <tr>
                     <th>IDX</th>
                     <th>ID</th>
                     <th>PWD</th>
                     <th>NAME</th>
                     <th>EMAIL</th>
                     <th>TEL</th>
                     <th>삭제</th>
                  </tr>
               </thead>
               <tbody>
                  <c:if test="${empty list}">
                     <tr>
                        <td colspan="5" align="center">리스트 없음.</td>
                     </tr>
                  </c:if>
                  <c:if test="${!empty list}">
                     <c:forEach var="dto" items="${list}">
                        <tr>
                           <td>${dto.idx}
                           <input type="hidden" name="idx" value="${dto.idx}"
                              readonly></td>
                           <td>${dto.id}
                           <input type="hidden" name="id" value="${dto.id}"
                              readonly></td>
                           <td>${dto.pwd}
                           <input type="hidden" name="pwd" value="${dto.pwd}"></td>
                           <td>${dto.name}
                           <input type="hidden" name="name" value="${dto.name}"></td>
                           <td>${dto.email}
                           <input type="hidden" name="email" value="${dto.email}"></td>
                           <td>${dto.tel}
                           <input type="hidden" name="tel" value="${dto.tel}"></td>
                           <td>
                           <input type="button" value="삭제" class="btn btn-outline-danger btn-sm" onclick="javascript:location.href='delManager.do?id=${dto.id}'"></td>
                        </tr>
                     </c:forEach>
                  </c:if>
               </tbody>
            </table>
         </form>
         </div>
         </div>
         <div style="height:1000px; border-right: 1px solid black;"></div>
         <form name="fmAddManager" action="addManager.do" method="POST">
               <h3>매니저 계정 추가</h3>
               <table class="table table-hover table-bordered">
                  <tr>
                     <th style="background-color: #dcdcdc;">ID</th>
                     <td><input type="text" name="id"></td>
                  </tr>
                  <tr>
                     <th style="background-color: #dcdcdc;">PWD</th>
                     <td><input type="password" name="pwd"></td>
                  </tr>
                  <tr>
                     <th style="background-color: #dcdcdc;">NAME</th>
                     <td><input type="text" name="name"></td>
                  </tr>
                  <tr>
                     <th style="background-color: #dcdcdc;">EMAIL</th>
                     <td><input type="email" name="email"></td>
                  </tr>
                  <tr>
                     <th style="background-color: #dcdcdc;">Tel</th>
                     <td><input type="text" name="tel"></td>
                  </tr>
                  <tr>
                  	<td colspan="2">
                  	<div align="center"><input class="btn btn-outline-primary" type="submit" value="계정추가"></div>
                  	</td>
                  </tr>
               </table>
               
            </form>
            </div>
         
         </div>
      </div>
   </div>
</body>
</html>

<div>
            