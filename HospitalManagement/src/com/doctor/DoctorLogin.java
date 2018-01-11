package com.doctor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.service.Loginservice;

/**
 * Servlet implementation class DoctorLogin
 */
@WebServlet("/DoctorLogin")
public class DoctorLogin extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid= request.getParameter("userid");
		String password = request.getParameter("password");
	 Doctor docdetails= new Doctor(userid,password);
		Loginservice service = new Loginservice();
	
		try {
			if(service.validateUser(docdetails)){
				RequestDispatcher dispatcher = request.getRequestDispatcher("doctordetails.jsp");
				dispatcher.forward(request, response);
			}
			else{
				request.setAttribute("msg","You are a invalid user");
				RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
				dispatcher.include(request,response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	}


