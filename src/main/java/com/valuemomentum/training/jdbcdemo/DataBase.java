package com.valuemomentum.training.jdbcdemo;
import java.sql.*;
public class DataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con;
		
		try{  
	 Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Connecting to database...");
	con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/mysqljdbc","root","Vam@1999");
	
	DatabaseMetaData dbmd=con.getMetaData();
	System.out.println("database server name:"+dbmd.getDatabaseProductName());
	System.out.println("database server version:"+dbmd.getDatabaseProductVersion());
	System.out.println("driver server version:"+dbmd.getDriverVersion());
	System.out.println("driver server name:"+dbmd.getDriverName());
	System.out.println("max columns:"+dbmd.getMaxColumnsInTable());
	
	con.close();
		}
	catch(Exception e){ System.out.println(e);}  
	}  
	} 