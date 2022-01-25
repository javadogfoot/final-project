<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<title>모레-회원가입</title>
<style>
   .container {
      width: 500px;
   }
   #file_btn {
     padding: 6px 25px;
     background-color:#b6847f;
     border-radius: 4px;
     color: white;
     cursor: pointer;
   }
   .btn-primary{
	background-color: #ff9797;
	border-color: #ff9797;
}
.btn-primary:hover{
	background-color: #ff9797;
	border-color: #ff9797;
}	
.btn-primary:disabled{
	background-color: #ff9797;
	border-color: #ff9797;
}
</style>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="container">
  <div class="col-md-12 order-md-1">
      <form class="needs-validation" method="POST" action="joinAction.do" onsubmit="return checks()">
     <div class="py-4 text-center">
         <img class="d-block mx-auto mb-4" id="profile" src="resources/img/profile_default.png" alt="" width="120" height="80" style="border: 1px solid gray; border-radius: 7px;-moz-border-radius: 7px;-khtml-border-radius: 7px;-webkit-border-radius: 7px;">
         <label id="file_btn" for="input-file">
           사진 등록
         </label>
        <input type="file" name="pic_path" id="input-file" style="display:none">
     </div>
     <script>
           // 사진 등록 
           let file = document.querySelector('#input-file');
   
               file.onchange = function () { 
               let fileList = file.files ;
               
               // 읽기
               let reader = new FileReader();
               reader.readAsDataURL(fileList [0]);
   
               //로드 한 후
               reader.onload = function  () {
                   document.querySelector('#profile').src = reader.result ;
               }; 
           }; 
     </script>
      <h4 class="mb-3">회원정보</h4>
        <div class="mb-2">
            <label>아이디</label> 
            <input type="text" class="form-control" id="id" name="id">
             <div id="id_check"></div>
        </div>
        <div class="mb-2">
            <label>비밀번호</label> 
            <input type="password" class="form-control" id="pwd" name="pwd">
            <div id="pwd_check"></div>
        </div>
        <div class="mb-2">
            <label>이름</label> 
            <input type="text" class="form-control" id="name" name="name">
        </div>
        <div class="mb-2">
            <label>이메일</label><input type="button" class="btn btn-primary" id="emailsend" value="인증번호 전송" style="position: absolute; margin-left: 300px; margin-top: 26px; line-height: 1.3;">
            <input type="email" class="form-control" id="email" name="email" style="width: 70%">
            <div id="email_check"></div>
            <label>인증번호</label><input type="button" class="btn btn-primary" id="emailcheck" value="인증번호 확인" disabled="disabled" style="position: absolute; margin-left: 283px; margin-top: 26px; line-height: 1.3;">
            <input type="text" class="form-control" id="email2" name="email2" style="width: 70%">
            <div id="email_check2"></div>
        </div>
        <div class="mb-2">
            <label>전화번호</label> 
            <input type="text" class="form-control" id="tel" name="tel">
            <div id="tel_check"></div>
        </div>
        <div class="mb-2">
          <input type="text" class="col-sm-3 form-label" name="zip_code" id="postcode" placeholder="우편번호" style="border-radius: 0.25rem; border: 1px solid #ced4da;">
            <input type="button" class="btn btn-primary" id="zip_code_btn" onclick="execDaumPostcode()" value="우편번호 찾기" disabled="disabled" style="line-height: 0.9; margin-bottom: 4px;">
            <input type="text" class="form-control" name="addr" id="address" placeholder="주소" style="margin-bottom: 5px">
            <input type="text" class="form-control" name="d_addr" id="detailAddress" placeholder="상세주소">
            <input type="hidden" class="" id="extraAddress" placeholder="참고항목">
            <div id="wrap" style="display:none;border:1px solid;width:500px;height:300px;margin:5px 0;position:relative">
               <img src="//t1.daumcdn.net/postcode/resource/images/close.png" id="btnFoldWrap" style="cursor:pointer;position:absolute;right:0px;top:-1px;z-index:1" onclick="foldDaumPostcode()" alt="접기 버튼">
            </div>
        </div>
        <div style="text-align: center">
           <button class="btn btn-primary btn-lg btn-block" id="submit" type="submit" disabled="disabled">가입하기</button>
        </div>
      </form>
    <script>
   let code =  "";
   $('#emailsend').click(function() {
      let email = $('#email').val();
      $.ajax ({
         type : 'GET',
         url : "mailCheck.do?email=" + email,
         cache : false,
         success : function(data) {
            if (data == "error") {
               $('#email_check').text("유요한 이메일 주소를 입력해주세요. ex) more@gmail.com");
               $('#email_check').css("color", "red");
            } else {
               $('#email_check').text("");
               $('#email_check2').text("인증번호 입력 해주세요");
               $('#email_check2').css("color", "red");
               $('#emailcheck').attr("disabled", false);
               code = data;
            }
         }
      })
   });
   $('#emailcheck').click(function() {
      let email2 = $('#email2').val();
      $.ajax ({
         success : function() {
            if (email2 == code) {
               $('#email_check2').text("인증번호가 일치합니다!");
               $('#email_check2').css("color", "green");
               $('#tel').focus();
            } else {
               $('#email_check2').text("인증번호가 일치하지 않습니다!");
               $('#email_check2').css("color", "red");
            }
         }
      })
   });
</script>
    <script>
      let getCheck= RegExp(/^[a-zA-Z0-9]{4,12}$/); // 소문자와 숫자 4~12
      let telCheck =  RegExp(/^[0-9]{2,3}-[0-9]{4}-[0-9]{4}/);
      // 아이디 유효성 검사
      $("#id").blur(function () {
         let id = $('#id').val();
         $.ajax ({
            url : 'idCheck.do?id=' + id,
            type : 'post',
            success : function (data) {
               if (data == 1) {
                  $('#id_check').text("사용중인 아이디입니다!");
                  $('#id_check').css("color", "red");
                  $('#submit').attr("disabled", true);
                  $('#zip_code_btn').attr("disabled", true);
               }   else if (id == "") {
                  $('#id_check').text("아이디를 입력해주세요!");
                  $('#id_check').css("color", "red");
                  $('#submit').attr("disabled", true);
                  $('#zip_code_btn').attr("disabled", true);
               }   else if (!getCheck.test($('#id').val())) {
                  $('#id').val("");
                  $('#id_check').text("아이디는 소문자와 숫자 4~12자리만 가능합니다!");
                  $('#id_check').css("color", "red");
                  $('#submit').attr("disabled", true);
                  $('#zip_code_btn').attr("disabled", true);
               }   else if (data == 0) {
                  $('#id_check').text("사용가능한 아이디입니다!");
                  $('#id_check').css("color", "green");
                  $('#zip_code_btn').attr("disabled", false);
               }
            }, error : function() {
               console.log('실패');
            }
         });
      });
      $('#pwd').blur(function () {
         let id = $('#id').val();
         let pwd = $('#pwd').val();
         $.ajax ({
            success : function () {
               if (pwd == "") {
                  $('#pwd_check').text("비밀번호를 입력해주세요!");
                  $('#pwd_check').css("color", "red");
                  $('#submit').attr("disabled", true);
                  $('#zip_code_btn').attr("disabled", true);
               } else if (id == pwd) {
                  $('#pwd').val("");
                  $('#pwd_check').text("아이디와 비밀번호가 같습니다!");
                  $('#pwd_check').css("color", "red");
                  $('#submit').attr("disabled", true);
                  $('#zip_code_btn').attr("disabled", true);
               }   else {
                  $('#pwd_check').text("");
                  $('#zip_code_btn').attr("disabled", false);
               }
            }, error : function () {
               console.log('실패');
            }
         });
      });
      $('#tel').blur(function () {
         let tel = $('#tel').val();
         $.ajax ({
            success : function () {
               if (tel == "") {
                  $('#tel_check').text("전화번호를 입력해주세요!");
                  $('#tel_check').css("color", "red");
                  $('#submit').attr("disabled", true);
                  $('#zip_code_btn').attr("disabled", true);
               } else if (!telCheck.test($('#tel').val())) {
                  $('#tel_check').text("전화번호를 형식에 맞춰주세요! ex) 010-1234-5678");
                  $('#tel_check').css("color", "red");
                  $('#submit').attr("disabled", true);
                  $('#zip_code_btn').attr("disabled", true);
               } else {
                  $('#tel_check').text("");
                  $('#submit').attr("disabled", false);
                  $('#zip_code_btn').attr("disabled", false);
               }
            }
         });
      });
   </script>
  </div>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>
<script>
   // 우편번호 찾기 찾기 화면을 넣을 element
   let element_wrap = document.getElementById('wrap');
   
   function foldDaumPostcode() {
       // iframe을 넣은 element를 안보이게 한다.
       element_wrap.style.display = 'none';
   }
   
   function execDaumPostcode() {
       // 현재 scroll 위치를 저장해놓는다.
       let currentScroll = Math.max(document.body.scrollTop, document.documentElement.scrollTop);
       new daum.Postcode({
           oncomplete: function(data) {
               // 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
   
               // 각 주소의 노출 규칙에 따라 주소를 조합한다.
               // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
               let addr = ''; // 주소 변수
               let extraAddr = ''; // 참고항목 변수
   
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
                   document.getElementById("extraAddress").value = extraAddr;
               
               } else {
                   document.getElementById("extraAddress").value = '';
               }
   
               // 우편번호와 주소 정보를 해당 필드에 넣는다.
               document.getElementById('postcode').value = data.zonecode;
               document.getElementById("address").value = addr;
               // 커서를 상세주소 필드로 이동한다.
               document.getElementById("detailAddress").focus();
   
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