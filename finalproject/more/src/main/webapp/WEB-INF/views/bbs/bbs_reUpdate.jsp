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

<title>모레-댓글수정</title>
</head>

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
#bbscontent {
   white-space: pre;
}
</style>

<%@ include file="/WEB-INF/views/header.jsp" %>

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
      class="font-footnote text-secondary"> ${dto.id} </span></li>
   <li class="list-inline-item mx-0">
      <div class="font-footnote text-secondary">·</div>
   </li>
   <li class="list-inline-item mx-0"><span
      class="font-footnote text-secondary">조회 ${dto.count}회</span></li>
   <li class="list-inline-item mx-0">
      <div class="font-footnote text-secondary">·</div>
   </li>
   <li class="list-inline-item mx-0"><span
      class="font-footnote text-secondary">${dto.regdate}</span></li>
   
      
   
</ul>
   </div>
   
   <button class="btn btn-outline-primary" onclick="location.href='bbsList.do'">목록</button>

</div>
<hr>
<br>
<c:if test="${!empty dto.file_path}">
            <div><img src="bbsfileUpload/${dto.file_path}" id="img"></div>
         </c:if>
<div style="white-space: pre;"><c:out value="${dto.content}" /></div>
<br><br><hr>
<div id="blurb">광고</div>
<br><br>


<!-- 댓글,대댓글 -->
<div>
   <b>댓글<i class="far fa-comment-dots fa-1x"></i> ${reCount}개
   </b>
</div>

<br>
<br>
<c:if test="${empty list}">
<div align="center">등록된 댓글이 없습니다.</div>
<br><br>
</c:if>

<div>
<c:forEach var="list" items="${list}">
<c:if test="${list.lev eq 0}">

   <hr>
   <br>
   <br>
   <ul style="padding-left: 0;">
      <li class="list-inline-item mx-0"
      ><span><b>${list.writer}</b></span></li> &nbsp;&nbsp;
      <li class="list-inline-item mx-0" style="font-size: 13px;">
      <span>${list.regdate}</span></li>
   </ul>
   <!-- 댓글수정 -->
   <c:if test="${list.re_idx==re_idx}">
   <form name="bbs_reupdate" action="bbs_reUpdate.do">
   <div class="input-group mb-3">
      <textarea type="text" class="form-control comment-text"
         name="content" id="content">${list.content}</textarea>
      <div class="input-group-append">
         <input type="hidden" name="cp" value="${cp}">
         <input type="hidden" name="b_idx" value="${dto.b_idx}"> 
         <input type="hidden" name="re_idx" value="${list.re_idx}"> 
         <input type="submit" class="btn font-subhead btn-primary text-nowrap width-100 comment-add"
               style="height: 64px;" value="등록">
         <input type="button" class="btn font-subhead btn-primary text-nowrap width-100 comment-add"
         style="height: 64px;" value="취소" onclick="history.back()">
      </div>
   </div>
   </form>
   </c:if>
   

   
   
   <c:if test="${list.re_idx != re_idx && list.del==0}">
      <div style="white-space:pre;"><c:out value="${list.content}" /></div>
   </c:if>
   
   <c:if test="${list.del==1}">
   <div>삭제된 댓글입니다.</div>
   </c:if>
   <br>
   
   <!-- 대댓글목록 -->
   <c:forEach var="list2" items="${list2}">
      <c:if test="${list2.ref eq list.ref}">
         <c:if test="${list2.lev ne 0}">
            <div style="padding-left: 20px;">
               <ul style="padding-left: 0; margin-bottom: 0px;">
                  <li class="list-inline-item mx-0"><span> <i class="material-icons-outlined">subdirectory_arrow_right</i>
                     &nbsp;${list2.writer}</span></li> &nbsp;&nbsp;
                  <li class="list-inline-item mx-0" style="font-size: 13px;">
                     <span> ${list2.regdate} </span>
                  </li>
               </ul>
               <div>
                     <!-- 대댓글 수정 -->
                  <c:if test="${list2.re_idx==re_idx}">
                  <form name="bbs_rereupdate" action="bbs_reUpdate.do">
                  <div class="input-group mb-3">
                  <textarea type="text" class="form-control comment-text"   name="content" id="content2">${list2.content}</textarea>
                  <div class="input-group-append">
                     <input type="hidden" name="cp" value="${cp}">
                     <input type="hidden" name="b_idx" value="${dto.b_idx}"> 
                     <input type="hidden" name="re_idx" value="${list2.re_idx}"> 
                     <input type="submit" class="btn font-subhead btn-primary text-nowrap width-100 comment-add"
                           style="height: 64px;" value="등록">
                     <input type="button" class="btn font-subhead btn-primary text-nowrap width-100 comment-add" 
                           style="height: 64px;" value="취소" onclick="history.back()">
                  </div>
   </div>
   </form>
   </c:if>
               </div>
               <c:if test="${list2.re_idx != re_idx}">
               <div style="padding-left: 40px; margin-bottom: 10px; white-space:pre;"><c:out value="${list2.content}" /></div>
               </c:if>
            </div>
         </c:if>
      </c:if>
   </c:forEach>
</c:if>
</c:forEach>
</div>
</section>

<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>