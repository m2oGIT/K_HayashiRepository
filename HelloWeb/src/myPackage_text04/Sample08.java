/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text04;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample08 {

  /**
   * 大きなサイズの型に代入する <br />
   * int -> double <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // 小さな型から大きな型に代入する
    int inum = 160;

    System.out.println("身長は" + inum + "センチです。");

    System.out.println("double型の変数に代入します。");
    double dnum = inum;

    System.out.println("身長は" + dnum + "センチです。");



  }

}
