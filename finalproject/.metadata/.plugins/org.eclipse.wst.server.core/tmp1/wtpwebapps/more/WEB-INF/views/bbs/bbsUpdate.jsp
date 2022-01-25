<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

  <title>모레-게시글수정</title>
</head>

 <!--css-->
<style>
 section{
     width: 1200px;
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
#img {
   width: 250px;
   hight: 250px;
   margin-right: 530px;
}


 </style>
<!--header-->
<body>
  <%@ include file="/WEB-INF/views/header.jsp" %>

  <section>
  <br><br><br>
  
  <br>
  <form name="bbsUpdate" action="bbsUpdate.do" onsubmit="$('input[name=content]').val($('#View_area').text());" 
       method="post" enctype="multipart/form-data">
  <table>
     <tr>
        <td><h5><b>게시글 수정</b></h5></td>
     </tr>
      <tr>
          <td>
          <input type="text" class="form-control" placeholder="제목" name="title" maxlength="50" value="${dto.title}"></td>
      </tr>
      <tr>
          <td>
          <div id='View_area' class="form-control" contentEditable="true"><div><c:if test="${!empty dto.file_path}"><img src="bbsfileUpload/${dto.file_path}" id="img"><input type="hidden" name="file_path" value="${dto.file_path}"></c:if>${dto.content}</div></div>
         <input type="hidden" name="id" value="${dto.id}">
         <input type="hidden" name="b_idx" value="${dto.b_idx}">
         <input type="hidden" name="content" value="">
          </td>
      </tr>
      <tr>
         <td>
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
    
         </td>
      </tr>
  </table>
  
  <br>
  <div id="writeBt">
    <input type="button" class="btn btn-outline-primary" value="취소" onclick="location.href='bbsContent.do?b_idx=${dto.b_idx}'">
  <input type="submit" class="btn btn-outline-primary" value="수정" id="btn">
  </div>
  </form>
</section>

<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>