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
public class Practice04{

  /**
   * 整数値から判断して出力メッセージを変える <br />
   * キーボードから整数値を入力し、場合に応じてメッセージを変更する <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("0～10までの整数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    int res = Integer.parseInt(str);

    if(res >= 0 && res <=10){
      System.out.println("正解です。");
    }
    else{
      System.out.println("まちがいです。");
    }


  }

}
