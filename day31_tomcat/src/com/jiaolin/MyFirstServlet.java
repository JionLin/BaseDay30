package com.jiaolin;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 16:51 2018/8/4
 * @Modify By:
 */
public class MyFirstServlet implements Servlet {
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		//初始化

	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		//调用的时候就运行
		//专门向客户端提供响应的方法
		HttpServletResponse response= (HttpServletResponse) servletResponse;
		response.getWriter().write("this is first servlet");
		response.getWriter().write("welcome");
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void destroy() {
		//销毁
	}
}
