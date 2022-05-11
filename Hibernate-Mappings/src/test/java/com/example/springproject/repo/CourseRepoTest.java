package com.example.springproject.repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springproject.Course;
import com.example.springproject.CourseRepo;
import com.example.springproject.Review;
import com.example.springproject.ReviewRepo;

@SpringBootTest
public class CourseRepoTest {

	
	@Autowired
	private CourseRepo courseRepo;
	

	@Test
	void findCourseById() {
		Course findCourseById = courseRepo.findCourseById(11);
		
		assertThat(findCourseById).isNotNull();
		
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("Tearning down");
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("Setting up");
	}
	
}
