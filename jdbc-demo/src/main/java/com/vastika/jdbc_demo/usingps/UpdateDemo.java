package com.vastika.jdbc_demo.usingps;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.vastika.jdbc_demo.usingst.DbUtil;

public class UpdateDemo {

	public static final String SQL = "update demo_tbl set demo_name= ?,age= ?,mobile_no=?,dob=? where id=?";

	public static void main(String[] args) {
		try (PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);) {
			ps.setString(1, "Hello demo1");
			ps.setInt(2, 33);
			ps.setLong(3, 9999);
			ps.setDate(4, new java.sql.Date(2000, 12, 01));
			ps.setInt(5, 1);

			ps.executeUpdate();
			System.out.println("Data Updated in Table!");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
