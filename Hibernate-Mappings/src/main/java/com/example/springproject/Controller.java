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
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private StudentRepo studentRepository;
	
	@Autowired
	private PassportRepo passportRepo;
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id){
		 Optional<Student> retreivestudentwithPassport =
				 studentRepository.findById(id);
		 Student student=null;
		 if(retreivestudentwithPassport==null)
			 throw new RuntimeException("not found");
		 student=retreivestudentwithPassport.get();
		return student;
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		 return studentRepository.findAll();
	}
	
	@PostMapping("/students")
	public void saveStudent(@RequestBody Student student) {
		student.setId(0);
		studentRepository.save(student);	
	}
	
	@PutMapping("/students/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable int id) { 
		
		Student s=studentRepository.findById(id).orElseThrow(()-> 
		new RuntimeException("not found"));
		
		s.setName(student.getName());
		
		studentRepository.save(s);
		
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentRepository.deleteById(id);
	}
	 
}
