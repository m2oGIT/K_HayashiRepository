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
public class Practice04 {

  /**
   * 三角形の面積計算 <br />
   * キーボードから入力した三角形の高さと底辺の長さから面積を求める <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("三角形の高さと底辺を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();

    int height = Integer.parseInt(str1);
    int weight = Integer.parseInt(str2);

    double menseki = (double)height*weight/2;

    System.out.println("三角形の面積は" + menseki + "です。");


  }

}
