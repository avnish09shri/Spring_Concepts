package com.example.springproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMappingsApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;
	
	//@Autowired
	//private StudentRepository2 studentRepository2;
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateMappingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//studentRepository.studentsavewithPassport();
		//studentRepository.retreivestudentwithPassport();
		
		//studentRepository.retreivestudentwithPassport();
		
		/*
		 * System.out.println("All Details"); List<Student> findAll =
		 * studentRepository2.findAll(); for(Student stu:findAll) {
		 * System.out.println(stu.getId()+" "+stu.getName());
		 * 
		 * }
		 */
	}

	
	
}
