package com.hcl.July28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd", "root", "pass");
		
		Statement st= con.createStatement();
//		
//		st.execute("Insert into emp values(1, 'Dylan', 25)");
//		
//		st.execute("Insert into emp values(2, 'John', 26)");
//		
//		st.execute("Insert into emp values(3, 'Joshua', 27)");
//		
//		st.execute("Insert into emp values(4, 'Rachid', 28)");
//		
//		st.execute("Insert into emp values(5, 'Chris', 29)");
		
		ResultSet rs = st.executeQuery("Select * from emp");
		
		while(rs.next()) {
			System.out.println(rs.getString("name"));
		}
	}

}
