package assign_9; 
import java.io.IOException; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import java.io.PrintWriter; 

@WebServlet("/") 
public class nineJQ extends HttpServlet { 
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException { 
		res.setIntHeader("refresh", 1); res.setContentType("text/html"); 
		PrintWriter out=res.getWriter(); 
		java.util.Date date=new java.util.Date();
		out.print("<h1>Refresh after every 1 seconds!!</h1>"); 
		out.println("<h2>"+date+"</h2>"); 
		out.println("</body></html>"); 
	} 
}