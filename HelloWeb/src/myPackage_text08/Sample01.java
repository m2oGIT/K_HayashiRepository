/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text08;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */

class Car
{
  int num;
  double gas;

  int getNum()
  {
    System.out.println("ナンバーを調べました。");
    return num;
  }


  double getGas()
  {
    System.out.println("ガソリン量を調べました。");
    return gas;
  }


  void setNumGas(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
  }

  void setNum(int n)
  {
    num =n;
    System.out.println("車のナンバーを" + num + "にしました。");
  }

  void setGas(double g)
  {
    gas =g;
    System.out.println("ガソリン量を" + gas + "にしました。");
  }

  void show()
  {
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }

  void showCar()
  {
    System.out.println("これから車の情報を表示します。");
    show();
  }
}

public class Sample01 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Car car1;
    car1 = new Car();

    car1.num = 1234;
    car1.gas = 20.5;

    System.out.println("車のナンバーは" + car1.num + "です。");
    System.out.println("ガソリン量は" + car1.gas + "です。");

  }

}
