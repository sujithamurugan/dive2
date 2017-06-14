package model;

import java.util.logging.Logger;

public class User {
	private static final Logger LOGGER = Logger.getLogger( User.class.getName() );

	int id;
	String name;
	String username;
	String password;
	int mobileno;
	String emailid;
	boolean active;
	String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", mobileno="
				+ mobileno + ", emailid=" + emailid + ", active=" + active + ", role=" + role + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword()
				+ ", getMobileno()=" + getMobileno() + ", getEmailid()=" + getEmailid() + ", isActive()=" + isActive()
				+ ", getRole()=" + getRole() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
