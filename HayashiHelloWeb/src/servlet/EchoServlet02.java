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
//@:アノテーション,設定ファイルがまとめられている
//  ()内URLのマッピング、クラス名と同じにする
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
	  //はじめにリクエストのエンコードを実施
	  request.setCharacterEncoding("Windows-31J");
	  //ContentTypeを指定
	  response.setContentType("text/html; charset=Windows-31J");

	  //HTTPレスポンスとして文字列を出力するライター
	  PrintWriter pw = response.getWriter();
      //文字列を出力する
      //pw.println("Hello EchoServlet");
	  pw.println("<html>");
	  pw.println("<head>");
	  pw.println("<title>EchoServlet</title>");
	  pw.println("</head>");
	  pw.println("<body>");
	  pw.println("<h1>");
	  pw.println("<font color=\"#778899\">Hello EchoServlet</font>");
	  pw.println("</h1>");
	  //index.htmlからの値を取得して表示する
	  String param = request.getParameter("param");
	  pw.println(param);
	  //入力値を標準出力する
	  System.out.println(param);
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
