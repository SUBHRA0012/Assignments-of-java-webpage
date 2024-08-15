package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class promy extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		String o=req.getParameter("op");
		int k=i+j;
		int mul=i*j;
		int subs=i-j;
		int dev=i/j;
		//System.out.println("The result is: "+k);
		PrintWriter out=res.getWriter();
		if (o.equals("+")) {
			out.println("The result is: "+k);
		}
		else if (o.equals("-")) {
			out.println("The result is: "+subs);
		}
		else if (o.equals("*")) {
			out.println("The result is: "+mul);
		}
		else if (o.equals("/")) {
			out.println("The result is: "+dev);
		}
		
		
	}

}
