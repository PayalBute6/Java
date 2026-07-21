/*5. Write a JDBC program to perform search operation on Person table.
1. Search all the person born in the year 1986.
2. Search all the females born between 2000- 2005.*/

import java.sql.*;
import java.io.*;

public class Q5
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
        System.out.println("All the person born in the year 1986.");
	  rs = stmt.executeQuery("SELECT * from Person where birth_year=1986");

	  while(rs.next())
	  {
		System.out.print("PID = "+rs.getInt(1) + "  ");
		System.out.print("name = "+rs.getString(2) + "  ");
		System.out.print("gender = "+rs.getString(3) +"  ");
		System.out.print("Birth Year = "+rs.getInt(4) + " \n");
	  }
	  System.out.println("All the females born between 2000- 2005.");
	  rs = stmt.executeQuery("SELECT * FROM person WHERE birth_year BETWEEN 2000 AND 2005 AND gender = 'Female'");

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

