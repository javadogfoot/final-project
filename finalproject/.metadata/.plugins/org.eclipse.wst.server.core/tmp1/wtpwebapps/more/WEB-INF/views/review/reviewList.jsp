<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="resources/css/review/review.css?after">
    <script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
    <div class="revMainContainer">
        <div class="revMainTextBox">
            <div class="revMainText">
                <h1>
					후기 게시판<br>
					<span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">수강 후기를 작성해 작성해보세요</span>
				</h1>
                <div class="revMainBt"><a href="lessonList.do">지금 바로 의뢰하기</a></div>
            </div>
        </div>
    </div>
    <div id="revIntroContainer">
        <div class="introItem">
            <i class="far fa-user fa-3x"></i>
            <h3>${expertCnt}명</h3>
            <h4>모레 전문가</h4>
        </div>    
        <div class="introItem">
            <i class="far fa-file-alt fa-3x"></i>
            <h3>${requestCnt}건</h3>
            <h4>누적 요청서</h4>
        </div>    
        <div class="introItem">
            <i class="far fa-thumbs-up fa-3x"></i>
            <h3>${totalCnt}개</h3>
            <h4>누적 리뷰</h4>
        </div>    
    </div>
    <div id="revListContainer">
    <c:if test="${empty list}">
    	<div class="revItem" style="width:1200px; text-align:center;">
            <div class="revText" style="font-size:50px;">등록된 후기가 없습니다.</div>
        </div>
    </c:if>
    <c:forEach var="dto" items="${list}">
        <div class="revItem" id="revItem${dto.rv_idx}">
            <div class="revCate">${dto.cate2}</div>
            <div class="revText">${fn:substring(dto.content,0,120)}</div>
            <div class="revEtc">
                <div class="star" data-rate="${dto.gradesum}">
       				<i class="fas fa-star fa-1x"></i>
        			<i class="fas fa-star fa-1x"></i>
       				<i class="fas fa-star fa-1x"></i>
      				<i class="fas fa-star fa-1x"></i>
    				<i class="fas fa-star fa-1x"></i>
    			</div>
                <div class="studentName">${dto.name} 수강생</div>
            </div>
        </div>
    <div class="modalContainer" id="modalContainer${dto.rv_idx}">
    	<div class="modali">
    		<div class="cate">${dto.e_id}강사의 ${dto.cate2} 레슨</div>
    		<c:if test="${sessionScope.sessionId==dto.id}">
    			<div class="reviewDel">
    				<a href="reviewUpdate.do?rv_idx=${dto.rv_idx}"><span>수정</span></a>
    				<a href="javascript:question()"><span id="reviewDel">삭제</span></a>
    			</div>
    		</c:if>
			<p class="content">${dto.content}</p>
		    <div class="star" data-rate="${dto.gradesum}">
       			<i class="fas fa-star fa-1x"></i>
        		<i class="fas fa-star fa-1x"></i>
       			<i class="fas fa-star fa-1x"></i>
      			<i class="fas fa-star fa-1x"></i>
    			<i class="fas fa-star fa-1x"></i>
    		</div>
    		<div class="studentName">${dto.name} 수강생</div>
    		<div class="revBt" onclick="location.href='expertProfile.do?id=${dto.e_id}'">${dto.e_id}강사 프로필 보기</div>
			<div class="revBt" onclick="location.href='request.do?cate1=${dto.cate1}'">${dto.cate2} 과외 요청하기</div>
    	</div>
    </div> 
    <script>
		$('#modalContainer${dto.rv_idx}').hide();
		var rv=document.getElementById('#revItem${dto.rv_idx}');
		$('#revItem${dto.rv_idx}').click(function(){
			$('#modalContainer${dto.rv_idx}').fadeIn();
		});
		$('#modalContainer${dto.rv_idx}').click(function(){
		    $('#modalContainer${dto.rv_idx}').fadeOut();
		});

    </script>
    </c:forEach>
    </div>
     <div class="footContainer">
     	<div>${pageStr}</div>
    	<input type="button" class="btn btn-outline-secondary" value="글쓰기" onclick="location.href='reviewWrite.do?id=${sessionScope.sessionId}'">
    </div>
	  <br>
      <br>
    <%@ include file="/WEB-INF/views/footer.jsp" %>
   <script>		
	function question(){
		var result=confirm("리뷰를 삭제하시겠습니까?");
		if(result){
			location.href="reviewDelete.do?rv_idx=${dto.rv_idx}"
		}else{
			close();
		}
	}
	
    $(document).ready(function(){
    	$('.star').each(function(){
    		var targetScore=$(this).attr('data-rate');
    		$(this).find('svg:nth-child(-n+'+targetScore+')').css({color:'#ff9797'});
    	});
    });
	</script>
</body>
</html>