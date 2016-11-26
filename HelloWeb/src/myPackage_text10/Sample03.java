/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample03 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ
    System.out.println("文字列を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();

    System.out.println("検索文字を入力してください。");

    String str2 = br.readLine();
    char ch = str2.charAt(0);

    int num = str1.indexOf(ch);

    if(num != -1)
      System.out.println(str1 + "の" + (num +1) + "番目に「" + ch + "」が見つかりました。" );
    else
      System.out.println(str1 + "に「" + ch + "」はありません。" );

  }

}
