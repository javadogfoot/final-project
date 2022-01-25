<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모레-의뢰인 제안하기</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/suggest/suggest.css" rel="stylesheet">
<script src="https://d3cwtye3iv0eb9.cloudfront.net/static/js/base/navigations/menu.js?v=1.01"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
/*카테고리 스크립트*/
function categoryChange(e) {
   var good_a = [ '영어', "중국어","일본어","스페인어","프랑스어","독일어","TOEIC","OPIC","기타언어" ];
   var good_b = [ "피트니스","테니스","골프","볼링","수영","요가","배구","발레","방송댄스","댄스스포츠","재즈댄스","스트릿댄스" ];
   var good_c = [ "보컬","성악","랩","피아노","기타","단소","피리","우쿨렐레","드럼","디제잉"];
   var good_d = [ "미술","입시미술","드로잉","캘리그래피","사진","웹툰","메이크업","마술","연기","꽃꽂이","제빵","한식","양식","일식","중식" ];
   var good_e = [ "코딩","엑셀","PPT","취업컨설팅","스피치","제테크","통계","포토샵","일러스트","영상편집"];
   var good_f = [ "국어","영어","수학","사회","과학","논술"];
   var target = document.getElementById("good");

   if (e.value == '외국어')
      var d = good_a;
   else if (e.value == "스포츠-댄스")
      var d = good_b;
   else if (e.value == "음악")
      var d = good_c;
   else if (e.value == "예술-요리")
      var d = good_d;
   else if (e.value == "실무교육")
      var d = good_e;
   else if (e.value == "교과목")
      var d = good_f;

   target.options.length = 0;

   for (x in d) {
      var opt = document.createElement("option");
      opt.value = d[x];
      opt.innerHTML = d[x];
      target.appendChild(opt);
   }
}
</script>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp"%>
   <div class="revMainContainer">
      <div class="revMainTextBox">
         <div class="revMainText">
            <h1>
               레슨을 제안해보세요<br>
               <span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">모레에서 레슨을 해보세요</span>
            </h1>   
         </div>
      </div>
   </div>
   <form action="requestSuggestAction.do" method="post">
   	  <input type="hidden" name="m_id" value="${m_id }">
      <div class="container">
         <!-- 레슨시작일/종료일 -->
         <div class="cateContainer">
            <h4>레슨의 카테고리를 알려주세요</h4>
            <div class="items">
               <div class="item">
                  <h5>카테고리 (1)</h5>
                  <select name="cate1" required id="id_code" onchange="categoryChange(this)">
                     <option value="" selected>카테고리를 선택하세요</option>
                     <option value="외국어">외국어</option>
                     <option value="스포츠-댄스">스포츠-댄스</option>
                     <option value="음악">음악</option>
                     <option value="예술-요리">예술-요리</option>
                     <option value="실무교육">실무교육</option>
                     <option value="교과목">교과목</option>
                  </select> 
               </div>
               <div class="item">
                  <h5>카테고리 (2)</h5>
                  <select name="cate2" id="good">
                     <option>세부 카테고리를 선택하세요</option>
                  </select>
               </div>
            </div>   
         </div>
         <div class="periodContainer">
            <h4>레슨 날짜를 알려주세요</h4>
            <div class="items">
               <div class="item">
                  <h5>레슨 시작일</h5>
                  <input type="date" name="start_date" class="dateItem">
               </div>
               <div class="item">
                  <h5>레슨 종료일</h5>
                  <input type="date" name="end_date" class="dateItem">
               </div>
            </div>
         </div>
         <div class="dayContainer">
            <h4>레슨 요일을 골라주세요</h4>
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
            <h4>레슨 시간은 언제인가요?</h4>
            <div class="items">
               <div class="item">
                  <h5>시작 시간</h5>
                  <select name="start_time">
                     <option value="" selected>시작 시간</option>
                     <c:forEach var="i" begin="01" end="24">
                        <option value="${i}">${i}:00</option>
                     </c:forEach>
                  </select>
               </div>
               <div class="item">
                  <h5>끝나는 시간</h5>
                  <select name="end_time">
                     <option value="" selected>끝나는 시간</option>
                     <c:forEach var="i" begin="01" end="24">
                        <option value="${i}">${i}:00</option>
                     </c:forEach>
                  </select>
               </div>
            </div>
         </div>
         <div class="costContainer">
            <h4>레슨 비용을 알려주세요</h4>
            <div class="items">
               <div class="item">
                  <h5>레슨 비용</h5>
                  <select name="cost">
                     <option value="" selected>레슨 비용</option>
                     <c:forEach var="i" begin="5" end="50" step="5">
                        <option value="${i}">${i}만원</option>
                     </c:forEach>
                  </select>
               </div>
            </div>
         </div>
         <div class="processContainer">
            <h4>어떻게 진행하면 좋을까요?</h4>
            <ul>
               <li><label for="id_travel_option_0">
               <input type="checkbox" name="process" value="의뢰인이 있는 곳으로 이동 가능합니다."
                     id="id_travel_option_0">의뢰인이 있는 곳으로 이동 가능합니다.</label></li>
               <li><label for="id_travel_option_1">
               <input type="checkbox" name="process" value="제가 있는 곳으로 의뢰인이 오는게 좋겠습니다."
                     id="id_travel_option_1">제가 있는 곳으로 의뢰인이 오는게 좋겠습니다.</label></li>
               <li><label for="id_travel_option_2">
               <input type="checkbox" name="process" value="온라인 및 화상수업으로 진행하고 싶습니다."
                     id="id_travel_option_2">온라인 및 화상수업으로 진행하고 싶습니다.</label></li>
            </ul>
         </div>
         <div class="ls_locationContainer">
            <h4>어디서 진행하면 좋을까요?</h4>
               <div class="items" style="margin-top:10px;">
                   <input type="hidden" id="sample3_postcode" placeholder="우편번호">
               <input type="hidden" id="sample3_address" placeholder="주소">
               <input type="text" name="ls_location" id="sample3_detailAddress" value="" placeholder="주소를 찾아주세요" readonly>
               <input type="hidden" id="sample3_extraAddress" placeholder="참고항목">
               <input type="button" class="btn btn-outline-secondary" onclick="sample3_execDaumPostcode()" value="주소 찾기" style="text-align:center; margin:30px auto;">
               </div>
               <div id="wrap" style="display:none;border:1px solid;width:500px;height:300px;margin:5px auto;position:relative">
               <img src="//t1.daumcdn.net/postcode/resource/images/close.png" id="btnFoldWrap" style="cursor:pointer;position:absolute;right:0px;top:-1px;z-index:1" onclick="foldDaumPostcode()" alt="접기 버튼">
               </div>
         </div>
         <div class="introContainer">
            <h4>선생님께 정보를 조금 더 알려주세요.</h4>
            <textarea name="s_intro" cols="40" rows="23" autocomplete="off"
               class="input-lg form-control"
               placeholder="관련 경험이나 실력, 구체적인 목적이나 집중하고 싶은 분야가 있다면 알려주세요. 이 외에도 수업 진행시 선생님이 갖추어야 할 조건이 있다면 반드시 언급해주세요."
               maxlength="1000" required="" id="id_field_25"></textarea>
         </div>
         <div class="updateBt">
            <input type="hidden" name="id" value="${sessionScope.sessionId}">
            <button class="btn btn-lg btn-primary" type="submit"
               style="width: 450px; margin-bottom: 20px;">제안하기</button>
            <button class="btn btn-lg btn-primary" type="button"
               style="width: 450px;"
               onclick="location.href='index.do'">뒤로</button>
         </div>
      </div>
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