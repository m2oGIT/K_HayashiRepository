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
	  //はじめにリクエストのエンコードを実施
      request.setCharacterEncoding("Windows-31J");
      //ContentTypeを指定
      response.setContentType("text/html; charset=Windows-31J");

      //index.htmlからの値を取得する
      String param1 = request.getParameter("param1");
      String param2 = request.getParameter("param2");

      //文字列から数値変換する
      int p2 = Integer.parseInt(param2);
      //文字列を出力する
      //param1の文字列をparam2の回数分繰り返し表示する
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
