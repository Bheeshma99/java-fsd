package com.bussineslogics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/SalaryServlet")
public class CredentialChecker extends HttpFilter implements Filter {
       
    
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		final String uname = request.getParameter("txtUname");
        final String pword = request.getParameter("txtPassword");
        final PrintWriter out = response.getWriter();
        if (uname.equalsIgnoreCase("accountant") && pword.equals("eclipse123")) {
            chain.doFilter(request, response);
        }
        else {
            out.println("Invalid Username or Password");
        }
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
