/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text11;


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
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
   Car[] cars;
   cars = new Car[2];

   cars[0] = new Car();
   cars[1] = new RacingCar();

   for(int i=0; i<cars.length;i++){
     Class cl = cars[i].getClass();
     System.out.println((i+1) + "�Ԗڂ̃I�u�W�F�N�g��" + cl + "�ł��B");
   }
   }

}
