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
public class Sample06 {

  /**
   * switch文で文字を場合分けする <br />
   * （説明） <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ
    System.out.println("aかbを入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    char res = str.charAt(0);

    switch(res){
      case 'a':
        System.out.println("aが入力されました。");
        break;
      case 'b':
        System.out.println("bが入力されました。");
        break;
      default:
        System.out.println("aかbを入力してください。");
        break;
    }

  }

}
