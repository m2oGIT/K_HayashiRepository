/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text14;

import java.io.*;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample09 {

  /**
   * （メソッド論理名） <br />
   * ファイルから入力する <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    try{
      BufferedReader br = new BufferedReader(new FileReader("test2.txt"));

      int[] test = new int[8];
      String str;

      for(int i=0; i<test.length; i++){
        str = br.readLine();
        test[i] = Integer.parseInt(str);
      }

      int max = test[0];
      int min = test[1];
      for(int i=0; i<test.length; i++){
        if(max < test[i])
          max = test[i];
        if(min > test[i])
          min = test[i];
        System.out.println(test[i]);
      }

      System.out.println("最高点は" + max + "です。");
      System.out.println("最低点は" + min + "です。");

      br.close();
    }
    catch(IOException e){
      System.out.println("入出力エラーです。");
    }
  }

}
