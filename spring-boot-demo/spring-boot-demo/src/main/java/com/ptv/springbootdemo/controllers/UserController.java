package com.ptv.springbootdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ptv.springbootdemo.User;
import com.ptv.springbootdemo.models.Response;
import com.ptv.springbootdemo.repos.UserRepository;

@RestController
@RequestMapping("/users")
@CrossOrigin()
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	
//	@RequestMapping(path = "/courses", method = RequestMethod.POST)
	@PostMapping("/")
	public ResponseEntity<User> register(@RequestBody User user) {
//		System.out.println(course);
		userRepository.save(user);
		ResponseEntity<User> re = new ResponseEntity<>(user, HttpStatus.CREATED);
		return re;
		
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<Response> login(@RequestBody User user) {
//		System.out.println(course);
		// 1. find user by email;
		ResponseEntity<Response> re = null;
		User existingUser = userRepository.findByEmail(user.getEmail());
		if(existingUser != null) {
//			2. Compare password
			if(existingUser.getPassword().equals(user.getPassword())) {
//				3. Return successfull response
				Response response = new Response("User authenticated!!", true);
				re = new ResponseEntity<>(response, HttpStatus.OK);
				
			}
			else {
//				4. REturn failure response
				Response response = new Response("User not authenticated!!", false);
				re = new ResponseEntity<>(response, HttpStatus.OK);
			}
		}
		else {
//			4. REturn failure response
			Response response = new Response("User not authenticated!!", false);
			re = new ResponseEntity<>(response, HttpStatus.OK);
		}
	
		return re;
		
	}
	
	@RequestMapping("/")
	public List<User> findAllCourses(){
		List<User> users = userRepository.findAll();
		return users;
	}
	
	
//	@PutMapping("/")
//	public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
////		System.out.println(course);
//		courseRepository.save(course);
//		ResponseEntity<Course> re = new ResponseEntity<>(course, HttpStatus.OK);
//		return re;
//		
//	}
	
//	@RequestMapping(path = "/courses/{id}", method = RequestMethod.DELETE)
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Void> deleteCourse(@PathVariable("id") int id) {
//		System.out.println(id);
//		ResponseEntity<Void> re = null;
//		try {
//			courseRepository.deleteById(id);
//			re = new ResponseEntity<>(HttpStatus.OK);
//		}
//		catch(org.springframework.dao.EmptyResultDataAccessException e) {
//			re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//		return re;
//	}
//	@RequestMapping(path = "/courses/{id}", method = RequestMethod.GET)
//	@GetMapping("/{id}")
//	public ResponseEntity<Course> findCourseById(@PathVariable("id") int id) {
//		Optional<Course> foundCourse = courseRepository.findById(id);
//		ResponseEntity<Course> re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		if(foundCourse.isPresent()) {
//			re = new ResponseEntity<>(foundCourse.get(), HttpStatus.OK);
//		}
//		return re;
//	}
	
//	@GetMapping("")
//	public ResponseEntity<List<Course>> findCourseByName(@RequestParam("title") String title) {
//		
//		System.out.println("Request PAram Value" +title );
//		ResponseEntity<List<Course>> re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		List<Course> foundCourses = courseRepository.findByTitle(title);
//		if(foundCourses !=null) {
//			re = new ResponseEntity<>(foundCourses, HttpStatus.OK);
//		}
//		return re;
//	}
	
	

}
