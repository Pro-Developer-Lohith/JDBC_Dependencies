package com.jdbc.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateStatementUsingCallableStatement {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root");
		CallableStatement cs=con.prepareCall("create table employee(id int,name varchar(20),age int)");
		cs.execute();
		System.out.println("Table successfully created");
	}
}
