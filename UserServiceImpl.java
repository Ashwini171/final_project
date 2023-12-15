package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository ur;

	@Override
	public List<User> getAllUsers(){
		return  ur.findAll();
	}

	

//	@Override
//	public User createUser(User user) {
//		return ur.save(user);
//	}
//
//	@Override
//	public User updateUser(Integer userId, User user) {
//		  if (ur.existsById(userId)) {
//		        // Set the user id to the provided userId
//		        user.setId(userId);
//
//		        // Save the updated user using the JpaRepository's save method
//		        User updatedUser = ur.save(user);
//
//		        // Return the updated user
//		        return updatedUser;
//		    } else {
//		        // Handle the case where the user with the given userId doesn't exist
//		        // You might want to throw an exception or return null based on your requirements
//		        return null;
//		    }
//	}
//
//	@Override
//	public void deleteUser(Integer userId) {
//		
//		 ur.deleteById(userId);
//	}

	

}
