package LoginIO.pojo;

/**
 * @Auther: Joinlin
 * @Descriptional:
 * @Date: Create in 11:47 2018/6/14
 * @Modify By:
 */
public class User {
	private String username;
	private String password;

	public User() {
	}

	public User(String username, String password) {

		this.username = username;
		this.password = password;
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
