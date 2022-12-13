package com.antra.course_Registration2;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {
	private List<Course> lst=new ArrayList<>();
	public void addCourseforInstuctor(Course c) {
		try {
		for(Course crs:lst) {
			if(crs.getPeriod()==c.getPeriod()) 
				throw new IllegalArgumentException("you have a class in this periob");
		}
		lst.add(c);
		}
		catch(Exception e) {
			System.out.println("you have a class in this periob");
		}
	}
	@Override
	public String toString() {
		return "Instructor [lst=" + lst + "]";
	}

}
