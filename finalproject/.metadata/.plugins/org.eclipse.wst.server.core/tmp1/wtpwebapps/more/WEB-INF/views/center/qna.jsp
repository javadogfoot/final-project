<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<style type="text/css">
body {
    font-family: "맑은 고딕";
    font-size: 0.9em;
    color: #666;
}

a {
    text-decoration: none;
    color: #09f;
}

a:hover {
    text-decoration: underline;
}

caption {
    display: none; /안보이게 설정, 
                              화면에 보이지는 않지만 스크린리더리로 읽어짐./
}

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

td.article { /article 클래스가 적용된 열만 좌측 정렬/
    text-align: left;
    width: 480px;
}

.tex {
    text-align: center;
    padding: 5px;
    margin-left: 1170px;
}
span{}
</style>
<title></title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
    <h3 class="fw-400 text-center" style="padding: 30px;">고객센터</h3>
   <div style="text-align: center; margin: 30px;">
      <input type="button" value="공지사항" style="width: 400px; height: 50px;" onclick="location.href='noticeList.do'">
      <input type="button" value="Q&A" style="width: 400px; height: 50px; background-color: #ff9797; border: none;" onclick="location.href='qnaList.do'">
   </div>
   <br>
   <div class="dataTbl1" style="height: 300px;">
      <table>
         <!--표의 제목-->
         <caption>Q & A</caption>
         <!--테이블 머리말 부분-->
         <thead>
            <tr>
               <th style="font-size:20px;color:#ff7d9e;">Q</th>
               <th>Title</th>
               <th>writer</th>
               <th>date</th>
            </tr>
         </thead>
         <!--테이블 내용 부분-->
         <tbody>
            <c:forEach var="dto" items="${list }">
               <tr>
                  <td width="100px;">${dto.cate }</td>
                  <td class="article"><a href="javascript:a(${dto.q_idx },'${dto.writer }');">${dto.title }</a></td>
                  <td style="width: 100px;">${dto.writer }</td>
                  <td>${fn:substring(dto.writedate,0,10)}</td>
               </tr>
               <tr>
                  <td id="${dto.q_idx }" class="answer" style="font-size:20px;color: #ff9797; border: none;"></td>
                  <td id="content${dto.q_idx }" class="a_content" style="border: none;"></td>
                  <td id="writer${dto.q_idx }" class="a_writer" style="border: none;"></td>
                  <td id="writedate${dto.q_idx }" class="a_writedate" style="border: none;"></td>
               </tr>
            </c:forEach>
         </tbody>
      </table>
   </div>
      <script>
         function a(no,writer) {
            let a_no = no;
            console.log('a_no =' + a_no);
            console.log('writer = ' + writer);
            $.ajax ({
               url : 'qnaAnswer.do?a_no=' + a_no,
               type : 'post',
               success : function (data) {
                  $('.answer').text("");
                  $('.a_content').text("");
                  $('.a_writer').text("");
                  $('.a_writedate').text("");
                  console.log(data);
                  if (!data) {
                     $('#' + no).val("");
                     $('#' + no).text('A');   
                     $('#content' + no).text('답변 준비중입니다!');                  
                  } else {
                     console.log('옴');
                     $('#' + no).val("");
                     $('#' + no).text('A');   
                     $('#content' + no).text(data.content);
                     $('#writer' + no).text(data.writer);
                     $('#writedate' + no).text(data.writedate.substring(0,10));
                  }
               }
            });
         }
      </script>
      <div class="page_nav">
         <div style="margin-left: 1175px; margin-top: 80px;">
           <input type="button" value="질문하기" onclick="location.href='qnaWrite.do'">
         </div>
     <nav aria-label="Page navigation example" class="mb-5">
       <ul class="pagination justify-content-center mt-5">
         ${pagestr }
       </ul>
     </nav>
   </div>
<%@ include file="/WEB-INF/views/footer.jsp" %>   
</body>
</html>