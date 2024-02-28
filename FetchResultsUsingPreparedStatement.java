package com.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchResultsUsingPreparedStatement {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root");
		PreparedStatement ps=con.prepareStatement("select * from user");
		ResultSet rs=ps.executeQuery();
		rs.next();
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
	}
}
