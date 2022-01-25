<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<style>
   .page-header {
       margin: 250px 150px 150px 150px;
   }
   .btn {
       background-color: skyblue;
   }
   
	   .btn-primary{
	background-color: #ff9797;
	border-color: #ff9797;
}
.btn-primary:hover{
	background-color: #ff9797;
	border-color: #ff9797;
}	
.btn-primary:disabled{
	background-color: #ff9797;
	border-color: #ff9797;
}
</style>
<title>모레-전문가등록</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
    <div id="section" style="min-height: 412.156px;">
        <div class="container text-center">
            <div class="page-header">
                <h3>전문가 등록이 완료되었습니다</h3><br>
                <h3>학생들에게 레슨을 제안해보세요!</h3><br>
                <h3>다시 로그인 부탁드립니다~</h3>
            </div>
            <button type="submit" class="btn" onclick="location.href='login.do'">로그인하러가기!</button>
        </div>
    </div>  
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>