package practice;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/add")
public class ReqResp extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(req.getParameter("value1"));
		int b = Integer.parseInt(req.getParameter("value2"));
		int sum = a + b;
		res.getWriter().print("The sum is "+sum);
		
	}

}
