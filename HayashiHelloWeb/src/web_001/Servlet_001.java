package web_001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_001
 */
@WebServlet("/Servlet_001")
public class Servlet_001 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_001() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  //�͂��߂Ƀ��N�G�X�g�̃G���R�[�h�����{
      request.setCharacterEncoding("Windows-31J");
      //ContentType���w��
      response.setContentType("text/html; charset=Windows-31J");

      //index.html����̒l���擾����
      String param1 = request.getParameter("param1");
      String param2 = request.getParameter("param2");

      //�����񂩂琔�l�ϊ�����
      int p2 = Integer.parseInt(param2);
      //��������o�͂���
      //param1�̕������param2�̉񐔕��J��Ԃ��\������
      for (int i = 0 ; i < p2 ; i++ ){
        System.out.println(param1);
      }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
