/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text13;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
//�ԃN���X
public class Car {
  private int num;
  private double gas;

  public Car()
  {
    num = 0;
    gas = 0.0;
    System.out.println("�Ԃ��쐬���܂����B");
  }

  public void setCar(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
  }

  public void show()
  {
    System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
    System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
  }

}
