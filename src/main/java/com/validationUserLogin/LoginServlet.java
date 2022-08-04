package com.validationUserLogin;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	public void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String email =req.getParameter("userID");
        String password =req.getParameter("password");
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");

		if ((email.equalsIgnoreCase("hrithik@gmail.com")) && 
				(password.equals("@121")))
		{
			out.println("Login Successfull...<br>This is <b>Dashboard</b><br>");
			out.println("<a href=\"login\">Logout</a>");
		}
		else
		{	
			out.println("Incorrect UserName or Password...<br>");
			out.println("Go back to <a href=\"login\">Login</a> page");
//			res.sendRedirect("login");
		}
			
	}
}
