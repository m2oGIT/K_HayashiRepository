/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text09;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */


public class Sample02 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    Car car1 = new Car();

    //���̂悤�ȃA�N�Z�X���ł��Ȃ��Ȃ�B
    //car1.num = 1234;
    //car1.gas = 20.5;

    car1.setNumGas(1234, 20.5);
    car1.show();

    System.out.println("�������Ȃ��K�\������(-10.0)���w�肵�Ă݂܂��B");

    car1.setNumGas(1234, -10.0);
    car1.show();

  }

}
