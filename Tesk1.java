package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tesk1
 */
public class Tesk1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tesk1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		//Connection cons;
		 pw.println("<h1 align=center>Viewing "
		    		+ "the Records</h1>");
		  pw.println("<hr color=blue>");
		  pw.println("<table border=2 bgcolor=yellow "
		  		+ "align=center bordercolor=pink>"
		  		+ "<tr><th>Name</th><th>Dept</th></tr>");
		try{
		ServletContext con1 = getServletContext();
		String url=con1.getInitParameter("url");
		String user=con1.getInitParameter("user");
		String pwd=con1.getInitParameter("password");
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection cons=DriverManager.getConnection(url,user,pwd);
		  Statement s = cons.createStatement();
			 ResultSet rs=s.executeQuery("select * from student1");
			   while(rs.next())
		 	    {
		 	    pw.println("<tr>");
		 	    pw.println("<td>" +rs.getString(1));
		 	    pw.println("\n");
		 	    pw.println("<td>" +rs.getString(2));	  
		 	    pw.println("</tr>"); 	 	
		 	    }
			  pw.println("</table>");
		 	    rs.close();
		 	    s.close();
		 	    cons.close(); 	 	 

	}
		 catch(Exception e)
        {
            pw.println(e);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
