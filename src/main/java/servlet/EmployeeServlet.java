package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.EmployeeDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/employee-register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	* @see HttpServlet#HttpServlet()
	*/
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// リクエストのエンコーディング
		request.setCharacterEncoding("UTF-8");

		// リクエストパラメータの取得
		String lastName = request.getParameter("lastName"); // 氏名（姓）
		String firstName = request.getParameter("firstName"); // 氏名（名）
		String gender = request.getParameter("gender"); // 性別
		String birthday = request.getParameter("birthday"); // 生年月日
		String phoneNumber = request.getParameter("phoneNumber"); // 電話番号
		String sectionCode = request.getParameter("sectionCode"); // 部署
		String languageCode = request.getParameter("languageCode"); // 言語
		String hireDate = request.getParameter("hireDate"); // 入社日

		String url = null; // 転送用パスを格納する変数

		EmployeeDAO dao = new EmployeeDAO(); // LanguageDAOクラスをインスタンス化

		try {
			// addEmployeeを呼び出して、データベースに値を追加
			dao.addEmployee(lastName, firstName, gender, birthday, phoneNumber, sectionCode, languageCode, hireDate);
			url = "employeeSuccess.jsp";
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			url = "employeeErr.jsp";
		}

		// 転送
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}
}
