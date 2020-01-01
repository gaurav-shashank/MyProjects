package com.example.library.entity;



import org.springframework.data.jpa.domain.Specification;

public class BooksSpec {
	
	public Specification<Books> equalToBook(String bookName){
		return (root, query, builder) -> builder.equal(root.get("bookName"), bookName);
		
	}
	
	
	public Specification<Books> equalToBook2(String bookName2){
		return (root, query, builder) ->builder.equal(root.get("bookName"), bookName2);
	}
	
	public Specification<Books> equalToBookID(int bookId){
		return (root, query, builder) ->builder.equal(root.get("bookId"), bookId);
	}

}
