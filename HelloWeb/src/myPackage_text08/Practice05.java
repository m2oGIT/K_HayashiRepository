/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text08;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */

class MyPoint
{
  int x;
  int y;

  void setX(int px)
  {
    x = px;
    System.out.println("X���W��" + x + "�ɐݒ肵�܂����B");
  }

  void setY(int py)
  {
    y = py;
    System.out.println("Y���W��" + y + "�ɐݒ肵�܂����B");
  }

  int getX()
  {
    System.out.println("X���W��" + x + "�ł��B");
    return x;
  }

  int getY()
  {
    System.out.println("Y���W��" + y + "�ł��B");
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

    MyPoint point = new MyPoint();

    point.setX(5);
    point.setY(10);



    int X1 = point.getX();
    int Y1 = point.getY();

    System.out.println("X���W��" + X1 + ",Y���W��" + Y1 + "�ł��B");

  }

}
