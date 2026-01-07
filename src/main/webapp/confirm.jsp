<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Confirmation</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
<div class="container">
    <h1>Order Confirmed ✔️</h1>
    <h2>Thank you for your order!</h2>

    <!-- Added your UL here -->
    <ul>
        <li>Pizza - &#8377;250</li>
        <li>Burger - &#8377;120</li>
        <li>Pasta - &#8377;180</li>
    </ul>

    <%
        String name = request.getParameter("name");
        String item = request.getParameter("item");
        int qty = Integer.parseInt(request.getParameter("qty"));

        int price = 0;
        if(item.equals("Pizza")) price = 250;
        else if(item.equals("Burger")) price = 120;
        else if(item.equals("Pasta")) price = 180;

        int total = qty * price;
    %>

    <div class="card">
        <p><strong>Name:</strong> <%= name %></p>
        <p><strong>Item Ordered:</strong> <%= item %></p>
        <p><strong>Quantity:</strong> <%= qty %></p>
        <p><strong>Total Amount:</strong> ₹<%= total %></p>
    </div>

    <br>
    <p>Your delicious food will reach you soon 😋🍽️</p>

    <br>
    <a href="menu.jsp" class="btn">Back to Menu</a>
    <a href="index.html" class="btn">Home</a>
</div>
</body>
</html>
