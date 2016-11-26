/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Practice05 {

  /**
   * 5科目のテストの合計点と平均点 <br />
   * キーボードから入力した5科目のテストの点数から合計点と平均点を求める <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("科目1～5の点数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();
    String str3 = br.readLine();
    String str4 = br.readLine();
    String str5 = br.readLine();

    int kamoku1 = Integer.parseInt(str1);
    int kamoku2 = Integer.parseInt(str2);
    int kamoku3 = Integer.parseInt(str3);
    int kamoku4 = Integer.parseInt(str4);
    int kamoku5 = Integer.parseInt(str5);

    int sum = kamoku1+kamoku2+kamoku3+kamoku4+kamoku5;
    double ave = (double)sum/5;

    System.out.println("5科目の合計点は" + sum + "です。");
    System.out.println("5科目の平均点は" + ave + "です。");



  }

}
