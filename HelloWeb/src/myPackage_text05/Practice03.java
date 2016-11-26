/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Practice03 {

  /**
   * 2つの整数を比較し、場合に応じてメッセージを変える <br />
   * キーボードから2つの整数値を入力し、場合に応じてメッセージを変更する <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("2つの整数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();

    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);

    if(num1 == num2){
      System.out.println("2つの数は同じ値です。");
    }
    else if(num1 < num2){
      System.out.println(num1 + "より" + num2 + "のほうが大きい値です。");
    }
    else{
      System.out.println(num2 + "より" + num1 + "のほうが大きい値です。");
    }
  }

}
