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
public class Sample09 {

  /**
   * 配列の内容をソートする <br />
   * （説明） <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args)  throws IOException{
    // TODO 自動生成されたメソッド・スタブ

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] test = new int[5];
    System.out.println(test.length + "人の点数を入力してください。");

    for(int i=0; i<test.length; i++){
      String str = br.readLine();
      test[i] = Integer.parseInt(str);
    }
    for(int s=0; s<test.length-1; s++){
      for(int t=s+1;t<test.length; t++){
        if(test[t] > test[s]){
          int tmp = test[t];
          test[t] = test[s];
          test[s] = tmp;
        }
      }
    }

    for(int j=0; j<test.length; j++){
      System.out.println((j+1) + "番目の人の点数は" + test[j] + "です。");
    }
    }
}
