package sample02;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample02Servlet
 */
@WebServlet("/Sample02Servlet")
public class Sample02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private User instance = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(instance == null) {
			try {
			     SecureRandom number = SecureRandom.getInstance("SHA1PRNG");
			     instance = new User(number.nextInt(21));
			    } catch (NoSuchAlgorithmException e) { }
		}
		
		PrintWriter out = response.getWriter();
		out.print("UserCount" + instance.getCount());
	}

}
