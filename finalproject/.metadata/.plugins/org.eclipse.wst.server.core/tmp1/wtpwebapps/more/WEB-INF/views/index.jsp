<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">  
    <link rel="shortcut icon" type="image/x-icon" href="resources/img/more_icon.jpg">
    <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/headers/">
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css"/>
    <link rel="stylesheet" type="text/css" href="resources/css/index.css?after">
    <title>모레</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<!--section-->
    <div class="mainContainer">
      <div class="mainFluid">
        <div class="mainText">
          <h1>나에게 딱 맞는 레슨·과외<br>선생님을 만나보세요</h1>
          <p>1분 요청서 작성 후 선생님들의 제안을 받아보세요</p>
          <br>
          <div id="mainSearchBox">
            <div class="icon"></div>
            <input type="text" name="search" placeholder="서비스를 찾아보세요" class="text">
          </div>
        </div>
        <div class="mainImg">
          <img src="resources/img/index_phone.png" alt="mainImg">
        </div>
      </div>
    </div>
    <div id="category">
        <span><a href="request.do?cate1=외국어">외국어</a></span>
        <span><a href="request.do?cate1=스포츠-댄스">스포츠-댄스</a></span>
        <span><a href="request.do?cate1=음악">음악</a></span>
        <span><a href="request.do?cate1=예술-요리">예술-요리</a></span>
        <span><a href="request.do?cate1=실무교육">실무교육</a></span>
        <span><a href="request.do?cate1=교과목">교과목</a></span>
    </div>
    <br>
    <div class="subjectContainer">
      <h3 style="font-weight: bold">인기있는 레슨</h3>
      <div style="width: 1170px;"><a href="lessonList.do">더보기 +</a></div>
    </div>
     <div class="listContainer">
      <c:forEach var="i" begin="0" end="4">
          <div class="listItem" onclick="location.href='requestWrite.do?cate1=${a_cate[i]}&cate2=${a_name[i]}&pic=${a_pic[i]}'">
                   <div class="img">
                        <img alt="img" src="${a_pic[i]}">
                        <div class="hidden">요청하기</div>
                    </div>
                   <div class="name">${a_name[i]}</div>
            </div>
         </c:forEach>
    </div>
    <br>
    <div class="subjectContainer">
      <h3 style="font-weight: bold">추천하는 레슨</h3>
      <div style="width: 1170px;"><a href="lessonList.do">더보기 +</a></div>
    </div>
     <div class="listContainer">
      <c:forEach var="i" begin="0" end="4">
          <div class="listItem" onclick="location.href='requestWrite.do?cate1=${b_cate[i]}&cate2=${b_name[i]}&pic=${b_pic[i]}'">
                   <div class="img">
                        <img alt="img" src="${b_pic[i]}">
                        <div class="hidden">요청하기</div>
                    </div>
                   <div class="name">${b_name[i]}</div>
            </div>
         </c:forEach>
    </div>
  <br>
  <div class="subjectContainer">
    <h3 style="font-weight: bold">수강생 후기</h3>
    <div><a href="reviewList.do">더보기 +</a></div>
  </div>
  <br>
<!-- Swiper -->
    <div class="swiper mySwiper" id="swiper-play">
      <div class="swiper-wrapper">
        <div class="swiper-slide">
            <div class="req-partner-contents">
              <h3 class="req-service-name">기타 레슨</h3>
                <h6 class="review-detail-text">
                모르는 부분이 있으면 이해가 될때까지설명해주시고 안되는<br>
                부분이 있으면 그 부분을 할 수 있을때까지 친절하게<br>
                기다려주시고 도와주셔서 기타레슨 배우는게 너무 좋아용❤️❤️ 
                <div style="padding-top: 100px; color: #1976de;">고*한 수강생</div>
                </h6>
            </div>
        </div>
        <div class="swiper-slide">
            <div class="req-partner-contents">
              <h3 class="req-service-name">피트니스 레슨</h3>
                <h6 class="review-detail-text">
               제가 많이 부족한데 선생님께서 항상 차분하게 기다려주시고<br>
               잘 할수 있게 도와주셔서 정말 감사드려요 ㅠㅠ 전에도 다른<br>
               선생님들께 배웠었는데 김동희쌤께 정착 중입니다 ^^
                <div style="padding-top: 100px; color: #1976de;">김*현 수강생</div>
                </h6>
            </div>
        </div>
        <div class="swiper-slide">
            <div class="req-partner-contents">
              <h3 class="req-service-name">영어 레슨</h3>
                <h6 class="review-detail-text">
               과제도 많이 내주시고 공부했냐고 맨날 확인하고 잊을만 하면<br>
               제가 뭘 하고 있는지 체크하시고 진짜 귀찮게 하세요...<br>
               혼자 공부하기 힘든 분들은 꼭 수업들으세요. 맨날 맨날 공부<br>
               하고 있는 자신을 발견하게 될 겂니다... 
                <div style="padding-top: 80px; color: #1976de;">김*준 수강생</div>
                </h6>
            </div>
        </div>
        <div class="swiper-slide">
            <div class="req-partner-contents">
              <h3 class="req-service-name">바이올린 레슨</h3>
                <h6 class="review-detail-text">
               일정도 저한테 맞춰주시고 좋은 악기도 직접 골라주셨습니다.<br>
               사근사근 친절하게 잘 가르쳐주세요~
                <div style="padding-top: 120px; color: #1976de;">이*민 수강생</div>
                </h6>
            </div>
        </div>
        <div class="swiper-slide">
            <div class="req-partner-contents">
              <h3 class="req-service-name">중국어 레슨</h3>
                <h6 class="review-detail-text">
               두번이나 포기한 중국어를 다시 시작하게 해주셨어요!<br>
               레벨에 맞게 꼼꼼히 설명해주시고 내용도 알차고<br>
               일정도 항상 잘 지켜주셔서 너무 감사드립니다 ㅎㅎ
                <div style="padding-top: 100px; color: #1976de;">권*윤 수강생</div>
                </h6>
            </div>
        </div>
      </div>
        <div class="swiper-button-next"></div>
        <div class="swiper-button-prev"></div>
    </div>
    <br>
    <br>
    <br>
    <div id="banner">
      <img src="resources/img/index_banner1.jpg" alt="배너">
    </div>
    <div id="introSubject">
      <h3 style="margin-top: 200px;font-weight: bold;">당신은 정말 중요한 일에 집중하세요</h3>
      <p>나머지는 모레의 전문가들이 해결해 드릴게요. 요청하신 의뢰는 다음과 같이 진행됩니다.</p>
    </div>
    <br>
    <br>
<!--manual-->
    <div id="manualContainer">
      <div class="manualItem1">
        <div class="manualImg">
          <img src="resources/img/1.PNG">
        </div>
        <div class="manualText">
          <h3>1단계 : 요청하기</h3>
          <p>
            전문가에게 뭘 어떻게 이야기 해야할지 모르시겠다구요?<br>
            걱정마세요. 모레에서 미리 준비한 쉬운 요청서 폼에<br>
            맞추어 의뢰에 필요한 내용들을 작성해주세요.
          </p>
        </div>
      </div>
      <div class="manualItem2" style="margin-top: 50px; margin-bottom: 50px; background-color:#ff979726;">
        <div class="manualImg">
          <img src="resources/img/2.PNG">
        </div>
        <div class="manualText">
          <h3>2단계 : 제안서 받기</h3>
          <p>
            작성된 요청서는 모레에 등록된 전문가들에게<br>
            전달됩니다. 곧 전문가들의 제안서들이 도착할거에요.<br>
          </p>
        </div>
      </div>
      <div class="manualItem1">
        <div class="manualImg">
          <img src="resources/img/3.PNG">
        </div>
        <div class="manualText">
          <h3>3단계 : 선택하기</h3>
          <p>
            요청에
            적합한 전문가를 선택하세요.
          </p>
        </div>
      </div>
    </div>
    <br>
    <br>
    <br>
<!--     <div id="banner">
      <img src="resources/img/index_banner1.jpg" alt="배너">
    </div> -->

<!--expert-->
    <h3 style="margin: 0px; font-weight: bold;" >모레엔 어떤 전문가들이 있을까요?</h3>
    <p>각 분야에서 전문성을 가진 다양한 전문가들이 여러분들을 기다리고 있습니다.</p>
    <br>
    <div id="expertContainer">
      <div class="expertItem">
        <h3>포토샵, 일러스트<br>쉽게 알려드려요</h3>
        <hr>
        <p>
          저는 다양한 분들과 디자인 작업을 할때 즐거워요. 현재 프리랜서로 다양한 국내외 기업, 
          창업자분들과 함께 다양한 디자인 작업을 하고 있습니다. 미국에서는 Esquire Magazine과 Carnegie Hall 등에서 일을 했었구요,
          여러 직업들을 통해 쌓은 경험을 바탕으로 디자이너의 손길이 필요한 곳에 도움을 드리고 싶습니다.
        </p>
        <br>
        <hr>
        <div class="profileBox">
          <div class="profilePic">
          <img src="resources/img/7.png" alt="expertProfile">
          <p class="name">최*경</p>
          </div>
          <div class="spec">
            <ul style="padding-left: 1rem">
              <li>UI/UX 디자인·</li>
              <li>편집디자인·패키지 디자인</li>
              <li>- 뉴욕 프랫대학원</li>
              <li>- 4년차 프리랜서 디자이너</li>
            </ul>
          </div>
        </div>
      </div>
      <div class="expertItem">
        <h3>더 많은 분들을 만날 수<br>있기를 기대하고 있어요</h3>
        <hr>
        <p>
          어렸을 때부터 피아노를 시작해서, 현재는 실용음악과 작곡전공으로 가요와, 피아노를 함께 하고 있습니다. 
          그동안 종종 레슨을 해왔는데 앞으로도 반주나 곡을 쓰는데 어려움이 있으신 분들과 함께하고 싶습니다. 
          밴드나 교회, 결혼식 이벤트를 위해, 또는 그냥 취미로 피아노/작곡을 배우고 싶으신 분들 모두 환영합니다!
        </p>
        <br>
        <hr>
        <div class="profileBox">
          <div class="profilePic">
          <img src="resources/img/8.png" alt="expertProfile">
          <p class="name">이*정</p>
          </div>
          <div class="spec">
            <ul style="padding-left: 1rem">
              <li>뉴에이지·가요·CCM반주</li>
              <li>- 동덕여대실용음악과</li>
              <li>- 공연경험 다수, 레슨 3년차</li>
            </ul>
          </div>
        </div>
      </div>
      <div class="expertItem">
        <h3>영어 과외는<br>저에게 맡겨주세요</h3>
        <hr>
        <p>
          어렸을 때부터 영어에 친숙한 환경에서 자라왔어요. 
          외고를 다녔고 대학에서도 대부분의 강의를 영어로 들어서 한국에서도 영어로 생활을 한 시간이 많았구요. 
          짧지 않은 기간 해외에 거주하기도 했습니다. 
          이러한 배경을 가지고 현재는 다양한 분야에서 영어가 필요한 경우에 도움을 드리고 있어요.
        </p>
        <br>
        <br>
        <hr>
        <div class="profileBox">
          <div class="profilePic">
          <img src="resources/img/6.png" alt="expertProfile">
          <p class="name">한*이</p>
          </div>
          <div class="spec">
            <ul style="padding-left: 1rem">
              <li>한영·영한번역/영어레슨</li>
              <li>- 대원외고 졸업</li>
              <li>- 고려대 경영 재학</li>
              <li>- 프리랜서 3년차</li>
            </ul>
          </div>
        </div>
      </div>
    </div>
<!--footer-->
<!--javaScript-->
      <script>
           var swiper = new Swiper(".mySwiper", {
             navigation: {
               nextEl: ".swiper-button-next",
               prevEl: ".swiper-button-prev",
             },
           });
           var Swiper = new Swiper('#swiper-play',
            { autoplay: { delay: 2000, }, });
         
      </script>
    
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>