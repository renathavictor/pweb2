<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Página principal da aplicação</title>
</head>
<body>
	<h1>Autentique-se</h1>
	<hr/>
	<c:if test="${not empty erro}">
		<span style="color:red">${erro}</span>
	</c:if>
	
	<form action="valide" method="POST">
		Login: <input type="text" name="login" /><br/><br/>
		Senha: <input type="password" name="senha" /><br/><br/>
		<input type="submit" value="login" /> 
	</form>
	
</body>
</html>