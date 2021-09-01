package com.ptv.springbootdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ptv.springbootdemo.repos.UserRepository;

@RestController
@RequestMapping("/courses")
@CrossOrigin()
public class CourseController {
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello from CourseController";
	}
	
//	@RequestMapping(path = "/courses", method = RequestMethod.POST)
	@PostMapping("/")
	public ResponseEntity<Course> addCourse(@RequestBody Course course) {
		System.out.println(course);
		boolean userFound = true;
		ResponseEntity<Course> re = new ResponseEntity<>(course, HttpStatus.CREATED);
		if(course.getUser().getId() > 0) {
			Optional<User> foundUser = userRepository.findById(course.getUser().getId());
			if(foundUser.isPresent()) {
				course.setUser(foundUser.get());
			}
			else {
				 re = new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
				 userFound = false;
			}
		}
		if(userFound)
			courseRepository.save(course);
		return re;
		
	}
	
	
	@PutMapping("/")
	public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
//		System.out.println(course);
		courseRepository.save(course);
		ResponseEntity<Course> re = new ResponseEntity<>(course, HttpStatus.OK);
		return re;
		
	}
	
//	@RequestMapping(path = "/courses/{id}", method = RequestMethod.DELETE)
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCourse(@PathVariable("id") int id) {
		System.out.println(id);
		ResponseEntity<Void> re = null;
		try {
			courseRepository.deleteById(id);
			re = new ResponseEntity<>(HttpStatus.OK);
		}
		catch(org.springframework.dao.EmptyResultDataAccessException e) {
			re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return re;
	}
//	@RequestMapping(path = "/courses/{id}", method = RequestMethod.GET)
	@GetMapping("/{id}")
	public ResponseEntity<Course> findCourseById(@PathVariable("id") int id) {
		Optional<Course> foundCourse = courseRepository.findById(id);
		ResponseEntity<Course> re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		if(foundCourse.isPresent()) {
			re = new ResponseEntity<>(foundCourse.get(), HttpStatus.OK);
		}
		return re;
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<List<Course>> findCourseByUserId(@PathVariable("id") int id) {
		List<Course> foundCourses = courseRepository.findByUser(new User(id));
		ResponseEntity<List<Course>> re = new ResponseEntity<>(foundCourses, HttpStatus.NOT_FOUND);
		return re;
	}
	
	
	@GetMapping("")
	public ResponseEntity<List<Course>> findCourseByName(@RequestParam("title") String title) {
		
		System.out.println("Request PAram Value" +title );
		ResponseEntity<List<Course>> re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		List<Course> foundCourses = courseRepository.findByTitle(title);
		if(foundCourses !=null) {
			re = new ResponseEntity<>(foundCourses, HttpStatus.OK);
		}
		return re;
	}
	
	@RequestMapping("/")
	public List<Course> findAllCourses(){
		
//		List<Course> courses = new ArrayList<>();
//		courses.add(new Course("Angular", "Front end framework from google!!"));
//		courses.add(new Course("React", "Front end library from facebook!!"));
		List<Course> courses = courseRepository.findAll();
		return courses;
	}

}
