package com.project.socialnet.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.project.socialnet.bean.User;

@Service("userService")
public class UserService {

	@Autowired
	MongoTemplate mongoTemplate;
	final String COLLECTION="users";
	public User addUser(User user)
	{
		mongoTemplate.insert(user, COLLECTION);
		return user;
	}
	public User getUser(String username, String password)
	{
		Query query= new Query();
		
		query.addCriteria(Criteria.where("FirstName").is(username));
		System.out.println("in getuser");
		query.addCriteria(Criteria.where("Password").is(password));
		User user =mongoTemplate.findOne(query, User.class, COLLECTION);
		System.out.println(user.toString());
		return user;
	}
}
