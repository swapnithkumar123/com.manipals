package com.Patient;

/*import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import comm.dao.DataBaseConnection;



@WebServlet("/PatientValidate")
public class PatientValidate extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Connection con=null;
	
		try{
			Class.forName("oracle:jdbc:Driver:OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:XE:1521","system","system");
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			int no=Integer.parseInt(request.getParameter("no"));
			String mail=request.getParameter("mail");
		String sql="insert into patientlogin values(?,?,?,?)";
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1, name);
		st.setString(2,password);
		st.setInt(3, no);
		st.setString(4, mail);
	    int rst=st.executeUpdate();
	    System.out.println("inserted into patientLogin table");
	    con.commit();
	    st.close();
	    con.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		try
		{
			if(con!=null)
			{
				con.close();
			}
			
		}
			catch(Exception e)

		{
				
				System.out.println(e);
		}}
	    
		
		
	
		
	}
}*/


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/patientValidate")
public class PatientValidate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        String pname = request.getParameter("name");
	       String pno = (request.getParameter("no"));
	        String pmail=request.getParameter("mail");
	        String pass=request.getParameter("password");
	       
	        String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
		      String DB_URL= "jdbc:oracle:thin:@localhost:1521:XE";
		      String user="system";
		      String password="system";
		      Statement stmt = null;
		      Connection conn = null;
		      response.setContentType("text/html");
		      PrintWriter p = response.getWriter();
		      String title = "Database Result";
		      try {
		          
		          Class.forName("oracle.jdbc.driver.OracleDriver");

		          
		          conn = DriverManager.getConnection(DB_URL, user, password);

		          
		          stmt = conn.createStatement();
		          String sql= "insert into registration values(?,?,?,?)";
		          PreparedStatement pst = 
		       	  conn.prepareStatement(sql);
		          pst.setString(1, pname);
		          pst.setString(2,pno);
		          pst.setString(3, pmail);
		          pst.setString(4, pass);
		          
		          int n=pst.executeUpdate();
		          out.println("Patient details updated");
		          
		        out.println("<a href='patientlogin.jsp'><h2>Login From Here</h2></a><br/><br/></br>");
		        // out.println("<a href='Adminwelcome.jsp'>Back to Admin Home Page</a>");
		         
	     
	     out.println("</body></html>");
	   
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

	        /*if(Validate.checkUser(email, pass))
	        {
	            RequestDispatcher rs = request.getRequestDispatcher("welcome");
	            rs.forward(request, response);
	        }
	        else
	        {
	           out.println("Username or Password incorrect");
	           RequestDispatcher rs = request.getRequestDispatcher("index.html");
	           rs.include(request, response);
	        }
	    }  */
	
	



