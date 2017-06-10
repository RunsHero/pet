package cn.zyyz.model;

/**
 * 用户
 * @author liang
 *
 */
public class User {

	private int user_id;
	private String user_age;
	private String user_name;
	public User(){
		super();
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_age() {
		return user_age;
	}
	public void setUser_age(String user_age) {
		this.user_age = user_age;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public User(int user_id, String user_age, String user_name) {
		super();
		this.user_id = user_id;
		this.user_age = user_age;
		this.user_name = user_name;
	}
	
	
}
