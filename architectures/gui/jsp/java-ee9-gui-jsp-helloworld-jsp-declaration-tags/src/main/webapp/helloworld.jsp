<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Hello World!</title>
    </head>
    <body>
        <p>
            <%! 
                String getRequestAttribute(HttpServletRequest request, String attributeName) {
                    return (String)request.getAttribute(attributeName);
                }
            %>
            <% 
                String result = getRequestAttribute(request, "message");
            %>
            <%= result %>
        </p>
    </body>
</html>