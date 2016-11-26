/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text12;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
//のりものインターフェイス
interface iVehicle
{
  void vshow();
}
//材料インターフェイス
interface iMaterial
{
  void mshow();
}

//車クラス
class Car2 implements iVehicle,iMaterial
{
  private int num;
  private double gas;

public Car2(int n, double g)
{
  num = n;
  gas = g;
  System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
}

public void vshow()
{
  System.out.println("車のナンバーは" + num + "です。");
  System.out.println("ガソリン量は" + gas + "です。");
}
public void mshow()
{
  System.out.println("車の材質は鉄です。");
}


}

//飛行機クラス
class Plane2 implements iVehicle,iMaterial
{
private int flight;

public Plane2(int f)
{
  flight = f;
  System.out.println("便" + flight + "の飛行機を作成しました。");
}

public void vshow()
{
  System.out.println("飛行機の便は" + flight + "です。");
}

public void mshow()
{
  System.out.println("飛行機の材質は鉄です。");
}


}

//のりものクラス
abstract class Vehicle
{
  protected int speed;
  public void setSpeed(int s)
  {
    speed = s;
    System.out.println("速度を" + speed + "にしました。");
  }

  abstract void show();
}


//車クラス
class Car extends Vehicle
{
  private int num;
  private double gas;

  public Car(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
  }

  public void show()
  {
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
    System.out.println("速度は" + speed + "です。");
  }
}

//飛行機クラス
class Plane extends Vehicle
{
  private int flight;

  public Plane(int f)
  {
    flight = f;
    System.out.println("便" + flight + "の飛行機を作成しました。");
  }

  public void show()
  {
    System.out.println("飛行機の便は" + flight + "です。");
    System.out.println("速度は" + speed + "です。");
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

    Vehicle[] vc;
    vc = new Vehicle[2];

    vc[0] = new Car(1234,20.5);
    vc[0].setSpeed(60);

    vc[1] = new Plane(232);
    vc[1].setSpeed(500);

    for(int i=0; i<vc.length; i++)
    {
      vc[i].show();
    }
  }

}
