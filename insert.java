import java.sql.*;
import java.io.*;

public class insert
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
	  stmt.executeUpdate("insert into Person values (5,'Sakshi','Female','2/6/2002')");

	 stmt.close();
	  
	  con.close();
	}

	catch(ClassNotFoundException ex)
	{
		System.out.println("Class not found"+ex);
	}	
	catch(SQLException ex1)
	{
		System.out.println("SQL Error");
		
	}
	catch(Exception ex2)
	{
		System.out.println("Error");
		
	}

  }
}  

