<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css">

<title>모레-공지사항글쓰기(관리자)</title>
</head>
<!--css-->
<style>
section {
   width: 1200px;
   margin: 0px auto;
}

#writeBt {
   float: left;
}

a:link {
   text-decoration: none;
   color: black;
}

#blurb {
   height: 200px;
   border: 1px solid black;
   background-image: url("resources/img/bbsbanner1.jpg");
   background-size: cover;
}

#paging {
   display: flex;
   justify-content: center;
}

#content {
   width: 350px;
   white-space: pre;
   overflow: hidden;
   text-overflow: ellipsis;
   padding-bottom: 20px;
}
#img{
   width: 150px;
   height: 150px;
}
.collapse {
    display: block;
}

</style>


<!--header-->
<body>
<%@ include file="/WEB-INF/views/adminSidebar.jsp"%>
   <br>
   <br>
   <section>
      <h5>
         <b><a href="adminNoticeList.do">공지사항 글쓰기</a></b>
      </h5>
      <br>
      <form name="qnaAnswerWrite" action="adminQnaWrite.do" method="post">
			<table>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" value="답변: ${dto.title}" readonly> </td>
				</tr>
				<tr>
					<th>카테고리</th>
					<td><input type="text" name="cate" value="${dto.cate}" readonly> </td>
				</tr>
				<tr>
					<th>글쓴이</th>
					<td><input type="text" value="관리자" readonly></td>
				</tr>
				<tr>
					<td colspan="2">
						<textarea rows="10" cols="50" name="content"></textarea>
					</td>
				</tr>
            	<tr>
            		<td colspan="2">
            			<input type="hidden" name="a_no" value="${dto.q_idx}">
               			<button class="btn btn-small btn-primary" type="submit">답변하기</button>
               		</td>
            	</tr>
            </table>
      </form>

   </section>
</body>
</html>