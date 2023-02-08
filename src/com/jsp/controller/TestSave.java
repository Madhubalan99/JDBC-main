package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student =new Student();
		student.setId(4);
		student.setName("madhubalan");
		student.setEmail("madhubalan@gamil.com");
		 StudentDao studentDao = new StudentDao();
		 Student s1=studentDao.saveStudent(student);
		 System.out.println(s1.getId()+"has been added");
		 
		 

	}

}
