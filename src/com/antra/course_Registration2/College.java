package com.antra.course_Registration2;

import java.util.ArrayList;
import java.util.List;

public class College {
	private List<Course> crs=new ArrayList<>();
	private List<Student> stu=new ArrayList<>();
	private List<Instructor> instr=new ArrayList<>();
	public void addCourse(Course c) {
		crs.add(c);
	}
	public void addStudent(Student s) {
		stu.add(s);
	}
	public void addInstructor(Instructor i) {
		instr.add(i);
	}
	public List<Course> getCourse(){
		return crs;
	}
	public List<Student> getStudent(){
		return stu;
	}
	public List<Instructor> getInstructor(){
		return instr;
	}
	@Override
	public String toString() {
		return "College [crs=" + crs + ", stu=" + stu + ", instr=" + instr + "]";
	}
	

}
