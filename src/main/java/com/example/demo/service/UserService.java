package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.user.Users;

@Service
public class UserService {

	List<Users> list = new ArrayList<>();

	public UserService() {

		list.add(new Users("abc", "abc", "abc@gmail.com"));
		list.add(new Users("xyz", "xyz", "xyzabc@gmail.com"));

	}

	public List<Users> getallusers() {
		return this.list;
	}

	public Users getUser(String username) {

		return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
	}

	public Users addUsers(Users user) {

		this.addUsers(user);
		return user;
	}

}