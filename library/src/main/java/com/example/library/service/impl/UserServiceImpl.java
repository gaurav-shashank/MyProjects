package com.example.library.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.library.entity.Users;
import com.example.library.repository.UsersRepository;
import com.example.library.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersRepository repository;
	
	@Override
	public List<Users> fetchUserDetails() {
		List<Users> response =StreamSupport.stream(repository.findAll().spliterator(), false) 
	            .collect(Collectors.toList());
		
		return response;
	}

}
