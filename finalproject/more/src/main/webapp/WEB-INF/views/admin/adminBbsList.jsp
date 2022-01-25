<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">

<title>모레-자유게시판(관리자)</title>
</head>
<script>
function removeCheck(b_idx) {

	 if (confirm("정말 삭제하시겠습니까?") == true){    //확인
		
		document.location.href = "adminBbsDel.do?b_idx="+b_idx;

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

#writeBt {
   float: left;
}

a:link {
   text-decoration: none;
   color: black;
}

#blurb {
   height: 200px;
   border: 1px solid black;
   background-image: url("resources/img/bbsbanner1.jpg");
   background-size: cover;
}

#paging {
   display: flex;
   justify-content: center;
}

#content {
   width: 350px;
   white-space: pre;
   overflow: hidden;
   text-overflow: ellipsis;
   padding-bottom: 20px;
}
#img{
   width: 150px;
   height: 150px;
}
.collapse {
    display: block;
}

</style>


<!--header-->
<body>
<%@ include file="/WEB-INF/views/adminSidebar.jsp"%>
   <br>
   <br>
   <section>
      <h5>
         <b><a href="adminBbsList.do">게시판 관리</a></b>
      </h5>
      <br>
      <form name="bbsSearch" action="bbsList.do">
         <div class="input-group col-12 p-0 mb-3">
            <input name="keyWord" type="text" class="form-control"
               placeholder="검색어를 입력하세요." aria-label="검색"
               aria-describedby="basic-addon2">
            <div>
               <button class="btn btn-small btn-primary" type="submit">검색</button>
            </div>
         </div>
      </form>
      <br>
      <hr>
      <br>
      <div>

         <c:if test="${empty list}">
            <h4 align="center">등록된 글이 없습니다.</h4>
            <br>
            <br>
            <br>
         </c:if>

         <c:if test="${!empty list}">
            <c:forEach var="dto" items="${list}" varStatus="status">

               <c:url var="contentUrl" value="adminBbsContent.do">
                  <c:param name="b_idx">${dto.b_idx}</c:param>
               </c:url>

               <fieldset>
               <div style="padding-bottom: 20px; font-size: 17px;">
                  <b>${dto.title}</b>
                  <c:if test="${sessionScope.sessionStatus == 9 || sessionScope.sessionStatus == 10}">
				  <input type="button" class="btn btn-outline-danger btn-sm"
						onclick="removeCheck(${dto.b_idx})" value="삭제" style="margin-bottom: 20px;"></c:if>
               </div>
                  <a href="${contentUrl}" style="color: black;">
                     <div style="display: flex; flex-direction: row; justify-content: space-between;">
                        <div>
                           
                           <div id="content"><c:out value="${dto.content}" /></div>
                           <ul
                              style="padding-left: 0; font-size: 13px; margin-bottom: 0px;">
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
                              <li class="list-inline-item mx-0"><span
                                 class="font-footnote text-secondary">댓글 ${reCount[status.index]}개</span></li>
                           </ul>
                        </div>
                        <c:if test="${!empty dto.file_path}">
                           <div>
                              <img src="bbsfileUpload/${dto.file_path}" id="img">
                           </div>
                        </c:if>
                     </div>
                  </a>
                  <hr>
                  <br>
               </fieldset>
            </c:forEach>
         </c:if>
         <!-- paging -->
         <div id="paging""page-item">${pageStr}</div>
   </section>
</body>
</html>