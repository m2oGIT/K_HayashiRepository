/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text09;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */

class Car
{
  public static int sum =0;

  private int num;
  private double gas;

  //�R���X�g���N�^
  public Car()
  {
    num = 0;
    gas = 0.0;
    sum++;
    System.out.println("�Ԃ��쐬���܂����B");
  }

  public Car(int n, double g)
  {
    this();
    num = n;
    gas = g;
    System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
  }

  //���\�b�h
  public static void showSum()
  {
    System.out.println("�Ԃ͑S����" + sum + "�䂠��܂��B");
  }

  public void setCar(int n)
  {
    num = n;
    System.out.println("�i���o�[��" + num + "�ɂ��܂����B");
  }

  public void setCar(double g)
  {
    gas = g;
    System.out.println("�K�\�����ʂ�" + gas + "�ɂ��܂����B");
  }

  public void setCar(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
  }

  public void setNumGas(int n, double g)
  {
    if(g>0 && g<1000){
      num = n;
      gas = g;
      System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
    }
    else{
      System.out.println(g + "�͐������K�\�����ʂł͂���܂���B");
      System.out.println("�K�\�����ʂ�ύX�ł��܂���ł����B");
    }
  }

  public void show()
  {
    System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
    System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
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
    Car car1 = new Car();

    //car1.num = 1234;
    //car1.gas = 20.5;

    car1.show();


  }

}
