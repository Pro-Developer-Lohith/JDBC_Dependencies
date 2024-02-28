package com.jdbc.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataUsingStatement {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root");
		Statement st=con.createStatement();
		st.execute("insert into student(id,name,age) values(101,'Ranga',25)");
		System.out.println("Data Inserted Successfully");
	
	}
}
