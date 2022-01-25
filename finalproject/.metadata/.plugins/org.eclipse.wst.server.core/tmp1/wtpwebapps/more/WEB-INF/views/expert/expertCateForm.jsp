<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
   src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/expert/regist1.css" rel="stylesheet">
<link href="resources/css/expert/regist2.css" rel="stylesheet">
<link href="resources/css/expert/expertUpdate.css" rel="stylesheet">
<title>모레-전문가수정</title>
<style>
.updateBt {
   width: 450px;
   height: 200px;
   text-align: center;
   margin: 0 auto;
   display: flex;
   flex-direction: column;
   justify-content: center;
}
</style>
</head>
<body>
   <%@ include file="/WEB-INF/views/header.jsp"%>
   <section style="height: 600px;">
        <h3>카테고리 수정</h3>
      <form name="expertCateForm" action="expertCate.do?id=${sessionScope.sessionId}" method="post">
         <div class="container">
            <div class="content">
               <select name="cate1" required id="id_code"
                  onchange="categoryChange(this)">
                  <option value="" >카테고리를 선택하세요</option>
                  <option value="외국어" <c:if test="${dto.cate1 eq '외국어'}">selected</c:if>>외국어</option>
                  <option value="스포츠-댄스" <c:if test="${dto.cate1 eq '스포츠-댄스'}">selected</c:if>>스포츠-댄스</option>
                  <option value="음악" <c:if test="${dto.cate1 eq '음악'}">selected</c:if>>음악</option>
                  <option value="예술-요리" <c:if test="${dto.cate1 eq '예술-요리'}">selected</c:if>>예술-요리</option>
                  <option value="실무교육" <c:if test="${dto.cate1 eq '실무교육'}">selected</c:if>>실무교육</option>
                  <option value="교과목" <c:if test="${dto.cate1 eq '교과목'}">selected</c:if>>교과목</option>
               </select> 
               <select name="cate2" id="good">
                  <option value="${dto.cate2 }">${dto.cate2 }</option>
               </select>
            </div>
         </div>
         <div class="updateBt">
            <button class="btn btn-lg btn-primary" type="submit"
               style="width: 450px; margin-bottom: 20px; background-color: #ff9797; border-color: #ff9797;">수정</button>
            <button class="btn btn-lg btn-primary" type="button"
               style="width: 450px; background-color: #ff9797; border-color: #ff9797;"
               onclick="location.href='expertProfile.do?id=${sessionScope.sessionId}'">뒤로</button>
         </div>
      </form>
      <script>
         function categoryChange(e) {
            var good_a = [ "영어","중국어","일본어","스페인어","프랑스어","독일어","TOEIC","OPIC","기타언어" ];
               var good_b = [ "피트니스","테니스","골프","볼링","수영","요가","배구","발레","방송댄스","댄스스포츠","재즈댄스","스트릿댄스" ];
               var good_c = [ "보컬","성악","랩","피아노","기타","단소","피리","우쿨렐레","드럼","디제잉"];
               var good_d = [ "미술","입시미술","드로잉","캘리그래피","사진","웹툰","메이크업","마술","연기","꽃꽂이","제빵","한식","양식","일식","중식" ];
               var good_e = [ "코딩","엑셀","PPT","취업컨설팅","스피치","제테크","통계","포토샵","일러스트","영상편집"];
               var good_f = [ "국어","영어","수학","사회","과학","논술"];
             var target = document.getElementById("good");

            if (e.value == "외국어")
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
   </section>
   <%@ include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>