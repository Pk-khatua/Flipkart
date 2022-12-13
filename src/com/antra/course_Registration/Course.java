package com.antra.course_Registration;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private int period;
	private int max_student;
	private List<Student> students=new ArrayList<>();
	public Course(int period, int max_student) {
		super();
		this.period = period;
		this.max_student = max_student;
	}
	public int getPeriod() {
		return period;
	}
	public void add_Student(Student s) {
		if(students.size() >= max_student) {
//			System.out.println("Maximun no student added");
//			throw new Exception("Maximum student exceed");
			throw new IllegalArgumentException("MAX STUDENTS EXCCEDED");
		}
		students.add(s);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return period+"+"+max_student;
	}
	
}
