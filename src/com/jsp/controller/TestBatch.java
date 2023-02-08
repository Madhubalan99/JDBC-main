package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;
public class TestBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao studentDao2 = new StudentDao(); 
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1= new Student();
		s1.setId(5);
		s1.setName("jenitan");
		s1.setEmail("jenitan@gmail.com");
		
		Student s2= new Student();
		s2.setId(6);
		s2.setName("jenitan");
		s2.setEmail("jenitan@gmail.com");
		
		Student s3= new Student();
		s3.setId(7);
		s3.setName("jenitan");
		s3.setEmail("jenitan@gmail.com");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		studentDao2.addMultipleStudents(al); 
		

	}

}
