package com.jdbc.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallingStoredProcedureFromDatabase {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root");
		CallableStatement call=con.prepareCall("{call EMPLOYEE(?,?,?)}");
		call.setInt(1, 102);
		call.setString(2, "guruji");
		call.setInt(3, 25);
		call.execute();
		System.out.println("Successfully calles");
	}
}
