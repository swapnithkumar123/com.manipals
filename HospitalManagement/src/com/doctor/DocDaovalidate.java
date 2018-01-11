package com.doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.doctor.Doctor;
import comm.dao.DataBaseConnection;

public class DocDaovalidate {
Connection con = DataBaseConnection.getDBConnection();
	
	
	public Doctor validateFromDB(Doctor docdetails) throws SQLException{
		
		String sql = "select * from doctor where userid=? and password=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, docdetails.getUserid());
		pst.setString(2, docdetails.getPassword());
		ResultSet rs = pst.executeQuery();
		Doctor docdetails1=null;
		if(rs.next()){
			docdetails1 = new Doctor(rs.getString(1),rs.getString(2));
			
		}
		return docdetails1;
		
	}

}
