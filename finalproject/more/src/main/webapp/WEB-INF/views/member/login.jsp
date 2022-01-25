<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/member/login.css" rel="stylesheet">
<title>모레-로그인</title>
<style>
.btn-primary{
	background-color: #ff9797;
	border-color: #ff9797;
}
.btn-primary:hover{
	background-color: #ff9797;
	border-color: #ff9797;
}
</style>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<main class="form-signin">
  <form action="loginAction.do" method="post">
    <h1 class="h3 mb-3 fw-normal">More</h1>
    <div class="form-floating">
      <input type="text" class="form-control" name="id" placeholder="ID" value="${cookie.ckId.value }">
      <label for="floatingInput">ID</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" name="pwd" placeholder="Password">
      <label for="floatingPassword">Password</label>
    </div>
    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" name="saveId" ${empty cookie.ckId.value ? '' : 'checked' }> Save ID
      </label>
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
  </form>
  <div style="text-align: center; margin-top: 20px">
  	<a href="findId.do">아이디 찾기</a>  |  <a href="findPassword.do">비밀번호 찾기</a>
  </div>
</main>
<div style="text-align: center">
    <a href="join.do">계정이 없으신가요?</a>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>