<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/request/request.css?after" rel="stylesheet">
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/views/header.jsp"%>
	<div class="revMainContainer">
		<div class="revMainTextBox">
			<div class="revMainText">
				<h1>
					${dto.cate2} 레슨 요청서<br>
					<span style="font-size:25px; font-weight:normal; border-top: 1px solid white; padding: 5px;">레슨을 요청합니다</span>
				</h1>	
			</div>
		</div>
	</div>
	<section>
   <br>
   <br>
   <c:if test="${sessionScope.sessionId eq dto.id }">
   		<div>
			<input type="button" value="수정" onclick="location.href='requestUpdate.do?r_idx=${dto.r_idx}'">
			<input type="button" value="삭제" onclick="question()">
		</div>
	</c:if>
		<div class="row-vh d-flex flex-row">
			<div class="leftContainer">
				<div class="card mb-3 p-4 shadow-sm"
					style="width: 100%; height: 100%; border: none; box-shadow: none;">
					<div class="d-flex align-items-top mb-3">
						<div style="margin-right: 20px;">
							<img src="resources/img/${dto.pic_path}" id="profile" class="rounded u-lg-avatar">
						</div>
						<div>
							<p class="text-dark mb-3 h5">${dto.name}</p>
							<p class="m-0 font-subhead">${dto.addr}</p>
						</div>
					</div>
					<c:if test="${sessionScope.sessionStatus eq 2}">
					<div class="left_item">
						<a href="requestSuggest.do?id=${dto.id}" class="btn px-2 py-1 rounded font-footnote border text-secondary font-weight-normal">
							<span class="text-primary" style="font-size: 20px;"> 제안하기 </span>
						</a>
					</div>
					</c:if>
					<div class="left_item">
						<i class="fas fa-user-check"></i>&nbsp;E-mail
						<p class="font-subhead pl-5 text-dark font-weight-normal m-0">
							${dto.email}
						</p>
					</div>
					<div class="left_item">
						<img src="https://d3cwtye3iv0eb9.cloudfront.net/static/images/base/icons/ic_client_info.svg" width="24" alt="" class="mr-1"> 
						<span class="font-subhead text-secondary">전문가가 참고해야 할 정보</span>
						<p class="font-subhead p-3 bg-soft-primary rounded mt-1 mb-0 text-dark font-weight-normal">
							${dto.intro}
						</p>
					</div>
				</div>
			</div>
			<div class="rightContainer">
				<div class="aaa">
					<div class="bbb">
						<h5>레슨 기간</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.period}</p>
						</div>
					</div>
				</div>
				<div class="aaa">
					<div class="bbb">
						<h5>선호하는 요일</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.day}</p>
						</div>
					</div>
				</div>
				<div class="aaa">
					<div class="bbb">
						<h5>선호하는 시간대</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.time}</p>
						</div>
					</div>
				</div>
				<div class="aaa">
					<div class="bbb">
						<h5>선호하는 레슨비용</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.cost}</p>
						</div>
					</div>
				</div>
				<div class="aaa">
					<div class="bbb">
						<h5>이렇게 진행했으면해요</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.process}</p>
						</div>
					</div>
				</div>
				<div class="aaa">
					<div class="bbb">
						<h5>이곳에서 진행했으면해요</h5>
					</div>
					<div class="card-body py-0">
						<div class="my-4">
							<p class="card-text mb-5">${dto.ls_location}</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<%@ include file="/WEB-INF/views/footer.jsp"%>
	<script>
	function question(){
		var result=confirm("요청서를 삭제하시겠습니까?");
		if(result){
			location.href="requestDelete.do?r_idx=${dto.r_idx}"
		}else{
			close();
		}
	}
	</script>
</body>
</html>