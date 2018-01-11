package com.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Appointment
 */
@WebServlet("/Appointment")
public class Appointment extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("patientid");
		String pid=request.getParameter("docid");
		String location=request.getParameter("location");
		String date=request.getParameter("date");
		String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	      String DB_URL= "jdbc:oracle:thin:@localhost:1521:XE";
	      String user="system";
	      String password="system";
	      Statement stmt = null;
	      Connection conn = null;
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
try {
	          
	          Class.forName("oracle.jdbc.driver.OracleDriver");

	          
	          conn = DriverManager.getConnection(DB_URL, user, password);

	          
	          stmt = conn.createStatement();
	          String sql;
	          sql = "insert into doctor1 values(?,?,?)";
	          PreparedStatement pst = 
	       	  conn.prepareStatement(sql);
	          pst.setString(1, doctorid);
	          pst.setString(2,docname);
	          pst.setString(3, deptname);
	          int n=pst.executeUpdate();
	          out.println("Doctor details updated");
	         out.println("<a href='doctordetails.jsp'><h2>Back to Add Doctor Details</h2></a><br/><br/></br>");
	         out.println("<a href='AdminWelcome.jsp'>Back to Admin Home Page</a>");
	         
     
     out.println("</body></html>");
   
     stmt.close();
     conn.close();
  } catch(SQLException se) {
     
     se.printStackTrace();
  } catch(Exception e) {
     
     e.printStackTrace();
  } finally {
     
     try {
        if(stmt!=null)
           stmt.close();
     } catch(SQLException se2) {
     } 
     try {
        if(conn!=null)
        conn.close();
     } catch(SQLException se) {
        se.printStackTrace();
     } 
  } 
}

}


}
}