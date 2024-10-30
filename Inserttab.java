package com.exampleDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Inserttab {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");   // register type-4 driver
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","priyanshu@2205");
	         String q1 = "insert into Salary_Log(employee_id, new_salary) values (?,?)";
	         PreparedStatement pst = con.prepareStatement(q1);
	         
	         pst.setInt(1, 101);
	         pst.setString(2, "Shipra");
	         pst.setDouble(3, 15000000);
	         
	         pst.execute();
	         System.out.println("Rows inserted count");
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
