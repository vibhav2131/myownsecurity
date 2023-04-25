package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.example.demo.user.Users;

@RestController
@RequestMapping("/User")
public class Controller {

	@Autowired
	public UserService userService;

	@GetMapping("/")
	public List<Users> getallUsers() {
		List<Users> getallusers = userService.getallusers();
		return getallusers;
	}

	@GetMapping("/{username}")
	public Users getUsers(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}

	@PostMapping("/")
	public Users addUsers(@RequestBody Users user) {
		return userService.addUsers(user);
	}

}