package com.antra.course_Registration3;

public class Main {
	public static void main(String[] args) {
		College c=new College();
		Instructor i1=new Instructor();
		Instructor i2=new Instructor();
		i1.setId(1);i1.setName("DAMA");
		i2.setId(2);i2.setName("RAMA");
		c.addInstructor(i2);
		c.addInstructor(i1);
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.setId(11);s1.setName("Pankaj");
		c.addStudent(s1);
		s2.setId(12);s2.setName("Pankaj");
		c.addStudent(s2);
		s3.setId(13);s3.setName("Pankaj");
		c.addStudent(s3);
		Course c1=new Course(1,10);
		Course c2=new Course(2,2);
		Course c3=new Course(1,5);
		c.addCourse(c1);
		c.addCourse(c2);
		c.addCourse(c3);
		i1.instructorforcors(c1);
		i1.instructorforcors(c3);
		i2.instructorforcors(c2);
		i2.instructorforcors(c1);
		c2.addStudent(s1);
		c2.addStudent(s2);
		c2.addStudent(s3);
		c1.addStudent(s1);
		c3.addStudent(s1);
	}

}
