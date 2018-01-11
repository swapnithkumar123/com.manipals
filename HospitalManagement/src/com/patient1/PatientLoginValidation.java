package com.patient1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PatientLoginValidation")
public class PatientLoginValidation extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	            
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        String pname = request.getParameter("pname");
	        String password = request.getParameter("password");
	        
	        if(Validate.checkUser(pname, password))
	        {
	            RequestDispatcher rs = request.getRequestDispatcher("welcome");
	            rs.forward(request, response);
	        }
	        else
	        {
	           out.println("Username or Password incorrect");
	           /*RequestDispatcher rs = request.getRequestDispatcher("index.html");
	           rs.include(request, response);*/
	        }
	    }  
	}


