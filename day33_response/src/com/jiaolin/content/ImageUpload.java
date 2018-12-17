package com.jiaolin.content;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 11:16 2018/8/5
 * @Modify By:
 */
public class ImageUpload extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//使用response获得字节输出流
		ServletOutputStream outputStream = resp.getOutputStream();

		//获得服务器上的图片 以web下的目录开始计算
		String realPath = this.getServletContext().getRealPath("a.jpg");
		//输入流
		FileInputStream inputStream = new FileInputStream(realPath);

		int len = 0;
		byte[] bytes = new byte[1024];
		while ((len = inputStream.read(bytes)) != -1) {
			outputStream.write(bytes, 0, len);
		}
		inputStream.close();
		outputStream.close();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
