package com.ptv;

import org.springframework.stereotype.Component;

@Component
public class CourseRepository {
	
	public void fetchAllCourses() {
		System.out.println("In CourseRepository class -- fetch from DB");
	}

}
