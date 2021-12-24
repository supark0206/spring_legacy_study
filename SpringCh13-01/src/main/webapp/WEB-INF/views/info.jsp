<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String ctx = request.getContextPath();
	%>
	<h1>info.jsp 파일 입니다</h1>
	<hr/>
	<form action="<%=ctx%>/stuView" method="post">
		이름 : <input type="text" name="name"><br/>
		학과 : <input type="text" name="major"><br/>
		학년 : <input type="text" name="gradeNum"><br/>
		반 : <input type="text" name="classNum"><br/>	
		<input type="submit" value="전송">
	</form>
</body>
</html>