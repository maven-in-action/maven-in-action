package com.juvenxu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class AppServlet
    extends HttpServlet
{
    private Logger logger = Logger.getLogger( AppServlet.class );

    protected void doGet( HttpServletRequest req, HttpServletResponse resp )
        throws ServletException,
            IOException
    {
        logger.info( "AppServlet invokded." );

        resp.getWriter().println( "Hello World" );
    }

}
