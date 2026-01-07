<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Order Confirmation</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>
<div class="container">
<h1>Order Confirmed ✔️</h1>

<div class="card">
<h2>Thank you for your order!</h2>

<%
String name = request.getParameter("name");
String item = request.getParameter("item");
String quantity = request.getParameter("quantity");
String total = String.valueOf(request.getAttribute("total"));
%>

<p><b>Name:</b> <%= name %></p>
<p><b>Item:</b> <%= item %></p>
<p><b>Quantity:</b> <%= quantity %></p>
<p><b>Total:</b> ₹ <%= total %></p>

<p>Your delicious food will reach you soon 🍕 🍔 🍝</p>
</div>

<a href="menu.jsp">Back to Menu</a> |
<a href="index.html">Home</a>
</div>
</body>
</html>
