package com.example.springproject;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class StudentRepository {

	@Autowired
	private EntityManager em;
	
	public void studentsavewithPassport(Student student) {
		//Passport passport=new Passport(student.getPassport().toString());
		
		
	}
	
	public Student retreivestudentwithPassport(int id) {
		Student student=em.find(Student.class, id);
		return student;
		//System.out.println(student);
		//System.out.println(student.getPassport());
	}
	
	public void retreivepassportwithStudent() {
		Passport passport=em.find(Passport.class, 101);
		System.out.println(passport);
		System.out.println(passport.getStudent().getName());
	}
}