<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
	<%@ page import="org.example.javaeetest.Cart" %>

	<% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p>Наименование: ${cart.getName()}</p>
    <p>Количество: ${cart.getQuantity()} </p>

    <%= new java.util.Date() %>

    <%Integer count = (Integer) session.getAttribute("count"); %>
    <p><%= count %></p>


</body>
</html>