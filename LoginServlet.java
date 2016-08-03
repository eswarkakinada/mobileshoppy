package E1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
  String str1=request.getParameter("txtname");
  String str2=request.getParameter("txtpass");
   if(str1.equals("Eswar")&&str2.equals("Password"))
   {
	   RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
	   rd.forward(request, response);
   }
   else
   {
  
	   RequestDispatcher rd=request.getRequestDispatcher("signin.html");
	   rd.forward(request, response);
	
	
	}
	}
}
