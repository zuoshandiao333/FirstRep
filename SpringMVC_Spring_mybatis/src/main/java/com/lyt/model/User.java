package com.lyt.model;

/**  
 * ”√ªß  
 * @author 
 *  
 */   
public class User {
	private int id;
	private String userName;
    private String age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", age=" + age + "]";
	}
	
	public User() {
		super();
		
	}
	public User(int id, String userName, String age) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
	}
	
	
    
	
    
	
}
