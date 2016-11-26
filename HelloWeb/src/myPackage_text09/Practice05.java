/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text09;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */

class MyPoint
{
  private int x;
  private int y;

  public MyPoint()
  {
    x = 0;
    y = 0;
    System.out.println("�������W��(0,0)�ł��B");
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

    System.out.println("�������W��("+x + ","+ y +")�ɐݒ肵�܂����B");
  }

  //X���W��ݒ肷��
  public void setX(int px)
  {
    if(px >=0 && px <=100)
      x = px;
    else
      System.out.println("���W���͈̔͂�����Ă��܂��B");
  }

  //Y���W��ݒ肷��
  public void setY(int py)
  {
    if(py >=0 && py <=100)
      y = py;
    else
      System.out.println("���W���͈̔͂�����Ă��܂��B");
  }

  //X���W�𓾂�
  public int getX()
  {
    return x;
  }

  //Y���W�𓾂�
  public int getY()
  {
    return y;
  }

}


public class Practice05 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    MyPoint point1 = new MyPoint();

    point1.setX(5);
    point1.setY(10);

    int X1 = point1.getX();
    int Y1 = point1.getY();

    System.out.println("point1��X���W��" + X1 + ",Y���W��" + Y1 + "�ł��B");

    MyPoint point2 = new MyPoint(20,10);

    int X2 = point2.getX();
    int Y2 = point2.getY();

    System.out.println("point2��X���W��" + X2 + ",Y���W��" + Y2 + "�ł��B");

  }

}
