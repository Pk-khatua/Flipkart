package com.antra.course_Registration1;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
	private List<Course> courses = new ArrayList<>();
	String cors;

	public void addCourse(Course c) {
		try {
			for (Course cors : courses) {
				if (cors.getPeriod() == c.getPeriod()) {
					throw new IllegalArgumentException("This period already obtained by another class");
				}
				courses.add(c);
			}
		} catch (Exception e) {
			System.out.println("This period already obtained by another class");
		}
	}

}
