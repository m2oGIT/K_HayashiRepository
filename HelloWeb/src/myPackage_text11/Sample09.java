/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text11;


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
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
   Car[] cars;
   cars = new Car[2];

   cars[0] = new Car();
   cars[1] = new RacingCar();

   for(int i=0; i<cars.length;i++){
     Class cl = cars[i].getClass();
     System.out.println((i+1) + "番目のオブジェクトは" + cl + "です。");
   }
   }

}
