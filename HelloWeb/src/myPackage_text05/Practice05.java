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
public class Practice05 {

  /**
   * 1から5までの5段階の成績を入力させ、場合に応じてメッセージを変える <br />
   * キーボードから1から5までの5段階の成績を入力し、場合に応じてメッセージを変更する <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("成績を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    int num = Integer.parseInt(str);

    switch (num){
      case 1 :
        System.out.println("もっとがんばりましょう。");
        break;
      case 2 :
        System.out.println("もう少しがんばりましょう。");
        break;
      case 3 :
        System.out.println("さらに上をめざしましょう。");
        break;
      case 4 :
        System.out.println("たいへんよくできました。");
        break;
      case 5 :
        System.out.println("たいへん優秀です。");
        break;
    }
  }

}
