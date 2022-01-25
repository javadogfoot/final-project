<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty sessionScope.sessionId }">
	<script>
		location.href = 'sessionNull.do';
	</script>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/expert/regist1.css" rel="stylesheet">
<title>모레-전문가등록</title>
<style>
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
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<section>
       <div class="container">
         <div class="box_1">
           <h2>모레의 전문가가 되어 고객을 만나보세요!</h2>
           <p>하고 싶은 의뢰를 고르고 제안서를 보내 보세요</p>
           <form action="regist2.do" method="post">
               <select name="cate1" required id="id_code">
                   <option value="" selected>카테고리 선택</option>
                   
                   <option value="외국어">외국어</option>
                   
                   <option value="스포츠-댄스">스포츠-댄스</option>
                   
                   <option value="음악">음악</option>
                   
                   <option value="예술-요리">예술-요리</option>
                   
                   <option value="실무교육">실무교육</option>
                   
                   <option value="교과목">교과목</option>
                   
               </select>
               <button style="background-color: #ff9797; border-color: #ff9797;" type="submit">시작하기</button>
           </form>
         </div>
         <hr>
         <div class="box_2">
           <h2>전문가로 가입 시 어떻게 진행되나요?</h2>
           <div class="row">
             <div class="col-xs-4">
               <img src="resources/img/number_1.png">
               <p>무료로 요청서를 받아보세요</p>
               <p>전문가님의 조건에 맞는<br>의뢰 요청을 보내드립니다</p>
             </div>
             <div class="col-xs-4">
               <img src="resources/img/number_2.png">
               <p>의뢰인에게 제안서를 보내세요</p>
               <p>마음에 드는 의뢰요청에<br>전문가님의 제안서를 보내보세요</p>
             </div>
             <div class="col-xs-4">
               <img src="resources/img/number_3.png">
               <p>작업 / 레슨을 시작하세요</p>
               <p>모레를 통해 전문가님의<br>비즈니스를 성장시키세요</p>
             </div>
           </div>
         </div>
       </div>
     </section>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>
