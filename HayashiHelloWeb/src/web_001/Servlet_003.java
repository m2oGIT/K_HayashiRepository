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
	   //はじめにリクエストのエンコードを実施
      request.setCharacterEncoding("Windows-31J");
      //ContentTypeを指定
      response.setContentType("text/html; charset=Windows-31J");

      //HTTPレスポンスとして文字列を出力するライター
      PrintWriter pw = response.getWriter();
      //文字列を出力する
      pw.println("<html>");
      pw.println("<head>");
      pw.println("<title>web_003</title>");
      pw.println("</head>");
      pw.println("<body>");

      //View_003.htmlからの値を取得して表示する
      String paramLeft  = request.getParameter("paramLeft");
      String paramOpe   = request.getParameter("paramOpe");
      String paramRight = request.getParameter("paramRight");

      //入力項目チェック（空欄がある場合エラー）
      if (paramLeft == "" ){
        pw.println("左項に不正な値が入力されました。");
        return;
      }
      if (paramOpe == "" ){
        pw.println("オペレータに不正な値が入力されました。");
        return;
      }
      if (paramRight == "" ){
        pw.println("右項に不正な値が入力されました。");
        return;
      }

      //入力項目チェック（演算子が+,-,*,/以外の場合エラー）
      if (paramOpe.equals("+") || ( paramOpe.equals("-") ) || ( paramOpe.equals("*") ) || ( paramOpe.equals("/") )){
      }else{
        pw.println("演算子が+,-,*,/以外不正な値が入力されました。");
        return;
      }

      //入力項目チェック（ゼロ除算の場合エラー）
      if (( paramOpe.equals("/") && paramRight.equals("0"))){
        pw.println("ゼロ除算不正な値が入力されました。");
        return;
      }

      //文字列から数値変換する
      double LeftNum = Double.parseDouble(paramLeft);
      double RightNum = Double.parseDouble(paramRight);

      //解答を算出する
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

      //算出結果を小数点第6位で四捨五入
      //元データをBigDecimal型にする
      BigDecimal bd = new BigDecimal(ans);

      //四捨五入する
      BigDecimal ansAfter = bd.setScale(5, BigDecimal.ROUND_HALF_UP);

      //解答を表示する
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
	//doGetメソッドに処理を委譲する
      this.doGet(request, response);
	}

}
