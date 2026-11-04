package com.test;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		
		String number=	request.getParameter("num");
		
		int num1=Integer.parseInt(number);
		
		PrintWriter out=response.getWriter();
		
		if(num1%2==0) {
			out.println("<h1>"+num1+" is Even Number</h1>");
		}else {
			out.println("<h1>"+num1+"is Odd Number</h1>");
		}
		
	}

}
