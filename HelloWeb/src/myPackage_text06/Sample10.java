/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample10 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ
    System.out.println("成績を入力してください。(1～5)");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

    switch(res){
      case 1:
      case 2:
        System.out.println("もう少しがんばりましょう。");
        break;
      case 3:
      case 4:
        System.out.println("この調子でがんばりましょう。");
        break;
      case 5:
        System.out.println("たいへん優秀です。");
        break;
      default:
        System.out.println("1～5までの成績を入力してください。");
        break;
    }


  }

}
