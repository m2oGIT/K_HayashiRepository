/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text13;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
//車クラス
public class Car {
  private int num;
  private double gas;

  public Car()
  {
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }

  public void setCar(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
  }

  public void show()
  {
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }

}
