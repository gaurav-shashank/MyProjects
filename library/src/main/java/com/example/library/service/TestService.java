package com.example.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.library.entity.Test;

@Service
public interface TestService {
	public List<Test> useCustomQuery(Test test);

}
