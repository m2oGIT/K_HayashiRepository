/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0717;

/**
 * ���Z���� <br />
 * 1�`���s�������܂ł̐��l�����[�v�ŉ񂵂āA���Z���� <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */
public class Test09 {

  /**
   * ���C�����\�b�h �������N�����܂��B <br />
   * 1�`���s�������܂ł̐��l�����[�v�ŉ񂵂āA���Z���� <br />
   *
   * @param args ���s������
   */
  public static void main(String[] args) {
    // ���s��������String�^����int�^�֌^�ϊ�����
    int num = Integer.parseInt(args[0]);

    // ���v
    int sum = 0;
    // 1�`���s�������܂ł̐��l�����[�v�ŉ񂵂āA���Z����
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    // ���v�̕\��
    System.out.println("1�`" + args[0] + "�܂ł̍��v��" + sum + "�ł��B");
  }

}
