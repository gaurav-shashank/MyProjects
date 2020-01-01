/*
 * This is a trial for git
 */

package com.example.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.entity.Test;
import com.example.library.exception.BookNotFoundException;
import com.example.library.repository.BooksRepository;
import com.example.library.service.BookService;
import com.example.library.service.TestService;
import com.example.library.service.UserService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

	@Autowired
	@Qualifier("comp1")
	private BookService bookService;
	@Autowired
	private UserService userService;
	@Autowired
	private TestService testService;
	@Autowired
	private BooksRepository repository;
	
	@GetMapping(value="/userDetails")
	public ResponseEntity<Object> fetchUserDetails(){
		
		return new ResponseEntity<Object>(userService.fetchUserDetails(),HttpStatus.OK);
		
	}
	
	@GetMapping(value="/bookDetails")
	public ResponseEntity<Object> fetchBookDetails(){
		return new ResponseEntity<Object>(bookService.fetchBookDetails(),HttpStatus.OK);
		
	}
	
	@GetMapping(value="/test")
	public ResponseEntity<Object> test(){
		return new ResponseEntity<Object>(bookService.test(),HttpStatus.OK);
		
	}
	@PostMapping(value = "/fetchBook")
	public ResponseEntity<Object> fetchBook(@RequestParam("book") int id ){
		
		return new ResponseEntity<Object>(repository.findById(id).orElseThrow(() -> new BookNotFoundException()),HttpStatus.OK);
		
		/*
		 * if(!repository.findById(id).isPresent()) {
		 * 
		 * throw new BookNotFoundException(); }else { return new
		 * ResponseEntity<Object>(repository.findById(id),HttpStatus.OK); }
		 */
		
	}
	@PostMapping(value="/test/custom")
	public ResponseEntity<Object> testCustom(@RequestBody final Test test){
		return new ResponseEntity<Object>(testService.useCustomQuery(test),HttpStatus.OK);
		
	}
	
	

}
