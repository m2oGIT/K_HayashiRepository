/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text07;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample10 {

  /**
   * �������z����g�� <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    int[][] test;
    test = new int[2][5];

    test[0][0] =80;
    test[0][1] =60;
    test[0][2] =22;
    test[0][3] =50;
    test[0][4] =75;

    test[1][0] =90;
    test[1][1] =55;
    test[1][2] =68;
    test[1][3] =72;
    test[1][4] =58;

    for(int i=0; i<5; i++){
      System.out.println((i+1) + "�Ԗڂ̐l�̍���̓_����" + test[0][i] + "�ł��B");
      System.out.println((i+1) + "�Ԗڂ̐l�̎Z���̓_����" + test[1][i] + "�ł��B");
    }

  }

}
