package controller;

import java.util.List;

import com.entity.Student;
import com.service.StudentService;

public class StudentController {

	StudentService service = null;

	public List<Student> getAllStudentscontroller() {

		service = new StudentService();

		List<Student> db = service.getallStudentservice();

		return db;

	}

	public List<Student> getAllStudentsnamestartswith(String ch) {

		service = new StudentService();

		List<Student> db = service.getallStudentnamestartswith(ch);

		return db;

	}

	public List<Student> getAllStudentnamesendswith(String e) {

		service = new StudentService();

		List<Student> db = service.getallStudentnamesendswith(e);

		return db;
	}

	public List<Student> getAllStudentcity(String s) {

		service = new StudentService();

		List<Student> db = service.getallStudentcity(s);

		return db;
	}

	public List<Student> getAllStudentmarksabove(int m) {

		service = new StudentService();

		List<Student> db = service.getallStudentmarksabove(m);

		return db;
	}

	public List<Student> getAllStudentmarksbelow(int i) {

		service = new StudentService();

		List<Student> db = service.getallStudentmarksbelow(i);

		return db;

	}

	public List<Student> getAllStudentbyid(int id) {
		service = new StudentService();

		List<Student> db = service.getAllStudentbyid(id);

		return db;
	}

	public List<Student> getAllStudentbyage(int a) {
		service = new StudentService();

		List<Student> db = service.getallStudentbyage(a);

		return db;
	}

	public List<Student> getTotalStudent() {
		service = new StudentService();

		List<Student> db = service.getTotalStudent();

		return db;
	}

}
