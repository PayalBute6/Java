<%@page import="java.sql.*"%>

<%
  int prod_id = Integer.parseInt(request.getParameter("id"));
  String prod_name = request.getParameter("nm");
  int qty = Integer.parseInt(request.getParameter("qt"));
  int price = Integer.parseInt(request.getParameter("price"));

  try {
    Class.forName("org.postgresql.Driver");
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jsp", "postgres", "");
    Statement st = con.createStatement();
    String query = "INSERT INTO product VALUES (" + prod_id + ", '" + prod_name + "', " + qty + ", " + price + ")";
    if (st.executeUpdate(query) > 0) {
      out.write("Records inserted");
    } else {
      out.write("insertion failed");
    }
  } catch (Exception e) {
    out.write("Exception : " + e);
  }
%>
