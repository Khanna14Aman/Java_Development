package org.springbootweb1;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.Servlet;
import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8010);
        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"Servlet1", (Servlet) new ServletExample());
        context.addServletMappingDecoded("/hello","Servlet1");
        tomcat.start();
        tomcat.getServer().await();
    }
}
