package com.businesslogics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getServlet")
public class getServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public getServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("txtuname");
		String pwd=request.getParameter("txtpassword");
		PrintWriter out=response.getWriter();
		if(name.equalsIgnoreCase("learnjava")&&pwd.equals("java@123"))
		{
			out.println("welcome user");
		}
		else
		{

			out.println("Invalid Username or Password");
		}
	}

}
