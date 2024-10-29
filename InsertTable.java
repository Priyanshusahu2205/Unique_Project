package com.jdbc.Retrivequery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","priyanshu@2205");
		if(con!=null) {
			System.out.println("Successfully connected to the database ");
		}
		else {
			System.out.println("Not Connected to the database ");
		}
		
		Statement st=con.createStatement();
		
		st.executeUpdate("DROP TABLE IF EXISTS items");
		
		st.executeUpdate("create table items(id int auto_increment primary key,name varchar(20),quantity int,location varchar(20))");
		st.executeUpdate("insert into items (name,quantity,location)values"+"('refrigerator',20,'raipur'),"+"('ac',25,'bhilai'),"+"('cooler',15,'durg')");
		
		//st.executeUpdate("update items set location='rajnandgaon'where id=3");
		//System.out.println("table updated successfully...");
		
		//st.executeUpdate("delete from items where id=3");
		//System.out.println("data deleted successfully...");
		
		ResultSet rs=st.executeQuery("Select *from items");
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int quantity=rs.getInt("quantity");
			String location=rs.getString("location");
			System.out.println(id+" "+name+" "+quantity+" "+location);
			
		}
		
		rs.close();
		st.close();
		con.close();
	}

}
