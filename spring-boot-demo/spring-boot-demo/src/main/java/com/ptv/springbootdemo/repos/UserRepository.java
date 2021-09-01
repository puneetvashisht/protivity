package com.ptv.springbootdemo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ptv.springbootdemo.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);

}
