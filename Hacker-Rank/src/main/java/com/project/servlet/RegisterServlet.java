package com.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	public RegisterServlet() {
		System.out.println("Object is created:"+this.getClass().getName());
	}
	
//	@Override//it will works for both get and post()
	//doGet and doPost
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("Involked service method from Register Servlet class");
//		resp.setContentType("text/html");
//		
//		String FirstName=req.getParameter("firstName");
//		String lastName=req.getParameter("lastName");
//		String email=req.getParameter("email");
//		String phone=req.getParameter("phone");
//		String password=req.getParameter("password");
//		System.out.println("FirstName:"+FirstName );
//		System.out.println("LastName: "+lastName);
//		System.out.println("Email:"+email);
//		System.out.println("Phone: "+phone);
//		System.out.println("Password: "+password);
//		PrintWriter htmlWriter=resp.getWriter();
//		htmlWriter.print("<html>");
//		htmlWriter.print("<body>");
//		htmlWriter.print("<h1 align='centre';>");
//		htmlWriter.print("Registraction is Sucessfull,,,,,,,,,,,,,");
//		htmlWriter.print("</h1>");
//		htmlWriter.print("</html>");
//		
//	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Involked service method from Register Servlet class");
		resp.setContentType("text/html");
		
		String FirstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String password=req.getParameter("password");
		System.out.println("FirstName:"+FirstName );
		System.out.println("LastName: "+lastName);
		System.out.println("Email:"+email);
		System.out.println("Phone: "+phone);
		System.out.println("Password: "+password);
		System.out.println("involked goGet() from Register Servlet class");
		PrintWriter htmlWriter=resp.getWriter();
		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("<h1 align='centre';>");
		htmlWriter.print("Registraction is sucessfull,,,,,,,,,,,,");
		htmlWriter.print("</h1>");
		htmlWriter.print("</html>");
		
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("involked goGet() from Register Servlet class");
		PrintWriter htmlWriter=resp.getWriter();
		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("<h1 align='centre';>");
		htmlWriter.print("use getMethod from html form");
		htmlWriter.print("</h1>");
		htmlWriter.print("</html>");
	}
}
