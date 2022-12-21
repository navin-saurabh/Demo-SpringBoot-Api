package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Courses;


@Service
public class CourseServiceImpl implements CourseService {
	
	
	List<Courses> list;
	
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Courses(1, "Java", "here you will learn about java"));
		list.add(new Courses(2, "SpringBoot", "here you will learn about SpringBoot"));
		list.add(new Courses(3, "MySQL", "here you will learn about MySQL"));
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Courses getCourse(int id) {
		// TODO Auto-generated method stub
		
		Courses courses =null;
		
		for(Courses c : list)
		{
			if(c.getId()==id)
			{
				courses =c;
			    break;
			}
			else {
				
			}
		}
		
		return courses;
	}

	@Override
	public Courses addCourse(Courses courses) {
		// TODO Auto-generated method stub
		Courses courses2 = null;
		
		list.add(courses);
		
		for(Courses c : list)
		{
			if(c.getId()==courses.getId())
			{
				courses2 =c;
			}
		}
		
		return courses2;
	}

	@Override
	public String deleteCourse(int courseId) {
		String message =null;
		
		for(Courses c :list)
		{
			if(c.getId()==courseId)
			{
				list.remove(courseId);
				message ="successfully deleted the course";
				break;
			}
		}
		
		return message;
	}

}
