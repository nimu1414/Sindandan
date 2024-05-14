package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GetSindanListLogic;
import model.PostSindanLogic;
import model.Sindan;
import model.User;

/**
 * Servlet implementation class SindanServlet
 */
@WebServlet("/SindanServlet")
public class SindanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GetSindanListLogic gsll = new GetSindanListLogic();
		List<Sindan> sindanList = gsll.execute();
		request.setAttribute("sindanList", sindanList);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name =request.getParameter("name");
		if (name != null && name.length() != 0) {
		Sindan sindan = new Sindan();
		sindan.SindanJob(sindan);
		sindan.SindanWeapon(sindan);
		sindan.SindanZokusei(sindan);
		String job = sindan.getJob();
		String weapon = sindan.getWeapon();
		String jobId = sindan.getJobId();
		String zokusei = sindan.getZokusei();
		sindan.setName(name);
//		System.out.println(job);
//		System.out.println(jobId);
//		System.out.println(weapon);
		User user = new User(name, job , weapon , jobId, zokusei);
		HttpSession session = request.getSession();
		session.setAttribute("loginUser", user);

		Sindan sindans = new Sindan(name , job , weapon ,zokusei);
		PostSindanLogic psl = new PostSindanLogic();
		psl.execute(sindans);
		GetSindanListLogic gsll = new GetSindanListLogic();
		List<Sindan> sinList = gsll.execute();
		request.setAttribute("sindanList", sinList);

		//診断結果画面にフォワード
				RequestDispatcher dis =
						request.getRequestDispatcher("WEB-INF/jsp/sindankekka.jsp");
				dis.forward(request, response);
		}else {
			response.sendRedirect("sindan.jsp");
		}


	}

}
