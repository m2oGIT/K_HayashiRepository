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
public class Practice05 {

  /**
   * 素数判定 <br />
   * キーボードから整数を入力させ、その数が素数であるかどうかを判定する <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("2以上の整数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int num = Integer.parseInt(str);

    for(int i=2; i<=num; i++){
      if(i == num){
        System.out.println(num + "は素数です。");
      }
      else if(num%i == 0){
        System.out.println(num + "は素数ではありません。");
        break;
      }
    }

  }

    /*
    System.out.println("2以上の整数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int res = Integer.parseInt(str);

    boolean bl = false;

    for(int i=2; i<res; i++){
      if(res%i == 0){
        bl = true;
        break;
      }
    }

    if(bl == false){
      System.out.println(res + "は素数です。");
    }
    else{
        System.out.println(res + "は素数ではありません。");
    }
  }
  */

}
