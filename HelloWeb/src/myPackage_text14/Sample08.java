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
public class Sample08 {

  /**
   * （メソッド論理名） <br />
   * ファイルから入力する <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    try{
      BufferedReader br = new BufferedReader(new FileReader("test1.txt"));

      String str1 =br.readLine();
      String str2 =br.readLine();

      System.out.println("ファイルに書き込まれている2つの文字列は");
      System.out.println(str1 + "です。");
      System.out.println(str2 + "です。");

      br.close();
    }
    catch(IOException e){
      System.out.println("入出力エラーです。");
    }
  }

}
