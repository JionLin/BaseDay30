package com.jiaolin.login;

import com.jiaolin.bean.User;
import com.jiaolin.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 22:10 2018/8/5
 * @Modify By:
 */
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取参数,从数据库进行对比
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = login(username, password);
		//登录成功,跳转页面
		if (user != null) {
			//登录成功 跳转到网站的首页 指的是/后的项目 也就是目录,
			String contextPath = req.getContextPath();
			System.out.println("首页是什么"+contextPath+"?");
			resp.sendRedirect(contextPath);

		} else {
			//失败,重新跳转到登录页面login.jsp
			req.setAttribute("loginInfo", "用户名或密码错误");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}

	}

	private User login(String username, String password) {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user where username=? and password=?";
		User user = null;
		try {
			user = runner.query(sql, new BeanHandler<User>(User.class), username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
