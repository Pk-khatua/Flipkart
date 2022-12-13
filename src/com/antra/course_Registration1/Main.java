package com.antra.course_Registration1;

public class Main {
	public static void main(String[] args) {
		College c=new College();
		Student s1=new Student();
		s1.setId(1);s1.setName("xyz");
		c.add_Student(s1);
		Student s2=new Student();
		s2.setId(2);s2.setName("yzx");
		c.add_Student(s2);
		Student s3=new Student();
		s3.setId(3);s3.setName("zyx");
		c.add_Student(s3);
		Instructor i1=new Instructor();
		i1.setId(11);i1.setName("abc");
		c.add_Instructor(i1);
		Instructor i2=new Instructor();
		i2.setId(12);i2.setName("cba");
		c.add_Instructor(i2);
		Course c1=new Course(1, 10);
		c.add_Course(c1);
		Course c2=new Course(2, 2);
		c.add_Course(c2);
		Course c3=new Course(1, 5);
		c.add_Course(c3);
		i1.instructorfr_cors(c1);
		i1.instructorfr_cors(c3);
		i2.instructorfr_cors(c2);
		i2.instructorfr_cors(c1);
		c2.addStudent(s1);
		c2.addStudent(s2);
		c2.addStudent(s3);
		c1.addStudent(s1);
		c3.addStudent(s1);
		System.out.println(c);
	}
}
