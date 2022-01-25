<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty sessionScope.sessionId }">
   <script>
      location.href = 'sessionNull.do';
   </script>
</c:if>
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
<title>모레-질문</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp"%>
    <h1 align="center" style="padding: 35px;">Q&A 등록</h1>
    <form name="qnaWrite" action="qnaWrite.do" method="post">
        <table>
            <tr>
                <th>문의종류</th>
                <td>
                   <select name="cate" required="required">
                      <option value="">문의 선택</option>
                      <option value="레슨문의">레슨문의</option>
                   </select>
                </td>
                <th>제목</th>
                <td><input type="text" name="title" style="width: 500px;" required="required"></td>
            </tr>
            <tr>
                <td colspan="4"><textarea rows="20" cols="100" name="content" required="required" style="padding: 10px;">
                </textarea></td>
            </tr>
            <tr>
                <td colspan="4" align="center">
                    <input type="reset" value="다시쓰기">
                   <input type="submit" value="글쓰기">
                </td>
            </tr>
        </table>
    </form>
<%@ include file="/WEB-INF/views/footer.jsp"%>   
</body>
</html>