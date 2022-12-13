package com.antra.course_Registration3;

import java.util.ArrayList;
import java.util.List;

public class College {
	private List<Student> s=new ArrayList<>();
	private List<Course> c=new ArrayList<>();
	private List<Instructor> i=new ArrayList<>();
	public void addStudent(Student stu) {
		s.add(stu);
	}
	public void addCourse(Course crs) {
		c.add(crs);
	}
	public void addInstructor(Instructor inst) {
		i.add(inst);
	}
	public List<Student> getS() {
		return s;
	}
	public List<Course> getC() {
		return c;
	}
	public List<Instructor> getI() {
		return i;
	}
	@Override
	public String toString() {
		return "College [s=" + s + ", c=" + c + ", i=" + i + "]";
	}
	
	

}
