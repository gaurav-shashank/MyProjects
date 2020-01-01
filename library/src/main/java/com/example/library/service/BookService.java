package com.example.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.library.entity.Books;
import com.example.library.rest.SummaryInformation;

@Service
public interface BookService {

	public List<Books> fetchBookDetails();
	public SummaryInformation test();
	
	
}
