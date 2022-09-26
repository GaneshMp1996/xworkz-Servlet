package com.project.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {
	public LifeCycleServlet() {
//		System.out.println("Involked no-Argument Constructor");
		System.out.println("Object is created: " + this.getClass().getName());

	}

	@Override//init child method
	public void init() throws ServletException {//child class
		System.out.println("involked init from life cycle servlet with zero parameter");
	}

	@Override//parent method
	public void init(ServletConfig config) throws ServletException {//parent class
		System.out.println("involked init from from life cycle servet with parameter");
	}

//	@Override//child method
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("involked service from lifecycle servlet without http");
//	}

//	@Override//parent method
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("involked service from lifecycle servlet with http");
//	}

	@Override//doGet
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("involked goGet from lifecycle servlet ");
	}
	@Override
	public void destroy() {
		System.out.println("Involked destroy from lifecycle servlet ");
	}
}