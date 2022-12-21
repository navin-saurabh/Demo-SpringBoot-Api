package com.example.demo.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Courses;
import com.example.demo.services.CourseService;

	

@RestController
public class ApiController {
	
	
	@Autowired
	private CourseService courseService;
	
	
	
	@GetMapping("/course")
	public List<Courses> getCourses()
	{
		return this.courseService.getCourses();
	}

	@GetMapping("/course/{courseId}")
	public Courses getCourse(@PathVariable  String courseId)
	{
		return this.courseService.getCourse(Integer.parseInt(courseId));
	}
	
	
	@PostMapping("/course")
	public Courses addCourses(@RequestBody Courses courses)
	{
      return this.courseService.addCourse(courses);		
	}
	
	@DeleteMapping("/course/{courseId}")
	public String deleteCourses(@PathVariable String courseId)
	{
		return this.courseService.deleteCourse(Integer.parseInt(courseId));
	}
}
