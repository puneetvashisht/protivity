package com.ptv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCourseService {
	
	public static void main(String[] args) {
		
		// Application context -- contains pre created objects/beans
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		CourseService courseService = context.getBean(CourseService.class);
		courseService.fetchAllCourses();
		
//		CourseService service = new CourseService();
//		service.fetchAllCourses();

	}

}
