package com.hcl.July28;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEx3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd", "root", "pass");
		
		CallableStatement call = con.prepareCall("call insertEmp(?, ?, ?)");
		
		call.setInt(1, 7);
		call.setString(2, "Ajay");
		call.setInt(3, 10);
		
		call.execute();
		
		System.out.println("Execute");
	}

}
