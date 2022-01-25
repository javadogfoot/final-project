<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty sessionScope.sessionId }">
	<script>
		location.href = 'wrong.do';
	</script>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/expert/regist4.css" rel="stylesheet">
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=1d32a2dcb8e69e2a4c412a41db160852&libraries=services"></script>
<title>모레-전문가등록</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div id="section" class="bg-white">
      <form action="regist5.do?cate1=${dto.cate1 }&cate2=${dto.cate2}&ls_location=${dto.ls_location}" method="POST">
         <div class="container">
           	 <div class="content">
             <h4 class="text-center">어떻게 일을 진행하고 싶으신가요?</h4>
             <div class="service-choice-box">
               <ul id="id_travel_option">
                   <li><label for="id_travel_option_0"><input type="checkbox" name="process" value="의뢰인이 있는 곳으로 이동 가능합니다" id="id_travel_option_0">의뢰인이 있는 곳으로 이동 가능합니다</label></li>
                   <li><label for="id_travel_option_1"><input type="checkbox" name="process" value="제가 있는 곳으로 의뢰인이 오는게 좋겠습니다" id="id_travel_option_1">제가 있는 곳으로 의뢰인이 오는게 좋겠습니다</label></li>                           
                   <li><label for="id_travel_option_2"><input type="checkbox" name="process" value="온라인 및 화상수업으로 진행하고 싶습니다" id="id_travel_option_2">온라인 및 화상수업으로 진행하고 싶습니다</label></li>
               </ul>
             </div>
             <div style="padding-left: 218px; padding-top: 20px;">
			<div id="map" style="width:500px;height:350px;"></div>
        </div>
      </div>
    </div>
    <div class="container-fluid bg-eee">
      <div class="container step-nav">
        <div class="row">
          <div class="col-xs-6">
            <a href="" class="prev-btn" id="prev-btn">
              뒤로 가기
            </a>
          </div>
          <div class="col-xs-6">
            <button type="submit" class="blue-btn form-control" id="next-btn" style="background-color: #ff9797; border-color: #ff9797;">다음</button>
          </div>
        </div>
      </div>
    </div>
  </form>
</div>
<script>
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
	    mapOption = {
	        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지ㄴ의 중심좌표
	        level: 5 // 지도의 확대 레벨
	    };  
	    
	    // 주소-좌표 변환 객체를 생성합니다
	    var geocoder = new kakao.maps.services.Geocoder();
	    // 지도를 생성합니다    
	    var map = new kakao.maps.Map(mapContainer, mapOption); 
	
	
	    // 주소로 좌표를 검색합니다
	    geocoder.addressSearch('${dto.ls_location}', function(result, status) {
	
	    // 정상적으로 검색이 완료됐으면 
	     if (status === kakao.maps.services.Status.OK) {
	
	        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
	
	        // 결과값으로 받은 위치를 마커로 표시합니다
	        var marker = new kakao.maps.Marker({
	            map: map,
	            position: coords
	        });
	
	        // 인포윈도우로 장소에 대한 설명을 표시합니다
	        var infowindow = new kakao.maps.InfoWindow({
	            content: '<div style="width:150px;text-align:center;padding:6px 0;">레슨장소</div>'
	        });
	        infowindow.open(map, marker);
	
	        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
	        map.setCenter(coords);
	    } 
	});    
</script>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>  