package com.zab.question.modle;

public class User {
   private int u_id;
   private String u_name;
   private String u_password;
   
	public User(int u_id, String u_name, String u_password) {
	super();
	this.u_id = u_id;
	this.u_name = u_name;
	this.u_password = u_password;
}

	@Override
public String toString() {
	return "User [u_id=" + u_id + ", u_name=" + u_name + ", u_password="
			+ u_password + "]";
}

	public int getU_id() {
	return u_id;
}

public void setU_id(int u_id) {
	this.u_id = u_id;
}

public String getU_name() {
	return u_name;
}

public void setU_name(String u_name) {
	this.u_name = u_name;
}

public String getU_password() {
	return u_password;
}

public void setU_password(String u_password) {
	this.u_password = u_password;
}

	public User() {
		// TODO Auto-generated constructor stub
	}

}
