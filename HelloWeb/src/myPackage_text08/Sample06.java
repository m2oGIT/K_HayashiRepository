/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text08;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */


public class Sample06 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Car car1 = new Car();

    car1.setNumGas(1234, 20.5);

    int number = car1.getNum();
    double gasoline = car1.getGas();

    System.out.println("サンプルから車を調べたところ");
    System.out.println("ナンバーは" + number + "ガソリン量は" + gasoline + "でした。");

  }

}
