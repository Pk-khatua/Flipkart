package com.antra.course_Registration2;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private int period;
	private int max_student;
	private List<Student> stu=new ArrayList<>();
	public int getPeriod() {
		return period;
	}
	public Course(int period,int max_student) {
		this.period=period;
		this.max_student=max_student;
	}
	public void addStudent(Student s) {
		try {
		if(stu.size()>=max_student) {
			throw new IllegalArgumentException("Max size exceed");
		}
		stu.add(s);
		}
		catch(Exception e) {
			System.out.println("Max size exceed");
		}
	}
	@Override
	public String toString() {
		return "Course [period=" + period + ", max_student=" + max_student + ", stu=" + stu + "]";
	}
}
