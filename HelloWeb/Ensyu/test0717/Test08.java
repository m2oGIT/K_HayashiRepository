/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0717;

/**
 * ���Z���� <br />
 * 1�`100�܂ł̐��l�����[�v�ŉ񂷁B��̏ꍇ�A���Z���� <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */
public class Test08 {

  /**
   * ���C�����\�b�h �������N�����܂��B <br />
   * 1�`100�܂ł̐��l�����[�v�ŉ񂷁B��̏ꍇ�A���Z���� <br />
   *
   * @param args ���s������
   */
  public static void main(String[] args) {
    // ���v
    int sum = 0;
    // 1�`100�܂ł̐��l�����[�v�ŉ�
    for (int i = 1; i <= 100; i++) {
      // ��̏ꍇ�A���Z����
      if (i % 2 == 1) {
        sum += i;
      }
    }
    // ���v��\��
    System.out.println("1�`100�܂ł̊�̍��v��" + sum + "�ł��B");
  }

}
