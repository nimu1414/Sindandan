package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Sindan;
import model.User;

/**
 * Servlet implementation class SindanServlet
 */
@WebServlet("/SindanServlet")
public class SindanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name =request.getParameter("name");
		Sindan sindan = new Sindan();
		String job = sindan.SindanJob();
		String weapon = sindan.SindanWeapon();
		String jobId = sindan.SindanJobId(job);
		String zokusei = sindan.SindanZokusei();
//		System.out.println(job);
//		System.out.println(jobId);
//		System.out.println(weapon);
		User user = new User(name, job , weapon , jobId, zokusei);
		HttpSession session = request.getSession();
		session.setAttribute("loginUser", user);

		//ログイン結果画面にフォワード
				RequestDispatcher dis =
						request.getRequestDispatcher("WEB-INF/jsp/sindankekka.jsp");
				dis.forward(request, response);


	}

}
