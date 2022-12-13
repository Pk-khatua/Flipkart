package com.antra.course_Registration3;

import java.util.ArrayList;
import java.util.List;

public class Course {
	int period;
	int max_Student;
	private List<Student> stu=new ArrayList<>();
	public void addStudent(Student s) {
		try {
		if(stu.size()>=max_Student) {
			throw new IllegalArgumentException("max sixe exceeed");
		}
		stu.add(s);
		}
		catch(Exception e) {
			System.out.println("Maximum size exceed");
		}
	}
	public Course(int period,int max_Student) {
		this.max_Student=max_Student;
		this.period=period;
	}
	public int getPeriod() {
		return period;
	}

}
