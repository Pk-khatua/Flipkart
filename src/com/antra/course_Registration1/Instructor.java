package com.antra.course_Registration1;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {
	private List<Course> courses = new ArrayList<>();
	String cors;

	public void instructorfr_cors(Course c) {
		try {
			for (Course cors : courses) {
				if (cors.getPeriod() == c.getPeriod()) {
					throw new IllegalArgumentException("You have already a class in this period");
				}
				courses.add(c);
			}
		} catch (Exception e) {
			System.out.println("You have already a class in this period");
		}
	}

}
