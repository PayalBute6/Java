/*6. Write a JDBC program to update number_of_students of “BCA Science” to
1000.Create a table Course (Code,name, department,number_of_students). Insert
values in the table.*/

import java.sql.*;
import java.io.*;

public class Q6
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
	  stmt.executeUpdate("Update course set number_of_students=1000 where department='BCA'");

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

