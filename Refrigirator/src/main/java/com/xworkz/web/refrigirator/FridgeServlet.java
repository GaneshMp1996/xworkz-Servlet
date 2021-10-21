package com.xworkz.web.refrigirator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FridgeServlet extends HttpServlet{
	
	public FridgeServlet() {
		System.out.println("Created"+this.getClass().getName());
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("invoked service from Fridge Servlet");
		response.setContentType("text/html");
		String brand=request.getParameter("brand");
		String color=request.getParameter("color");
		String price=request.getParameter("price");
		
		System.out.println("Brand :"+brand);
		System.out.println("Color :"+color);
		System.out.println("Price :"+price);
		System.out.println("****************");
		
		PrintWriter htmlWriter= response.getWriter();
		htmlWriter.print("<html>");
		htmlWriter.print("<body>");
		htmlWriter.print("<h1>");
		htmlWriter.print("Save is Success for "+brand);
		htmlWriter.print("</h1>");
		htmlWriter.print("</body>");
		htmlWriter.print("</html>");
	}

}
