package com.vastika.jdbc_demo.usingst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCreateDemo {
	// Make constant
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root1234";
	public static final String SQL = "create database demo_db ";

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;

		try {
			// Step1: Register the Driver
			Class.forName(DRIVER_NAME);

			// Step2: Get connection Object
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			// Step 3: Get Statement object
			st = con.createStatement();

			// Step 4: Execute the Query
			st.executeUpdate(SQL);
			System.out.println("Database created ");

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

				// Step 5: Close the Connection
				con.close();
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
