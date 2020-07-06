<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<h1>Calculadora</h1>
	<form name="calculate" action="calculator" method="POST">
       Operador 1: <input type="text" name="operador1">
       <br /><br />
       Operador 2: <input type="text" name="operador2" />
       <br /><br />
       <input type="submit" value="Calcular" />
     </form>
</body>
</html>