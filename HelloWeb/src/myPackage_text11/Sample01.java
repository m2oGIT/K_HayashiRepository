/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text11;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */

//車クラス
class Car
{
  protected int num;
  protected double gas;

  public Car()
  {
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }

  public Car(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
  }

  public void setCar(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
  }

  public String toString()
  {
    String str = "ナンバー" + num + "ガソリン量" + gas + "の車";
    return str;
  }


  public void show()
  {
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }
}

//レーシングカークラス
class RacingCar extends Car
{
  private int course;

  public RacingCar()
  {
    course = 0;
    System.out.println("レーシングカーを作成しました。");
  }

  public RacingCar(int n,double g,int c)
  {
    super(n,g);
    course = c;
    System.out.println("コース番号" + course + "のレーシングカーを作成しました。");
  }

  public void setCourse(int c)
  {
    course = c;
    System.out.println("コース番号を" + course + "にしました。");
  }

  public void show()
  {
    System.out.println("レーシングカーのナンバーは"+ num + "です。");
    System.out.println("ガソリン量は"+ gas + "です。");
    System.out.println("コース番号は"+ course + "です。");

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
    RacingCar rccar1;
    rccar1 = new RacingCar();

    rccar1.setCar(1234, 20.5);
    rccar1.setCourse(5);

  }

}
