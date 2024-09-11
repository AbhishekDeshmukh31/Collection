package com.client;

import java.util.List;
import com.entity.Student;
import controller.StudentController;

public class TestStudentController {

	public static void main(String[] args) {

		StudentController sc = new StudentController();

		List<Student> db = sc.getAllStudentscontroller();
		System.err.println("All Students are : ");
		System.out.println(db);

		List<Student> db1 = sc.getAllStudentsnamestartswith("A");
		System.err.println("Students whose name starts with letter :");
		System.out.println(db1);

		System.err.println("Students whose name ends with letter :");
		List<Student> db2 = sc.getAllStudentnamesendswith("t");
		System.out.println(db2);

		List<Student> db3 = sc.getAllStudentcity("k");
		System.err.println("Students city ends with K :");
		System.out.println(db3);

		System.err.println("Students city staart with  :");
		List<Student> db4 = sc.getAllStudentcity("a");
		System.out.println(db4);

		List<Student> db5 = sc.getAllStudentmarksabove(80);
		System.err.println("Students whose marks are above :");
		System.out.println(db5);

		List<Student> db6 = sc.getAllStudentmarksbelow(70);
		System.err.println("Students whose marks are below :");
		System.out.println(db6);

		List<Student> db7 = sc.getAllStudentbyid(3);
		System.err.println("Students whose ID is :");
		System.out.println(db7);

		List<Student> db8 = sc.getAllStudentbyage(22);
		System.err.println("Students whose age is :");
		System.out.println(db8);

		List<Student> db9 = sc.getTotalStudent();
		
		for (Student student : db9) {
			System.err.println("Total Students are :");
			System.out.println(student);
		}


	}

}
