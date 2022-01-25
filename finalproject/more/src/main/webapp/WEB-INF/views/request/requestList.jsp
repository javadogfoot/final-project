<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/suggest/suggestList.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
   function gory(f) {
      let language = ['영어','중국어','일본어','스페인어','프랑스어','독일어','TOEIC','OPIC','기타언어'];
      let sports = ['피트니스','테니스','골프','볼링','수영','요가','배구','발레','방송댄스','댄스스포츠','재즈댄스','스트릿댄스'];
      let music = ['보컬','피아노','성악','랩','기타','단소','플롯','리코더','우쿨렐레'];
      let art = ['미술','입시미술','드로잉','캘리그래피','사진','웹툰','메이크업','마술','연기','꽃꽂이','제빵','한식','양식','일식','중식'];
      let practice = ['코딩','엑셀','PPT','취업컨설팅','스피치','재테크','통계','포토샵','일러스트','영상편집'];
      let subject = ['국어','영어','수학','사회','과학','논술'];
      let target = document.getElementById("cate2");
      let result = '';
      if (f.value == "외국어") result = language;
      else if (f.value == "스포츠-댄스") result = sports;
      else if (f.value == "음악") result = music;
      else if (f.value == "예술-요리") result = art;
      else if (f.value == "실무교육") result = practice;
      else if (f.value == "교과목") result = subject;
      target.options.lenght = 0;
      for (x in result) {
         let opt = document.createElement("option");
         opt.value = result[x];
         opt.innerHTML = result[x];
         target.appendChild(opt);
      }
   }
</script>
<style>
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
</style>
<title>모레-학생 요청</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="revMainContainer">
      <div class="revMainTextBox">
         <div class="revMainText">
            <h1>
               요청서 목록<br>
               <span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">학생들의 요청서를 확인해보세요</span>
            </h1>   
         </div>
      </div>
   </div>
  <section id="section" class="bg-f4f4f4" style="min-height: 680px;">
     <br>
   <br>
    <div class="container list-main-container">
      <div class="list-align-nav" style="margin-left: 220px;">
      <form name="category" action="requestList.do">
       <select class="form-control" id="cate1" name="cate1" style="width: 120px; margin-right: 20px; float: left;"onchange="gory(this)">
        <option value="외국어">외국어</option>
        <option value="스포츠-댄스">스포츠-댄스</option>
        <option value="음악">음악</option>
        <option value="예술-요리">예술-요리</option>
        <option value="실무교육">실무교육</option>
        <option value="교과목">교과목</option>
      </select>
      <script>
         let cate1 = '${cate1}';
      $('#cate1').val(cate1);
      </script>
      <select class="form-control" onchange="cateform()" id="cate2" name="cate2" style="width: 120px; margin-left: 120px;">
        <c:if test="${cate2 != '세부분야'}"><option value="${cate2 }">${cate2 }</option></c:if>
      </select>
      </form>
   <script>
         function cateform() {
         let f = document.category;
         if (f.cate2.value != "세부분야") {
            f.submit();
         } else {
         }
      }
   </script>
        <ul>
         
        </ul>
      </div>
  <c:forEach var="dto" items="${list }">
  <div class="summary-box bg-white" style="width: 900px;margin-left: 220px;">
    <a href="requestContent.do?r_idx=${dto.r_idx }">
      <div class="summary-main">
      <div class="row">
        <div class="col-xs-2 text-center nth-first is_offered_list">
          <p>
            <img src="resources/img/${dto.pic_path }" alt="">
          </p>
          <span style="margin: 10px;">${dto.id }</span>
        </div>
        <div class="col-xs-8 is_offered_list">
          <h6 class="fw-400 hire-request">
            <div style="margin-top: 1rem;">
              <button type="button" class="btn btn-outline-primary">${dto.cate1 }</button>
              <button type="button" class="btn btn-outline-danger">${dto.cate2 }</button>
            </div>
          </h6>
          <p class="first-info">
             <button type="button" class="btn btn-outline-success">${dto.ls_location }</button>
            <br class="only-mobile-visible">
          </p>
          <p class="summary-information" style="background-color: #eeeeee; padding: 20px; white-space: pre;">${dto.intro }</p>
        </div>
        <div class="col-xs-2 text-center sub-info-col only-desktop-visible" style="margin-top: 50px;">
          <p>
              <span class="client-partner-distance">
              <button type="button" class="btn btn-outline-danger">${dto.time }</button>
              </span> 
              <br>
              <span class="submitted-time" ></span>
              <br>
              <span><button type="button" class="btn btn-outline-primary">${dto.day }</button></span>
          </p>
        </div>
       </div>
      </div>
    </a>
  </div>
  </c:forEach>
</div>
</section>
<div class="page_nav">
  <nav aria-label="Page navigation example" class="mb-5">
    <ul class="pagination justify-content-center mt-5">
      ${pagestr }
    </ul>
  </nav>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>