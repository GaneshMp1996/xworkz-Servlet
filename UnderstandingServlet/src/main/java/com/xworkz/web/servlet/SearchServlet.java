package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SearchServlet extends HttpServlet {
	public SearchServlet() {
		System.out.println("created"+this.getClass());
	}
@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Invoked Service from SearchServlet");
		response.setContentType("text/html");
		PrintWriter htmlWriter=response.getWriter();
		htmlWriter.print("<html>");
		htmlWriter.print("<body style='background-color:#FF8C00;'>");
		htmlWriter.print("<h1 align='center';>");
		htmlWriter.print("This is my Search Link");
		htmlWriter.print("</h1>");
		htmlWriter.print("<h3><a href=http://localhost:8080/UnderstandingServlet/>Home</a></h3>");
		htmlWriter.print("<footer style='text-align:center;margin-top:35%;'>");
		htmlWriter.print("<h2>This is footer<h2>");
		htmlWriter.print("</footer>");
		htmlWriter.print("</html>");
		
		
	}


}
