/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text12;

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
  /**
 * （メソッド論理名） <br />
 * （説明） <br />
 * @param args
 */
public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    iVehicle[] ivc;
    ivc = new iVehicle[2];

    ivc[0] = new Car2(1234,20.5);
    ivc[1] = new Plane2(232);

    for(int i=0;i<ivc.length; i++){
      ivc[i].vshow();
    }
  }

}
