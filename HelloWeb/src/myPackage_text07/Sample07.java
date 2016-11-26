/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text07;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample07 {

  /**
   * 配列の長さを知る <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    int[] test= {80,60,22,50,75};

    for(int i=0; i<5; i++){
      System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
    }

    System.out.println("テストの受験者は" + test.length + "人です。");

  }

}
