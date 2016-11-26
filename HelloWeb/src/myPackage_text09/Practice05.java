/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text09;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */

class MyPoint
{
  private int x;
  private int y;

  public MyPoint()
  {
    x = 0;
    y = 0;
    System.out.println("初期座標は(0,0)です。");
  }

  public MyPoint(int px,int py)
  {
    this();

    if(px >=0 && px <=100)
      x = px;
    else
      x = 0;

    if(py >=0 && py <=100)
      y = py;
    else
      y = 0;

    System.out.println("初期座標を("+x + ","+ y +")に設定しました。");
  }

  //X座標を設定する
  public void setX(int px)
  {
    if(px >=0 && px <=100)
      x = px;
    else
      System.out.println("座標軸の範囲が誤っています。");
  }

  //Y座標を設定する
  public void setY(int py)
  {
    if(py >=0 && py <=100)
      y = py;
    else
      System.out.println("座標軸の範囲が誤っています。");
  }

  //X座標を得る
  public int getX()
  {
    return x;
  }

  //Y座標を得る
  public int getY()
  {
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

    MyPoint point1 = new MyPoint();

    point1.setX(5);
    point1.setY(10);

    int X1 = point1.getX();
    int Y1 = point1.getY();

    System.out.println("point1のX座標は" + X1 + ",Y座標は" + Y1 + "です。");

    MyPoint point2 = new MyPoint(20,10);

    int X2 = point2.getX();
    int Y2 = point2.getY();

    System.out.println("point2のX座標は" + X2 + ",Y座標は" + Y2 + "です。");

  }

}
