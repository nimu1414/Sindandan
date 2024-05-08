package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.Sindan;
import model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name =request.getParameter("name");

		//Userインスタンスの生成
		User user = new User(name);

		//ログイン処理
		LoginLogic loginLogic = new LoginLogic();
		boolean isLogin = loginLogic.execute(user);
		//ログイン成功
		if (isLogin) {
			Sindan sindan = new Sindan();
			sindan.SindanJob();
			String weapon = sindan.SindanWeapon();
			user.setJob(sindan.getJob());
			user.setJobId(sindan.getJobId());
			user.setWeapon(weapon);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);

		}
		//ログイン結果画面にフォワード
		RequestDispatcher dis =
				request.getRequestDispatcher("WEB-INF/jsp/sindankekka.jsp");
		dis.forward(request, response);

	}

}
