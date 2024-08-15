package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class check extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String i=req.getParameter("id1");
		int j=Integer.parseInt(req.getParameter("pass"));
		
		if (j==1234 && i.equals("subh")) {
			PrintWriter out=res.getWriter();
			out.println("Hello admin");
		}
		else {
			PrintWriter out=res.getWriter();
			out.println("Login faild");
		}
		
		
		
	}

}
