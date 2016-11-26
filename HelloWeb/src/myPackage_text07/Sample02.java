/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample02 {

  /**
   * 配列要素の数を入力する <br />
   * （説明） <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("テストの受験者数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int num = Integer.parseInt(str);

    int[] test;
    test = new int[num];

    System.out.println("人数分の点数を入力してください。");

    for(int i=0; i<num; i++){
      str = br.readLine();
      int tmp = Integer.parseInt(str);
      test[i]= tmp;
    }
    for(int i=0; i<num; i++){
      System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
    }


  }

}
