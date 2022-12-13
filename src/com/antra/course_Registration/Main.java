package com.antra.course_Registration;

public class Main {
	public static void main(String[] args) {
		College c = new College();
		Student s1=new Student();
		s1.setId(1); s1.setName("A");
		Student s2=new Student();
		s2.setId(2); s2.setName("B");
		Student s3=new Student();
		s3.setId(3); s3.setName("C");
		Instructor i1=new Instructor();
		i1.setId(11);i1.setName("X");
		Instructor i2=new Instructor();
		i2.setId(12);i2.setName("Z");
		Course c1=new Course(1,10);
		Course c2=new Course(2,2);
		Course c3=new Course(1,5);
		c.addStudent(s1);
		c.addStudent(s2);
		c.addStudent(s3);
		c.addInstructor(i1);
		c.addInstructor(i2);
		c.addCourse(c1);
		c.addCourse(c2);
		c.addCourse(c3);
		i1.addCourse(c1);
		i1.addCourse(c3);
		i2.addCourse(c2);
		i2.addCourse(c1);
		c2.add_Student(s1);
		c2.add_Student(s2);
		c2.add_Student(s3);
		c1.add_Student(s1);
		c3.add_Student(s1);
		System.out.println(c);
	}

}
