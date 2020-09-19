package com.spring.boot.domain;

public class User {
	private String name;
private int userId;
private long number;
private String email;

public User() {
	// TODO Auto-generated constructor stub
}
public User(String name, int userId, long number, String email) {
	super();
	this.name = name;
	this.userId = userId;
	this.number = number;
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", number=" + number + ", email=" + email + "]";
}


}
