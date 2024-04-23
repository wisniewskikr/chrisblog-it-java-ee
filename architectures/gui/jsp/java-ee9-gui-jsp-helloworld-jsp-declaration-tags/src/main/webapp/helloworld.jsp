<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Hello World!</title>
    </head>
    <body>
        <p>
            <% String result = (String)request.getAttribute("message"); %>
            <%= result %>
        </p>
    </body>
</html>