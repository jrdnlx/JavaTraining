package com.hcl.AS6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd", "root", "pass");

		Statement st = con.createStatement();

		st.execute("Insert into emp values(1, 'Dylan', 25)");

		st.execute("Insert into emp values(2, 'John', 26)");

		st.execute("Insert into emp values(3, 'Joshua', 27)");

		st.execute("Insert into emp values(4, 'Rachid', 28)");

		st.execute("Insert into emp values(5, 'Chris', 29)");

		PreparedStatement update = con.prepareStatement("update emp set name=? where id=?");
		update.setString(1, "Blaise");
		update.setInt(2, 4);
		int x1 = update.executeUpdate();
		System.out.println(x1 + " record(s) updated");

		PreparedStatement delete = con.prepareStatement("delete from emp where id=?");
		delete.setInt(1, 5);
		int x = delete.executeUpdate();
		System.out.println(x + " record(s) deleted");

		ResultSet rs = st.executeQuery("Select * from emp");

		while (rs.next()) {
			System.out.println(rs.getString("name"));

		}

	}
}