package com.luv2code.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	String user="springstudent";
	String pass="springstudent";
	String url="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC"; // hib is my database name 
	
	String driver="com.mysql.jdbc.Driver";
	
	try {
		PrintWriter out=response.getWriter();
		Class.forName(driver);
		Connection myconn=DriverManager.getConnection(url,user,pass);
		System.out.println("SUCCESS!!!!");
			myconn.close();
		
	}catch(Exception e)
	{
		e.printStackTrace();
		throw new ServletException(e);
	}
		
	}

}
