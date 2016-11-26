/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text04;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample09 {

  /**
   * 小さなサイズの型に代入する <br />
   * double -> int <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // 大きな型から小さな型に代入する

    double dnum = 160.5;
    System.out.println("身長は" + dnum + "センチです。");

    System.out.println("int型の変数に代入します。");
    int inum = (int)dnum;

    System.out.println("身長は" + inum + "センチです。");


  }

}
