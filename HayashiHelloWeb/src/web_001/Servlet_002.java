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
	  //はじめにリクエストのエンコードを実施
      request.setCharacterEncoding("Windows-31J");
      //ContentTypeを指定
      response.setContentType("text/html; charset=Windows-31J");

      //HTTPレスポンスとして文字列を出力するライター
      PrintWriter pw = response.getWriter();
      //文字列を出力する
      pw.println("<html>");
      pw.println("<head>");
      pw.println("<title>web_002</title>");
      pw.println("</head>");
      pw.println("<body>");

      //View_002.htmlからの値を取得して、カンマごとに分割する
      String paramStr1 = request.getParameter("paramStr1");
      String[] heightStr = paramStr1.split(",", 0);

      //身長から標準体重を算出する
      for(int i = 0 ; i < heightStr.length ; i++ ){
        int heightNum = Integer.parseInt(heightStr[i]);
        double weight = (heightNum - 100) * 0.9;
        pw.printf("%.5f", weight);
        pw.println("<br>");
        System.out.printf("身長：" + heightNum + " 体重：" + "%.5f",weight);
        System.out.println();
      }

      pw.println("</body>");
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
