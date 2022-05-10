package com.example.springproject.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {

	@Id
	private int id;
	
	private String name;
	
	private String mobileno;

	public Student(int id, String name, String mobileno) {
		this.id=id;
		this.name = name;
		this.mobileno = mobileno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileno=" + mobileno + "]";
	}
	
	
}
