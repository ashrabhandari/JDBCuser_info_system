package com.vastika.jdbc_demo.usingps;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbc_demo.usingst.DbUtil;

public class InsertDemo {
	public static final String URL = "jdbc:mysql://localhost:3306/demo_db";

	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root1234";
	public static final String SQL = "insert into demo_tbl(demo_name,age,mobile_no,dob) values(?,?,?,?) ";

	public static void main(String[] args) {
		try (PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);) {
			ps.setString(1, "demo2");
			ps.setInt(2, 23);
			ps.setLong(3, 8787);
			ps.setDate(4, new java.sql.Date(2000, 12, 01));

			ps.executeUpdate();
			System.out.println("Data Inserted in Table!");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
