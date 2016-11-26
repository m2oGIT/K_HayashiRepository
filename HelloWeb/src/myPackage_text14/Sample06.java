/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample06 {

  /**
   * （メソッド論理名） <br />
   * 画面・キーボードから入出力する <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    System.out.println("文字列を入力してください。");

    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      System.out.println(str + "が入力されました。");
    }
    catch(IOException e){
      System.out.println("入出力エラーです。");
    }
  }

}
