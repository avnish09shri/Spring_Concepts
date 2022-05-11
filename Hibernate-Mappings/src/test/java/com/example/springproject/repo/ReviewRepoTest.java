package com.example.springproject.repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springproject.CourseRepo;
import com.example.springproject.Review;
import com.example.springproject.ReviewRepo;

@SpringBootTest
public class ReviewRepoTest {

	@Autowired
	private ReviewRepo reviewRepo;
	
	
	
	@Test
	
	void findByCourseId() {
		
		List<Review> findByCourseId = reviewRepo.findByCourseId(10);
		assertThat(findByCourseId).isNotEmpty();
	}
	
	
	
}
