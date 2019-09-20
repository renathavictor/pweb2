<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Págin principal da aplicação</title>
</head>
<body>
	<h1>Livros cadastrados</h1>
	
	<c:if test="${not empty livro}">
		<p>${livro.titulo} cadastrado com sucesso!</p>
	</c:if>
	
	<table>
		<thead>
			<th>Id</th>
			<th>Titulo</th>
			<th>Autor</th>
			<th>Estilo</th>
			<th>Link</th>
		</thead>
		<tbody>
			<c:forEach var="livroItem" items="${livros}">
					<tr>
					 <td>${livroItem.id}</td>
					 <td>${livroItem.titulo}</td>
					 <td>${livroItem.autor}</td>
					 <td>${livroItem.estilo}</td>
					 <td><a href="http://localhost:8080/spring-pratica-mvc-1/livros/${livroItem.id}">Mais informações</a></td>
					</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>