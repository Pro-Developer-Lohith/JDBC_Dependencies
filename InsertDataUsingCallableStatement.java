package com.jdbc.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertDataUsingCallableStatement {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root");
		CallableStatement cs=con.prepareCall("insert into employee(id,name,age) values(101,'RajaRam',30)");
		cs.execute();
		System.out.println("Inserted successfully");
	}
}
