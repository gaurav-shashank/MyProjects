package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.library.entity.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer>,JpaSpecificationExecutor<Books> {
	
	

}
