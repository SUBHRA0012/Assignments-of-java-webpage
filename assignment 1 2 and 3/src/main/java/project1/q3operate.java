package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/id3")
public class q3operate extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		//res.setContentType("text/html");
		String i=req.getParameter("id3q");
		String j=req.getParameter("passq3");
		PrintWriter out=res.getWriter();
	//	String k="servlet";
		if(j.equals("servlet")) {
			RequestDispatcher rd=req.getRequestDispatcher("welcome"); 
			rd.forward(req, res);
		}
		else {
			out.println("Password is incorrect");
			RequestDispatcher rd=req.getRequestDispatcher("q3.html"); 
			rd.include(req, res);
		}
	}

}
