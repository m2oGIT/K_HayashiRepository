/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text14;

import java.io.*;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Practice02 {

  /**
   * （メソッド論理名） <br />
   * ファイルに出力する <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    try{
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test4.txt")));

      pw.println("A long time ago,");
      pw.println("There was a little girl.");
      System.out.println("ファイルに書き込みました。");

      pw.close();
    }
    catch(IOException e){
      System.out.println("入出力エラーです。");
    }
  }

}
