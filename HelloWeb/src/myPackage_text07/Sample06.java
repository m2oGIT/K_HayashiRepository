/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text07;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample06 {

  /**
   * 要素の値を変更する <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    int[] test1;
    test1 = new int[3];

    System.out.println("test1を宣言しました。");
    System.out.println("配列要素を宣言しました。");

    test1[0] = 80;
    test1[1] = 60;
    test1[2] = 22;

    int[] test2;
    System.out.println("test2を宣言しました。");

    test2 = test1;
    System.out.println("test2にtest1を代入しました。");

    for(int i=0; i<3; i++){
      System.out.println("test1がさす" + (i+1) + "番目の人の点数は" + test1[i] + "です。");
    }

    for(int i=0; i<3; i++){
      System.out.println("test2がさす" + (i+1) + "番目の人の点数は" + test2[i] + "です。");
    }


    test1[2] = 100;
    System.out.println("test1がさす3番目の人の点数を変更します。");

    for(int i=0; i<3; i++){
      System.out.println("test1がさす" + (i+1) + "番目の人の点数は" + test1[i] + "です。");
    }

    for(int i=0; i<3; i++){
      System.out.println("test2がさす" + (i+1) + "番目の人の点数は" + test2[i] + "です。");
    }

  }

}
