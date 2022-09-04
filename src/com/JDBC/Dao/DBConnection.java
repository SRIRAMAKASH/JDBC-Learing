package com.JDBC.Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String user="root";
	private String password="root";
	private String url="jdbc:mysql://localhost:3306/emp";
	private static Connection con=null;

	public void getConnection() {
		try 
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
			
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Driver not Found");
		}
		catch(SQLException e)
		{
			System.out.println("Connection with Database failed");
		}
	}

}
