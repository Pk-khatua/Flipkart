package com.antra.course_Registration3;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {
	private List<Course> lst=new ArrayList<>();
	public void instructorforcors(Course c) {
		try {
		for(Course crs:lst) {
			if(crs.getPeriod()==c.getPeriod())
				throw new IllegalArgumentException();
		}
		lst.add(c);
		}
		catch(Exception e){
			System.out.println("you have already a class in that time");
		}
	}

}
