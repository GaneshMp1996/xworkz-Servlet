package com.xworkz.web.refrigirator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HaierFridgeServlet extends HttpServlet {

	public HaierFridgeServlet() {
		System.out.println("Created" + this.getClass().getSimpleName());

	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String Brand = request.getParameter("brand");
		String Price = request.getParameter("color");
		String Color = request.getParameter("price");
		System.out.println("***************************");

		System.out.println("brand " + Brand);
		System.out.println("color" + Color);
		System.out.println("price" + Price);

		PrintWriter htmlWriter = response.getWriter();
		System.out.println("<html>");
		System.out.println("<body>");
		System.out.println("<h1>");
		System.out.println("Save is sucess for " + Brand);
		System.out.println("</h1>");
		System.out.println("</body>");
		System.out.println("</html>");
	}

}
