package assign_7; 
import java.io.IOException; 
import java.io.PrintWriter;
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

@WebServlet("/") 
public class sevenJQ extends HttpServlet { 
	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
		res.setIntHeader("refresh", 1); 
		res.setContentType("text/html"); 
		PrintWriter out=res.getWriter(); 
		java.util.Date date=new java.util.Date(); 
		out.println("<html><body>"); 
		out.println("<h1>Current Date and Time</h1>"); 
		out.println("<p>The current date and time is: " + date + "</p>"); 
		out.println("</body></html>"); 
		} 
	}