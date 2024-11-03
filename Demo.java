package com.exampleDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo {
	
	public static void main(String[] args){
		try{
	         Class.forName("com.mysql.cj.jdbc.Driver");   // register type-4 driver
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","priyanshu@2205");
	         String q1 = "insert into employee(eid, eage,ename) values (?,?,?)";
	         PreparedStatement pst1 = con.prepareStatement(q1);
	         PreparedStatement pst2 = con.prepareStatement(q1);
	         
	         pst1.setInt(1, 101);
	         pst1.setInt(2, 25);
	         pst1.setString(3, "Amar");
	         
	         pst2.setInt(1, 102);
	         pst2.setInt(2, 26);
	         pst2.setString(3, "Varun");
	         
	         
	         pst1.execute();
	         pst2.execute();
	         System.out.println("Rows inserted count");
	         
	         /*for(int i=0;i<3;i++) {
	        	 System.out.println("Enter Employee id, age, name:");
	        	 int eid=s.nextInt();
	        	 int eage=s.nextInt();
	        	 String ename=s.next();
	        	 
	        	 pst.setInt(1, eid);
	        	 pst.setInt(2, eage);
	        	 pst.setString(3, ename);
	        	 
	        	 pst.execute();
	         }*/
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}


}



