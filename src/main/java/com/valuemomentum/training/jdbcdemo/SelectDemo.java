

package com.valuemomentum.training.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection con;
	      Statement stmt;
	      ResultSet rs;              //virtual table
	      try
	      {
	    	  
	    	 // Class.forName("com.mysql.jdbc.Driver");
	    	  
	    	  //step 2: Open a connection
	    	  
	    	        System.out.println( "Connecting to database.." );
	    	        
	    	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","Vam@1999");
	    	        // step 3: creating statement object using connection object 
	    	         stmt=con.createStatement();
	    	        // step 4: Execute a query
	    	        rs=stmt.executeQuery("Select * from candidates");
	    	        //  step 5:  Extract data from result set
	    	        
	    	        while(rs.next())
	    	        	 {
	    	        	       System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString("dob")+" "+rs.getString(5)+" "+rs.getString("email") );
	    	        	 }
	    	        rs.close();
   	        	 	stmt.close();
   	        	 	con.close();
   	        	 
   	        }
     catch(Exception e)  
     {
   	   System.out.println(e);
     }
     }
}