<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
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
   <h3><b>탈퇴회원 관리</b></h3>
   
   <form name="outmember" action="adminOutMember.do">
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
            <th>NAME</th>
            <th>EMAIL</th>
            <th>TEL</th>
            <th>주소</th>
            <th>상세주소</th>
         </tr>
      </thead>
      <tbody>
         <c:if test="${empty list}">
            <tr>
               <td colspan="6" align="center">일치하는 아이디가 없습니다.</td>
            </tr>
         </c:if>
         <c:if test="${!empty list}">
            <c:forEach var="dto" items="${list}">
               <tr>
                  <td>${dto.id}</td>
                  <td>${dto.name}</td>
                  <td>${dto.email}</td>
                  <td>${dto.tel}</td>
                  <td>${dto.addr}</td>
                  <td>${dto.d_addr}</td>
               </tr>
            </c:forEach>
         </c:if>
      </tbody>
      <tfoot>
         <tr>
            <td colspan="6" align="center">
            <div id="paging">${pageStr}</div>
            </td>
         </tr>
      </tfoot>
   </table>
   <div style="text-align: right; width: 100%;"><button onclick="location.href='adminOutMember.do'" class="btn btn-primary mt-3 mb-5">전체목록</button></div>
   </div>
</body>
</html>