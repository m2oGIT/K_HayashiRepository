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
public class Practice03 {

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

    char sounyu ='a';
    System.out.println("aの挿入位置を整数で入力してください。");

    String str2 = br.readLine();
    int iti = Integer.parseInt(str2);

    StringBuffer sb = new StringBuffer(str1);
    sb.insert(iti, sounyu);

    System.out.println(sb + "になりました。");

  }

}
