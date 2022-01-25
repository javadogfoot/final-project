<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- CSS -->
<link rel="stylesheet" href="resources/css/admin/sidebarStyles.css">

<title>MORE - 관리자페이지</title>
</head>
<body id="body-pd">
   <c:if
      test="${sessionScope.sessionStatus != 9 && sessionScope.sessionStatus != 10}">
      <h1>접근권한이 없습니다.</h1>
      <a href="index.do">MORE</a>
   </c:if>
   <c:if
      test="${sessionScope.sessionStatus == 9 || sessionScope.sessionStatus == 10}">
      <main>
         <div class="l-navbar" id="navbar">
            <nav class="nav">
               <div>
                  <div class="nav__brand">
                     <ion-icon name="menu-outline" class="nav__toggle" id="nav-toggle"></ion-icon>
                     <a href="adminDashboard.do" class="nav__logo">MORE ADMIN</a>
                  </div>
                  <div class="nav__list">
                     <a href="adminDashboard.do" class="nav__link active"> <ion-icon
                           name="home-outline" class="nav__icon"></ion-icon> <span
                        class="nav_name">대시보드</span>
                     </a>

               
                     <div href="#" class="nav__link collapse2">
                        <ion-icon name="people-outline" class="nav__icon"></ion-icon>
                         <span class="nav_name">유저관리</span>
                   
                        <ion-icon name="chevron-down-outline" class="collapse__link"></ion-icon>

                        <ul class="collapse__menu" style="width:150px;">
                           <li><a href="manageClient.do" class="collapse__sublink">의뢰인</a></li>
                           <li><a href="adminExpert.do" class="collapse__sublink">전문가</a></li>
                           <li><a href="adminOutMember.do" class="collapse__sublink">탈퇴회원</a></li>
                        </ul>
                     </div>

                     <div href="#" class="nav__link collapse2">
                        <ion-icon name="newspaper-outline" class="nav__icon"></ion-icon>
                        <span class="nav_name">게시판 관리</span>
                     

                        <ion-icon name="chevron-down-outline" class="collapse__link"></ion-icon>

                        <ul class="collapse__menu" style="width:150px;">
                           <li><a href="adminBbsList.do" class="collapse__sublink">자유게시판</a></li>
                           <li><a href="adminReviewList.do" class="collapse__sublink">후기게시판</a></li>
                           <li><a href="adminNoticeList.do" class="collapse__sublink">공지사항</a></li>
                           <li><a href="adminQnaList.do" class="collapse__sublink">Q&A</a></li>
                        </ul>
                     </div>

                     <a href="adminChart.do" class="nav__link"> <ion-icon
                           name="pie-chart-outline" class="nav__icon"></ion-icon> <span
                        class="nav_name">차트</span>
                     </a>
                     
                     <a href="adminRevenue.do" class="nav__link"> <ion-icon
                           name="wallet-outline" class="nav__icon"></ion-icon> <span
                        class="nav_name">수익관리</span>
                     </a>
                     
                     <c:if test="${sessionScope.sessionStatus == 10}">
                        <a href="adminManager.do" class="nav__link"> <ion-icon
                              name="people-circle-outline" class="nav__icon"></ion-icon> <span
                           class="nav_name">매니저 관리</span>
                        </a>
                     </c:if>
                     
                     <a href="updateAdminInfoForm.do" class="nav__link"> <ion-icon
                           name="person-outline" class="nav__icon"></ion-icon> <span
                        class="nav_name">내 정보 수정</span>
                     </a>
                     
                  </div>
                  <a href="adminLogout.do" class="nav__link"> <ion-icon
                        name="log-out-outline" class="nav__icon"></ion-icon> <span
                     class="nav_name">Log out</span>
                  </a>
               </div>
            </nav>
         </div>
      </main>
   </c:if>
   <!-- IONICONS -->
   <script src="https://unpkg.com/ionicons@5.2.3/dist/ionicons.js"></script>
   <!-- JS -->
   <script src="resources/js/admin/sidebar.js"></script>
</body>
</html>