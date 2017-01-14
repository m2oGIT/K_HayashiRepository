package web_001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_002
 */
@WebServlet("/Servlet_002")
public class Servlet_002 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_002() {
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
      pw.println("<html>");
      pw.println("<head>");
      pw.println("<title>web_002</title>");
      pw.println("</head>");
      pw.println("<body>");

      //View_002.html����̒l���擾���āA�J���}���Ƃɕ�������
      String paramStr1 = request.getParameter("paramStr1");
      String[] heightStr = paramStr1.split(",", 0);

      //�g������W���̏d���Z�o����
      for(int i = 0 ; i < heightStr.length ; i++ ){
        int heightNum = Integer.parseInt(heightStr[i]);
        double weight = (heightNum - 100) * 0.9;
        pw.printf("%.5f", weight);
        pw.println("<br>");
        System.out.printf("�g���F" + heightNum + " �̏d�F" + "%.5f",weight);
        System.out.println();
      }

      pw.println("</body>");
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
