package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.User;
@Service
public interface UserService {

	public List<User> getAllUsers();

//	User createUser(User user);
//
//	User updateUser(Integer userId, User user);
//
//	void deleteUser(Integer userId);

	
}
