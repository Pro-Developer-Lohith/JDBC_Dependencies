package com.jdbc.Connection;

public class RegisterTheDriver {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Registered Successfully");
	}
}
