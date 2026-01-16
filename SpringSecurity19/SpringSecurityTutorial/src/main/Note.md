::: Our project should take care of all the security mentioned in owasp: open web application security project.
1: Spring Security is useful for providing multiple security feature to your backend code.
2: To create Spring Security project add dependencies like: Spring web, Spring security, Dev tools.
3: The moment you use Spring Security in your project by default it will provide login page whose username will be "User" and password you will get from console. 
4: If you use http://localhost:8080/logout it will show the logout page and if you click logout it will logout the session.
5: By Default Spring Security provides many layers of security filter before request reached to controller. Those filters get executed in particular order but we can change the order.
6: HttpServletRequest object will have session Id which is also known as cookie.
7: you can set username and password in application.properties file.
8: CSRF stands for Cross-Site Request Forgery. When some server try to steal cookie from your browser for some personal account and then use that cookie for accessing your personal account.
9: For POST, PUT, DELETE request we need to use CSRF token, so we can get CSRF token from HttpServletRequest object inside that we can use .getAttribute method and pass _csrf as string parameter then it will return CSRF token which you can use for POST,PUT and DELETE request.
10: In header part you have to add X-CSRF-TOKEN in key field and CSRF token in your value part.
11: server.servlet.session.cookie.same-site=strict use this in application.properties file so any third party server will not be able to steal your cookie.
12: Also If we make our server stateless then everytime we call any api request we have to use username and password. In this case we can disable our csrf token.
13: By default spring provides many security like username, password, csrf token, etc. But you can change this security using HttpSecurity object. But now you have to define every security things manually else there is nothig in security.
14: Also whenever you are changing default security you have to return SecurityFilterChain object.
15: Whenever you tried to login Spring will check if there is any method where you are returning UserDetailsService object then it will consider login account from this object else it will consider login account from application.properties file if not maintained there then it will consider default username and password.
16: Whenever we are authenticating the user we called him as Principal.