/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text11;


/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample08 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
   Car car1 = new Car();
   Car car2 = new Car();

   Car car3 = car1;

   boolean bl1 = car1.equals(car2);
   boolean bl2 = car1.equals(car3);

   System.out.println("car1とcar2が同じか調べたところ" + bl1 + "でした。");
   System.out.println("car1とcar3が同じか調べたところ" + bl2 + "でした。");
  }

}
