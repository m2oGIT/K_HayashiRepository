/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text04;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample09 {

  /**
   * �����ȃT�C�Y�̌^�ɑ������ <br />
   * double -> int <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // �傫�Ȍ^���珬���Ȍ^�ɑ������

    double dnum = 160.5;
    System.out.println("�g����" + dnum + "�Z���`�ł��B");

    System.out.println("int�^�̕ϐ��ɑ�����܂��B");
    int inum = (int)dnum;

    System.out.println("�g����" + inum + "�Z���`�ł��B");


  }

}
