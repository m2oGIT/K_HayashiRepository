/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text10;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */

public class Sample07 {

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

    System.out.print("car1������");
    car1.show();

    System.out.print("car2������");
    car2.show();

    System.out.println("car1�������ԂɕύX�������܂��B");
    car1.setCar(2345, 30.5);

    System.out.print("car1������");
    car1.show();

    System.out.print("car2������");
    car2.show();


  }

}
