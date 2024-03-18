/*4. Write a JDBC program to insert the records into the table Employee(ID,name,salary)
using PreparedStatement interface. Accept details of Employees from user.*/

import java.sql.*;
import java.io.*;

public class Q4 {
    public static void main(String args[]) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = null;

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java", "postgres", "");
            String sql = "INSERT INTO emp(id, name, salary) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Enter id:");
                int id = Integer.parseInt(br.readLine());
                System.out.println("Enter name:");
                String name = br.readLine();
                System.out.println("Enter salary:");
                float salary = Float.parseFloat(br.readLine());

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setFloat(3, salary);

                int i = ps.executeUpdate();
                System.out.println(i + " records updated");

                System.out.print("Do you want to continue (y/n): ");
                String s = br.readLine();
                if (s.startsWith("n")) {
                    break;
                }
            }

            con.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found" + ex);
        } catch (SQLException ex1) {
            System.out.println("SQL Error" + ex1);

        } catch (Exception ex2) {
            System.out.println("Error" + ex2);

        }
    }
}
