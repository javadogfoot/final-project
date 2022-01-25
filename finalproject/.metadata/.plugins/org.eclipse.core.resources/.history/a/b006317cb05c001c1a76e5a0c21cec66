<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
   href="resources/css/expert/expertProfile.css?ver=1">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
<script
   src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
   <%@ include file="/WEB-INF/views/header.jsp"%>
   <c:if test="${sessionScope.sessionId eq dto.id}">
   <div id="expertNav">
      <a href="expertProfile.do?id=${sessionScope.sessionId}"><span style="font-weight: bold;">내 프로필 보기</span></a> 
      <a href="account.do"><span>기본 정보</span></a>
      <a href="expertLocation.do?id=${sessionScope.sessionId}"><span>위치 및 이동</span></a> 
      <a href="expertIntro.do?id=${sessionScope.sessionId}"><span>소개</span></a>
      <a href="expertSpec.do?id=${sessionScope.sessionId}"><span>학력 및 경력</span></a>
      <a href="expertCate.do?id=${sessionScope.sessionId}"><span>전문 레슨</span></a> 
   </div>
   <div class="expertMain">
      <div class="leftMain">
         <div class="leftMenu">
            <div class="modify">
               <a href="account.do"><button>수정</button></a>
            </div>
            <div class="profile">
               <img src="resources/img/${dto.pic_path}" alt="profile">
               <h4>${dto.name}님의 프로필</h4>
               <div class="name">
                  <i class="fas fa-star fa-1x"></i>(${reviewCnt}개 리뷰)
               </div>
               <div class="name">
                  <i class="fas fa-pencil-alt fa-1x"></i>(${documentCnt}개 레슨)
               </div>
               <br>
               <br>
               <div id="telBt">연락처 확인하기</div>
               <div id="emailBt">E-mail 확인하기</div>
            </div>
            <hr>
            <div class="profileContainer" style="height:65px;">
               <div class="profileItem">
                  <h3>나의 계좌</h3>
                  <a href="expertAccount.do?id=${sessionScope.sessionId}"><button>수정</button></a>
               </div>
               <div style="font-size: 18px;">${dto.bank} ${dto.account}</div>
            </div>
            <br>
            <hr>
            <div class="profileContainer">
               <div class="profileItem">
                  <h3>지역</h3>
                  <div class="btContainer">
                     <a href="expertLocation.do?id=${sessionScope.sessionId}"><button>수정</button></a>
                  </div>
               </div>
               <div class="location">
                  <div>
                     <i class="mr-2 fas fa-map-marker-alt text-secondary"></i>&nbsp;
                     ${dto.ls_location}
                  </div>
                  <div>
                     <i class="mr-2 fas fa-check text-secondary"
                        style="margin-top: 10px;"></i>&nbsp; ${dto.process}<br>
                  </div>
               </div>
            </div>
            <br>
            <hr>
            <div class="profileContainer" style="height:90px;">
               <div class="profileItem">
                  <h3>전문 레슨</h3>
                  <a href="expertCate.do?id=${sessionScope.sessionId}"><button>수정</button></a>
               </div>
               <div style="font-size: 18px;">${dto.cate1}
                  <span style="font-size: 17px;">(${dto.cate2})</span>
               </div>
            </div>
            <hr>
            <div class="profileContainer">
               <div class="profileItem">
                  <h3>
                     제안서 목록<span style="font-size: 15px; font-weight: 400; padding-left: 10px;">${suggestCnt}개의 제안</span>
                  </h3>
               </div>
               <div class="suggestContent">
                  <c:if test="${empty suggestList}">
                     <div class="reviewList">등록된 제안서가 없습니다.</div>
                  </c:if>
                  <c:if test="${!empty suggestList}">
                     <div class="reviewList">
                        <table>
                           <tr style="border-bottom-width: 2px;">
                              <th>레슨명</th>
                              <th>제안대상</th>
                           </tr>
                        <c:forEach var="s_list" items="${suggestList}">
                           <tr class="tableList"  style="border-bottom:1px solid #bdbfc4;" onclick="location.href='sugContent.do?s_idx=${s_list.s_idx }'">
                              <td>${s_list.cate2}</td>  
                              <td>${s_list.m_id}</td>  
                           </tr>
                        </c:forEach>
                        </table>
                     </div>
                     <div class="page">${suggestPageStr}</div>
                  </c:if>
               </div>
            </div>
         </div>

      </div>
      <div class="rightMain">
         <div class="rightMenu">
            <div class="rightContainer">
               <div class="rightMenubar">
                  <a href="#see_review"><span>리뷰</span></a> 
                  <a href="#see_intro"><span>전문가 소개</span></a> 
                  <a href="#see_spec"><span>학력 및 경력</span></a> 
                  <a href="#see_lesson"><span>나의 레슨 목록</span></a>
               </div>
               <hr>

               <div class="reviewContainer">
                  <div class="reviewItem">
                     <h3 id="see_intro">전문가 소개</h3>
                     <a href="expertIntro.do?id=${sessionScope.sessionId}"><button>수정</button></a>
                  </div>
                  <br>
                  <p>${dto.intro}</p>
               </div>
               <br>
               <hr>
               <div class="specContainer">
                  <div class="reviewItem">
                     <h3 id="see_spec">학력 및 경력</h3>
                     <a href="expertSpec.do?id=${sessionScope.sessionId}"><button>수정</button></a>
                  </div>
                  <h5 style="font-weight: bold;">학력</h5>
                  <div class="compleContainer3">
                     <div class="compleItems2">
                        <div class="compleItem2">
                           <div class="univ">
                              <img src="resources/img/${dto.pic_path }" alt="univ">
                              <ul class="univUl">
                                 <li>${dto.univ}</li>
                                 <li>${dto.major}</li>
                              </ul>
                           </div>
                        </div>
                     </div>
                  </div>
                  <br>
                  <div class="careerItems">
                     <div class="careerItem">
                        <h5 style="font-weight: bold;">
                           <i class="fas fa-briefcase"></i>&nbsp;경력 및 기타사항
                        </h5>
                        <div class="spec">
                           <div>${dto.career}</div>
                        </div>
                     </div>
                     <div class="careerItem">
                        <h5 style="font-weight: bold;">
                           <i class="fas fa-graduation-cap"></i>&nbsp;자격증
                        </h5>
                        <div class="spec">
                           <div>${dto.cer}</div>
                        </div>
                     </div>
                  </div>
                  <br>
                  <hr>
               </div>
                  <div class="reviewContainer1">
                  <div class="profileItem">
                     <h3 id="see_review">
                        리뷰<span style="font-size: 15px; font-weight: 400; padding-left: 10px;">${reviewCnt}개의 리뷰</span>
                     </h3>
                  </div>
                  <div class="reviewContent1">
                     <div class="leftStar">
                        <i class="fas fa-star fa-2x"></i>&nbsp;<span style="font-size: 30px;">${grsumavg}</span>
                     </div>
                     <div class="rightStar">
                        <ul>
                           <li>전문성</li>
                           <li id="gr1" data-rate="${gr1avg}">
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i>
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i>
                           </li>
                        </ul>
                        <ul>
                           <li>준비도</li>
                           <li id="gr2" data-rate="${gr2avg}">
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i>
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i>
                              </li>
                        </ul>
                        <ul>
                           <li>강의력</li>
                           <li id="gr3" data-rate="${gr3avg}">
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i>
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i>
                           </li>
                        </ul>
                     </div>
                  </div>
                  <div class="reviewContent2">
                     <c:if test="${empty reviewList}">
                        <div class="reviewList">등록된 리뷰가 없습니다.</div>
                     </c:if>
                     <c:if test="${!empty reviewList}">
                        <div class="reviewList">
                           <table>
                              <tr style="border-bottom-width: 2px;">
                                 <th>레슨명</th>
                                 <th>학생ID</th>
                                 <th colspan="2">후기</th>
                                 <th>별점</th>
                              </tr>
                           <c:forEach var="r_list" items="${reviewList}">
                              <tr id="revItem${r_list.rv_idx}" class="tableList" style="border-bottom:1px solid #bdbfc4;">                     
                                 <td>${r_list.cate2}</td>  
                                 <td>${r_list.id}</td>  
                                 <td colspan="2">${fn:substring(r_list.content,0,10)}</td>
                                 <td>${r_list.gradesum}점</td>
                              </tr>
                              <div class="modalContainer" id="modalContainer${r_list.rv_idx}">
                                  <div class="modali">
                                     <div class="cate">${r_list.e_id}강사의 ${r_list.cate2} 레슨</div>
                                    <p class="content">${r_list.content}</p>
                                     <div class="star" data-rate="${r_list.gradesum}">
                                           <i class="fas fa-star fa-1x"></i>
                                         <i class="fas fa-star fa-1x"></i>
                                           <i class="fas fa-star fa-1x"></i>
                                          <i class="fas fa-star fa-1x"></i>
                                        <i class="fas fa-star fa-1x"></i>
                                     </div>
                                     <div class="studentName">${r_list.name} 수강생</div>
                                  </div>
                               </div> 
                               <script>
                                 $('#modalContainer${r_list.rv_idx}').hide();
                                 var rv=document.getElementById('#revItem${r_list.rv_idx}');
                                 $('#revItem${r_list.rv_idx}').click(function(){
                                    $('#modalContainer${r_list.rv_idx}').fadeIn();
                                 });
                                 $('#modalContainer${r_list.rv_idx}').click(function(){
                                     $('#modalContainer${r_list.rv_idx}').fadeOut();
                                 });
                               </script>
                           </c:forEach>
                           </table>
                           <div class="page">${reviewPageStr}</div>
                        </div>
                     </c:if>
                  </div>
               </div>
               <hr>
               <div class="specContainer">
                  <div class="reviewItem">
                     <h3 id="see_lesson">
                        나의 레슨 목록<span style="font-size: 15px; font-weight: 400; padding-left: 10px;">${documentCnt}개의 레슨</span>
                     </h3>
                  </div>
                  <div class="reviewContent2">
                     <c:if test="${empty documentList}">
                        <div class="reviewList">레슨이 없습니다.</div>
                     </c:if>
                     <c:if test="${!empty documentList}">
                        <div class="reviewList">
                           <table>
                              <tr style="border-bottom-width: 2px;">
                                 <th>레슨명</th>
                                 <th>학생ID</th>
                                 <th>진행상황</th>
                              </tr>
                           <c:forEach var="d_list" items="${documentList}">
                              <tr class="tableList" style="border-bottom:1px solid #bdbfc4;" onclick="location.href='documentContent.do?d_idx=${d_list.d_idx}'">
                                 <td>${d_list.cate2}</td>  
                                 <td>${d_list.e_id}</td>  
                                 <td>${d_list.status}</td>
                              </tr>
                           </c:forEach>
                           </table>
                           <div class="page">${documentPageStr}</div>
                        </div>
                     </c:if>
                  </div>
               </div>
               <hr>
            </div>
         </div>
      </div>
   </div>
   <div id="modal_tel">
      <div class="modal_body">
         <div class="modal_title">${dto.name}님의 연락처</div>
         <div class="modal_content">${dto.tel}</div>
      </div>
   </div>
   <div id="modal_email">
      <div class="modal_body">
         <div class="modal_title">${dto.name}님의 E-mail</div>
         <div class="modal_content">${dto.email}</div>
      </div>
   </div>      
</c:if>
<c:if test="${sessionScope.sessionId ne dto.id}">
   <div class="expertMain">
      <div class="leftMain">
         <div class="leftMenu">
            <div class="modify">
            </div>
            <div class="profile">
               <img src="resources/img/${dto.pic_path }" alt="profile">
               <h4>${dto.name}님의 프로필</h4>
               <div class="name">
                  <i class="fas fa-star fa-1x"></i>(${reviewCnt}개 리뷰)
               </div>
               <div class="name">
                  <i class="fas fa-pencil-alt fa-1x"></i>(${documentCnt}개 레슨)
               </div>
               <br>
               <br>
               <div id="telBt">연락처 확인하기</div>
               <div id="emailBt">E-mail 확인하기</div>
            </div>
            <br>
            <hr>
            <div class="profileContainer">
               <div class="profileItem">
                  <h3>지역</h3>
               </div>
               <div class="location">
                  <div>
                     <i class="mr-2 fas fa-map-marker-alt text-secondary"></i>&nbsp;${dto.ls_location}
                  </div>
                  <div>
                     <i class="mr-2 fas fa-check text-secondary" style="margin-top: 10px;"></i>&nbsp; ${dto.process}<br>
                  </div>
               </div>
            </div>
            <br>
            <hr>
            <div class="profileContainer" style="height:90px;">
               <div class="profileItem">
                  <h3>전문 레슨</h3>
               </div>
               <div style="font-size: 18px;">${dto.cate1}
                  <span style="font-size: 17px;">(${dto.cate2})</span>
               </div>
            </div>
            <hr>
            <div class="profileContainer">
               <div class="profileItem">
                  <h3 style="width:100%;">제안서 리스트<span style="font-size: 15px; font-weight: 400; padding-left: 10px;">${suggestCnt}개의 제안</span></h3>
               </div>
               <div class="suggestContent">
                  <c:if test="${empty suggestList}">
                     <div class="reviewList">등록된 제안서가 없습니다.</div>
                  </c:if>
                  <c:if test="${!empty suggestList}">
                     <div class="reviewList">
                        <table>
                           <tr style="border-bottom-width: 2px;">
                              <th>레슨명</th>
                           </tr>
                        <c:forEach var="s_list" items="${suggestList}">
                           <tr class="tableList" style="border-bottom:1px solid #bdbfc4;">
                              <td onclick="location.href='sugContent.do?s_idx=${s_list.s_idx }'">${s_list.cate2} 레슨</td> 
                           </tr>
                        </c:forEach>
                        </table>
                     </div>
                     <div class="page">${suggestPageStr}</div>
                  </c:if>
               </div>
            </div>
         </div>

      </div>
      <div class="rightMain">
         <div class="rightMenu">
            <div class="rightContainer">
               <div class="rightMenubar">
                  <a href="#see_review"><span>리뷰</span></a> 
                  <a href="#see_intro"><span>소개</span></a> 
                  <a href="#see_spec"><span>학력 및 경력</span></a> 
               </div>
               <hr>
               <div class="reviewContainer1">
                  <div class="profileItem">
                     <h3 id="see_review">
                        리뷰<span
                           style="font-size: 15px; font-weight: 400; padding-left: 10px;">${reviewCnt}개의
                           리뷰</span>
                     </h3>
                  </div>
                  <div class="reviewContent1">
                     <div class="leftStar">
                        <i class="fas fa-star fa-2x"></i>&nbsp;<span
                           style="font-size: 30px;">${grsumavg}</span>
                     </div>
                     <div class="rightStar">
                        <ul>
                           <li>전문성</li>
                           <li id="gr1" data-rate="${gr1avg}">
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i>
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i>
                           </li>
                        </ul>
                        <ul>
                           <li>준비도</li>
                           <li id="gr2" data-rate="${gr2avg}">
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i>
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i>
                              </li>
                        </ul>
                        <ul>
                           <li>강의력</li>
                           <li id="gr3" data-rate="${gr3avg}">
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i>
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i> 
                              <i class="fas fa-star"></i>
                           </li>
                        </ul>
                     </div>
                  </div>
                  <div class="reviewContent2">
                     <c:if test="${empty reviewList}">
                        <div class="reviewList">등록된 리뷰가 없습니다.</div>
                     </c:if>
                     <c:if test="${!empty reviewList}">
                        <div class="reviewList">
                           <table>
                              <tr style="border-bottom-width: 2px;">
                                 <th>레슨명</th>
                                 <th>학생ID</th>
                                 <th colspan="2">후기</th>
                                 <th>별점</th>
                              </tr>
                           <c:forEach var="r_list" items="${reviewList}">
                              <tr id="revItem${r_list.rv_idx}" class="tableList" style="border-bottom:1px solid #bdbfc4;">                     
                                 <td>${r_list.cate2}</td>  
                                 <td>${r_list.id}</td>  
                                 <td colspan="2">${fn:substring(r_list.content,0,10)}</td>
                                 <td>${r_list.gradesum}점</td>
                              </tr>
                              <div class="modalContainer" id="modalContainer${r_list.rv_idx}">
                                  <div class="modali">
                                     <div class="cate">${r_list.e_id}강사의 ${r_list.cate2} 레슨</div>
                                    <p class="content">${r_list.content}</p>
                                     <div class="star" data-rate="${r_list.gradesum}">
                                           <i class="fas fa-star fa-1x"></i>
                                         <i class="fas fa-star fa-1x"></i>
                                           <i class="fas fa-star fa-1x"></i>
                                          <i class="fas fa-star fa-1x"></i>
                                        <i class="fas fa-star fa-1x"></i>
                                     </div>
                                     <div class="studentName">${r_list.name} 수강생</div>
                                  </div>
                               </div> 
                               <script>
                                 $('#modalContainer${r_list.rv_idx}').hide();
                                 var rv=document.getElementById('#revItem${r_list.rv_idx}');
                                 $('#revItem${r_list.rv_idx}').click(function(){
                                    $('#modalContainer${r_list.rv_idx}').fadeIn();
                                 });
                                 $('#modalContainer${r_list.rv_idx}').click(function(){
                                     $('#modalContainer${r_list.rv_idx}').fadeOut();
                                 });
                               </script>
                           </c:forEach>
                           </table>
                           <div class="page">${reviewPageStr}</div>
                        </div>
                     </c:if>
                  </div>
               </div>
               <hr>
               <div class="reviewContainer">
                  <div class="reviewItem">
                     <h3 id="see_intro">전문가 소개</h3>
                  </div>
                  <br>
                  <p>${dto.intro}</p>
               </div>
               <br>
               <hr>
               <div class="specContainer">
                  <div class="reviewItem">
                     <h3 id="see_spec">학력 및 경력</h3>
                  </div>
                  <h5 style="font-weight: bold;">학력</h5>
                  <div class="compleContainer3">
                     <div class="compleItems2">
                        <div class="compleItem2">
                           <div class="univ">
                              <img src="resources/img/${dto.pic_path }" alt="univ">
                              <ul class="univUl">
                                 <li>${dto.univ}</li>
                                 <li>${dto.major}</li>
                              </ul>
                           </div>
                        </div>
                     </div>
                  </div>
                  <br>
                  <div class="careerItems">
                     <div class="careerItem">
                        <h5 style="font-weight: bold;">
                           <i class="fas fa-briefcase"></i>&nbsp;경력 및 기타사항
                        </h5>
                        <div class="spec">
                           <div>${dto.career}</div>
                        </div>
                     </div>
                     <div class="careerItem">
                        <h5 style="font-weight: bold;">
                           <i class="fas fa-graduation-cap"></i>&nbsp;자격증
                        </h5>
                        <div class="spec">
                           <div>${dto.cer}</div>
                        </div>
                     </div>
                  </div>
                  <br>
                  <hr>
               </div>
               <div class="specContainer">
                  <div class="reviewItem">
                     <h2 style="line-height: 50px; font-weight:bold;">
                        ${dto.name} 강사님<span>은 현재까지</span><br>${documentCnt}개의 레슨<span>을 진행했습니다.</span>
                     </h2>
                  </div>
               </div>
            </div>
         </div>
      </div>
   </div>
   <div id="modal_tel">
      <div class="modal_body">
         <div class="modal_title">${dto.name}님의 연락처</div>
         <div class="modal_content">${dto.tel}</div>
      </div>
   </div>
   <div id="modal_email">
      <div class="modal_body">
         <div class="modal_title">${dto.name}님의 E-mail</div>
         <div class="modal_content">${dto.email}</div>
      </div>
   </div>      
</c:if>
<%@ include file="/WEB-INF/views/footer.jsp"%>
<script>
var modal = document.getElementById('modal_tel');
var modal_bt = document.getElementById('telBt');
modal_bt.addEventListener('click', function() {
   modal.style.display = 'block';
})
modal.addEventListener('click', function() {
   modal.style.display = 'none';
})
$('#modal_email').hide();
$('#emailBt').click(function() {
   $('#modal_email').fadeIn();
});
$('#modal_email').click(function() {
   $('#modal_email').fadeOut();
});

$(function(){

   var star= $('#gr1');
   star.each(function(){
      var targetScore=$(this).attr('data-rate');
      $(this).find('svg:nth-child(-n+'+targetScore+')').css({color:'#ff9797'});
   });
   var star= $('#gr2');
   star.each(function(){
      var targetScore=$(this).attr('data-rate');
      $(this).find('svg:nth-child(-n+'+targetScore+')').css({color:'#ff9797'});
   });
   var star= $('#gr3');
   star.each(function(){
      var targetScore=$(this).attr('data-rate');
      $(this).find('svg:nth-child(-n+'+targetScore+')').css({color:'#ff9797'});
   });
      var star= $('.star');
      star.each(function(){
         var targetScore=$(this).attr('data-rate');
         $(this).find('svg:nth-child(-n+'+targetScore+')').css({color:'#ff9797'});
      });
});

var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
var options = { //지도를 생성할 때 필요한 기본 옵션
   center : new kakao.maps.LatLng(33.450701, 126.570667), //지도의 중심좌표.
   level : 3
//지도의 레벨(확대, 축소 정도)
};

var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴

// 주소로 좌표를 검색합니다
geocoder
      .addressSearch(
            '${dto.ls_location}',
            function(result, status) {

               // 정상적으로 검색이 완료됐으면 
               if (status === kakao.maps.services.Status.OK) {

                  var coords = new kakao.maps.LatLng(
                        result[0].y, result[0].x);

                  // 결과값으로 받은 위치를 마커로 표시합니다
                  var marker = new kakao.maps.Marker(
                        {
                           map : map,
                           position : coords
                        });

                  // 인포윈도우로 장소에 대한 설명을 표시합니다
                  var infowindow = new kakao.maps.InfoWindow(
                        {
                           content : '<div style="width:150px;text-align:center;padding:6px 0;">레슨장소</div>'
                        });
                  infowindow.open(map, marker);

                  // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
                  map.setCenter(coords);
               }
            });
</script>
</body>
</html>











