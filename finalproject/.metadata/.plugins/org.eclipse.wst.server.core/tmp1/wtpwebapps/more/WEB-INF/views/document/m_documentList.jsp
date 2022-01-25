<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="resources/css/suggest/suggestList.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<style>
section{
   width: 1200px;
   margin: 0px auto;
}
.summary-box{
   border-radius: 5px;
   box-shadow: 1px 1px 3px 1px #bdbfc4;
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
<body>
<%@ include file="/WEB-INF/views/header.jsp"%>
 <div class="revMainContainer">
		<div class="revMainTextBox">
			<div class="revMainText">
				<h1>
					나의 레슨 목록<br>
					<span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">나의 수강 목록을 확인해보세요</span>
				</h1>	
			</div>
		</div>
	</div>
<section>
<br>
<br>
<c:forEach var="dto" items="${list }">
  <div class="summary-box bg-white" style="width: 800px;margin-left: 220px;">
    <a href="documentContent.do?d_idx=${dto.d_idx}">
      <div class="summary-main p-3">
      <div class="row">
        <div class="col-xs-2 text-center nth-first is_offered_list" style="width: 150px;">
          <p>
            <c:if test="${dto.pic_path == null}">
                        <div style="margin-right: 20px;">
                           <img
                              src="https://d3cwtye3iv0eb9.cloudfront.net/media/images/defaults/useridentity/thumb.webp"
                              id="profile" class="rounded u-lg-avatar" >
                        </div>
                     </c:if>
                     <c:if test="${dto.pic_path != null}">
                        <div style="margin-right: 20px;">
                           <img src="resources/img/${dto.pic_path}" id="profile2" style="width:100px">
                        </div>
                     </c:if>
          </p>
          <div style="font-size: 14px;" class="text-muted">${dto.name} 강사님</div>
        </div>
        <div class="col-xs-8 is_offered_list" style="width:500px;">
          <p class="first-info">
            <br class="only-mobile-visible">
            <span style="font-size: 20px;"><b>${dto.cate2} 레슨</b></span>
          <div style="background-color: rgba(25, 118, 222, 0.1); padding: 10px;">
          <p>${dto.intro}</p></div>
          
          
        </div>
        <div class="col-xs-2 text-center sub-info-col only-desktop-visible" style="margin-top: 20px;">
          <p>
              <span class="submitted-time">${fn:substring(dto.start_date,0,10)}</span>
              <span class="submitted-time">~ ${fn:substring(dto.start_date,0,10)}</span>
              <br><br>
              <span>${dto.day}</span>
          </p>
        </div>
       </div>
      </div>
    </a>
  </div>
  </c:forEach>
 </section>
 
<%@ include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>