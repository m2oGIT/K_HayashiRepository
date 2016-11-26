/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0722_23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日時・起動時引数の書き込み処理 <br />
 * /practice/run/file/text.txtというファイルに対し、 <br />
 * 実行時に与えた文字列と、実行時の日時を追加書込で書き込む処理を作成する。 <br />
 * また同一クラス内に、上記の対象ファイルを読み込み、内容をコンソールに表示する処理を作成する。 <br />
 * 更新履歴 yyyy/mm/dd （更新者）：新規作成 <br />
 */
public class FileReadWriteTest {

  /**
   * 日時・起動時引数の書き込み処理 <br />
   * /practice/run/file/text.txtというファイルに対し、 <br />
   * 実行時に与えた文字列と、実行時の日時を追加書込で書き込む処理を作成する。 <br />
   * また同一クラス内に、上記の対象ファイルを読み込み、内容をコンソールに表示する処理を作成する。 <br />
   *
   * @param args 起動時引数
   */
  public static void main(String[] args) {

    // ファイルに書き込む
    PrintWriter pw = null;
    try {
      // ファイルに追加で書き込む
      pw = new PrintWriter(new BufferedWriter(new FileWriter(
          "C:\\workspace44\\HelloWeb\\practice\\run\\file\\text.txt", true)));

      // 日付
      Date d = new Date();
      // 日付のフォーマット
      SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy'/'MM'/'dd'/' HH:mm:ss ");

      // 実行時の日時を書き込む
      pw.println(sdf1.format(d) + args[0]);
    } catch (IOException e) {
      System.out.println("出力エラーです。");
    } finally {
      // ファイルを閉じる
      pw.close();
    }

    // ファイルの内容を読み込むためのバッファー
    BufferedReader br = null;
    try {
      // ファイルを読み込む
      br = new BufferedReader(new FileReader(
          "C:\\workspace44\\HelloWeb\\practice\\run\\file\\text.txt"));
      // ファイルの内容を読み込む
      String str;
      // ファイルの内容をコンソールに表示する
      while ((str = br.readLine()) != null) {
        System.out.println(str);
      }
    } catch (IOException e) {
      System.out.println("入力エラーです。");
    } finally {
      // ファイルを閉じる
      try {
        br.close();
      } catch (IOException e) {
        System.out.println("ファイルクローズでエラーです。");
      }
    }

  }

}
