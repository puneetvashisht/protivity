package com.ptv.springbootdemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepository extends JpaRepository<Course, Integer>{

	

	List<Course> findByTitle(String title);
	List<Course> findByUser(User user);

}
