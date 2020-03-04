import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jdbc1
 */
@WebServlet("/Jdbc")
public class Jdbc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jdbc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter pw = response.getWriter();
		 pw.println("<h1 align=center>Viewing "
		    		+ "the Records</h1>");
		  pw.println("<hr color=red>");
		  pw.println("<table border=6 bgcolor=pink "
		  		+ "align=center bordercolor=red>"
		  		+ "<tr><th>Eno</th><th>EmpName</th>"
		  		+ "<th>Salary</th></tr>");
		  try
	 	  {
	 		  Class.forName("com.mysql.jdbc.Driver");
	 Connection con=DriverManager.getConnection
	("jdbc:mysql://localhost:3306/test","root","Hanuman@456");
	 	     Statement s = con.createStatement();
	 ResultSet rs=s.executeQuery("select * from emp2");
	   while(rs.next())
 	    {
 	    pw.println("<tr>");
 	    pw.println("<td>"+rs.getString(1));
 	    pw.println("<td>"+rs.getString(2));
 	    pw.println("<td>"+rs.getString(3)); 	  
 	    pw.println("</tr>"); 	 	
 	    }
	  pw.println("</table>");
 	    rs.close();
 	    s.close();
 	    con.close(); 	 	 

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
		doGet(request, response);
	}

}