package com.xworkz.web.refrigirator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SamsungFridgeServlet extends HttpServlet {

	public SamsungFridgeServlet() {
		System.out.println("created" + this.getClass().getName());

	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String Brand = request.getParameter("brand");
		String Color = request.getParameter("color");
		String Price = request.getParameter("price");

		System.out.println("brand " + Brand);
		System.out.println("brand " + Color);
		System.out.println("brand " + Price);

		PrintWriter htmlWriter = response.getWriter();
		System.out.println("<html>");
		System.out.println("<body>");
		System.out.println("<h1>");
		System.out.println("Save is Sucess for "+Brand);
		System.out.println("</h1>");
		System.out.println("</body>");
		System.out.println("</html>");
	}

}
