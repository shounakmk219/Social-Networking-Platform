package com.project.socialnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.socialnet.bean.User;
import com.project.socialnet.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/userform",method=RequestMethod.POST, headers = "Accept=application/json")
	public User createUser(@RequestBody User user) {
		return userService.addUser(user);		
	}
	
	@RequestMapping(value="/signin",method=RequestMethod.POST, headers = "Accept=application/json")
	public User signin(@RequestBody User user) {
		return userService.getUser(user.getFirstName(), user.getPassword());		
	}
}
