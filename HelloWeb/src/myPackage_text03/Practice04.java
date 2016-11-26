/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Practice04 {

  /**
   * 円周率の値を問う <br />
   * 円周率を入力 <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException {
    // TODO 自動生成されたメソッド・スタブ
    System.out.println("円周率の値はいくつですか？");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    double pi = Double.parseDouble(str);

    System.out.println("円周率の値は" + pi + "です。");



  }

}
