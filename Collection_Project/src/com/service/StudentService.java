package com.service;

import java.util.ArrayList;
import java.util.List;
import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

	StudentDao dao = null;

	public List<Student> getallStudentservice() {
		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();

		return db;

	}

	public List<Student> getallStudentnamestartswith(String ch) {
		List<Student> db1 = new ArrayList<Student>();
		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();
		for (Student s : db) {
			if (s.getName().startsWith(ch)) {
				db1.add(s);
			}
		}
		return db1;
	}

	public List<Student> getallStudentnamesendswith(String e) {

		List<Student> db2 = new ArrayList<Student>();
		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();
		for (Student s1 : db) {
			if (s1.getName().endsWith(e)) {
				db2.add(s1);
			}
		}
		return db2;

	}

	public List<Student> getallStudentcity(String s) {

		List<Student> db2 = new ArrayList<Student>();
		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();
		for (Student s2 : db) {
			if (s2.getCity().endsWith(s)) {
				db2.add(s2);
			}
		}
		return db2;
	}

	public List<Student> getallStudentmarksabove(int m) {

		List<Student> db3 = new ArrayList<Student>();
		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();
		for (Student s3 : db) {
			if (s3.getMarks() > m) {
				db3.add(s3);
			}
		}
		return db3;
	}

	public List<Student> getallStudentmarksbelow(int i) {

		List<Student> db4 = new ArrayList<Student>();
		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();
		for (Student s4 : db) {
			if (s4.getMarks() < i) {
				db4.add(s4);
			}
		}
		return db4;
	}

	public List<Student> getAllStudentbyid(int id) {

		List<Student> db5 = new ArrayList<Student>();
		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();
		for (Student s5 : db) {
			if (s5.getRoll() == id) {
				db5.add(s5);
			}
		}
		return db5;
	}

	public List<Student> getallStudentbyage(int a) {

		List<Student> db6 = new ArrayList<Student>();
		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();
		for (Student s6 : db) {
			if (s6.getAge() == a) {
				db6.add(s6);
			}
		}
		return db6;
	}

	public List<Student> getTotalStudent() {

		List<Student> db7 = new ArrayList<Student>();
		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();
		int total = dao.getAllStudents().size();
		System.out.println("Total no of Students is : " + total);
		return db7;
	}

	public List<Student> updateAStudentage(int a, int newage) {

		List<Student> db8 = new ArrayList<Student>();
		dao = new StudentDao();
		List<Student> db = dao.getAllStudents();
		for (Student student : db) {
			if (student != null) {
				student.setAge(newage);
				System.out.println("Student age updated successfully" + newage);

			}

		}
		return db;
	}

}
