import java.sql.*;
import java.io.*;

public class records
{
  public static void main(String args[])
  {
    try
    {
 Class.forName("org.postgresql.Driver");
 Connection conn=null ;
 Statement st=null;
 ResultSet rs=null;

       Connection con = DriverManager.getConnection("jdbc:postgresql:java","postgres", "");


 if(con==null)
System.out.println("Connection Failed");
 else
System.out.println("Connection Successfull");

      st=con.createStatement();


rs=st.executeQuery("select * from person");
int count=0;
while(rs.next())
{
count++;
}

System.out.println("The number of records are: "+count);

 
 con.close();
}

catch(ClassNotFoundException ex)
{
System.out.println("Class not found");
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
