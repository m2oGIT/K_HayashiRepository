/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text07;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample01 {

  /**
   * �z����g�� <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    int[] test;
    test = new int[5];

    test[0] =80;
    test[1] =60;
    test[2] =22;
    test[3] =50;
    test[4] =75;

    for(int i=0; i<5; i++){
      System.out.println((i+1) + "�Ԗڂ̐l�̓_����" + test[i] + "�ł��B");
    }

  }

}
