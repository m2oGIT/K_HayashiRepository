/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text12;

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
  /**
 * �i���\�b�h�_�����j <br />
 * �i�����j <br />
 * @param args
 */
public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    Vehicle[] vc;
    vc = new Vehicle[2];

    vc[0] = new Car(1234,20.5);
    vc[1] = new Plane(232);

    for(int i=0;i<vc.length; i++){
      if(vc[i] instanceof Car)
        System.out.println((i+1) + "�Ԗڂ̃I�u�W�F�N�g��Car�N���X�ł��B");
      else
        System.out.println((i+1) + "�Ԗڂ̃I�u�W�F�N�g��Car�N���X�ł͂���܂���B");
    }


  }

}
