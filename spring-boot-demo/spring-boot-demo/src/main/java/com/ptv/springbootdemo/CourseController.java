package com.ptv.springbootdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	CourseRepository courseRepository;
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello from CourseController";
	}
	
	@RequestMapping(path = "/courses", method = RequestMethod.POST)
	public void addCourse(@RequestBody Course course) {
		
//		System.out.println(course);
		courseRepository.save(course);
		
	}
	
	@RequestMapping(path = "/courses/{id}", method = RequestMethod.DELETE)
	public void deleteCourse(@PathVariable("id") int id) {
		System.out.println(id);
		courseRepository.deleteById(id);
		
	}
	
	@RequestMapping("/courses")
	public List<Course> findAllCourses(){
		
//		List<Course> courses = new ArrayList<>();
//		courses.add(new Course("Angular", "Front end framework from google!!"));
//		courses.add(new Course("React", "Front end library from facebook!!"));
		List<Course> courses = courseRepository.findAll();
		return courses;
	}

}
