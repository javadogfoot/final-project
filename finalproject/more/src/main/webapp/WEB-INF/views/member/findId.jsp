<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<style>
   #section{
     padding-top:110px; padding-bottom:200px;
   }
   h3 {
     font-size: 28px;
   }
   .content{
     margin:80px auto 0px auto;
     border:1px solid #e2e2e2; 
     padding:25px; 
     width:610px; 
     padding-top:13px;
   }
   .content form{
     margin-top:12px;
   }
   .content input{
     width:400px; 
     height:50px; 
     border:1px solid #e2e2e2; 
     padding:12px 20px; 
     border-radius:2px; 
     font-size:18px;
   }
   .content button{
     float:right;
     width:120px; 
     height:50px; 
     font-size:16px;
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
<title>모레-아이디 찾기</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
  <div id="section" style="min-height: 412.156px;">
    <div class="container">
      <div class="page-header">
        <h3 class="text-center">아이디 찾기</h3>
      </div>
      <div class="content">
        
        <form method="POST" action="findId.do"> 
          <div style="margin: 10px;">   
             <input id="email" name="email" type="email" placeholder="이메일 주소 입력" required="">
             <button type="button" id="emailsend" class="btn btn-primary" style="width: 130px">인증번호 전송</button>
             <div id="email_check"></div>
          </div>
          <div style="margin: 10px;">
             <input id="email2" name="email2" type="text" placeholder="인증 번호 입력" required="">
             <button type="button" id="emailcheck" class="btn btn-primary" style="width: 130px" disabled="disabled">인증번호 확인</button>
             <div id="email_check2"></div>
          </div>
          <div style="text-align: center; margin: 30px;">
            <input type="submit" id="submit" value="아이디 찾기" disabled="disabled">
          </div>
        </form>
      </div>
    </div>
  </div>
<%@ include file="/WEB-INF/views/footer.jsp" %>
<script>
   let code = '';
     $("#emailsend").click(function () {
      let email = $('#email').val();
      $.ajax ({
         url : 'idMailCheck.do?email=' + email,
         type : 'POST',
         success : function (data) {
            $('#email_check').text("");
            console.log(data);
            if (data == 1) {
               console.log('들어옴');
               $.ajax ({
                  type : 'GET',
                  url : "mailCheck.do?email=" + email,
                  cache : false,
                  success : function(data) {
                     $('#email_check2').text("인증번호 입력 해주세요");
                     $('#email_check2').css("color", "red");
                     $('#emailcheck').attr("disabled", false);
                     code = data;
                  }
               })
            } else {
               $('#email_check').text("존재하지 않는 이메일입니다");
               $('#email_check').css("color", "red");
            }
         }
      });
   });
   $('#emailcheck').click(function() {
      let email2 = $('#email2').val();
      $.ajax ({
         success : function() {
            if (email2 == code) {
               $('#email_check2').text("인증번호가 일치합니다!");
               $('#email_check2').css("color", "green");
               $('#submit').attr("disabled", false);
            } else {
               $('#email_check2').text("인증번호가 일치하지 않습니다!");
               $('#email_check2').css("color", "red");
            }
         }
      })
   });
</script>
</body>
</html>