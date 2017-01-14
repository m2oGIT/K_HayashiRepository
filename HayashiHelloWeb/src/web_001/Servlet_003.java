package web_001;

import java.io.IOException;
import java.io.PrintWriter;

import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_003
 */
@WebServlet("/Servlet_003")
public class Servlet_003 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_003() {
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
      pw.println("<title>web_003</title>");
      pw.println("</head>");
      pw.println("<body>");

      //View_003.html����̒l���擾���ĕ\������
      String paramLeft  = request.getParameter("paramLeft");
      String paramOpe   = request.getParameter("paramOpe");
      String paramRight = request.getParameter("paramRight");

      //���͍��ڃ`�F�b�N�i�󗓂�����ꍇ�G���[�j
      if (paramLeft == "" ){
        pw.println("�����ɕs���Ȓl�����͂���܂����B");
        return;
      }
      if (paramOpe == "" ){
        pw.println("�I�y���[�^�ɕs���Ȓl�����͂���܂����B");
        return;
      }
      if (paramRight == "" ){
        pw.println("�E���ɕs���Ȓl�����͂���܂����B");
        return;
      }

      //���͍��ڃ`�F�b�N�i���Z�q��+,-,*,/�ȊO�̏ꍇ�G���[�j
      if (paramOpe.equals("+") || ( paramOpe.equals("-") ) || ( paramOpe.equals("*") ) || ( paramOpe.equals("/") )){
      }else{
        pw.println("���Z�q��+,-,*,/�ȊO�s���Ȓl�����͂���܂����B");
        return;
      }

      //���͍��ڃ`�F�b�N�i�[�����Z�̏ꍇ�G���[�j
      if (( paramOpe.equals("/") && paramRight.equals("0"))){
        pw.println("�[�����Z�s���Ȓl�����͂���܂����B");
        return;
      }

      //�����񂩂琔�l�ϊ�����
      double LeftNum = Double.parseDouble(paramLeft);
      double RightNum = Double.parseDouble(paramRight);

      //�𓚂��Z�o����
      double ans;
      if ( paramOpe.equals("+") ){
        ans = LeftNum + RightNum;
      }else if( paramOpe.equals("-") ){
        ans = LeftNum - RightNum;
      }else if( paramOpe.equals("*") ){
        ans = LeftNum * RightNum;
      }else{
        ans = LeftNum / RightNum;
      }

      //�Z�o���ʂ������_��6�ʂŎl�̌ܓ�
      //���f�[�^��BigDecimal�^�ɂ���
      BigDecimal bd = new BigDecimal(ans);

      //�l�̌ܓ�����
      BigDecimal ansAfter = bd.setScale(5, BigDecimal.ROUND_HALF_UP);

      //�𓚂�\������
      if ( paramOpe.equals("+") ){
        pw.println(LeftNum + " + " + RightNum + " = " + ansAfter);
      }else if( paramOpe.equals("-") ){
        pw.println(LeftNum + " - " + RightNum + " = " + ansAfter);
      }else if( paramOpe.equals("*") ){
        pw.println(LeftNum + " * " + RightNum + " = " + ansAfter);
      }else{
        pw.println(LeftNum + " / " + RightNum + " = " + ansAfter);
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
