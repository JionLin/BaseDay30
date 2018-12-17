package com.jiaolin.forward;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 18:20 2018/8/5
 * @Modify By:
 */
public class Servlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext servletContext = this.getServletContext();
		String name = (String) servletContext.getAttribute("name");
		System.out.println("servlet2获取的名字是"+name);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}
}
