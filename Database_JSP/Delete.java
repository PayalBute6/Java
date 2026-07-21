import java.sql.*;
import java.io.*;

public class Delete
{
  public static void main(String args[])
  {
    try
    {
	  Class.forName("org.postgresql.Driver");
	  Connection conn=null ; 
	  Statement stmt=null; 

       Connection con = DriverManager.getConnection("jdbc:postgresql:java","postgres", "");


	  if(con==null)
		System.out.println("Connection Failed");
	  else
		System.out.println("Connection Successfull");
	
      stmt=con.createStatement();
	  stmt.executeUpdate("delete from Person where name='Sakshi'");

	  stmt.close();
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

