/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text10;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */

public class Sample09 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args){
    // TODO 自動生成されたメソッド・スタブ
    Car[] cars ;
    cars = new Car[3];

    for(int i=0; i<cars.length; i++){
      cars[i] = new Car();
    }

    cars[0].setCar(1234, 20.5);
    cars[1].setCar(2345, 30.5);
    cars[2].setCar(3456, 40.5);

    for(int i=0; i<cars.length; i++){
      cars[i].show();
    }

  }

}
