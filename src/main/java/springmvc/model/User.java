package springmvc.model;

public class User {
	
	//the variable's name  should be same as the name of the fields in the form 
	
	private String email;
	private String userName;
	private String password;
	
	public User(String email, String userName, String password) {

		this.email = email;
		this.userName = userName;
		this.password = password;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	

}
