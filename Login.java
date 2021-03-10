package com.fujitsu.loginAndRegister.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fujitsu.loginAndRegister.DAO.LoginDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		LoginDao dao=new LoginDao();
		boolean result=dao.verifyUserCredentials(username, password);
		
		if(result)
		{
			System.out.println("Executing if block " + result);
			HttpSession session=request.getSession();
			session.setAttribute("user", username);

			response.sendRedirect("welcome.jsp");
			

		}
		else
		{
			response.sendRedirect("login.jsp");
		}
		
		
		
		
	}

}
