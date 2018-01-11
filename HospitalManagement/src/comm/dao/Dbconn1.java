package comm.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dbconn1")
public class Dbconn1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String no=request.getParameter("no");
		String mail=request.getParameter("mail");
		String pass=request.getParameter("password");
		String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	      String DB_URL= "jdbc:oracle:thin:@localhost:1521:XE";
	      String user="system";
	      String password="system";
	      Statement stmt = null;
	      Connection conn = null;
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      String title = "Database Result";
	      try {
	          
	          Class.forName("oracle.jdbc.driver.OracleDriver");

	          
	          conn = DriverManager.getConnection(DB_URL, user, password);

	          
	          stmt = conn.createStatement();
	          String sql;
	          sql = "insert into patientlogin values(?,?,?,?)";
	          PreparedStatement pst = 
	       	  conn.prepareStatement(sql);
	          pst.setString(1, name);
	          pst.setString(2,no);
	          pst.setString(3,mail);
	          pst.setString(4, pass);
	          int n=pst.executeUpdate();
	          out.println("data base created");
	         
     
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
