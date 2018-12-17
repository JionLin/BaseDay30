package com.jiaolin.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 8:19 2018/8/5
 * @Modify By:
 */
public class ContextServlet_2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext servletContext = getServletContext();
		String name = (String) servletContext.getAttribute("name");
		System.out.println(name);
	}
}
