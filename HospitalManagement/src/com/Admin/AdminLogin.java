package com.Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.Adminservice;


import java.sql.SQLException;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class AdminLogin extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Admin1 ad=new Admin1(username, password);
		Adminservice adl=new Adminservice();
		try {
			if(adl.Validate(ad))
			{
				
				RequestDispatcher e=request.getRequestDispatcher("doctordetails.jsp");
				e.forward(request, response);
			}
			else
			{
				request.setAttribute("msg","values invalid plse check");
				RequestDispatcher rd=request.getRequestDispatcher("AdminLogin.jsp");
				rd.forward(request,response);	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		