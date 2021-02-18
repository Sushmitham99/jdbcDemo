//dml operations

package com.valuemomentum.training.jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con ;
        Statement stmt;
        ResultSet rs;
        int cnt=0;
        try {
            // register JDBC driver
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //open a connection 
            System.out.println("Connecting  to database...");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","Vam@1999");
            String str="delete from skills where name='.NET'";                   
            stmt = con.createStatement(); 
            int cn= stmt.executeUpdate(str);
            if(cnt>0) {
                System.out.println("Record Deleted successfully");
            }
            String str1="Select count(id) from skills";
            rs=stmt.executeQuery(str1);
            while(rs.next()) {
            cnt = rs.getInt(1);
            }
            System.out.println("Total no of records is:"+cnt);
            con.close(); 
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
                    }
    }
}