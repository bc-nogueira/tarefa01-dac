<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>O resultado é: ${resultado}</h1>
	<br />
	<br />
	<h1>
		Contador: 
		<%
			Cookie[] cookies = null;
			cookies = request.getCookies();
			
			for(int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("CONTADOR")) {
					out.print(cookies[i].getValue());
				}
			}
		%>
	</h1>
	
	<a href="/tarefa01-dac/home">Voltar</a>
</body>
</html>