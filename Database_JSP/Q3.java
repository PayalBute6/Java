/*3. Write a JDBC program to display all the countries located in West Region. Create a
table Country in PostgreSQL with fields (Name, continent, Capital,Region). Insert
values in the table.*/


import java.sql.*;
import java.io.*;

public class Q3
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
	  rs = stmt.executeQuery("SELECT * from country where region='west'");

	  while(rs.next())
	  {
		System.out.print("ID = "+rs.getInt(1) + "  ");
		System.out.print("Name = "+rs.getString(2) + "  ");
		System.out.print("Continent = "+rs.getString(3) +"  ");
		System.out.print("Capital = "+rs.getString(4) + "  ");
		System.out.print("Region = "+rs.getString(5) + " \n");
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

