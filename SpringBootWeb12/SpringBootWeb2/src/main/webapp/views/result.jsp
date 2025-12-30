<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    </body>

<!--     using plain Java -->
<!--        <h2>Result is:<%= session.getAttribute("result") %></h2>  -->


       <!--  using jstl tags -->
        <h2>Result is: ${result}  </h2>

         <h2>Welcome To Galaxy  </h2>
                <p> ${alien} </p>
         <p>Welcome to the ${course} World</p>


    </body>
</html>