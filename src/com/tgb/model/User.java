package com.tgb.model;
/**
 * 
* @ClassName: User 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author panzh
* @date 2017-5-23 上午11:06:29 
*
 */
public class User {

	private int id;
	private String age;
	private String userName;
	private String password;
	
	public User(){
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int id, String age, String userName) {
		super();
		this.id = id;
		this.age = age;
		this.userName = userName;
	}
}
