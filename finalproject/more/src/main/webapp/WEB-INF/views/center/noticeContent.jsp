<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<style type="text/css">
table {
    margin: 0px auto;
    width: 800px;
    border-collapse: collapse;
    border-top: 2px solid #8d8d8d;
}
th {
    padding: 10px 8px; /padding: vertical horizontal;/
    background: #f9f9f9;
    color: #666;
    border-bottom: 1px solid #8d8d8d;
    text-align: center;
}

td {
    padding: 10px 8px; /padding: vertical horizontal;/
    line-height: 1.25em;
    color: #666;
    border-bottom: 1px solid #8d8d8d;
    text-align: center;
}
</style>
<title>모레-공지사항</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div style="text-align: center; padding: 50px;">
   <h3>공지사항 내용</h3>
</div>
<div style="height: 550px;">
<table border="1" cellspacing="0" width="550" height="300">
    <tr>
        <th>제목</th>
        <td>${dto.title }</td>
    </tr>
    <tr>
        <th>작성날짜</th>
        <td colspan="3">${fn:substring(dto.writedate,0,10)}</td>
    </tr>
    <tr height="150">
        <td colspan="4" align="left" valign="top" height="400">
           ${dto.content }
        </td>
    </tr>
    <tr>
        <td colspan="4" align="center"><a href="noticeList.do">목록</a></td>
    </tr>
</table>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>