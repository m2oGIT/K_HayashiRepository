/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text12;

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
  /**
 * （メソッド論理名） <br />
 * （説明） <br />
 * @param args
 */
public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Vehicle[] vc;
    vc = new Vehicle[2];

    vc[0] = new Car(1234,20.5);
    vc[1] = new Plane(232);

    for(int i=0;i<vc.length; i++){
      if(vc[i] instanceof Car)
        System.out.println((i+1) + "番目のオブジェクトはCarクラスです。");
      else
        System.out.println((i+1) + "番目のオブジェクトはCarクラスではありません。");
    }


  }

}
