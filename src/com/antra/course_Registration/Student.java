package com.antra.course_Registration;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
	private List<Course> courses=new ArrayList<>();
	String cors;
	public void RegisterCourse(Course c) {
		for(Course cors:courses) {
			if(cors.getPeriod()==c.getPeriod()) {
//				System.out.println("you have already a class in that time");
				throw new IllegalArgumentException("PERIOD IS OPTED BY STUDENT");
			}
			courses.add(c);
		}
		cors=courses.toString();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getId()+getName()+cors;
	}

}
