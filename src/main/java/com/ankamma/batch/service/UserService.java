package com.ankamma.batch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankamma.batch.model.User;
import com.ankamma.batch.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired 
	UserRepository userRepository;
	
	
	public void save(User user) {
		
		userRepository.save(user);
		
		
		
		
	}
	
	

}
