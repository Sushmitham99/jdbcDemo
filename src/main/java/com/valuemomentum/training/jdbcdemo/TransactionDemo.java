package com.valuemomentum.training.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Connecting  to database...");
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","Vam@1999");
		System.out.println("Driver is loaded");
		Statement stmt= con.createStatement();
		con.setAutoCommit(false);
		
		try
		{
			int i1=stmt.executeUpdate("insert into candidate_skills values(50,3)");
			int i2=stmt.executeUpdate("update skills set name= 'Ruby'where id=5");
			int i3=stmt.executeUpdate("delete from candidates where id= 40");
			con.commit();
			System.out.println("Transaction is successful");
		}
		catch(Exception e)
		{
			try
			{
				con.rollback();
		System.out.println("Transaction has failed");
			}
			catch(Exception ex)
			{
				System.out.println("Exception is:"+ex);
			}
		
		
	}  
		stmt.close();
		con.close();
		System.out.println("connection is closed");
}
}
