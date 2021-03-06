﻿<%@ page contentType="text/html;charset=UTF-8" %>

<%
    if (session.getAttribute("username") != null) {
        response.sendRedirect("/");
    }
%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/main-style.css"/>
</head>
<body>

<jsp:include page="header-bar.jsp"/>

<br><br>

<p class="big-text" style="text-align: center; margin: auto; color: #218527;">Log In</p>
<br>

<div class="loginbox">
    <form action="UserControllerServlet" method="POST">
        <h3>Username:
            <input type="text" name="username">
        </h3>
        <h3>Password:
            <input type="password" name="password">
        </h3>
        <button type="submit" name="login" value="yes">Login</button>
        <%
            String printCouldNotLoginMessage = (String) session.getAttribute("print-could-not-login-message");
            if (printCouldNotLoginMessage != null && printCouldNotLoginMessage.equals("yes")) {
                out.print("<h4 style = 'color: yellow;'>You where not able to log in.</h4>");
                request.getSession(false).setAttribute("print-could-not-login-message", "no");
            }
        %>
    </form>
</div>

</body>
</html>
