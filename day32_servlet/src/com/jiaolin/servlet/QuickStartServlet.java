package com.jiaolin.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:11 2018/8/5
 * @Modify By:
 */
public class QuickStartServlet implements Servlet {

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		//需要求servlet的名字
		String name = servletConfig.getServletName();
		System.out.println(name);
		//以及servlet的url
		//指的是<init parm><param-name> <param -value>
		String url = servletConfig.getInitParameter("servlet_3");
		System.out.println(url);
		//3、获得Servletcontext对象
		ServletContext servletContext = servletConfig.getServletContext();

		System.out.println("init params");

	}

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		System.out.println("service");
	}
	@Override
	public ServletConfig getServletConfig() {
		return null;
	}


	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("destory");
	}
}
