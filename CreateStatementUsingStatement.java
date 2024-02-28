package com.jdbc.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatementUsingStatement {
	public static void main(String[] args) throws SQLException {
		/**Initially, till Java6 it is needed to register the driver using Class.forname() 
		 	or the registerDriver() method before establishing connection with the database. 
		 * But,since Java 1.6, JDBC 4.0 API, there is no need to register the driver explicitly,*/
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","root");
		Statement st=con.createStatement();
		System.out.println(st);
	}
}
