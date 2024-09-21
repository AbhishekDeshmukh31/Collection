package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Student;

public class StudentDao {

	public List<Student> getAllStudents() {

		List<Student> db = new ArrayList<Student>();

		db.add(new Student("Jay", 1, 60, "Pune", 20));
		db.add(new Student("Parag", 5, 80, "Nashik", 21));
		db.add(new Student("Shubham", 2, 71, "Nagar", 22));
		db.add(new Student("Abhishek", 4, 88, "Satara", 23));
		db.add(new Student("Rohit", 3, 55, "Nagar", 24));
		db.add(new Student("Shankar", 6, 90, "C.SambhajiNagar", 22));
		return db;

	}

}
