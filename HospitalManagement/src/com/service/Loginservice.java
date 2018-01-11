package com.service;
import com.doctor.Doctor;
import java.sql.SQLException;


import com.doctor.DocDaovalidate;

public class Loginservice {
	public boolean validateUser(Doctor docdetails) throws SQLException{
		DocDaovalidate  dao = new DocDaovalidate ();
		 Doctor userDBObj= dao.validateFromDB(docdetails);
		
		if(userDBObj!=null&&docdetails!=null){
		if(docdetails.getUserid().equals(userDBObj.getUserid())&&docdetails.getPassword().equals(userDBObj.getPassword())){
			return true;
			
		}
		
		}
		
		return false;
		

}

}
