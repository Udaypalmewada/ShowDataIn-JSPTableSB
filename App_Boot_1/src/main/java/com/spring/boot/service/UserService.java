package com.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.domain.User;

@Service
public class UserService implements IUser {
	

	public int logIn(int id, String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int forgetPwsByMobile(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int forgetPwsByEmail(String mail) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int ragistor(User user) {
		int count = 0;
		if (null != user) {
			count++;
			System.out.println(user.toString() + "saved");
			return count;
		}
		return 0;
		// TODO Auto-generated method stub
	}

	public List<User> ListOfUSer() {

		List<User> userList = new ArrayList<User>();
		userList.add(new User("Ronak", 101, 9893, "R@gmail.com"));
		userList.add(new User("Uday", 102, 9893, "R@gmail.com"));
		userList.add(new User("Roshni", 103, 9893, "R@gmail.com"));
		userList.add(new User("Sushma", 104, 9893, "R@gmail.com"));

		return userList;

	}

}
