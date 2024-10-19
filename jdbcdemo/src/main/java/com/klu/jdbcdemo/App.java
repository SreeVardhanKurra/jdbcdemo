package com.klu.jdbcdemo;

import java.sql.*;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	String url = "jdbc:mysql://localhost:3306/klu";
    	String username = "root";
    	 String password = "1997";
    	 
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 
    	 Connection con = DriverManager.getConnection(url, username, password);
    	 
    	 Statement stmt = con.createStatement();
    	 
    	 ResultSet rs = stmt.executeQuery("select * from STUDENT");
    	 while(rs.next())
    	 {
    	System.out.println("Roll No: " + rs.getInt(1));
    	 System.out.println("Name: " + rs.getString(2));
    	 }
    	 con.close();
    	 }

    
}
