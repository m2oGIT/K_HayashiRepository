/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text11;


/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample04 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
   RacingCar rccar1 = new RacingCar();

   rccar1.setCar(1234, 20.5);
   rccar1.setCourse(5);

   rccar1.show();

  }

}
