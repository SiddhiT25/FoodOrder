<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Contact Us</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
<div class="container">
    <h1>Contact Us ☎️</h1>

    <h2>📞 Contact Information</h2>
    <p><strong>Phone:</strong> +91 12345 67890</p>
    <p><strong>Email:</strong> support@foodorder.com</p>
    <p><strong>Address:</strong> Indore, Madhya Pradesh</p>

    <hr>

    <h2>✉️ Send a Message</h2>

    <form>
        <label>Your Name:</label><br>
        <input type="text" placeholder="Enter your name" required><br><br>

        <label>Your Email:</label><br>
        <input type="email" placeholder="Enter your email" required><br><br>

        <label>Your Message:</label><br>
        <textarea rows="4" placeholder="Write your message..." required></textarea><br><br>

        <button type="submit" class="btn">Send Message</button>
    </form>

    <br>
    <a href="menu.jsp" class="btn">Back to Menu</a>
</div>
</body>
</html>
