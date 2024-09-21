package com.entity;

public class Student {

	private String name;
	private int roll;
	private int marks;
	private String city;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int roll, int marks, String city, int age) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [Name = " + name + ", roll = " + roll + ", marks = " + marks + ", city = " + city + ", age = "
				+ age + " ]";
	}

}