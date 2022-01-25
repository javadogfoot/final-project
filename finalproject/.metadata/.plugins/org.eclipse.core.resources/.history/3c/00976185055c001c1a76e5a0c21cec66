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
               레슨<br>
               <span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">원하는 레슨을 선택해보세요</span>
            </h1>   
         </div>
      </div>
   </div>
	<br>
	<br>
   <div id="revListContainer">
      <div class="listItem" onclick="location.href='request.do?cate1=외국어'">
              <div class="img">
               <img alt="img" src="resources/img/lan/lan_eng.jpg">
               <div class="hidden">요청하기</div>
              </div>
             <div class="name">외국어</div>
         </div>
         <div class="listItem" onclick="location.href='request.do?cate1=스포츠-댄스'">
              <div class="img">
               <img alt="img" src="resources/img/sport/sport_training.jpg">
               <div class="hidden">요청하기</div>
              </div>
             <div class="name">스포츠-댄스</div>
         </div>
         <div class="listItem" onclick="location.href='request.do?cate1=음악'">
              <div class="img">
               <img alt="img" src="resources/img/music/music_vocal.jpg">
               <div class="hidden">요청하기</div>
              </div>
             <div class="name">음악</div>
         </div>
         <div class="listItem" onclick="location.href='request.do?cate1=예술-요리'">
              <div class="img">
               <img alt="img" src="resources/img/art/art_draw.jpg">
               <div class="hidden">요청하기</div>
              </div>
             <div class="name">예술-요리</div>
         </div>
         <div class="listItem" onclick="location.href='request.do?cate1=실무교육'">
              <div class="img">
               <img alt="img" src="resources/img/job/job_code.png">
               <div class="hidden">요청하기</div>
              </div>
             <div class="name">실무교육</div>
         </div>
         <div class="listItem" onclick="location.href='request.do?cate1=교과목'">
              <div class="img">
               <img alt="img" src="resources/img/sch/sch_math.jpg">
               <div class="hidden">요청하기</div>
              </div>
             <div class="name">교과목</div>
         </div>
   </div>

<%@ include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>