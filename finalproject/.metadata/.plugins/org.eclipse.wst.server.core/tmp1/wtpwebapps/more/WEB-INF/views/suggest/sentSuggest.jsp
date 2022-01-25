<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<style>
   h3 {
     margin-top: 24px;
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
.btn-primary {
    color: #fff;
    background-color: #ff9797;
    border-color: #ff9797;
}
</style>
<title>모레-보낸제안</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="revMainContainer">
		<div class="revMainTextBox">
			<div class="revMainText">
				<h1>
					보낸 제안서 목록<br>
					<span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">나의 제안서 목록을 확인해보세요</span>
				</h1>	
			</div>
		</div>
	</div>
<section id="section" class="bg-f4f4f4" style="height: 700px;">
  <div class="container list-main-container">
  <c:forEach var="dto" items="${list }">
      <div class="summary-main" style="margin-left: 400px; margin-right: 400px; margin-top: 50px; cursor:pointer;" onclick="location.href='sugContent.do?s_idx=${dto.s_idx}'">
        <div class="col-xs-8 is_offered_list">
          <div id="courseList" style="width:600px;">
            <div class="card-frame" style="border: 1px solid #e7eaf3; padding: 16px;">
                <div class="d-flex justify-content-between align-items-center border-bottom pb-3">
                  <div class="col-8 font-weight-semi-bold pl-0">
                    <div class="d-flex align-contents-center font-footnote">
                      <a class="btn btn-xs mb-2" style="background-color:rgba(119, 131, 143, 0.1);padding: 0.3rem;">${dto.cate1 }</a>
                        <span class="btn-xs tag-primary-ghost mb-2 ml-2" style="padding: 0.3rem;">${dto.cate2 }</span>
                    </div>
                    <div class="font-weight-semi-bold text-truncate">
                      <a href="">${dto.process }</a>
                    </div>
                    <div class="font-subhead font-weight-normal text-secondary text-truncate">
                    </div>
                  </div>
                  <div class="col-4 pr-0 text-right">
                    <div>
                        <div class="font-weight-semi-bold" style="text-align: right; padding-bottom: 3px;">   
                            <button type="button" class="btn btn-primary lg">${dto.cost }만원</button>
                        </div>
                        <div class="font-weight-semi-bold" style="text-align: right;">   
                           <c:set var="m_id" value="${dto.m_id}"></c:set>
                           <c:if test="${m_id != 'no' }">
                               <button type="button" class="btn btn-primary lg">${m_id} 의뢰인님</button>
                           </c:if>
                        </div>
                    </div>
                  </div>
                </div>
                <div class="font-subhead">
                  <p class="mt-2 mb-0 text-truncate">
                      ${fn:substring(dto.start_date,0,10) }
                      ~
                      ${fn:substring(dto.end_date,0,10) }
                    <c:set var="location" value="${dto.ls_location }"/>
                    <span style="padding-left: 200px;">${fn:substring(location,0,fn:indexOf(location,'구')+1)}</span>
                  </p>
                </div>
            </div>
        </div>
       </div>
      </div>
   </c:forEach>
  </div>
</section>
<div class="page_nav">
  <nav aria-label="Page navigation example" class="mb-5">
    <ul class="pagination justify-content-center mt-5">
      ${pagestr }
    </ul>
  </nav>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>