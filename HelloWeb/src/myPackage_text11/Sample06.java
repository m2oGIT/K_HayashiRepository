/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text11;


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
   Car[] cars;
   cars = new Car[2];

   cars[0] = new Car();
   cars[0].setCar(12334, 20.5);

   cars[1] = new RacingCar();
   cars[1].setCar(4567, 30.5);

   for(int i=1;i<cars.length;i++){
     cars[i].show();
   }

  }

}
