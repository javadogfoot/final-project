<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<script>
function removeCheck(id) {

	 if (confirm("정말 탈퇴처리 하시겠습니까?") == true){    //확인
		 
		document.location.href = "delClient.do?id="+id;

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
   <h3><b>의뢰인 관리</b></h3>
   <form name="memberclient" action="manageClient.do">
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
      <thead>
         <tr style="background-color: #dcdcdc;">
            <th>ID</th>
            <th>PWD</th>
            <th>NAME</th>
            <th>EMAIL</th>
            <th>TEL</th>
            <th>주소</th>
            <th>상세주소</th>
            <th>회원탈퇴</th>
         </tr>
      </thead>
      <tbody>
         <c:if test="${empty list}">
            <tr>
               <td colspan="8" align="center">일치하는 아이디가 없습니다.</td>
            </tr>
         </c:if>
         <c:if test="${!empty list}">
            <c:forEach var="dto" items="${list}">
               <tr>
                  <td>${dto.id}</td>
                  <td>${dto.pwd}</td>
                  <td>${dto.name}</td>
                  <td>${dto.email}</td>
                  <td>${dto.tel}</td>
                  <td>${dto.addr}</td>
                  <td>${dto.d_addr}</td>
                  <td>
                  <input type="button" class="btn btn-outline-danger btn-sm" onclick="removeCheck('${dto.id}')" value="탈퇴">
                  </td>
               </tr>
            </c:forEach>
         </c:if>
      </tbody>
      <tfoot>
         <tr>
            <td colspan="8" align="center">
            <div id="paging">${pageStr}</div>
            </td>
         </tr>
      </tfoot>
   </table>
   <div style="text-align: right; width: 100%;"><button onclick="location.href='manageClient.do'" class="btn btn-primary mb-5">전체목록</button></div>
   </div>
</body>
</html>