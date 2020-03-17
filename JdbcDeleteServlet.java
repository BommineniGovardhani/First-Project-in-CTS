package com.test;


import java.lang.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class JdbcDeleteServlet extends HttpServlet
{    
       String dbn,dbp,dbco;
       String un,up,uco;
       boolean flag=false;
       public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
       {
          try
           {
               response.setContentType("text/html;charset=UTF-8");
               PrintWriter out = response.getWriter();
               response.setContentType("text/html");  
               un=request.getParameter("uname");
               up=request.getParameter("pwd"); 
               uco=request.getParameter("code"); 
               Class.forName("com.mysql.jdbc.Driver");
		       Connection con=DriverManager.getConnection
		   ("jdbc:mysql://localhost:3306/test","root","Hanuman@456");
		  Statement s=con.createStatement();
              s.execute("select *from jduser4");   
              ResultSet rs=s.getResultSet();   
              
                         s.executeUpdate("delete * from jduser4");
                         flag=true;
                          
                   
             
            if(flag==true)
                  out.println(" user Data deleted successfully");
             else
               out.println(" user data is Not Available");
            s.close();
            con.close(); 
           out.close(); 
       } 
       catch(IOException e)
        { 
           System.out.println(e.getMessage());
        }
        catch(SQLException e)
        { 
           System.out.println(e.getMessage());
        } 
       catch(ClassNotFoundException e)
        { 
           System.out.println(e.getMessage());
        }
    }
}



