/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text07;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample07 {

  /**
   * �z��̒�����m�� <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    int[] test= {80,60,22,50,75};

    for(int i=0; i<5; i++){
      System.out.println((i+1) + "�Ԗڂ̐l�̓_����" + test[i] + "�ł��B");
    }

    System.out.println("�e�X�g�̎󌱎҂�" + test.length + "�l�ł��B");

  }

}
