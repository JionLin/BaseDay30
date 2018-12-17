package com.jiaolin.Login;


import com.jiaolin.bean.User;
import com.jiaolin.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:42 2018/8/5
 * @Modify By: 计算出登录的次数
 */
public class LoginServlet extends HttpServlet {


	@Override
	public void init() throws ServletException {
		int count = 0;
		this.getServletContext().setAttribute("count", count);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// req.setCharacterEncoding("UTF-8");
		//响应给服务端的
		resp.setContentType("text/html; charset=utf-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		//2、从数据库中验证该用户名和密码是否正确
		QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user where username=? and password=?";
		User user = null;
		try {
			user = queryRunner.query(sql, new BeanHandler<User>(User.class), username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//3、根据返回的结果给用户不同显示信息
		if (user != null) {
			//进行输出次数
			//获取全局参数 servlet上下文
			ServletContext servletContext = this.getServletContext();
			//获取count次数
			Integer count = (Integer) servletContext.getAttribute("count");
			count++;
			resp.getWriter().write("登录次数:" + count);
			//在把count存入进去
			servletContext.setAttribute("count", count);

		} else {
			resp.getWriter().write("账号名或者密码错误");
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
