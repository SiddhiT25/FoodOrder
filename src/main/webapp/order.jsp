<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Now</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="container">
    <h1>Place Your Order</h1>

    <!-- Added your UL here -->
    <ul>
        <li>Pizza - &#8377;250</li>
        <li>Burger - &#8377;120</li>
        <li>Pasta - &#8377;180</li>
    </ul>

    <form action="order" method="post">


        <label>Your Name:</label><br>
        <input type="text" name="name" required><br><br>

        <label>Select Item:</label><br>
        <select name="item" required>
            <option value="Pizza">Pizza - ₹250</option>
            <option value="Burger">Burger - ₹120</option>
            <option value="Pasta">Pasta - ₹180</option>
        </select>

        <br><br>

        <label>Quantity:</label><br>
        <input type="number" name="quantity" min="1" required>

        <br><br>
        <input type="submit" value="Confirm Order">
    </form>

    <br>
    <a href="index.html">Back to Home</a>
</div>

</body>
</html>
