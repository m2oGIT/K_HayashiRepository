/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text10;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample01 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    String str = "Hello";

    char ch1 = str.charAt(0);
    char ch2 = str.charAt(1);

    int len = str.length();

    System.out.println(str + "��1�Ԗڂ̕�����" + ch1 + "�ł��B");

    System.out.println(str + "��2�Ԗڂ̕�����" + ch2 + "�ł��B");

    System.out.println(str + "�̒�����" + len + "�ł��B");
  }

}
