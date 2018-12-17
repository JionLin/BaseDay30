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
 * @Date: Create in 18:30 2018/8/4
 * @Modify By:
 */
public class ContextServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获得ServletContext对象
		ServletContext servletContext = getServletContext();
		//1、获得初始化参数
		String initParameter = servletContext.getInitParameter("drive");
		System.out.println(initParameter);
		//2、获得a b c d.txt的绝对路径
		//2.1 获得a.txt
		String realPath_a = servletContext.getRealPath("a.txt");
		//2.2 获得b.txt
		String realPath_b = servletContext.getRealPath("WEB-INF/b.txt");
		//2.3 获得c.txt
		String realPath_c = servletContext.getRealPath("c.txt");
		System.out.println("a"+realPath_a);
		System.out.println("b"+realPath_b);
		System.out.println("c"+realPath_c);
		//2.4 获得d.txt----获取不到


		//在读取src(classes) 下的资源是可以同类加载器----专门加载classes 下的文件的
		//getResource() 参数是一个相对地址 相对classes
		String path_c = ContextServlet.class.getClassLoader().getResource("c.txt")
				.getPath();
		System.out.println("path_c"+path_c);
		//3、域对象---向servletContext中存数据
		servletContext.setAttribute("name","菜菜");


	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
