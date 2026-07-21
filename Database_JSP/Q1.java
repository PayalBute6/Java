/*1. Write a JDBC program to display all the details of the Person table in proper format
on the screen. Create a Person table with fields as PID, name, gender, birth_year in
PostgreSQL. Insert values in Person table.*/

import java.sql.*;
import java.io.*;

public class Q1
{
  public static void main(String args[])
  {
    try
    {
	  Class.forName("org.postgresql.Driver");
	  Connection conn=null ; 
	  Statement stmt=null; 
	  ResultSet rs=null;

       Connection con = DriverManager.getConnection("jdbc:postgresql:java","postgres", "");


	  if(con==null)
		System.out.println("Connection Failed");
	  else
		System.out.println("Connection Successfull");
	
      stmt=con.createStatement();
	  rs = stmt.executeQuery("SELECT * from Person");

	  while(rs.next())
	  {
		System.out.print("PID = "+rs.getInt(1) + "  ");
		System.out.print("name = "+rs.getString(2) + "  ");
		System.out.print("gender = "+rs.getString(3) +"  ");
		System.out.print("Birth Year = "+rs.getInt(4) + " \n");
	  }
	  
	  con.close();
	}

	catch(ClassNotFoundException ex)
	{
		System.out.println("Class not found"+ex);
	}	
	catch(SQLException ex1)
	{
		System.out.println("SQL Error"+ex1);
		
	}
	catch(Exception ex2)
	{
		System.out.println("Error");
		
	}

  }
}

