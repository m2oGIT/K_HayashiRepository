/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text09;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */


public class Sample03 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    Car car1 = new Car();

    car1.setNumGas(1234, 20.5);
    car1.show();

    System.out.println("�Ԃ̃i���o�[�����ύX���܂��B");
    car1.setCar(2345);
    car1.show();

    System.out.println("�K�\�����ʂ����ύX���܂��B");
    car1.setCar(30.5);
    car1.show();

  }

}
