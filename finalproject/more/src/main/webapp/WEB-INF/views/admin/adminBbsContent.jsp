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
function removeCheck(b_idx, re_idx, ref) {

	 if (confirm("정말 삭제하시겠습니까?") == true){    //확인
		
		 var str='';
		 if(b_idx) str+="b_idx="+b_idx+"&";
		 if(re_idx) str+="re_idx="+re_idx+"&";
		 if(ref) str+="ref="+ref+"&";
		 
		document.location.href = "adminBbs_reDel.do?"+str;

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
      
      <c:url var="updateUrl" value="bbsUpdateForm.do">
         <c:param name="b_idx">${dto.b_idx}</c:param>
      </c:url>
      <c:url var="deleteUrl" value="bbsDelete.do">
         <c:param name="b_idx">${dto.b_idx}</c:param>
      </c:url>

</ul>
   </div>
   
   <button class="btn btn-outline-primary" onclick="location.href='adminBbsList.do'">목록</button>

</div>
<hr>
<br>
<c:if test="${!empty dto.file_path}">
            <div><img src="bbsfileUpload/${dto.file_path}" id="img"></div>
         </c:if>
<div style="white-space: pre;"><c:out value="${dto.content}" /></div>
<br><hr>

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

<!-- 댓글목록 -->
<div>
<c:forEach var="list" items="${list}" varStatus="status">
<c:if test="${list.lev eq 0}">
   <hr>
   <br>
   <br>
   <ul style="padding-left: 0;" id="reply">
      <li class="list-inline-item mx-0"><span> <b>${list.writer}</b>
      </span></li> &nbsp;&nbsp;
      <li class="list-inline-item mx-0" style="font-size: 13px;"><span>
            ${list.regdate} </span></li>
            
      <c:if test="${sessionScope.sessionStatus == 9 || sessionScope.sessionStatus == 10 && list.del == 0}">
      <li class="list-inline-item mx-0">
      <input type="button" class="btn btn-outline-danger btn-sm" 
      		onclick="removeCheck(${list.b_idx}, ${list.re_idx}, ${list.ref})" value="삭제" style="margin-bottom: 20px;">
      		</li></c:if>
      <c:url var="re_updateUrl" value="bbs_reUpdateForm.do">
         <c:param name="re_idx">${list.re_idx}</c:param>
         <c:param name="b_idx">${dto.b_idx}</c:param>
         <c:param name="cp">${cp}</c:param>
      </c:url>
      <c:url var="re_deleteUrl" value="bbs_reDelete.do">
         <c:param name="re_idx">${list.re_idx}</c:param>
         <c:param name="b_idx">${dto.b_idx}</c:param>
         <c:param name="ref">${list.ref}</c:param>
      </c:url>      
     
   </ul>
   <c:if test="${list.del==0}">
   <div style="white-space:pre;" id="re_content"><c:out value="${list.content}" /></div>
   </c:if>
   <c:if test="${list.del==1}">
   <div>삭제된 댓글입니다.</div>
   </c:if>
   <br>

   <c:if test="${sessionScope.sessionId == null && list.del==0}">
   <span style="font-size: 13px; cursor: pointer;">대댓글 ${rereCount[status.index]}개</span>
   </c:if>
   </c:if>

   <!-- 대댓글목록 -->
   <c:forEach var="list2" items="${list2}">
   
      <c:if test="${list2.ref eq list.ref && list2.lev ne 0 && list.del eq 0}">

            
            <div style="padding-left: 20px;">
               <ul style="padding-left: 0; margin-bottom: 0px;" id="comment">
                  <li class="list-inline-item mx-0"><span> 
                  <i class="material-icons-outlined">subdirectory_arrow_right</i>&nbsp;${list2.writer}</span></li> &nbsp;&nbsp;
                  <li class="list-inline-item mx-0" style="font-size: 13px;">
                     <span> ${list2.regdate} </span>
                  </li>
                  <c:if test="${sessionScope.sessionStatus == 9 || sessionScope.sessionStatus == 10 && list2.del == 0}">
                  <li class="list-inline-item mx-0">
                  <input type="button" class="btn btn-outline-danger btn-sm"
            				onclick="removeCheck(${list2.b_idx}, ${list2.re_idx})" value="삭제" style="margin-bottom: 20px;">
                  </li></c:if>
                    
                        
               </ul>
               </div>
               <c:if test="${list2.del==1}">
                  <div style="padding-left: 40px;">삭제된 댓글입니다.</div>
               </c:if>
               <c:if test="${list2.del==0}">
                  <div style="padding-left: 40px; margin-bottom: 10px; white-space:pre;"><c:out value="${list2.content}" /></div>
               </c:if>      
         </c:if>      
            
   </c:forEach>
</c:forEach>
</div>

</section>

<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>