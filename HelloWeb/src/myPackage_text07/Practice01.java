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
public class Practice01 {

  /**
   * 各自の点数と最高点を出力する <br />
   * （説明） <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("5人のテストの点数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] test= new int[5];

    for(int i=0; i<5; i++){
      String str = br.readLine();
      int num = Integer.parseInt(str);
      test[i] = num;
    }

    for(int i=0; i<5; i++){
      System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
    }

    int max=0;

    for(int i=0; i<5; i++){
      if(max < test[i]){
        max = test[i];
      }
    }

    System.out.println("最高点は" + max + "点です。");

  }

}
