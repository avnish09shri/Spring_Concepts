package com.example.springproject.service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springproject.CourseRepo;
import com.example.springproject.CourseService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CourseServiceTest {

	@Mock
	private CourseRepo courseRepo;
	
	private CourseService courseService;
	
	@BeforeEach
	void setUp() {
		this.courseService=new CourseService(this.courseRepo);
	}
	
	@Test
	void getAll() {
		
		courseService.getAll();
		verify(courseRepo).findAll();
		
	}
	
	/*
	 * @Test void getOne() { courseService.getOne(14);
	 * verify(courseRepo).getById(14); }
	 */
}
