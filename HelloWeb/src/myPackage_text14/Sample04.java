/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text14;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample04 {

  /**
   * �i���\�b�h�_�����j <br />
   * ��O�����itry�`catch�`finally�`�j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    try{
      int[] test;
      test = new int[5];

      System.out.println("test[10]�ɒl�������܂��B");

      test[10] = 80;
      System.out.println("test[10]��80�������܂����B");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("�z��̗v�f�������Ă��܂��B");
      System.out.println(e + "�Ƃ�����O���������܂����B");
    }

    System.out.println("�����I�����܂����B");

  }

}