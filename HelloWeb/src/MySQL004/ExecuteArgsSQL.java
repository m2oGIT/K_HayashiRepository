package MySQL004;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.io.*;

import org.apache.jasper.tagplugins.jstl.core.If;


/**
 * DBアクセッサの使い方（Statement） <br />
 * Statementクラスを使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class ExecuteArgsSQL {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ExecuteArgsSQL() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // Statementクラスは最もシンプルなDBアクセスクラス。
    // ただし、セキュリティ上の脆弱性があり、業務プログラムでの使用は推奨されない。
    // 基本的には脆弱性を改善したPreparedStatementクラスを使用すること。

    // DB関連インスタンスを生成。
    Statement stmt = null;
    Connection conn = null;
    // ResultSetは検索結果格納用のライブラリクラス。
    ResultSet rs = null;
    int count = 0;
    String sqlSelect = null;
    String sqlInsert = null;

    // SQL文を文字列で記述する。
    // 一部のSQL文はDB製品ごとに文法が異なる場合があるので、要注意。
    //String sqlSelect = "SELECT * FROM moeiwast_eiwatest_db01.test01_hayashi ";
    //String sqlSelect = args[0];
        //String sqlInsert = "insert into moeiwast_eiwatest_DB01.testTable "
    //    + "( id, name, createdate, client, address ) "
    //    + "values ( 22, 'あいうえお', '2015/11/05', 'N/A', 'N/A' )";

    if ( args[0].startsWith( "SELECT" )){
      sqlSelect = args[0];
    } else {
      sqlInsert = args[0];
    }

    // 接続先DBの指定文字列（DB製品ごとに原則定型）。
    String url = "jdbc:mysql://localhost:3306/moeiwast_eiwatest_db01";

    try {
      // ドライバ（opt/mysql-connector-java-5.1.36-bin.jar）をロードする。
      // eclipseのプロジェクト＞プロパティー＞ビルドパス＞ライブラリからドライバjarの格納先を設定しておくこと。
      Class.forName( "com.mysql.jdbc.Driver" ).newInstance();

      // MySQLの場合、以下のように文字コード指定を含む接続情報を
      // PropertiesクラスにセットしてConnectionクラスに渡す。
      Properties props = new Properties();
      props.put( "user", "root" );
      props.put( "password", "root" );
      props.put( "useUnicode", "true" ); // 省略すると日本語が文字化けする。
      props.put( "characterEncoding", "SJIS" ); // 省略すると日本語が文字化けする。

      // 接続情報を元に、コネクションを生成。
      conn = DriverManager.getConnection( url, props );

      // コネクションからステートメント（SQL実行用オブジェクト）を生成。
      stmt = conn.createStatement();

      // SQLを実行。
      // 参照系（Select）と更新系でメソッドが異なる。
      if ( args[0].startsWith("SELECT") ){
        rs = stmt.executeQuery( sqlSelect );
      } else {
        count = stmt.executeUpdate( sqlInsert );
      }
      //rs = stmt.executeQuery( sqlSelect )
      // count = stmt.executeUpdate( sqlInsert );

      // 検索結果を表示する。（executeQuery実行時）
      // ResultSetは表形式のオブジェクト。
      // デフォルトは"0行目(データなし)"を指しており、rs.next()を実行する度に1行進む。
      if ( rs != null ) {
        while ( rs.next() ) {

          // カラムの型に合わせてgetInt()/getStringで値を取り出す。
          System.out.println( rs.getBigDecimal( "STAFF_NO" ) );
          System.out.println( rs.getString( "OFFICE_CD" ) );
          System.out.println( rs.getString( "STAFF_NAME" ) );
          System.out.println( rs.getInt( "WORK_TIME" ) );
          System.out.println( rs.getDate( "CREATE_DATE" ) );
          System.out.println( "" );
        }
      }

      // 更新件数を表示する。（executeUpdate実行時）
      if ( count != 0 ) {
        System.out.println( "更新が完了しました。" + count + " 件を更新しました。" );
      }


      // Streamと同様、末尾で明示的にクローズ処理を記述するのがお作法。
      // 検索結果のクローズ。
      if ( rs != null ) {
        rs.close();
      }
      // ステートメントをクローズする。
      stmt.close();

    // エラー発生時はエラーの内容を表示。
    } catch ( ClassNotFoundException e ) {
      System.out.println( "ClassNotFoundException:" + e.getMessage() );
    } catch ( SQLException e ) {
      System.out.println( "SQLException:" + e.getMessage() );
    } catch ( Exception e ) {
      System.out.println( "Exception:" + e.getMessage() );

    } finally {
      try {
        // コネクションをクローズ。
        if ( conn != null ) {
          conn.close();
        }
      } catch ( SQLException e ) {
        System.out.println( "SQLException:" + e.getMessage() );
      }
    }

    /** 使用するライブラリクラスの種類が多く丸暗記が難しいため、サンプルを元にコピー作成でも問題ない。 **/
  }
}
