package com.vastika.jdbc_demo.usingst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreateDemo {

	public static final String URL = "jdbc:mysql://localhost:3306/demo_db";
	// public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root1234";
	public static final String SQL = "create table demo_tbl(id int not null auto_increment, demo_name varchar(50),primary key(id)) ";

	public static void main(String[] args) {
		try (Connection con = DbUtil.getConnection(); Statement st = con.createStatement();

		) {
			st.executeUpdate(SQL);
			System.out.println("Table created!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
