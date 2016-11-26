/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text10;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */

public class Sample07 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args){
    // TODO 自動生成されたメソッド・スタブ
    Car car1;
    System.out.println("car1を宣言しました。");
    car1 = new Car();
    car1.setCar(1234, 20.5);

    Car car2;
    System.out.println("car2を宣言しました。");

    car2 = car1;
    System.out.println("car2にcar1を代入しました。");

    System.out.print("car1がさす");
    car1.show();

    System.out.print("car2がさす");
    car2.show();

    System.out.println("car1がさす車に変更を加えます。");
    car1.setCar(2345, 30.5);

    System.out.print("car1がさす");
    car1.show();

    System.out.print("car2がさす");
    car2.show();


  }

}
