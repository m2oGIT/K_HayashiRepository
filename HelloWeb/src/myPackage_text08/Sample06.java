/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text08;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */


public class Sample06 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    Car car1 = new Car();

    car1.setNumGas(1234, 20.5);

    int number = car1.getNum();
    double gasoline = car1.getGas();

    System.out.println("�T���v������Ԃ𒲂ׂ��Ƃ���");
    System.out.println("�i���o�[��" + number + "�K�\�����ʂ�" + gasoline + "�ł����B");

  }

}