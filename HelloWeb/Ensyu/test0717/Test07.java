/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0717;

/**
 * ���Z���� <br />
 * 1�`100�܂ł̐��l�����[�v�ŉ񂵂āA���Z���� <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */
public class Test07 {

  /**
   * ���C�����\�b�h �������N�����܂��B <br />
   * 1�`100�܂ł̐��l�����[�v�ŉ񂵂āA���Z���� <br />
   *
   * @param args ���s������
   */
  public static void main(String[] args) {
    // ���v
    int sum = 0;
    // 1�`100�܂ł̐��l�����[�v�ŉ񂵂āA���Z����
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    // ���v�̕\��
    System.out.println("1�`100�܂ł̍��v��" + sum + "�ł��B");
  }

}
