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
public class Sample03 {

  /**
   * 足し算プログラム <br />
   * 入力した2つの値を足し合わせる <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ
    System.out.println("整数を2つ入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();


    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);

    System.out.println("足し算の結果は" + (num1+num2) + "です。");

  }

}
