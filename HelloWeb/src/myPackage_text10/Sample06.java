/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text10;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */

class Car
{
  private int num;
  private double gas;
  //private String name;

  //�R���X�g���N�^
  public Car()
  {
    num = 0;
    gas = 0.0;
    //name = "������";
    System.out.println("�Ԃ��쐬���܂����B");
  }

  public void setCar(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
  }
/*
  public void setName(String nm)
  {
    name = nm;
    System.out.println("���O��"+ name + "�ɂ��܂����B");
  }
*/
  public void show()
  {
    System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
    System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
    //System.out.println("���O��" + name + "�ł��B");
  }
}


public class Sample06 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args){
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    Car car1;
    System.out.println("car1��錾���܂����B");
    car1 = new Car();
    car1.setCar(1234, 20.5);

    Car car2;
    System.out.println("car2��錾���܂����B");

    car2 = car1;
    System.out.println("car2��car1�������܂����B");

    System.out.println("car1�������B");
    car1.show();

    System.out.println("car2�������B");
    car2.show();

  }

}
