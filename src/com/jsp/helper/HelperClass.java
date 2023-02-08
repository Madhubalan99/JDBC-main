package com.jsp.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username="madhu";
	String password="Madhu123";
	Connection connection=null;
public Connection getConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
try {
	connection=	DriverManager.getConnection(url,username,password);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	return connection;
	
}
}
