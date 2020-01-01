package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.library.entity.Test;
@Repository

public interface TestRepository extends CrudRepository<Test, Integer>, JpaSpecificationExecutor<Test> {

}
