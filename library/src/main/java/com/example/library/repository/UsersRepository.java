package com.example.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.library.entity.Users;
@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {

}
