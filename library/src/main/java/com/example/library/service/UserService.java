package com.example.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.library.entity.Users;
@Service
public interface UserService {
	
	public List<Users> fetchUserDetails();

}
