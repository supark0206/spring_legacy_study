<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>stuInfo.jsp</h1>
	<hr>
	
	<h3>
	<!-- m.addAttribute 로 설정한 이름 stuInfo.객체변수명 -->
		학교 : ${stuInfo.university} <br/>    
		학과 : ${stuInfo.major} <br/>
		학년 : ${stuInfo.grade} <br/>
		이름 : ${stuInfo.name} <br/>
		
	
	</h3>

</body>
</html>