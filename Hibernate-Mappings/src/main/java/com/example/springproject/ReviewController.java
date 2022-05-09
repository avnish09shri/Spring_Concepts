package com.example.springproject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

	@Autowired
	private ReviewRepo courseRepository;
	
	@Autowired
	private ReviewRepo reviewRepository;
	
	@GetMapping("/reviews/{id}")
	public Review getReview(@PathVariable int id){
		 Optional<Review> retreiveReviewwithPassport =
				reviewRepository.findById(id);
		 Review review=null;
		 if(retreiveReviewwithPassport==null)
			 throw new RuntimeException("not found");
		 review=retreiveReviewwithPassport.get();
		return review;
	}
	
	@GetMapping("/reviews")
	public List<Review> getReviews(){
		 return reviewRepository.findAll();
	}
	
	@PostMapping("/reviews")
	public void saveReview(@RequestBody Review review) {
		review.setId(0);
		reviewRepository.save(review);	
	}
	
	@PutMapping("/reviews/{id}")
	public void updateReview(@RequestBody Review review, @PathVariable int id) { 
		
		Review s=reviewRepository.findById(id).orElseThrow(()-> 
		new RuntimeException("not found"));
		
		s.setRating(review.getRating());
		s.setDescription(review.getDescription());
		
		reviewRepository.save(s);
		
	}
	
	@DeleteMapping("/reviews/{id}")
	public void deleteReview(@PathVariable int id) {
		reviewRepository.deleteById(id);
	}
	 
	@GetMapping("/reviews/filter/{id}")
	public List<Review> findName(@PathVariable int id){
		return reviewRepository.findByCourseId(id);
	}
	
}
