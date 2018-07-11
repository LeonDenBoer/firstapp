package nl.hu.v1.wac.firstapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/DynamicServlet.do")
public class DynamicServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double firstNumber = Double.valueOf(req.getParameter("first_number"));
		double secondNumber = Double.valueOf(req.getParameter("second_number"));
		String symbol = req.getParameter("symbol");
		double answer;
		switch (symbol) {
		case "plus":
			answer = firstNumber + secondNumber;
			break;
		case "minus":
			answer = firstNumber - secondNumber;
			break;
		case "multiply":
			answer = firstNumber * secondNumber;
			break;
		default:
			answer = firstNumber / secondNumber;
			break;
		}
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println(" <title>Dynamic Example</title>");
		out.println(" <body>");
		out.println(" <h2>Calculation</h2>");
		out.println(" <h2>The answer of your calculation is " + answer + ".</h2>");
		out.println(" </body>");
		out.println("</html>");
	}
}