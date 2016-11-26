package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EchoServlet02
 */
@WebServlet("/EchoServlet02")
//@:�A�m�e�[�V����,�ݒ�t�@�C�����܂Ƃ߂��Ă���
//  ()��URL�̃}�b�s���O�A�N���X���Ɠ����ɂ���
public class EchoServlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EchoServlet02() {
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

	  //HTTP���X�|���X�Ƃ��ĕ�������o�͂��郉�C�^�[
	  PrintWriter pw = response.getWriter();
      //��������o�͂���
      //pw.println("Hello EchoServlet");
	  pw.println("<html>");
	  pw.println("<head>");
	  pw.println("<title>EchoServlet</title>");
	  pw.println("</head>");
	  pw.println("<body>");
	  pw.println("<h1>");
	  pw.println("<font color=\"#778899\">Hello EchoServlet</font>");
	  pw.println("</h1>");
	  //index.html����̒l���擾���ĕ\������
	  String param = request.getParameter("param");
	  pw.println(param);
	  //���͒l��W���o�͂���
	  System.out.println(param);
	  pw.println("</body>");
	  pw.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  //doGet���\�b�h�ɏ������Ϗ�����
	  this.doGet(request, response);
	}

}
