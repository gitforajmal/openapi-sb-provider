package com.learning.openapiprovider.controller;

import org.springframework.http.ResponseEntity;

import com.learning.openapiprovider.UsersApi;
import com.learning.openapiprovider.model.User;

public class UserController implements UsersApi {
	
	
	public ResponseEntity<User> fetchUser(Integer userId) {
		User u = new User();
		
		return ResponseEntity.ok(u);
	}
}
