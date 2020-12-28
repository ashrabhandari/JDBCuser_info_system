package com.vastika.jdbc_demo.usingst;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

	public static final String SQL = "update demo_tbl set demo_name = 'test3' where id = 3 ";

	public static void main(String[] args) {
		try (Connection con = DbUtil.getConnection(); Statement st = con.createStatement();

		) {
			st.executeUpdate(SQL);
			System.out.println("Data Inserted in Table!");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
