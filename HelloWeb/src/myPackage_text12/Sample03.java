/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text12;

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
  /**
 * �i���\�b�h�_�����j <br />
 * �i�����j <br />
 * @param args
 */
public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    iVehicle[] ivc;
    ivc = new iVehicle[2];

    ivc[0] = new Car2(1234,20.5);
    ivc[1] = new Plane2(232);

    for(int i=0;i<ivc.length; i++){
      ivc[i].vshow();
    }
  }

}
