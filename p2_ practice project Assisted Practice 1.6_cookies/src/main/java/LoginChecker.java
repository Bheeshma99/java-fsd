


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(asyncSupported = true, urlPatterns = { "/LoginChecker" })
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginChecker() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String uname=request.getParameter("txtuname");
//		String pword=request.getParameter("txtpassword");
//		PrintWriter out=response.getWriter();
//		if(uname.equalsIgnoreCase("java") && pword.equals("eclipse123")){
//			out.println("You are Welcomed");
//		}
//		else
//			out.println("Invalid Username or Password");
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("txtuname");
		String pword=request.getParameter("txtpassword");
		PrintWriter out=response.getWriter();


		if(pword.equals("eclipse123")){
			
			Cookie cookie=new Cookie("username",uname);//key,value
			response.addCookie(cookie);
			
			//Request Dispatcher is used to send information on next page or same page
			RequestDispatcher rs= request.getRequestDispatcher("link.html");
			rs.forward(request, response);

		
		}
		else
		{
			out.println("sorry username or password is wrong");
			RequestDispatcher rs= request.getRequestDispatcher("login.html");
			rs.include(request, response);
		}
		
	}
	

}
