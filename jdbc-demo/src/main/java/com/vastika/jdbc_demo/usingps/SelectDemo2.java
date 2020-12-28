package com.vastika.jdbc_demo.usingps;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vastika.jdbc_demo.usingst.DbUtil;

public class SelectDemo2 {
	// public static final String SQL = "select * from demo_tbl where id=?";
	public static final String SQL = "select * from demo_tbl where id=? and demo_name=?";

	public static void main(String[] args) {
		try (PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);

		) {
			ps.setInt(1, 2);
			ps.setString(2, "demo1");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("demo_name"));
				System.out.println(rs.getInt("age"));
				System.out.println(rs.getLong("mobile_no"));
				System.out.println(rs.getDate("dob"));
				System.out.println("-----------------------------------------");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
