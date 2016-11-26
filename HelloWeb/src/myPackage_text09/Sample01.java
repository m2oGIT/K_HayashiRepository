/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text09;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */

class Car
{
  public static int sum =0;

  private int num;
  private double gas;

  //コンストラクタ
  public Car()
  {
    num = 0;
    gas = 0.0;
    sum++;
    System.out.println("車を作成しました。");
  }

  public Car(int n, double g)
  {
    this();
    num = n;
    gas = g;
    System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
  }

  //メソッド
  public static void showSum()
  {
    System.out.println("車は全部で" + sum + "台あります。");
  }

  public void setCar(int n)
  {
    num = n;
    System.out.println("ナンバーを" + num + "にしました。");
  }

  public void setCar(double g)
  {
    gas = g;
    System.out.println("ガソリン量を" + gas + "にしました。");
  }

  public void setCar(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
  }

  public void setNumGas(int n, double g)
  {
    if(g>0 && g<1000){
      num = n;
      gas = g;
      System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }
    else{
      System.out.println(g + "は正しいガソリン量ではありません。");
      System.out.println("ガソリン量を変更できませんでした。");
    }
  }

  public void show()
  {
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
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
    Car car1 = new Car();

    //car1.num = 1234;
    //car1.gas = 20.5;

    car1.show();


  }

}
