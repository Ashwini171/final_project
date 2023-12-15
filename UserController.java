package com.controller;
//UserController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.entity.User;
import com.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

 @Autowired
 private UserService userService;

     @GetMapping("/get-all-user")
     public List<User> getAllUsers() {
         return userService.getAllUsers();
     }

     // ...
 }

//
// @GetMapping("/get-user-by-id/{userId}")
// public User getUserById(@PathVariable int userId) {
//     return userService.getUserById(userId);
// }

// @PostMapping("/create-user")
// public User createUser(@RequestBody User user) {
//     return userService.createUser(user);
// }
//
// @PutMapping("/update-user-by-id/{userId}")
// public User updateUser(@PathVariable int userId, @RequestBody User user) {
//     return userService.updateUser(userId, user);
// }
//
// @DeleteMapping("/delete-user-by-id/{userId}")
// public void deleteUser(@PathVariable int userId) {
//     userService.deleteUser(userId);
// }

