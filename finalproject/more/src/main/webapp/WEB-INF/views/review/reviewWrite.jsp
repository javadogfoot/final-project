<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${empty sessionScope.sessionId }">
	<script>
		location.href = 'sessionNull.do';
	</script>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/review/review.css?after">
<link rel="stylesheet" type="text/css" href="resources/css/header.css">
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
			<i class="fas fa-pencil-alt fa-3x"></i>
			<h3>후기 게시판 글쓰기</h3>
		</div>
	</div>
	<form name="reviewWrite" action="reviewWrite.do" method="post">
		<div class="writeContainer">
			<input type="text" name="name" value="${sessionScope.sessionName}" readonly>
			<select name="lessonlist" onchange="selectCate(this.value)" required>
				<option value="" selected hidden disabled>리뷰를 작성할 수업을 선택하세요</option>
				<c:forEach var="list" items="${list}">
					<option value="${list.e_id}강사의 ${list.cate2}레슨(${list.cate1})">${list.e_id}강사의 ${list.cate2} 레슨(${list.cate1})</option>
				</c:forEach>
			</select>
			<textarea name="content" cols="80" rows="15" autocomplete="off"
					class="input-lg form-control"
					placeholder="레슨 후기를 작성해주세요.(500자 내로)"
					maxlength="500" required="" id="id_field_25"></textarea>
			<div class="ratingContainer">
			<div class="ratingItem">
				<h4>전문성</h4>
				<div id="rating1">
       				<i class="fas fa-star fa-3x"></i>
        			<i class="fas fa-star fa-3x"></i>
       				<i class="fas fa-star fa-3x"></i>
      				<i class="fas fa-star fa-3x"></i>
    				<i class="fas fa-star fa-3x"></i>
    			</div>
    		</div>
    		<div class="ratingItem">
    			<h4>준비도</h4>
				<div id="rating2">
       				<i class="fas fa-star fa-3x"></i>
        			<i class="fas fa-star fa-3x"></i>
       				<i class="fas fa-star fa-3x"></i>
      				<i class="fas fa-star fa-3x"></i>
    				<i class="fas fa-star fa-3x"></i>
    			</div>
    		</div>
    		<div class="ratingItem">
    			<h4>강의력</h4>
				<div id="rating3">
       				<i class="fas fa-star fa-3x"></i>
        			<i class="fas fa-star fa-3x"></i>
       				<i class="fas fa-star fa-3x"></i>
      				<i class="fas fa-star fa-3x"></i>
    				<i class="fas fa-star fa-3x"></i>
    			</div>
    		</div>
			</div>
			
			<div class="writeButton">
				<input type="hidden" name="e_id" id="changeE_id">
				<input type="hidden" name="cate1" id="changeCate1">
				<input type="hidden" name="cate2" id="changeCate2">
				<input type="hidden" name="id" value="${sessionScope.sessionId}">
				<input type="submit" value="글쓰기" onmouseover="sum()"> 
				<input type="button" value="취소" onclick="location.href='reviewList.do'"> 
				<input type="hidden" name="grade1" value="">
				<input type="hidden" name="grade2" value="">
				<input type="hidden" name="grade3" value="">
				<input type="hidden" name="gradesum" value="">
			</div>
		</div>
	</form>
	<br>
	<br>
	<%@ include file="/WEB-INF/views/footer.jsp" %>
	<script>
	function selectCate(value){
		var i=value;
		var a=i.substring(i.indexOf("의")+2,i.indexOf("레"));
		var b=i.substring(0,i.indexOf("강"));
		var c=i.substring(i.indexOf("(")+1,i.indexOf(")"));
		console.log(a);
		console.log(b);
		console.log(c);
		$('#changeCate2').val(a);
		$('#changeE_id').val(b);
		$('#changeCate1').val(c);
	}


        $(document).ready(function(){
            $('#rating1 svg').on("click",function(){
                var targetNum1=$(this).index()+1;
                $('#rating1 svg').css({color:'#000'});
                $('#rating1 svg:nth-child(-n'+targetNum1+')').css({color:'#ff9797'});
                console.log(targetNum1);
                document.reviewWrite.grade1.value=targetNum1;
            });
            
            $('#rating2 svg').on("click",function(){
                var targetNum2=$(this).index()+1;
                $('#rating2 svg').css({color:'#000'});
                $('#rating2 svg:nth-child(-n'+targetNum2+')').css({color:'#ff9797'});
                console.log(targetNum2);
                document.reviewWrite.grade2.value=targetNum2;  
            });
            
            $('#rating3 svg').on("click",function(){
                var targetNum3=$(this).index()+1;
                $('#rating3 svg').css({color:'#000'});
                $('#rating3 svg:nth-child(-n'+targetNum3+')').css({color:'#ff9797'});
                console.log(targetNum3);
                document.reviewWrite.grade3.value=targetNum3;
            });

        });
        /* $(function(){
            $('#rating1 svg').click(function(){
                var targetNum1=$(this).index()+1;
                $('#rating1 svg').css({color:'#000'});
                $('#rating1 svg:nth-child(-n'+targetNum1+')').css({color:'#ff9797'});
                console.log(targetNum1);
                document.reviewWrite.grade1.value=targetNum1;
            })
            
            $('#rating2 svg').click(function(){
                var targetNum2=$(this).index()+1;
                $('#rating2 svg').css({color:'#000'});
                $('#rating2 svg:nth-child(-n'+targetNum2+')').css({color:'#ff9797'});
                console.log(targetNum2);
                document.reviewWrite.grade2.value=targetNum2;  
            })
            
            $('#rating3 svg').click(function(){
                var targetNum3=$(this).index()+1;
                $('#rating3 svg').css({color:'#000'});
                $('#rating3 svg:nth-child(-n'+targetNum3+')').css({color:'#ff9797'});
                console.log(targetNum3);
                document.reviewWrite.grade3.value=targetNum3;
            })

        }); */
        function sum(){
        	var a=parseInt(document.reviewWrite.grade1.value);
        	var b=parseInt(document.reviewWrite.grade2.value);
        	var c=parseInt(document.reviewWrite.grade3.value);
            var targetNumSum=Math.round((a+b+c)/3);
            console.log(targetNumSum);
            document.reviewWrite.gradesum.value=targetNumSum;
        }

    </script>
</body>
</html>