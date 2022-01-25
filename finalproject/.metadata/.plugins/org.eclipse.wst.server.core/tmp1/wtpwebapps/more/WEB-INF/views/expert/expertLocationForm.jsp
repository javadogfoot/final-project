<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/expert/regist3.css" rel="stylesheet">
<link href="resources/css/expert/regist4.css" rel="stylesheet">
<link href="resources/css/expert/expertUpdate.css" rel="stylesheet">
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>모레-전문가등록</title>

</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div id="section" class="bg-white">
   <h3>주소 수정</h3>
   <form name="expertLocationForm" action="expertLocation.do?id=${sessionScope.sessionId}" id="regist3" method="POST">
       <div class="container">
           <div class="content" style="padding-bottom:0px;">
               <h4 class="subject">어떻게 일을 진행하고 싶으신가요?</h4>
                <div class="service-choice-box">
                     <ul id="id_travel_option" style="padding-left: 0px;">
                  
                         <li><label for="id_travel_option_0" style="padding-right: 52px;"><input type="checkbox" name="process" value="의뢰인이 있는 곳으로 이동 가능합니다" id="id_travel_option_0" 
                            <c:if test="${dto.process eq '의뢰인이 있는 곳으로 이동 가능합니다'}">
                        checked
                     </c:if>>의뢰인이 있는 곳으로 이동 가능합니다
                  </label></li>
                         <li><label for="id_travel_option_1"><input type="checkbox" name="process" value="제가 있는 곳으로 의뢰인이 오는게 좋겠습니다" id="id_travel_option_1" 
                            <c:if test="${dto.process eq '제가 있는 곳으로 의뢰인이 오는게 좋겠습니다'}">
                        checked
                     </c:if>>제가 있는 곳으로 의뢰인이 오는게 좋겠습니다
                  </label></li>                           
                         <li><label for="id_travel_option_2" style="padding-right: 22px;"><input type="checkbox" name="process" value="온라인 및 화상수업으로 진행하고 싶습니다" id="id_travel_option_2"
                            <c:if test="${dto.process eq '온라인 및 화상수업으로 진행하고 싶습니다'}">
                        checked
                     </c:if>>온라인 및 화상수업으로 진행하고 싶습니다
                         </label></li>
                     </ul>
                </div>
             </div>
          </div>
          <div class="container">
             <div class="content" style="text-align:center; padding-bottom:50px;">
                <h4 class="subject" style="margin-bottom:20px;">주소를 적어주세요</h4>
                   <input type="hidden" id="sample3_postcode" placeholder="우편번호">
               <input type="hidden" id="sample3_address" placeholder="주소"><br>
               <input type="text" name="ls_location" id="sample3_detailAddress" value="${dto.ls_location}" placeholder="주소" readonly style="height:70px;width:500px;font-size:19px; border:1px solid #e2e2e2; text-align:center;"><br>
               <input type="hidden" id="sample3_extraAddress" placeholder="참고항목">
               <input type="button" class="btn btn-outline-secondary" onclick="sample3_execDaumPostcode()" value="주소 찾기" style="text-align:center; margin:30px auto;">
               
               <div id="wrap" style="display:none;border:1px solid;width:500px;height:300px;margin:0 auto;position:relative">
               <img src="//t1.daumcdn.net/postcode/resource/images/close.png" id="btnFoldWrap" style="cursor:pointer;position:absolute;right:0px;top:-1px;z-index:1" onclick="foldDaumPostcode()" alt="접기 버튼">
               </div>
             </div>
          </div>
      <div class="updateBt">
           <button class="btn btn-lg btn-primary" type="submit" style="width: 450px; margin-bottom:20px; background-color: #ff9797; border-color: #ff9797;" >수정</button>
           <button class="btn btn-lg btn-primary" type="button" style="width: 450px; background-color: #ff9797; border-color: #ff9797;" onclick="location.href='expertProfile.do?id=${sessionScope.sessionId}'">뒤로</button>
        </div>
</form>
</div>
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
      <br>
      <br>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>