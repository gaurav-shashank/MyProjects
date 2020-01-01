package com.example.library.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.library.entity.Books;
import com.example.library.repository.BooksRepository;
import com.example.library.rest.Summary;
import com.example.library.rest.SummaryInformation;
import com.example.library.service.BookService;
@Component("comp1")
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BooksRepository repository;

	@Override
	public List<Books> fetchBookDetails() {
		// TODO Auto-generated method stub
		List<Books> response = new ArrayList<Books>();
		Iterable<Books> bookList = repository.findAll();
		for(Books data : bookList) {
			
			response.add(data);
			
			
		}
		
		return response;
	}

	@Override
	public SummaryInformation test() {
		// TODO Auto-generated method stub
		SummaryInformation response = new SummaryInformation();
		List<Summary> testData = new ArrayList<Summary>();
		
		
		for(int i = 0;i <= 5;i++) {
			Summary summary = new Summary();
			summary.setValue1(2.0+i);
			summary.setValue2(5.0d+i);
			testData.add(summary);
		}
		response.setSummaryList(testData);
		return response;
	}

}
