<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		
		
		$("#btn").on("click", function() {
			let txt = document.querySelector("#empno").value;
			
			$.ajax({
				url: "empSearch.jsp",
				dataType: "html",
				data : {"txt" : txt }, 
				success : function(response, status, request) { 
					console.log(response);
					$("#info").html(response);
					
				}
				
			})
		})
	})
</script>
</head>
<body>
	<input type="text" name="empno" id="empno" />
	<input type="button" value="검색" id="btn" />
	
	<div id="info">
		<h6>사원번호</h6> 
		<h6>사원명</h6>
		<h6>이름</h6>
		<h6>직무</h6>
	</div>
</body>
</html>