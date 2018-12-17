package com.jiaolin.content;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 18:28 2018/8/5
 * @Modify By:
 */
public class ContentServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取页面中传递过来的参数
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println("username: " + username + " password:	" + password);
		String[] hobbies = req.getParameterValues("hobby");
		if (hobbies != null && hobbies.length > 0) {
			for (String hobby : hobbies) {
				System.out.println("hobby: " + hobby);
			}
		}
		System.out.println("=========================");

		//获取所有的键的参数名称
		Enumeration<String> parameterNames = req.getParameterNames();
		while (parameterNames.hasMoreElements()) {
			String s = parameterNames.nextElement();
			System.out.println("获取所有的元素: " + s);
		}
		System.out.println("=========================");
		//4、获得所有的参数 参数封装到一个Map<String,String[]>
		Map<String, String[]> parameterMap = req.getParameterMap();
		//map集合遍历
		/*for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
			System.out.println("key值:	" + entry.getKey());
			for (String value : entry.getValue()) {
				System.out.println("value值: " + value);
			}

		}*/
		//根据键找值 获取所有的key
		Set<String> set = parameterMap.keySet();
		//把key进行遍历,在通过key获取所有的值
		for (String s : set) {
			String[] value = parameterMap.get(s);
			for (String value2 : value) {
				System.out.println("key为:	" + s + "值为:" + value2);
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
