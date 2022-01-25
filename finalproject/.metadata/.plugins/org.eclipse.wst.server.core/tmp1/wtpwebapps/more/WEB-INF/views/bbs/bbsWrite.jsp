<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>


<!-- Bootstrap CSS -->
  <link href="resources/css/bootstrap.min.css" rel="stylesheet">

  <title>모레-글쓰기</title>
</head>

 <!--css-->
<style>
 section{
 
     margin: 0px auto;
 }
 table{
     width: 800px;
     margin: 0px auto;
 }
 #textarea{
    height: 350px;
 }
 #writeBt{
   text-align: center;
 }
 #View_area{
    width: 800px; 
    height: 350px; 
    dispaly: inline;
    overflow: auto;
 }
 #View_area:empty:before{
    content: attr(placeholder);
 }
 #profile_pt {
    display: none;
 }
 .revMainContainer{
	background-image:url(https://d3cwtye3iv0eb9.cloudfront.net/media/images/part/1544382373866000/pc/origin.jpg);
	background-repeat:no-repeat;
	background-size:cover;
    height: 380px;
    width: 100%;
}
.revMainContainer .revMainTextBox{
    width: 100%;
    height: 400px;
    padding-right: 15px;
    padding-left: 15px;
    margin:0 auto;  
}
.revMainText{
    margin:0 auto;
    width: 550px;
    height: 400px;
    display: flex;
    flex-direction: column;
    justify-content: center;
}
.revMainText h1{
    height: 100px;
    font-size: 42px;
    font-weight: bold;
    color: white;
    text-align: center;
}
.btn-outline-primary{
	color: #ff9797;
	border-color: #ff9797;
}
.btn-outline-primary:hover{
	background-color: #ff9797;
	border-color: #ff9797;
	color:white;
}

 </style>
 <script>
   
 </script>
  <%@ include file="/WEB-INF/views/header.jsp" %>
<div class="revMainContainer">
		<div class="revMainTextBox">
			<div class="revMainText">
				<h1>
					자유 게시판<br>
					<span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">자유롭게 글을 작성해보세요</span>
				</h1>	
			</div>
		</div>
	</div>
  <section>
  <br><br><br><br>

<script>
var div=document.qeurySelector("[contentEditable=\"true\"]");
div.onkeyup=function(){
  var a=document.activeElement;
  if( a.lastChild && a.lastChild.nodeName!="BR" ){
    a.appendChild(document.createElement("br"));
  }
};
div.onkeypress=function(e){
  if( e.keyCode==13 ){
    var selection=window.getSelection(),
      range=selection.getRangeAt(0),
      br=document.createElement("br");
    range.deleteContents();
    range.insertNode(br);
    range.setStartAfter(br);
    range.setEndAfter(br);
    range.collapse(false);
    selection.removeAllRanges();
    selection.addRange(range);
    return false;
  }
};
</script>

  <form name="bbsWrite" action="bbsWrite.do" onsubmit="$('input[name=content]').val($('#View_area').text());" 
        method="post" enctype="multipart/form-data">
  <table>
     <tr>
        <td><h5><b>자유게시판 글쓰기</b></h5></td>
     </tr>
      <tr>
          <td><input type="text" class="form-control" placeholder="제목" name="title" maxlength="50"></td>
      </tr>
      <tr>
          <td>
          <div id='View_area' class="form-control" contentEditable="true" placeholder="내용"></div>
         <input type="hidden" name="content" value="">
         <input type="hidden" name=id value="${sessionScope.sessionId}">      
          </td>
      </tr>
      <tr>
         <td>
         <div class="btn btn-outline-secondary" onclick="onclick=document.all.file.click()">이미지업로드</div>
         <input type="file" name="file" id="profile_pt" onchange="previewImage(this,'View_area')">
      
    <script>
    function previewImage(targetObj, View_area) {
       var preview = document.getElementById(View_area); //div id
       var ua = window.navigator.userAgent;

      //ie일때(IE8 이하에서만 작동)
       if (ua.indexOf("MSIE") > -1) {
          targetObj.select();
          try {
             var src = document.selection.createRange().text; // get file full path(IE9, IE10에서 사용 불가)
             var ie_preview_error = document.getElementById("ie_preview_error_" + View_area);


             if (ie_preview_error) {
                preview.removeChild(ie_preview_error); //error가 있으면 delete
             }

             var img = document.getElementById(View_area); //이미지가 뿌려질 곳

             //이미지 로딩, sizingMethod는 div에 맞춰서 사이즈를 자동조절 하는 역할
             img.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(src='"+src+"', sizingMethod='scale')";
          } catch (e) {
             if (!document.getElementById("ie_preview_error_" + View_area)) {
                var info = document.createElement("<p>");
                info.id = "ie_preview_error_" + View_area;
                info.innerHTML = e.name;
                preview.insertBefore(info, null);
             }
          }
      //ie가 아닐때(크롬, 사파리, FF)
       } else {
          var files = targetObj.files;
          for ( var i = 0; i < files.length; i++) {
             var file = files[i];
             var imageType = /image.*/; //이미지 파일일경우만.. 뿌려준다.
             if (!file.type.match(imageType))
                continue;
             var prevImg = document.getElementById("prev_" + View_area); //이전에 미리보기가 있다면 삭제
             if (prevImg) {
                preview.removeChild(prevImg);
             }
             var img = document.createElement("img"); 
             img.id = "prev_" + View_area;
             img.classList.add("obj");
             img.file = file;
             img.style.width = '250px'; 
             img.style.height = '250px';
             img.style.marginRight = '530px';
             preview.appendChild(img);
             if (window.FileReader) { // FireFox, Chrome, Opera 확인.
                var reader = new FileReader();
                reader.onloadend = (function(aImg) {
                   return function(e) {
                      aImg.src = e.target.result;
                   };
                })(img);
                reader.readAsDataURL(file);
             } else { // safari is not supported FileReader
                //alert('not supported FileReader');
                if (!document.getElementById("sfr_preview_error_"
                      + View_area)) {
                   var info = document.createElement("p");
                   info.id = "sfr_preview_error_" + View_area;
                   info.innerHTML = "not supported FileReader";
                   preview.insertBefore(info, null);
                }
             }
          }
       }
    }
    </script>
    <script>
   function checkForm() {
      console.log('들어옴');
      let text = $('#View_area').text();
      let result = text.replace(/n, '<br>');
      $('input[name=content]').val(result);
      console.log(result);
   }
</script>
    
         </td>
      </tr>
  </table>
  
  <br>
  <div id="writeBt">
    <input type="button" class="btn btn-outline-primary" value="목록" onclick="location.href='bbsList.do'">
  <input type="submit" class="btn btn-outline-primary" value="작성" id="btn">
  </div>
  </form>
</section>

<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>