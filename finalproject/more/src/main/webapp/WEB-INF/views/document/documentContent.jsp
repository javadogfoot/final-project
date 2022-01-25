<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/document/document.css?after">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/views/header.jsp"%>
	<div class="revMainContainer">
      <div class="revMainTextBox">
         <div class="revMainText">
            <h1>
               나의 ${dto.cate2} 레슨<br>
               <span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">나의 레슨 정보를 확인해보세요</span>
            </h1>   
         </div>
      </div>
   </div>
	<div class="expertMain">
		<div class="leftMain">
			<div class="leftMenu">
				<div class="who">학생</div>
				<div class="profile">
					<img src="resources/img/${dto.m_pic_path}" alt="profile">
					<h4>${dto.m_name}</h4>
					<div class="name">
						<i class="fas fa-phone fa-1x"></i>&nbsp;${dto.m_tel}
					</div>
					<div class="name">
						<i class="far fa-envelope fa-1x"></i>&nbsp;${dto.m_email}
					</div>
					<br>
					<c:if test="${sessionScope.sessionId eq dto.m_id }">
						<a href="statusUpdate.do?d_idx=${dto.d_idx}&p_idx=${dto.p_idx}"><button>수강취소</button></a>
					</c:if>
				</div>
				<hr>
				<div class="who">강사</div>
				<div class="profile">
					<img src="resources/img/${dto.e_pic_path}" alt="profile">
					<h4>${dto.e_name}</h4>
					<div class="name">
						<i class="fas fa-phone fa-1x"></i>&nbsp;${dto.e_tel}
					</div>
					<div class="name">
						<i class="far fa-envelope fa-1x"></i>&nbsp;${dto.e_email}
					</div>
					<br>
					<c:if test="${sessionScope.sessionId eq dto.m_id}">
						<div id="emailBt"><a href="expertProfile.do?id=${dto.e_id}">프로필 보기</a></div>
					</c:if>
				</div>
			</div>

		</div>
		<div class="rightMain">
			<div class="rightMenu">
				<div class="rightContainer">
				<div class="aaa" style="display:flex; justify-content: space-between;">
				<div class="aab">
					<div class="bbb">
						<h5>시작 날짜</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.start_date}</p>
						</div>
					</div>
				</div>
				<div class="aab">
					<div class="bbb">
						<h5>종료 날짜</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.end_date}</p>
						</div>
					</div>
				</div>
				</div>
				<div class="aaa">
					<div class="bbb">
						<h5>요일</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.day}</p>
						</div>
					</div>
				</div>
				<div class="aaa" style="display:flex; justify-content: space-between;">
				<div class="aab">
					<div class="bbb">
						<h5>시작 시간</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.start_time}:00</p>
						</div>
					</div>
				</div>
				<div class="aab">
					<div class="bbb">
						<h5>종료 시간</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.end_time}:00</p>
						</div>
					</div>
				</div>
				</div>
				<div class="aaa">
					<div class="bbb">
						<h5>비용</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.cost}만원</p>
						</div>
					</div>
				</div>
				<div class="aaa">
					<div class="bbb">
						<h5>진행 방법</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.process}</p>
						</div>
					</div>
				</div>
				<div class="aaa">
					<div class="bbb">
						<h5>수업 장소</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.ls_location}</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>	
<%@ include file="/WEB-INF/views/footer.jsp"%>
<script>
	function show(){
		alert();
	}
</script>
</body>
</html>












