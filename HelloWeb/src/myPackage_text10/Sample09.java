/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text10;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */

public class Sample09 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args){
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    Car[] cars ;
    cars = new Car[3];

    for(int i=0; i<cars.length; i++){
      cars[i] = new Car();
    }

    cars[0].setCar(1234, 20.5);
    cars[1].setCar(2345, 30.5);
    cars[2].setCar(3456, 40.5);

    for(int i=0; i<cars.length; i++){
      cars[i].show();
    }

  }

}
