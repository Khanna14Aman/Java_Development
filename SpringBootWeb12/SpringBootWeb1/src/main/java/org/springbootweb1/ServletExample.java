package org.springbootweb1;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletExample extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("Hello Servlet");
        res.setContentType("text/html");
        res.getWriter().println("<H2>Hello World</H2>");
    }
}
