package com.jdbc.Retrivequery;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {
	
	public static void main(String[] args) {
		System.out.println("Welcome to JDBC program...");
		
		String url="jdbc:mysql://localhost:3306/STUDENTDETAILS";
		String username="root";
		String password="priyanshu@2205";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try {
			//create connection
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is done...");
				
				//create statement
				Statement st = con.createStatement();
			
			//query
			String query = "select *from Student";
			//result
			
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				String id=rs.getString("Student_Id");
				String name=rs.getString("Student_Name");
				Date date_of_birth = rs.getDate("Date_of_Birth"); 
				String phone_number = rs.getString("Phone_Number");
				System.out.println("Student_Id="+id);
				System.out.println("Student_Name="+name);
				System.out.println("Student Date of birth="+date_of_birth);
				System.out.println("Student phone number"+phone_number);
					
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
