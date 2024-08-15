package assign_10; 
import java.io.IOException; 
import java.io.PrintWriter; 
import javax.servlet.annotation.*; 
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
@WebServlet("/RegisterServlet") 
public class tenJQ extends HttpServlet { 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		response.setContentType("text/html");
		PrintWriter out=response.getWriter(); 
		String firstName = request.getParameter("fname"); 
		String middleName = request.getParameter("mname"); 
		String lastName = request.getParameter("lname"); 
		String login = request.getParameter("name"); 
		String password = request.getParameter("passwd"); 
		String ConfirmPassword = request.getParameter("cpasswd"); 
		StringBuilder st = new StringBuilder(); 
		if (!firstName.matches("[A-Za-z]+")) { 
			st.append("First Name should contain only alphabets.<br/>"); 
		} 
		if (!lastName.matches("[A-Za-z]+")) { 
			st.append("Last Name should contain only alphabets.<br/>"); 
		} 
		if (middleName != null && !middleName.matches("[A-Za-z]*")) {
			st.append("Middle Name should contain only alphabets.<br/>"); 
		} 
		if(login==null) { 
			st.append("desired login is required.<br>"); 
		} 
		if (password.length() < 6 || !password.matches(".*[A-Za-z].*") || !password.matches(".*[0-9].*") || !password.matches(".*[^A-Za-z0-9].*")) { 
			st.append("Password should contain at least 6 characters and contain alphabets, a number, and a special character.<br/>"); 
		} 
		if (!password.equals(ConfirmPassword)) { 
			st.append("Passwords do not match.<br/>"); 
		} 
		if (st.length() > 0) { 
			response.setContentType("text/html"); 
			response.getWriter().println("<html><body>" + st.toString() + "</body></html>"); 
		} 
		else {
			response.setContentType("text/html"); 
			response.getWriter().println("<html><body>Registration Successful</body></html>"); 
		} 
	} 
}