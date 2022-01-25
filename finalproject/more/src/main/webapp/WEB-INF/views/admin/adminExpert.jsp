<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">


<link href="resources/css/bootstrap.min.css" rel="stylesheet">

<title>모레-전문가관리</title>
</head>
<script>
function removeCheck(id) {

	 if (confirm("정말 탈퇴처리 하시겠습니까?") == true){    //확인
		 
		document.location.href = "adminExpertDel.do?id="+id;

	 }else{   //취소

		 return false;

	 }
}
</script>

<style>
table{
	text-align: center;
}

#paging {
   display: flex;
   justify-content: center;
}
</style>

<body>
<%@ include file="/WEB-INF/views/adminSidebar.jsp"%>

<section>
<h3><b>전문가 관리</b></h3>
<form name="bbsSearch" action="adminExpert.do">
         <div class="input-group col-12 p-0 mb-3" style="width: 400px;">
            <input name="keyWord" type="text" class="form-control"
               placeholder="검색할 아이디를 입력하세요." aria-label="검색"
               aria-describedby="basic-addon2">
            <div>
               <button class="btn btn-small btn-primary" type="submit">검색</button>
            </div>
         </div>
      </form>
     <div style="width: 1200px;"> 
      <table class="table table-hover table-bordered">
      	<tr style="background-color: #dcdcdc;">
      		<th>이름</th>
      		<th>ID</th>
      		<th>CATE1</th>
      		<th>CATE2</th>
      		<th>대학교</th>
      		<th>전공</th>
      		<th>경력</th>
      		<th>자격증</th>
      		<th>회원탈퇴</th>
      	</tr>
      	<c:if test="${empty list}">
            <tr>
               <td colspan="9" align="center">일치하는 아이디가 없습니다.</td>
            </tr>
         </c:if>
         <c:if test="${!empty list}">
      	<c:forEach var="dto" items="${list}">
      	<tr>
      		<td>${dto.name}</td>
      		<td>${dto.id}</td>
      		<td>${dto.cate1}</td>
      		<td>${dto.cate2}</td>
      		<td>${dto.univ}</td>
      		<td>${dto.major}</td>
      		<td>${dto.career}</td>
      		<td>${dto.cer}</td>
      		<td>
      		<div>
      		<input type="button" class="btn btn-outline-danger btn-sm" onclick="removeCheck('${dto.id}')" value="탈퇴"></div>
      		</td>
      	</tr>
      	</c:forEach>
      	</c:if>
      	<tfoot>
      	<tr>
   			<td colspan="9">
   			<div id="paging">${pageStr}</div>
   			</td>
      	</tr>
      	</tfoot>
      </table>
      <div style="text-align: right;"><button onclick="location.href='adminExpert.do'" class="btn btn-primary mb-5">전체목록</button></div>
      </div>
      </section>
      </body>
</html>