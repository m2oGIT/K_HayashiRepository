/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text07;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample11 {

  /**
   * 要素の長さが異なる配列 <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    int[][] test = {{80,60,22,50},{90,55,68,72},{33,75,63}};

    for(int i=0; i<test.length; i++){
      System.out.println((i+1) + "番目の配列の長さは" + test[i].length + "です。");
    }

  }

}
