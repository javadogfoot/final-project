<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/member/login.css" rel="stylesheet">
<title>MORE - 관리자페이지 로그인</title>
</head>
<body>
<c:choose>
   <c:when test="${sessionScope.sessionStatus == null }">
      <main class="form-signin">
         <form action="adminLoginAction.do" method="post">
            <h1 class="h3 mb-3 fw-normal">MORE ADMIN LOGIN</h1>
            <div class="form-floating">
               <input type="text" class="form-control" name="id" placeholder="ID">
               <label for="floatingInput">ID</label>
            </div>
            <div class="form-floating">
               <input type="password" class="form-control" name="pwd"
                  placeholder="Password"> <label for="floatingPassword">Password</label>
            </div>
            <button class="w-100 btn btn-lg btn-primary" style="background-color:#ff9797; border-color:black;" type="submit">Sign
               in</button>
         </form>
      </main>
   </c:when>
   <c:when test="${sessionScope.sessiomStatus == 9 || sessionScope.sessiomStatus == 10}">
      <input type="button" value="관리페이지로 이동" onclick="location.href='adminSetting.do'">
      <input type="button" value="로그아웃" onclick="location.href='#'">
   </c:when>
   <c:otherwise>
      <h1>접근권한이 없습니다.</h1>
      <a href="index.do">MORE</a>
      <a href="adminLogout.do">temporary logout link</a>
   </c:otherwise>
   </c:choose>
</body>
</html>