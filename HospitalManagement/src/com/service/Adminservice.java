package com.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Admin.Admin1;




public class Adminservice  {
	public boolean Validate(Admin1 admin)throws Exception
	{
		
		if(admin.getUsername().equals("admin")&&admin.getPassword().equals("admin")){
		
				{
			
			return true;
				}
		}
		
		return false;
	}
}
