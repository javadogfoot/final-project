<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty sessionScope.sessionId }">
	<script>
		location.href = 'wrong.do';
	</script>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/expert/regist2.css" rel="stylesheet">
<title>모레-전문가등록</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div id="section" class="bg-white">
  <form action="regist3.do?cate1=${dto.cate1 }" method="POST">
    <div class="container">
      <div class="content">
        <h4 class="text-center">세부 분야를 선택해주세요.</h4>
        <div class="service-choice-box">
          <ul id="id_code">
          	<c:if test="${dto.cate1 eq '외국어'}">
              <li><label for="id_code_0"><input type="radio" name="cate2" value="영어" required id="id_code_0">영어</label></li>
              <li><label for="id_code_1"><input type="radio" name="cate2" value="중국어" required id="id_code_1">중국어</label> </li>
              <li><label for="id_code_2"><input type="radio" name="cate2" value="일본어" required id="id_code_2">일본어</label></li>
              <li><label for="id_code_3"><input type="radio" name="cate2" value="스페인어" required id="id_code_3">스페인어</label></li>
              <li><label for="id_code_4"><input type="radio" name="cate2" value="프랑스어" required id="id_code_4">프랑스어</label></li>
              <li><label for="id_code_5"><input type="radio" name="cate2" value="독일어" required id="id_code_5">독일어</label></li>
              <li><label for="id_code_6"><input type="radio" name="cate2" value="TOEIC" required id="id_code_6">TOEIC</label></li>
              <li><label for="id_code_7"><input type="radio" name="cate2" value="OPIC" required id="id_code_7">OPIC</label></li>
              <li><label for="id_code_8"><input type="radio" name="cate2" value="기타언어" required id="id_code_8">기타언어</label></li>
          	</c:if>
          	<c:if test="${dto.cate1 eq '스포츠-댄스'}">
              <li><label for="id_code_0"><input type="radio" name="cate2" value="피트니스" required id="id_code_0">피트니스</label></li>
              <li><label for="id_code_1"><input type="radio" name="cate2" value="테니스" required id="id_code_1">테니스</label></li>
              <li><label for="id_code_2"><input type="radio" name="cate2" value="골프" required id="id_code_2">골프</label></li>
              <li><label for="id_code_3"><input type="radio" name="cate2" value="볼링" required id="id_code_3">볼링</label></li>
              <li><label for="id_code_4"><input type="radio" name="cate2" value="수영" required id="id_code_4">수영</label></li>
              <li><label for="id_code_5"><input type="radio" name="cate2" value="요가" required id="id_code_5">요가</label></li>
              <li><label for="id_code_6"><input type="radio" name="cate2" value="배구" required id="id_code_6">배구</label></li>
              <li><label for="id_code_7"><input type="radio" name="cate2" value="발레" required id="id_code_7">발레</label></li>
              <li><label for="id_code_8"><input type="radio" name="cate2" value="방송댄스" required id="id_code_8">방송댄스</label></li>
              <li><label for="id_code_9"><input type="radio" name="cate2" value="댄스스포츠" required id="id_code_9">댄스스포츠</label></li>
              <li><label for="id_code_10"><input type="radio" name="cate2" value="재즈댄스" required id="id_code_10">재즈댄스</label></li>
              <li><label for="id_code_11"><input type="radio" name="cate2" value="스트릿댄스" required id="id_code_11">스트릿댄스</label></li>
          	</c:if>
          	<c:if test="${dto.cate1 eq '음악'}">
				<li><label for="id_code_0"><input type="radio" name="cate2" value="보컬" required id="id_code_0">보컬</label></li>
		        <li><label for="id_code_1"><input type="radio" name="cate2" value="성악" required id="id_code_1">성악</label> </li>
		        <li><label for="id_code_2"><input type="radio" name="cate2" value="랩" required id="id_code_2">랩</label></li>
		        <li><label for="id_code_3"><input type="radio" name="cate2" value="피아노" required id="id_code_3">피아노</label></li>
		        <li><label for="id_code_4"><input type="radio" name="cate2" value="기타" required id="id_code_4">기타</label></li>
		        <li><label for="id_code_5"><input type="radio" name="cate2" value="단소" required id="id_code_5">단소</label></li>
		        <li><label for="id_code_6"><input type="radio" name="cate2" value="피리" required id="id_code_6">피리</label></li>
		        <li><label for="id_code_7"><input type="radio" name="cate2" value="우쿨렐레" required id="id_code_7">우쿨렐레</label></li>
		        <li><label for="id_code_8"><input type="radio" name="cate2" value="드럼" required id="id_code_8">드럼</label></li>
		        <li><label for="id_code_9"><input type="radio" name="cate2" value="디제잉" required id="id_code_9">디제잉</label></li>
          	</c:if>
          	<c:if test="${dto.cate1 eq '예술-요리'}">
		        <li><label for="id_code_0"><input type="radio" name="cate2" value="미술" required id="id_code_0">미술</label></li>
		        <li><label for="id_code_1"><input type="radio" name="cate2" value="입시미술" required id="id_code_1">입시미술</label></li>
		        <li><label for="id_code_2"><input type="radio" name="cate2" value="드로잉" required id="id_code_2">드로잉</label></li>
		        <li><label for="id_code_3"><input type="radio" name="cate2" value="캘리그래피" required id="id_code_3">캘리그래피</label></li>
		        <li><label for="id_code_4"><input type="radio" name="cate2" value="사진" required id="id_code_4">사진</label></li>
		        <li><label for="id_code_5"><input type="radio" name="cate2" value="웹툰" required id="id_code_5">웹툰</label></li>
		        <li><label for="id_code_6"><input type="radio" name="cate2" value="메이크업" required id="id_code_6">메이크업</label></li>
		        <li><label for="id_code_7"><input type="radio" name="cate2" value="마술" required id="id_code_7">마술</label></li>
		        <li><label for="id_code_8"><input type="radio" name="cate2" value="연기" required id="id_code_8">연기</label></li>
		        <li><label for="id_code_9"><input type="radio" name="cate2" value="꽃꽂이" required id="id_code_9">꽃꽂이</label></li>
		        <li><label for="id_code_10"><input type="radio" name="cate2" value="제빵" required id="id_code_10">제빵</label></li>
		        <li><label for="id_code_11"><input type="radio" name="cate2" value="한식" required id="id_code_11">한식</label></li>
		        <li><label for="id_code_12"><input type="radio" name="cate2" value="양식" required id="id_code_12">양식</label></li>
		        <li><label for="id_code_13"><input type="radio" name="cate2" value="일식" required id="id_code_13">일식</label></li>
		        <li><label for="id_code_14"><input type="radio" name="cate2" value="중식" required id="id_code_14">중식</label></li>
          	</c:if>
          	<c:if test="${dto.cate1 eq '실무교육'}">
              <li><label for="id_code_0"><input type="radio" name="cate2" value="코딩" required id="id_code_0">코딩</label></li>
              <li><label for="id_code_1"><input type="radio" name="cate2" value="엑셀" required id="id_code_1">엑셀</label> </li>
              <li><label for="id_code_2"><input type="radio" name="cate2" value="PPT" required id="id_code_2">PPT</label></li>
              <li><label for="id_code_3"><input type="radio" name="cate2" value="취업컨설팅" required id="id_code_3">취업컨설팅</label></li>
              <li><label for="id_code_4"><input type="radio" name="cate2" value="스피치" required id="id_code_4">스피치</label></li>
              <li><label for="id_code_5"><input type="radio" name="cate2" value="재테크" required id="id_code_5">재테크</label></li>
              <li><label for="id_code_6"><input type="radio" name="cate2" value="통계" required id="id_code_6">통계</label></li>
              <li><label for="id_code_7"><input type="radio" name="cate2" value="포토샵" required id="id_code_7">포토샵</label></li>
              <li><label for="id_code_8"><input type="radio" name="cate2" value="일러스트" required id="id_code_8">일러스트</label></li>
              <li><label for="id_code_9"><input type="radio" name="cate2" value="영상편집" required id="id_code_9">영상편집</label></li>
          	</c:if>
          	<c:if test="${dto.cate1 eq '교과목'}">
              <li><label for="id_code_0"><input type="radio" name="cate2" value="국어" required id="id_code_0">국어</label></li>
              <li><label for="id_code_1"><input type="radio" name="cate2" value="영어" required id="id_code_1">영어</label> </li>
              <li><label for="id_code_2"><input type="radio" name="cate2" value="수학" required id="id_code_2">수학</label></li>
              <li><label for="id_code_3"><input type="radio" name="cate2" value="사회" required id="id_code_3">사회</label></li>
              <li><label for="id_code_4"><input type="radio" name="cate2" value="과학" required id="id_code_4">과학</label></li>
              <li><label for="id_code_5"><input type="radio" name="cate2" value="논술" required id="id_code_5">논술</label></li>
          	</c:if>
          </ul>
        </div>
      </div>
    </div>
    <div class="container-fluid bg-eee">
      <div class="container step-nav">
        <div class="row">
          <div class="col-xs-6">
            <a href="" class="prev-btn" id="prev-btn">
              뒤로 가기
            </a>
          </div>
          <div class="col-xs-6">
            <button type="submit" class="blue-btn form-control" id="next-btn" style="background-color: #ff9797; border-color: #ff9797;">다음</button>
          </div>
        </div>
      </div>
    </div>
  </form>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>