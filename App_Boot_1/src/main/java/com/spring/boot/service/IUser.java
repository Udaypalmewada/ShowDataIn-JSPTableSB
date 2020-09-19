package com.spring.boot.service;

import com.spring.boot.domain.User;

public interface IUser {
	public int ragistor(User user);
public int logIn(int id,String email);
public int forgetPwsByMobile(int id);
public int forgetPwsByEmail(String mail);
}
