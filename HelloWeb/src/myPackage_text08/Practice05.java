/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text08;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */

class MyPoint
{
  int x;
  int y;

  void setX(int px)
  {
    x = px;
    System.out.println("X座標を" + x + "に設定しました。");
  }

  void setY(int py)
  {
    y = py;
    System.out.println("Y座標を" + y + "に設定しました。");
  }

  int getX()
  {
    System.out.println("X座標は" + x + "です。");
    return x;
  }

  int getY()
  {
    System.out.println("Y座標は" + y + "です。");
    return y;
  }

}


public class Practice05 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    MyPoint point = new MyPoint();

    point.setX(5);
    point.setY(10);



    int X1 = point.getX();
    int Y1 = point.getY();

    System.out.println("X座標は" + X1 + ",Y座標は" + Y1 + "です。");

  }

}
