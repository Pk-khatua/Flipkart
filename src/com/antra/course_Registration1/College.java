package com.antra.course_Registration1;

import java.util.ArrayList;
import java.util.List;

public class College {
	private List<Course> c=new ArrayList<>();
	private List<Student> s=new ArrayList<>();
	private List<Instructor> I=new ArrayList<>();
	public void add_Course(Course crs) {
		c.add(crs);
	}
	public void add_Student(Student stu) {
		s.add(stu);
	}
	public void add_Instructor(Instructor instr) {
		I.add(instr);
	}
	public List<Course> getC() {
		return c;
	}
	public List<Student> getS() {
		return s;
	}
	public List<Instructor> getI() {
		return I;
	}
	public String toString() {
		return "College [courses=" + c + ", instructors=" + I + ", students=" + s + "]";
	}

}
