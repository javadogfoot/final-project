<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/member/account.css" rel="stylesheet">
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
<title>모레-계정설정</title>
<style type="text/css">
	#file_btn {
	  padding: 6px 25px;
	  margin-bottom: 20px;
	  background-color:#FF6600;
	  border-radius: 4px;
	  color: white;
	  cursor: pointer;
	}
	#zip_code_btn {
		position: absolute;
		line-height: 1.5;
		margin-left: 171.5px;
	}
</style>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div id="section">
	<div class="container">
	<div class="page-header">
    	<h2 class="text-center fw-400">계정설정</h2>
    </div>
  	<form action="accountRevise.do" method="post">
  	<div class="content text-center nth-first">
    	<img id="profile" src="resources/img/${dto.pic_path }" alt="">
    	<p><a href=""></a></p>
    	<label id="file_btn" for="input-file" style="background-color: #ff9797; border-color: #ff9797;" >
			회원 사진 수정
    	</label>
    	<input type="file" name="pic_path" id="input-file" style="display:none ">
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
  	</div>
  	<div class="content nth-second">
    	<h5>개인정보</h5>
    	<div class="name-field">
      	<p class="name-field">
		<i class="fas fa-user fa-2x" style="margin-right: 13px; float: left; margin-top: 6px; font-size: 1.5em"></i>
        <input type="text" class="form-control" value="${dto.id }" disabled>
        <input type="hidden" name="id" value="${dto.id }"> 
      	</p>
      	</div>
    </div>
    <div class="content nth-second">
        <p class="name-field">
          <i class="fas fa-key fa-2x" style="margin-right: 10px; float: left; margin-top: 6px; font-size: 1.5em"></i>
          <input type="text" class="form-control" name="pwd" value="${dto.pwd }">
        </p>
    </div>
    <div class="content nth-second">
    	<p class="name-field">
    	<input type="text" class="form-control" value="${dto.name }" disabled style="margin-left: 32px;">
        </p>
   	</div>
    <div class="content nth-second">
		<p class="name-field">
		<i class="fas fa-at fa-2x" style="margin-right: 10px; float: left; margin-top: 6px; font-size: 1.5em"></i>
          <input type="text" class="form-control" name="email" value="${dto.email }">
        </p>
    </div>
    <div class="content nth-second">
    	<p class="name-field">
		<i class="fas fa-mobile-alt fa-2x" style="margin-right: 16px; margin-left:4px; float: left; margin-top: 6px; font-size: 1.5em"></i>
			<input type="text" class="form-control" name="tel" value="${dto.tel }">
        </p>
    </div>
    <div class="content nth-second">
		<p class="name-field">
		<i class="fas fa-map fa-2x" style="margin-right: 8px; float: left; margin-top: 6px; font-size: 1.5em"></i>
		<input type="button" class="btn btn-primary" id="zip_code_btn" onclick="execDaumPostcode()" value="우편번호 찾기" style="background-color: gray; border-color: gray;">
        <input type="text" class="form-control" name="zip_code" id="postcode" value="${dto.zip_code }">
        </p>
                 <div id="wrap" style="display:none;border:1px solid;width:330px;height:300px;margin:5px 0;position:relative">
          <img src="//t1.daumcdn.net/postcode/resource/images/close.png" id="btnFoldWrap" style="cursor:pointer;position:absolute;right:0px;top:-1px;z-index:1" onclick="foldDaumPostcode()" alt="접기 버튼">
         </div>
    </div>
    <div class="content nth-second">
		<p class="name-field">
        <i></i>
        <input type="text" class="form-control" name="addr" id="address" value="${dto.addr }" style="margin-left: 32px;">
        </p>
    </div>
    <div class="content nth-second">
		<p class="name-field">
        <i></i>
        <input type="text" class="form-control" name="d_addr" id="detailAddress" value="${dto.d_addr }" style="margin-left: 32px;">
        </p>
    </div>
    <input type="hidden" class="" id="extraAddress" placeholder="참고항목">
    <div class="content nth-second">
	    <input type="reset" class="btn btn-primary btn-lg btn-block" style="width: 130px; float: left; margin-left: 31px; margin-right: 20px; background-color: #ff9797; border-color: #ff9797;" value="다시수정"> 
	    <input type="submit" class="btn btn-primary btn-lg btn-block" style="width: 130px; background-color: #ff9797; border-color: #ff9797;" value="수정하기">
    </div>
    <div class="content nth-second" style="margin-top: 50px; margin-left: 430px;">
    	<p class="name-field">
		<a href="memberDelete.do?id=${dto.id }" onclick="return confirm('정말로 탈퇴하시겠습니까?');" style="font-size: 20px; font-weight:bold; color:gray;">탈퇴하기</a>
		</p>
    </div>
    </form>
	</div>
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
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>