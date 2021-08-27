package com.ptv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	public void fetchAllCourses() {
		
		System.out.println("In CourseService class -- fetching all courses");
//		CourseRepository courseRepository = new CourseRepository();
		courseRepository.fetchAllCourses();
	}

}
