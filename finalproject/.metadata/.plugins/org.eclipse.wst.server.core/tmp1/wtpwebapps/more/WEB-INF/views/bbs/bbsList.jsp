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
<link href="resources/css/bootstrap.min.css" rel="stylesheet"
   type="text/css">

<title>모레-자유게시판</title>
</head>

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
.btn-primary{
	background-color: #ff9797;
	border-color: #ff9797;
}
.btn-primary:hover{
	background-color: #ff9797;
	border-color: #ff9797;
}
.revMainContainer{
	background-image:url(https://d3cwtye3iv0eb9.cloudfront.net/media/images/part/1544382373866000/pc/origin.jpg);
	background-repeat:no-repeat;
	background-size:cover;
    height: 380px;
    width: 100%;
}
.revMainContainer .revMainTextBox{
    width: 100%;
    height: 400px;
    padding-right: 15px;
    padding-left: 15px;
    margin:0 auto;  
}
.revMainText{
    margin:0 auto;
    width: 550px;
    height: 400px;
    display: flex;
    flex-direction: column;
    justify-content: center;
}
.revMainText h1{
    height: 100px;
    font-size: 42px;
    font-weight: bold;
    color: white;
    text-align: center;
}

</style>


<!--header-->
<body>
   <%@ include file="/WEB-INF/views/header.jsp"%>
	<div class="revMainContainer">
		<div class="revMainTextBox">
			<div class="revMainText">
				<h1>
					자유 게시판<br>
					<span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">자유롭게 글을 작성해보세요</span>
				</h1>	
			</div>
		</div>
	</div>

   <br>
   <br>

   <section>
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
         <div>
         <img src="resources/img/0.png" style="height: 200px; width: 1200px;">
      </div>
      <br> <br>
      
      <c:if test="${sessionScope.sessionId != null}">
      <div id="writeBt">
         <input type="button" class="btn btn-outline-secondary"
            onclick="location.href='bbsWriteForm.do'" value="글쓰기">
      </div>
      </c:if>
      <br> <br>
      <hr>
      <br>
      <div>

         <c:if test="${empty list}">
            <h4 align="center">등록된 글이 없습니다.</h4>
            <br>
            <Br>
            <br>
         </c:if>

         <c:if test="${!empty list}">
            <c:forEach var="dto" items="${list}" varStatus="status">

               <c:url var="contentUrl" value="bbsContent.do">
                  <c:param name="b_idx">${dto.b_idx}</c:param>
               </c:url>

               <fieldset>
                  <a href="${contentUrl}" style="color: black;">
                     <div style="display: flex; flex-direction: row; justify-content: space-between;">
                        <div>
                           <div style="padding-bottom: 20px; font-size: 17px;">
                              <b>${dto.title}</b>
                           </div>
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
   <%@ include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>