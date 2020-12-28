package com.vastika.jdbc_demo.usingst;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
	public static final String URL = "jdbc:mysql://localhost:3306/demo_db";
	// public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root1234";
	public static final String SQL = "insert into demo_tbl(demo_name) values('demo3') ";

	public static void main(String[] args) {
		try (Connection con = DbUtil.getConnection();
				Statement st = con.createStatement();

		) {
			st.executeUpdate(SQL);
			System.out.println("Data Inserted in Table!");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
