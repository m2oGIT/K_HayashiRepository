/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text09;

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
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Car car1 = new Car();

    car1.setNumGas(1234, 20.5);
    car1.show();

    System.out.println("車のナンバーだけ変更します。");
    car1.setCar(2345);
    car1.show();

    System.out.println("ガソリン量だけ変更します。");
    car1.setCar(30.5);
    car1.show();

  }

}
