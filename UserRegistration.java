package com.fujitsu.loginAndRegister.controller;

import java.io.IOException;

import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fujitsu.loginAndRegister.DAO.UserRegistrationDao;
import com.fujitsu.loginAndRegister.model.User;

/**
 * Servlet implementation class UserRegistration
 */
@WebServlet("/userRegistration")
public class UserRegistration extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			UserRegistrationDao dao;
			
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			int phone=Integer.parseInt(request.getParameter("phone"));
			String address=request.getParameter("address");
			
			//Generating UserId
			Random random=new Random();
			int userId=random.nextInt(999);
			
			
			User newUser=new User(userId,username,password,phone,address);
			
			//Save user in Database
			dao=new UserRegistrationDao();
			boolean result=dao.registerUser(newUser);
			
			if(result) {
				System.out.println("User Registered Successfully");
			    response.sendRedirect("welcome.jsp");
			}
			
			else {
				System.out.println("Server Error");
			response.sendRedirect("error.jsp");
			}
		
		
		
	}

}
