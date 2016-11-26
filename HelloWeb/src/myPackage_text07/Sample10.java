/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text07;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample10 {

  /**
   * 多次元配列を使う <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    int[][] test;
    test = new int[2][5];

    test[0][0] =80;
    test[0][1] =60;
    test[0][2] =22;
    test[0][3] =50;
    test[0][4] =75;

    test[1][0] =90;
    test[1][1] =55;
    test[1][2] =68;
    test[1][3] =72;
    test[1][4] =58;

    for(int i=0; i<5; i++){
      System.out.println((i+1) + "番目の人の国語の点数は" + test[0][i] + "です。");
      System.out.println((i+1) + "番目の人の算数の点数は" + test[1][i] + "です。");
    }

  }

}
