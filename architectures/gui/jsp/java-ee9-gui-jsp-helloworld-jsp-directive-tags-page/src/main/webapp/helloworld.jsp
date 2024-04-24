<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Hello World!</title>
    </head>
    <body>
        <p>
            <%= request.getAttribute("message") %>
        </p>
    </body>
</html>