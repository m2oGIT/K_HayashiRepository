/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text10;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */

class Car
{
  private int num;
  private double gas;
  //private String name;

  //コンストラクタ
  public Car()
  {
    num = 0;
    gas = 0.0;
    //name = "名無し";
    System.out.println("車を作成しました。");
  }

  public void setCar(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
  }
/*
  public void setName(String nm)
  {
    name = nm;
    System.out.println("名前を"+ name + "にしました。");
  }
*/
  public void show()
  {
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
    //System.out.println("名前は" + name + "です。");
  }
}


public class Sample06 {

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

    System.out.println("car1がさす。");
    car1.show();

    System.out.println("car2がさす。");
    car2.show();

  }

}
