package com.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateStatementUsingPreparedStatement {
	public static void main(String[] args) throws SQLException {
	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root");
		PreparedStatement ps=con.prepareStatement("create table user(id int,name varchar(10),age int)");
		ps.execute();
		System.out.println("Table created Successfully");
	}
	
}
