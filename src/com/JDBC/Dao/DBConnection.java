package com.JDBC.Dao;

public class DBConnection {
	private String driver = "com.mysql.cj.jdbc.Driver";

	public void getConnection() {
		try 
		{
			Class.forName(driver);
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Driver not Found");
		}
	}

}
