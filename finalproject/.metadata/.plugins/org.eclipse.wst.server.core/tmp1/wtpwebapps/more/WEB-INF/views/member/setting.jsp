<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<style>
  main {
  position: relative;
  }
  a {
      text-decoration: none;
  }
  li {
      list-style: none;
  }
  .u-lg-avatar {
     width: 10rem;
     height: 10rem;
  }  
  .btn-outline-primary{
	color: #ff9797;
	border-color: #ff9797;
}
.btn-outline-primary:hover{
	background-color: #ff9797;
	border-color: #ff9797;
	color:white;
}
  
</style>
<title>모레-설정</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<main id="content" role="main">
  <div class="container space-1 mb-4" style="padding-top: 2rem !important;">
    <div class="row justify-content-center">
      <div class="col-lg-5 mb-5 mb-lg-0">
        <div class="card shadow-sm p-5 mb-2">
          <div class="text-center">
            <div class="text-center">
                <img class="u-lg-avatar rounded-circle" src="resources/img/${dto.pic_path }" alt="">
            </div>
            <div class="name-field text-center mt-3 mb-2">
              <p class="name-field m-0 text-dark">
            ${dto.name }
              </p>
            </div>
            <p class="mb-3">${dto.email }</p>
            <c:if test="${sessionScope.sessionStatus == 2 }">
              <div class="my-3">
                <button type="button" class="p-1 btn btn-xs btn-outline-primary rounded-pill">
                <span class="d-inline rounded-circle  py-1 px-2 font-subhead">
                  <img src="" class="mr-1 position-relative" width="16" style="top:-2px;">
                  전문가
                </span>
              </button>
              </div>
              </div>
               <div class="align-content-center">
             </div>
             </c:if>
            <c:if test="${sessionScope.sessionStatus == 1 }">
              <div class="my-3">
                <button type="button" class="p-1 btn btn-xs btn-outline-primary rounded-pill">
                <span class="d-inline rounded-circle  py-1 px-2 font-subhead">
                  <img src="" class="mr-1 position-relative" width="16" style="top:-2px;">
                  의뢰인
                </span>
              </button>
              </div>
              </div>
               <div class="align-content-center">
             </div>
             </c:if>
        </div>
        <div class="card shadow-sm p-5 mb-2">
          <div>
            <h6 class="font-subhead mb-5 font-weight-medium">일반 설정</h6>
            <ul class="m-0">
              <li class="mb-3">
                <a href="account.do" class="text-secondary d-flex align-items-center" name="나의 계정">
                  <i></i>
                  <p class="m-0 col-11 p-0 font-subhead">계정 설정</p>
                </a>
              </li>
              <c:if test="${sessionScope.sessionStatus == 2 }">
              <li class="mb-3">
                <a href="expertProfile.do?id=${sessionScope.sessionId}" name="" class="text-secondary d-flex align-items-center">
                  <i></i>
                  <p class="m-0 col-11 p-0 font-subhead">전문가 프로필 설정</p>
                </a>
              </li>
              </c:if>
            </ul>
          </div>
        </div>
        <div class="card shadow-sm p-5 only-desktop-visible">
          <a class="font-subhead text-gray" href="logout.do">로그아웃</a>
        </div>
      </div>
    </div>
  </div>
</main>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>