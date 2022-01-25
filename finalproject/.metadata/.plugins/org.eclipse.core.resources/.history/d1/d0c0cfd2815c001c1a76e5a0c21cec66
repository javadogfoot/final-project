<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
<link href="resources/css/header.css" rel="stylesheet">
<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-214947172-1"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-214947172-1');
</script>
<!-- ---------------------비회원  -->
<c:if test="${sessionScope.sessionStatus == null }">
	<header>
    <div id="headerContainer">
        <a href="index.do"><img src="resources/img/more_logo.jpg" alt="logo" style="padding: 10px"></a>
        <div id="menubar">
          <div id="leftMenu">
            <div><a href="regist1.do">전문가 등록하기</a></div>
            <div><a href="lessonList.do">수업 요청하기</a></div>
            <div><a href="bbsList.do">자유 게시판</a></div>
            <div><a href="reviewList.do">후기 게시판</a></div>
          </div>
          <div id="rightMenu">
               <div><a href="login.do">로그인</a></div>
               <div><a href="noticeList.do"><i class="far fa-question-circle"></i></a></div>
          </div>
        </div>
      </div>
	</header>
</c:if>
<!----------------------기본(의뢰인) 로그인중-->
<c:if test="${sessionScope.sessionStatus == 1 }">
	<header>
     <div id="headerContainer">
        <a href="index.do"><img src="resources/img/more_logo.jpg" alt="logo" style="padding: 10px"></a>
        <div id="menubar">
          <div id="leftMenu">
            <div id="client" onmouseover="show()" onmouseout="hide()">
               <a href="#">레슨</a>
              </div>
            <div id="joinExpert">
               <a href="regist1.do">전문가 등록하기</a>
             </div>
            <div><a href="bbsList.do">자유 게시판</a></div>
            <div><a href="reviewList.do">후기 게시판</a></div>
          </div>
          <div id="rightMenu">
            <div>${sessionScope.sessionName }님</div>
            <div><a href="setting.do"><i class="far fa-user fa-1x"></i></a></div>
            <div><a href="noticeList.do"><i class="far fa-question-circle"></i></a></div>
          </div>
        </div>
      </div>
      <div id="hiddenHeaderContainer" onmouseover="show()" onmouseout="hide()">
        <div class="hiddenItem">
          <div class="Item"><a href="suggestList.do">레슨 목록</a></div>
          <div class="Item"><a href="lessonList.do">레슨 요청하기</a></div>
          <div class="Item"><a href="sentRequest.do?id=${sessionScope.sessionId}">보낸 요청</a></div>
          <div class="Item"><a href="receiveSuggest.do?id=${sessionScope.sessionId }">받은 제안</a></div>
          <div class="Item"><a href="m_documentList.do">나의 레슨 내역</a></div>
        </div>
      </div>
	</header>
</c:if>
<!-- -----------------------전문가 로그인중 -->
<c:if test="${sessionScope.sessionStatus == 2 }">
	<header>
     <div id="headerContainer">
       <a href="index.do"><img src="resources/img/more_logo.jpg" alt="logo" style="padding: 10px"></a>
       <div id="menubar">
         <div id="leftMenu">
           <div id="client" onmouseover="show()" onmouseout="hide()">
              <a href="#">레슨</a>
             </div>
           <div><a href="bbsList.do">자유 게시판</a></div>
           <div><a href="reviewList.do">후기 게시판</a></div>
         </div>
         <div id="rightMenu">
           <div>${sessionScope.sessionName }님</div>
           <div><a href="setting.do"><i class="far fa-user fa-1x"></i></a></div>
		   <div><a href="noticeList.do"><i class="far fa-question-circle"></i></a></div>
         </div>
       </div>
     </div>
     <div id="hiddenHeaderContainer" onmouseover="show()" onmouseout="hide()">
       <div class="hiddenItem">
       	 <div class="Item"><a href="requestList.do">요청서 목록</a></div>
       	 <div class="Item"><a href="suggest.do">레슨 제안하기</a></div>
         <div class="Item"><a href="sentsuggest.do?id=${sessionScope.sessionId}">보낸 제안</a></div>
		 <div class="Item"><a href="m_documentList.do">나의 레슨 내역</a></div>
       </div>
     </div>
	</header>
</c:if>
   <script>   
       function show(){
         document.getElementById('hiddenHeaderContainer').style.display='block';
       }
       function hide(){
         document.getElementById('hiddenHeaderContainer').style.display='none';
       } 
  </script> 