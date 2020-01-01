package com.example.library.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.library.entity.Books;
import com.example.library.rest.SummaryInformation;
import com.example.library.service.BookService;
@Component("comp2")
public class BookImpl implements BookService {

	@Override
	public List<Books> fetchBookDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SummaryInformation test() {
		// TODO Auto-generated method stub
		return null;
	}

}
