<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${empty sessionScope.sessionId}">
	<script>
		location.href = 'sessionNull.do';
	</script>
</c:if>
<c:if test="${sessionScope.sessionStatus eq 2}">
	<script>
		location.href = 'sessionNullExpert.do';
	</script>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모레-레슨요청</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/request/request.css?after" rel="stylesheet">
<script src="https://d3cwtye3iv0eb9.cloudfront.net/static/js/base/navigations/menu.js?v=1.01"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp"%>
   <div class="revMainContainer" style="background-image:url(${pic}); background-size: 50%; background-position:center center; background-repeat: no-repeat; background-color:white;">
      <div class="revMainTextBox">
         <div class="revMainText">
            <h1>
               ${dto.cate2}<br>
               <span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">모레에서 ${dto.cate2} 레슨 전문가를 만나보세요</span>
            </h1>   
         </div>
      </div>
   </div>
   <form name="requestWriteForm" action="requestWrite.do" method="post">
      <div class="container">
         <!-- 레슨시작일/종료일 -->
         <div class="periodContainer">
            <h4>어느 정도 기간동안 배우고 싶나요?</h4>
            <ul>
               <li><label><input type="checkbox" name="period" value="꾸준히 계속">꾸준히 계속</label></li>
               <li><label><input type="checkbox" name="period" value="4~6개월">4~6개월</label></li>
               <li><label><input type="checkbox" name="period" value="2~3개월">2~3개월</label></li>
               <li><label><input type="checkbox" name="period" value="1개월">1개월</label></li>
               <li><label><input type="checkbox" name="period" value="" id="periodCheck">직접입력<br> 
               <input type="text" name="field_85_319" class="input-lg form-control extrafield" maxlength="200" id="periodText" disabled="disabled" required="required"></label></li>
            </ul>
         </div>
         <script>
            $('#periodCheck').click(function () {
               let checked = $('#periodCheck').is(':checked');
               if (checked) {
                  $("#periodText").removeAttr("disabled");               
                  var ph=document.getElementById('periodCheck');
                  var pt=document.getElementById('periodText');
                  pt.addEventListener("keydown",showText);
                  function showText(){
                     ph.value=pt.value;
                  }   
               } else {
                  $("#periodText").attr("disabled",true);
               }
            });
         </script>
         <div class="dayContainer">
            <h4>선호하는 요일을 골라주세요.</h4>
            <ul>
               <li><label><input type="checkbox" name="day" value="월요일">월요일</label></li>
               <li><label><input type="checkbox" name="day" value="화요일">화요일</label></li>
               <li><label><input type="checkbox" name="day" value="수요일">수요일</label></li>
               <li><label><input type="checkbox" name="day" value="목요일">목요일</label></li>
               <li><label><input type="checkbox" name="day" value="금요일">금요일</label></li>
               <li><label><input type="checkbox" name="day" value="토요일">토요일</label></li>
               <li><label><input type="checkbox" name="day" value="일요일">일요일</label></li>
            </ul>
         </div>
         <div class="timeContainer">
            <h4>선호하는 시간대는 언제인가요?</h4>
            <ul>
               <li><label><input type="checkbox" name="time" value="오전9시 이전">오전9시 이전</label></li>
               <li><label><input type="checkbox" name="time" value="오전9시 ~ 12시">오전9시 ~ 12시</label></li>
               <li><label><input type="checkbox" name="time" value="12시 ~ 3시">12시 ~ 3시</label></li>
               <li><label><input type="checkbox" name="time" value="3시 ~ 6시">3시 ~ 6시</label></li>
               <li><label><input type="checkbox" name="time" value="6시 ~ 9시">6시 ~ 9시</label></li>
               <li><label><input type="checkbox" name="time" value="9시 이후">9시 이후</label></li>
            </ul>
         </div>
         <div class="costContainer">
            <h4>레슨 비용에 대한 선호를 알려주세요.</h4>
            <ul>
               <li><label><input type="checkbox" name="cost" value="비용은 크게 중요하지 않아요">비용은 크게 중요하지 않아요</label></li>
               <li><label><input type="checkbox" name="cost" value="" id="costCheck">원하는 비용 수준이 있어요<br>
               <input type="text" name="field_85_319" class="input-lg form-control extrafield" maxlength="200" id="costText" disabled="disabled"></label></li>
               <li><label><input type="checkbox" name="cost" value="잘 모르겠어요">잘 모르겠어요</label></li>
            </ul>
         </div>
         <script>
            $('#costCheck').click(function () {
               let checked = $('#costCheck').is(':checked');
               if (checked) {
                  $("#costText").removeAttr("disabled");               
                  var ch=document.getElementById('costCheck');
                  var ct=document.getElementById('costText');
                  ct.addEventListener("keydown",showText);
                  function showText(){
                     ch.value=ct.value;
                  }   
               } else {
                  $("#costText").attr("disabled",true);
               }
            });
         </script>
         <div class="processContainer">
            <h4>어떻게 진행하면 좋을까요?</h4>
            <ul>
               <li><label for="id_travel_option_0">
               <input type="checkbox" name="process" value="전문가가 있는 곳으로 이동 가능합니다"
                     id="id_travel_option_0">전문가가 있는 곳으로 이동 가능합니다</label></li>
               <li><label for="id_travel_option_1">
               <input type="checkbox" name="process" value="제가 있는 곳으로 전문가가 오는게 좋겠습니다"
                     id="id_travel_option_1">제가 있는 곳으로 전문가가 오는게 좋겠습니다</label></li>
               <li><label for="id_travel_option_2">
               <input type="checkbox" name="process" value="온라인 및 화상수업으로 진행하고 싶습니다"
                     id="id_travel_option_2">온라인 및 화상수업으로 진행하고 싶습니다</label></li>
            </ul>
         </div>
         <div class="ls_locationContainer">
            <h4>어디서 진행하면 좋을까요?</h4>
            <div class="items">
                   <input type="hidden" id="sample3_postcode" placeholder="우편번호">
               <input type="hidden" id="sample3_address" placeholder="주소">
               <input type="text" name="ls_location" id="sample3_detailAddress" value="" placeholder="주소" required="required">
               <input type="hidden" id="sample3_extraAddress" placeholder="참고항목">
               <input type="button" class="btn btn-outline-secondary" onclick="sample3_execDaumPostcode()" value="주소 찾기" style="text-align:center; margin:30px auto;">
            </div>   
               <div id="wrap" style="display:none;border:1px solid;width:500px;height:300px;margin:5px auto;position:relative">
               <img src="//t1.daumcdn.net/postcode/resource/images/close.png" id="btnFoldWrap" style="cursor:pointer;position:absolute;right:0px;top:-1px;z-index:1" onclick="foldDaumPostcode()" alt="접기 버튼">
               </div>
         </div>
         <div class="introContainer" style="height: 633px;">
            <h4>선생님께 정보를 조금 더 알려주세요.</h4>
            <textarea name="intro" cols="40" rows="23" autocomplete="off"
               class="input-lg form-control"
               placeholder="관련 경험이나 실력, 구체적인 목적이나 집중하고 싶은 분야가 있다면 알려주세요. 이 외에도 수업 진행시 선생님이 갖추어야 할 조건이 있다면 반드시 언급해주세요."
               maxlength="1000" required="" id="id_field_25"></textarea>
         </div>
         <div class="updateBt">
            <input type="hidden" name="id" value="${sessionScope.sessionId}">
            <input type="hidden" name="cate1" value="${dto.cate1}">
            <input type="hidden" name="cate2" value="${dto.cate2}">
            <button class="btn btn-lg btn-primary" type="button"
               style="width: 450px; margin-bottom: 20px; background-color: #ff9797; border-color: #ff9797;" onclick="check()">요청하기</button>
            <button class="btn btn-lg btn-primary" type="button"
               style="width: 450px; background-color: #ff9797; border-color: #ff9797;"
               onclick="location.href='index.do'">뒤로</button>
         </div>
      </div>
      <script type="text/javascript">
         function check() {
            let result = false;
            let result1 = false;
            let result2 = false;
            let result3 = false;
            let result4 = false;
      
            let msg = "";
            
            let period = document.getElementsByName('period');
            
            for (let i = 0; i < period.length; i++) {
               if (period[i].checked) result = true; 
            }
            
            let day = document.getElementsByName('day');
            
            for (let i = 0; i < day.length; i++) {
               if (day[i].checked) result1 = true;
            }
            
            let time = document.getElementsByName('time');
            
            for (let i = 0; i < time.length; i++) {
               if (time[i].checked) result2 = true; 
            }

            let cost = document.getElementsByName('cost');
            
            for (let i = 0; i < cost.length; i++) {
               if (cost[i].checked) result3 = true;
            }
            
            let process = document.getElementsByName('process');
            
            for (let i = 0; i < process.length; i++) {
               if (process[i].checked) result4 = true;
            }
      
            if (!result) msg = '레슨 기간을 체크해주세요!';
            if (!result1) msg = '레슨 요일을 체크해주세요!';
            if (!result2) msg = '레슨 선호시간대을 체크해주세요!';
            if (!result3) msg = '레슨 선호비용을 체크해주세요!';
            if (!result4) msg = '레슨 진행방식을 체크해주세요!';
            
            
            if (result && result1 && result2 && result3 && result4) {
               document.requestWriteForm.submit();
            } else {
               alert(msg);
            }
         }
      </script>
   </form>
<%@ include file="/WEB-INF/views/footer.jsp"%>
<script>
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