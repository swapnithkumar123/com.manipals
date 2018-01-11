package com.patient1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {
	
	
	     public static boolean checkUser(String pname,String password) 
	     {
	      boolean st =false;
	      try{

		 //loading drivers for mysql
	         Class.forName("oracle.jdbc.driver.OracleDriver");

	 	 //creating connection with the database 
	         Connection con=DriverManager.getConnection
	                        ("jdbc:oracle:thin:@localhost:1521:XE", "system","system");
	         PreparedStatement ps =con.prepareStatement
	                             ("select * from registration where pname=? and password=?");
	         ps.setString(1, pname);
	         ps.setString(2, password);
	         ResultSet rs =ps.executeQuery();
	         st = rs.next();
	        
	      }catch(Exception e)
	      {
	          e.printStackTrace();
	      }
	         return st;                 
	  }   
	}


