/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text08;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */

class Car
{
  int num;
  double gas;

  int getNum()
  {
    System.out.println("�i���o�[�𒲂ׂ܂����B");
    return num;
  }


  double getGas()
  {
    System.out.println("�K�\�����ʂ𒲂ׂ܂����B");
    return gas;
  }


  void setNumGas(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("�Ԃ̃i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
  }

  void setNum(int n)
  {
    num =n;
    System.out.println("�Ԃ̃i���o�[��" + num + "�ɂ��܂����B");
  }

  void setGas(double g)
  {
    gas =g;
    System.out.println("�K�\�����ʂ�" + gas + "�ɂ��܂����B");
  }

  void show()
  {
    System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
    System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
  }

  void showCar()
  {
    System.out.println("���ꂩ��Ԃ̏���\�����܂��B");
    show();
  }
}

public class Sample01 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    Car car1;
    car1 = new Car();

    car1.num = 1234;
    car1.gas = 20.5;

    System.out.println("�Ԃ̃i���o�[��" + car1.num + "�ł��B");
    System.out.println("�K�\�����ʂ�" + car1.gas + "�ł��B");

  }

}
