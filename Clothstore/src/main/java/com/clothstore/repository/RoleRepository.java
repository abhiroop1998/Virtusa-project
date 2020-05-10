package com.clothstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.clothstore.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
	Role findByname(String name);

}
