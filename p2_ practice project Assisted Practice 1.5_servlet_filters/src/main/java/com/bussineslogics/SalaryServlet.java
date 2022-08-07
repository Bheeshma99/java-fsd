package com.bussineslogics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SalaryServlet")
public class SalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SalaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 final PrintWriter out = response.getWriter();
	        out.println("Welcome Accountant you can check salary list");
		
	}

}
