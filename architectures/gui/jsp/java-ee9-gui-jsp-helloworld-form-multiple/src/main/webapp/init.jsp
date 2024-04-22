<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Hello World!</title>
    </head>
    <body>
        <form method="post" action="">

            <div>
                <label for="name">Name:</label>
                <input type="text" id="name" name="name"></input>
            </div>

            <div>
                <button type="submit">Submit</button>
            </div>

        </form>
        <p>${message}</p>
    </body>
</html>