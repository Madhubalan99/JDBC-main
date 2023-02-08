package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.jsp.dto.Student;
import com.jsp.helper.HelperClass;

public class StudentDao {
	HelperClass helperclass = new HelperClass();

	public Student saveStudent(Student student ) {
		Connection connection = helperclass.getConnection();
		String sql = "INSERT INTO student VALUES(?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			preparedStatement.execute();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;

	}

	public List<Student> addMultipleStudents(List<Student> students) {
		Connection connection = helperclass.getConnection();
		String sql = "INSERT INTO student VALUES(?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			for (Student s : students) {
				preparedStatement.setInt(1, s.getId());
				preparedStatement.setString(2, s.getName());
				preparedStatement.setString(3, s.getEmail());
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
			System.out.println("ALL GOOD");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;

	}
}
