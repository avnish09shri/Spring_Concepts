package com.example.springproject;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer> {

	List<Review> findByCourseId(int id);
	
	
	
}
