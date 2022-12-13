package com.antra.course_Registration;

import java.util.ArrayList;
import java.util.List;

public class College {
	private List<Student> s=new ArrayList<>();
	private List<Course> c=new ArrayList<>();
	private List<Instructor> i=new ArrayList<>();
	public void addStudent(Student stud) {
		s.add(stud);
	}
	public void addCourse(Course crs) {
		c.add(crs);
	}
	public void addInstructor(Instructor instr) {
		i.add(instr);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "College [courses=" + c + ", instructors=" + i + ", students=" + s + "]";
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

}
