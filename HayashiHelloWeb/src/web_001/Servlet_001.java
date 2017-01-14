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

      //HTTPレスポンスとして文字列を出力するライター
      PrintWriter pw = response.getWriter();
      //文字列を出力する
      pw.println("<html>");
      pw.println("<head>");
      pw.println("<title>web_001</title>");
      pw.println("</head>");
      pw.println("<body>");

      //View_001.htmlからの値を取得して表示する
      String paramStr1 = request.getParameter("paramStr1");
      String paramStr2 = request.getParameter("paramStr2");

      //文字列から数値変換する
      int p2 = Integer.parseInt(paramStr2);

      //param1の文字列をparam2の回数分繰り返し表示する
      for (int i = 0 ; i < p2 ; i++ ){
        pw.print(paramStr1);
      }
      pw.println("</body>");
      pw.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  //doGetメソッドに処理を委譲する
      this.doGet(request, response);
	}

}
