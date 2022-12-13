package com.antra.course_Registration1;

import java.util.ArrayList;
import java.util.List;

public class Course {
	int period;
	int max_Student;
	private List<Student> students=new ArrayList<>();
	public Course(int period,int max_Student) {
		this.period=period;
		this.max_Student=max_Student;
	}
	public void addStudent(Student s) {
		try {
		if(students.size()>=max_Student) {
			throw new IllegalArgumentException("MAXIMUM STUDENT EXCEED");
		}
		students.add(s);
		}
		catch(Exception e) {
			System.out.println("MAXIMUM STUDENT EXCEED");
		}
	}
	public int getPeriod() {
		return period;
	}

}
