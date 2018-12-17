package com.jiaolin.bean;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 9:48 2018/8/5
 * @Modify By: 用户对象实体
 */
public class User {
	private int id;
	private String username;
	private String password;


	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
