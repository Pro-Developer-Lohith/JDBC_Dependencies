package com.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProcessResultsUsingPreparedStatement {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root");
		PreparedStatement ps=con.prepareStatement("insert into user(id,name,age) values(101,'Ramana',25)");
		ps.execute();
		System.out.println("Data Inserted Successfully");
	}
}
