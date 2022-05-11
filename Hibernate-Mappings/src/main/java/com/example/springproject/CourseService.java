package com.example.springproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	
	private CourseRepo courseRepo;
	
	public CourseService(CourseRepo courseRepo) {
		this.courseRepo = courseRepo;
	}
	
	public List<Course> getAll(){
		return courseRepo.findAll();
	}
	
	public Course getOne(int id) {
		return courseRepo.getById(id);
	}
}
