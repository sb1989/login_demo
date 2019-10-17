package com.demo.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/user_login?useSSL=false&serverTimezone=UTC";
		
		String user = "hbstudent";
		String password = "hbstudent";

		try {
			System.out.println("Connecting to database");
			Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Connected to database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
