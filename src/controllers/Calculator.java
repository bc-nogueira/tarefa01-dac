package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer operador1 = Integer.parseInt(request.getParameter("operador1"));
		Integer operador2 = Integer.parseInt(request.getParameter("operador2"));
		
		request.setAttribute("resultado", operador1 + operador2);
		
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		
		for(int i = 0; i < cookies.length; i++) {
			if(cookies[i].getName().equals("CONTADOR")) {
				cookie = cookies[i];
				Integer newValue = Integer.parseInt(cookie.getValue()) + 1;
				cookie.setValue(newValue.toString());
			}
		}
		
		if(cookie == null) {
			cookie = new Cookie("CONTADOR", "1");
			cookie.setMaxAge(10);
		}
		
		response.addCookie(cookie);
		response.setContentType("text/html;charset=UTF-8");
        response.sendRedirect("result.jsp");
	}

}
