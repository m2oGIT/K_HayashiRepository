/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text09;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */


public class Sample02 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Car car1 = new Car();

    //このようなアクセスができなくなる。
    //car1.num = 1234;
    //car1.gas = 20.5;

    car1.setNumGas(1234, 20.5);
    car1.show();

    System.out.println("正しくないガソリン量(-10.0)を指定してみます。");

    car1.setNumGas(1234, -10.0);
    car1.show();

  }

}
