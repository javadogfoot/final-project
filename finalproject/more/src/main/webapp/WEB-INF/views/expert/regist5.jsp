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
<style>
	.container {
	  width: 500px;
	  margin-top: 50px;
	}
	.mb-2 input {
	  width: 450px;
	}
	.mb-2 textarea {
	  width: 450px;
	  height: 150px;
	  padding: 10px;
	}
	h4 {
	  margin: 60px;
	  text-align: center;
	}
</style>
<title>모래-전문가등록</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="container">
  <div class="col-md-12 order-md-1">
      <h4>전문가 정보</h4>
      <form action="regist.do?cate1=${dto.cate1 }&cate2=${dto.cate2}&ls_location=${dto.ls_location}&id=${sessionScope.sessionId}&process=${dto.process}" method="post">
          <div class="mb-3">
            <select class="form-control" name="bank" style="width: 120px; float: left; margin-right: 20px;" required="required">
               <option value="" selected="selected">은행선택</option>
               <option value="국민은행">국민은행</option>
               <option value="기업은행">기업은행</option>
               <option value="농협은행">농협은행</option>
               <option value="신한은행">신한은행</option>
               <option value="대구은행">대구은행</option>
               <option value="광주은행">광주은행</option>
               <option value="수협은행">수협은행</option>
               <option value="제주은행">제주은행</option>
            </select>
            <input type="text" class="form-control" name="account" placeholder="  계좌번호입력('-'제외)" style="width: 300px; height: 38px;" onkeyup="check(this)" required="required">
         </div>
        <div class="mb-2">
            <label>대학교</label> 
            <input type="text" class="form-control" id="" name="univ" placeholder="예) 서울대학교">
            <div id="id_check"></div>
        </div>
        <div class="mb-2">
            <label>학과</label> 
            <input type="text" class="form-control" id="" name="major" placeholder="예) 컴퓨터공학과">
            <div id="pwd_check"></div>
        </div>
        <div class="mb-2">
            <label>레슨 경력</label> 
            <input type="text" class="form-control" id="" name="career" placeholder="예) 1년">
        </div>
        <div class="mb-2">
            <label>자격증</label> 
            <input type="text" class="form-control" id="" name="cer" placeholder="예) 정보처리기사">
        </div>
        <div class="mb-2">
            <label>전문가 소개</label> 
            <textarea class="form-control" id="" name="intro"></textarea>
        </div>
        <div style="margin-top: 50px;">
	        <button class="btn btn-lg btn-primary" type="submit" style="width: 450px; background-color: #ff9797; border-color: #ff9797;">전문가 등록</button>
        </div>
     </form>
  </div>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>