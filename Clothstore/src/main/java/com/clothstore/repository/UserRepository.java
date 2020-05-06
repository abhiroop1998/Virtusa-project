package com.clothstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.clothstore.domain.User;

public interface UserRepository extends CrudRepository<User,Long>{
	User findByUsername(String username);	
	User findByEmail(String email);
}
