<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<link
   href="https://fonts.googleapis.com/icon?family=Material+Icons|Material+Icons+Sharp|Material+Icons+Two+Tone|Material+Icons+Outlined"
   rel="stylesheet">


<title>모레-게시판관리</title>
</head>
<script>
function removeCheck(n_idx) {

	 if (confirm("정말 삭제하시겠습니까?") == true){    //확인
		
		document.location.href = "adminQnaDel.do?q_idx="+q_idx;

	 }else{   //취소

		 return false;

	 }
}
</script>

<!--css-->
<style>
section {
   width: 1200px;
   margin: 0px auto;
}

#blurb {
   height: 200px;
   border: 1px solid black;
   background-image: url("resources/img/bbsbanner2.jpg");
   background-size: cover;
}

#img {
   width: 250px;
}
a:link {
   text-decoration: none;
   color: black;
}

#paging {
   display: flex;
   justify-content: center;
}

</style>

<%@ include file="/WEB-INF/views/adminSidebar.jsp"%>

<!-- 본문 -->

<section>
<br>

<br> <br>
<br>
<br>
   <div>
      <h5>
         <b>${dto.title}</b>
   </h5>
</div>
<div id="a" style="display:flex; flex-direction: row; justify-content: space-between;">
<div id="a2">
<ul style="padding-left: 0; font-size: 13px;">

   <li class="list-inline-item mx-0"><span
      class="font-footnote text-secondary">작성자: ${dto.writer} </span></li>
   <li class="list-inline-item mx-0">
      <div class="font-footnote text-secondary">·</div>
   </li>
   <li class="list-inline-item mx-0"><span
      class="font-footnote text-secondary">카테고리: ${dto.cate}</span></li>
   <li class="list-inline-item mx-0">
      <div class="font-footnote text-secondary">·</div>
   </li>
   <li class="list-inline-item mx-0"><span
      class="font-footnote text-secondary">작성일: ${dto.writedate}</span></li>
      
</ul>
   </div>
  
</div>
<hr>
<br>
<div style="white-space: pre;"><c:out value="${dto.content}" /></div>
<br><hr>
<input type="button" class="btn btn-outline-danger btn-sm" onclick="location.href='adminQnaList.do'" value="목록" style="margin-bottom: 20px;">
<input type="button" class="btn btn-outline-danger btn-sm" onclick="removeCheck(${dto.q_idx})" value="삭제" style="margin-bottom: 20px;">
</section>
</body>
</html>