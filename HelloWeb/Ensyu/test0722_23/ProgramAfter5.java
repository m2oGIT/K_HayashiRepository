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
import java.util.ArrayList;
import java.util.List;

/**
 * 出力ファイル編集処理 <br />
 * 入力ファイルの社員情報を読み取り、リストに格納する。 <br />
 * リストに格納した社員情報をもとに、出力ファイルに出力する。 <br />
 * 更新履歴 yyyy/mm/dd （更新者）：新規作成 <br />
 */
public class ProgramAfter5 {

  /**
   * 出力ファイル編集処理 <br />
   * 入力ファイルから1行ずつ読み取り、ファイルの最後になるまで、リストに格納する。 <br />
   * リストに格納した社員情報をもとに、出力ファイルに出力する。 <br />
   *
   * @param args 起動時引数
   */
  public static void main(String[] args) {

    try {
      // 入力ファイルを指定する。
      BufferedReader br = new BufferedReader(new FileReader("input.txt"));

      // 入力ファイルの読み取り先
      String str;
      // 社員情報リスト
      List<Member> list = new ArrayList<Member>();

      // 入力ファイルから1行ずつ読み取り、ファイルの最後になるまで、リストに格納する
      while ((str = br.readLine()) != null) {
        String[] cols = str.split(",");
        list.add(new Member(cols[0], cols[1], cols[2]));
      }
      // 入力ファイルをクローズする
      br.close();

      // 出力ファイル
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

      // リストに格納した社員情報をもとに、出力ファイルに出力する
      for (int i = 0; i < list.size(); i++) {
        pw.print("行数：[" + (i + 1) + "] ");
        pw.print("社員No：[" + list.get(i).getId() + "] ");
        pw.println("名前：[" + list.get(i).getSecondName() + "　" + list.get(i).getFirstName() + "]");
      }

      // 出力ファイルをクローズする
      pw.close();

    } catch (IOException e) {
      System.out.println("入出力エラーです");
    }

  }

}
