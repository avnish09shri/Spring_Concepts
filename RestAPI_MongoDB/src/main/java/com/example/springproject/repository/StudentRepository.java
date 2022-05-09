package com.example.springproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springproject.collections.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
