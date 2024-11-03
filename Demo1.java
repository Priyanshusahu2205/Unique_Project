package com.exampleDemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Demo1 {
	
	public static void main(String[] args) {
        try {
            // Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "priyanshu@2205");

            // Prepare the callable statement to call the stored procedure
            String call = "{CALL insert_student(?, ?, ?)}";
            CallableStatement cst = con.prepareCall(call);

            // Set parameters for the stored procedure
            cst.setString(1, "Shipra"); // name
            cst.setInt(2, 21);           // age
            cst.setString(3, "Bhilai");        // grade

            // Execute the callable statement
            int rowsInserted = cst.executeUpdate();
            System.out.println("Rows inserted in students table: " + rowsInserted);

            // Close the resources
            cst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
