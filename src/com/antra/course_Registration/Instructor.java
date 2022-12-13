package com.antra.course_Registration;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {
	private List<Course> courses=new ArrayList<>();
	String cors;
	public void addCourse(Course c) {
		for(Course cors:courses) {
			if(cors.getPeriod() == c.getPeriod()) {
//				System.out.println("You have another class in that same time");
				throw new IllegalArgumentException(
						"PERIOD IS OPTED BY INSTRUCTOR");
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
