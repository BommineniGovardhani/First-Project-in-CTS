

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample
 */
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		//out.println("<body style='background_color:blue;'>");
		out.println("<body bgcolor='lightpink'>");
		String user=request.getParameter("u1");
		String pass=request.getParameter("p1");
		String gen1=request.getParameter("r1");
		out.println("<h2>Username  :"+user+"        Password  :"+pass+""+"          Gender  :"+gen1);
		String[] lang1=request.getParameterValues("c1");
		out.println("<h2>Language");
		for(int i=0;i<lang1.length;i++)
		{
			out.println(lang1[i]);
		}
		String[] lang2=request.getParameterValues("s1");
		for(int i=0;i<lang2.length;i++)
		{
			out.println("<h2>Qualifiication: "+lang2[i]);
		}
	}

}
