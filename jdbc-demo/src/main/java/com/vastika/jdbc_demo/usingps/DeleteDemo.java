package com.vastika.jdbc_demo.usingps;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.jdbc_demo.usingst.DbUtil;

public class DeleteDemo {
	public static final String SQL = "delete from demo_tbl where id=?";

	public static void main(String[] args) {
		try (PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);) {
			ps.setInt(1, 3);
			ps.executeUpdate();
			System.out.println("Data Deleted from the Table!");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
