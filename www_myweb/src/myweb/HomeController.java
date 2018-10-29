package myweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ViewName ="/WEB-INF/views/Home.jsp";
		
		req.setAttribute("message", "Hello Web Application");
		
		RequestDispatcher view = req.getRequestDispatcher(ViewName);
		view.forward(req, resp);
	}
}
