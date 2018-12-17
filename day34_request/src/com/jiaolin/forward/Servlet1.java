package com.jiaolin.forward;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 18:13 2018/8/5
 * @Modify By:
 */
public class Servlet1 extends HttpServlet {
	//进行跳转达到servlet2
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext servletContext = this.getServletContext();
		//设置上下文的值 全web应用
		servletContext.setAttribute("name", "tom");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/servlet2");
		//请求转发
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}
}
