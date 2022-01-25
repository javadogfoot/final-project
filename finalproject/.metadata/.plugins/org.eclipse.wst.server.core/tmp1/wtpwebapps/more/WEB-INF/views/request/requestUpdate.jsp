<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/request/request.css?after" rel="stylesheet">
<script src="https://d3cwtye3iv0eb9.cloudfront.net/static/js/base/navigations/menu.js?v=1.01"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp"%>
   <div class="revMainContainer">
		<div class="revMainTextBox">
			<div class="revMainText">
				<h1>
					요청서 수정<br>
					<span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">요청서를 수정해보세요</span>
				</h1>	
			</div>
		</div>
	</div>
	<form name="requestUpdateForm" action="requestUpdate.do" method="post">
		<div class="container">
			<!-- 레슨시작일/종료일 -->
			<div class="periodContainer">
				<h4>어느 정도 기간동안 배우고 싶나요?</h4>
				<ul>
					<li><label><input type="checkbox" name="period" value="꾸준히 계속"
					<c:if test="${dto.period eq '꾸준히 계속'}">checked</c:if>>꾸준히 계속</label></li>
					<li><label><input type="checkbox" name="period" value="4~6개월"
					<c:if test="${dto.period eq '4~6개월'}">checked</c:if>>4~6개월</label></li>
					<li><label><input type="checkbox" name="period" value="2~3개월"
					<c:if test="${dto.period eq '2~3개월'}">checked</c:if>>2~3개월</label></li>
					<li><label><input type="checkbox" name="period" value="1개월"
					<c:if test="${dto.period eq '1개월'}">checked</c:if>>1개월</label></li>
					<li><label><input type="checkbox" name="period" value="" id="periodCheck">직접입력<br> 
					<input type="text" name="field_85_319" class="input-lg form-control extrafield" maxlength="200" id="periodText" value="${dto.period}"></label></li>
				</ul>
			</div>
			<div class="dayContainer">
				<h4>선호하는 요일을 골라주세요.</h4>
				<ul>
					<li><label><input type="checkbox" name="day" value="월요일"
					<c:if test="${dto.day eq '월요일'}">checked</c:if>>월요일</label></li>
					<li><label><input type="checkbox" name="day" value="화요일"
					<c:if test="${dto.day eq '화요일'}">checked</c:if>>화요일</label></li>
					<li><label><input type="checkbox" name="day" value="수요일"
					<c:if test="${dto.day eq '수요일'}">checked</c:if>>수요일</label></li>
					<li><label><input type="checkbox" name="day" value="목요일"
					<c:if test="${dto.day eq '목요일'}">checked</c:if>>목요일</label></li>
					<li><label><input type="checkbox" name="day" value="금요일"
					<c:if test="${dto.day eq '금요일'}">checked</c:if>>금요일</label></li>
					<li><label><input type="checkbox" name="day" value="토요일"
					<c:if test="${dto.day eq '토요일'}">checked</c:if>>토요일</label></li>
					<li><label><input type="checkbox" name="day" value="일요일"
					<c:if test="${dto.day eq '일요일'}">checked</c:if>>일요일</label></li>
				</ul>
			</div>
			<div class="timeContainer">
				<h4>선호하는 시간대는 언제인가요?</h4>
				<ul>
					<li><label><input type="checkbox" name="time" value="오전9시 이전"
					<c:if test="${dto.time eq '오전9시 이전'}">checked</c:if>>오전9시 이전</label></li>
					<li><label><input type="checkbox" name="time" value="오전9시 ~ 12시"
					<c:if test="${dto.time eq '오전9시 ~ 12시'}">checked</c:if>>오전9시 ~ 12시</label></li>
					<li><label><input type="checkbox" name="time" value="12시 ~ 3시"
					<c:if test="${dto.time eq '12시 ~ 3시'}">checked</c:if>>12시 ~ 3시</label></li>
					<li><label><input type="checkbox" name="time" value="3시 ~ 6시"
					<c:if test="${dto.time eq '3시 ~ 6시'}">checked</c:if>>3시 ~ 6시</label></li>
					<li><label><input type="checkbox" name="time" value="6시 ~ 9시"
					<c:if test="${dto.time eq '6시 ~ 9시'}">checked</c:if>>6시 ~ 9시</label></li>
					<li><label><input type="checkbox" name="time" value="9시 이후"
					<c:if test="${dto.time eq '9시 이후'}">checked</c:if>>9시 이후</label></li>
				</ul>
			</div>
			<div class="costContainer">
				<h4>레슨 비용에 대한 선호를 알려주세요.</h4>
				<ul>
					<li><label><input type="checkbox" name="cost" value="비용은 크게 중요하지 않아요"
					<c:if test="${dto.cost eq '비용은 크게 중요하지 않아요'}">checked</c:if>>비용은 크게 중요하지 않아요</label></li>
					<li><label><input type="checkbox" name="cost" value="" id="costCheck"
					<c:if test="${dto.cost}">checked</c:if>>원하는 비용 수준이 있어요<br> <input
							type="text" name="field_85_319"
							class="input-lg form-control extrafield" maxlength="200"
							id="costText"> </label></li>
					<li><label><input type="checkbox" name="cost" value="잘 모르겠어요"
					<c:if test="${dto.cost eq '잘 모르겠어요'}">checked</c:if>>잘 모르겠어요</label></li>
				</ul>
			</div>
			<div class="processContainer">
				<h4>어떻게 진행하면 좋을까요?</h4>
				<ul>
					<li><label for="id_travel_option_0">
					<input type="checkbox" name="process" value="전문가가 있는 곳으로 이동 가능합니다" id="id_travel_option_0"
					<c:if test="${dto.process eq '전문가가 있는 곳으로 이동 가능합니다'}">checked</c:if>>전문가가 있는 곳으로 이동 가능합니다</label></li>
					<li><label for="id_travel_option_1">
					<input type="checkbox" name="process" value="제가 있는 곳으로 전문가가 오는게 좋겠습니다" id="id_travel_option_1"
					<c:if test="${dto.process eq '제가 있는 곳으로 전문가가 오는게 좋겠습니다'}">checked</c:if>>제가 있는 곳으로 전문가가 오는게 좋겠습니다</label></li>
					<li><label for="id_travel_option_2">
					<input type="checkbox" name="process" value="온라인 및 화상수업으로 진행하고 싶습니다" id="id_travel_option_2"
					<c:if test="${dto.process eq '온라인 및 화상수업으로 진행하고 싶습니다'}">checked</c:if>>온라인 및 화상수업으로 진행하고 싶습니다</label></li>
				</ul>
			</div>
			<div class="ls_locationContainer">
				<h4>어디서 진행하면 좋을까요?</h4>
				<div class="items">
                	<input type="hidden" id="sample3_postcode" placeholder="우편번호">
					<input type="hidden" id="sample3_address" placeholder="주소">
					<input type="text" name="ls_location" id="sample3_detailAddress" value="${dto.ls_location}" placeholder="주소" readonly>
					<input type="hidden" id="sample3_extraAddress" placeholder="참고항목">
					<input type="button" class="btn btn-outline-secondary" onclick="sample3_execDaumPostcode()" value="주소 찾기" style="text-align:center; margin:30px auto;">
				</div>	
					<div id="wrap" style="display:none;border:1px solid;width:500px;height:300px;margin:5px auto;position:relative">
					<img src="//t1.daumcdn.net/postcode/resource/images/close.png" id="btnFoldWrap" style="cursor:pointer;position:absolute;right:0px;top:-1px;z-index:1" onclick="foldDaumPostcode()" alt="접기 버튼">
					</div>
			</div>
			<div class="introContainer">
				<h4>선생님께 정보를 조금 더 알려주세요.</h4>
				<textarea name="intro" cols="40" rows="23" autocomplete="off" class="input-lg form-control"
					placeholder="관련 경험이나 실력, 구체적인 목적이나 집중하고 싶은 분야가 있다면 알려주세요. 이 외에도 수업 진행시 선생님이 갖추어야 할 조건이 있다면 반드시 언급해주세요."
					maxlength="1000" required="" id="id_field_25">${dto.intro}</textarea>
			</div>
			<div class="updateBt">
				<input type="hidden" name="r_idx" value="${dto.r_idx}">
				<button class="btn btn-lg btn-primary" type="submit"
					style="width: 450px; margin-bottom: 20px;">수정하기</button>
				<button class="btn btn-lg btn-primary" type="button"
					style="width: 450px;"
					onclick="location.href='index.do'">뒤로</button>
			</div>
		</div>
	</form>
<%@ include file="/WEB-INF/views/footer.jsp"%>
<script>
var ph=document.getElementById('periodCheck');
var pt=document.getElementById('periodText');
var ch=document.getElementById('costCheck');
var ct=document.getElementById('costText');
pt.addEventListener("keydown",showText);
ct.addEventListener("keydown",showText);
function showText(){
	ph.value=pt.value;
	ch.value=ct.value;
}


    // 우편번호 찾기 찾기 화면을 넣을 element
    var element_wrap = document.getElementById('wrap');

    function foldDaumPostcode() {
        // iframe을 넣은 element를 안보이게 한다.
        element_wrap.style.display = 'none';
    }

    function sample3_execDaumPostcode() {
        // 현재 scroll 위치를 저장해놓는다.	
        var currentScroll = Math.max(document.body.scrollTop, document.documentElement.scrollTop);
        new daum.Postcode({
            oncomplete: function(data) {
                // 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample3_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample3_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample3_postcode').value = data.zonecode;
                document.getElementById("sample3_detailAddress").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample3_detailAddress").focus();

                // iframe을 넣은 element를 안보이게 한다.
                // (autoClose:false 기능을 이용한다면, 아래 코드를 제거해야 화면에서 사라지지 않는다.)
                element_wrap.style.display = 'none';

                // 우편번호 찾기 화면이 보이기 이전으로 scroll 위치를 되돌린다.
                document.body.scrollTop = currentScroll;
            },
            // 우편번호 찾기 화면 크기가 조정되었을때 실행할 코드를 작성하는 부분. iframe을 넣은 element의 높이값을 조정한다.
            onresize : function(size) {
                element_wrap.style.height = size.height+'px';
            },
            width : '100%',
            height : '100%'
        }).embed(element_wrap);

        // iframe을 넣은 element를 보이게 한다.
        element_wrap.style.display = 'block';
    }
</script>
</body>
</html>