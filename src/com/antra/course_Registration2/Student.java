package com.antra.course_Registration2;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
	private List<Course> lst=new ArrayList<>();
	public void registerCourse(Course c) {
		for(Course crs:lst) {
			if(crs.getPeriod()==c.getPeriod())
				throw new IllegalArgumentException("you already obtained that period");
		}
		lst.add(c);
	}
	@Override
	public String toString() {
		return "Student [lst=" + lst + "]";
	}

}
