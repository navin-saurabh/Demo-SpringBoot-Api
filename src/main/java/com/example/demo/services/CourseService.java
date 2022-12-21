package com.example.demo.services;

import java.util.List;



import com.example.demo.entity.Courses;


public interface CourseService {
	
	public List<Courses> getCourses();
	
	public Courses getCourse(int courseId);

	public Courses addCourse(Courses courses);
	
	public String deleteCourse(int courseId);
	

}
