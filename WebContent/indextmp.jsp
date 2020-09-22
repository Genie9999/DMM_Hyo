<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원가입
	<form action="./userJoinAction.jsp" method="post">
		아이디 : <input type="text" name="userID">
		비밀번호 : <input type="password" name="userPassword">
		<input type="submit" value="회원가입">
	</form>
</body>
</html>