/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0717;

/**
 * �u*�v�̊K�i <br />
 * �u*�v�̊K�i����ʕ\������ <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */
public class Test13 {

  /**
   * ���C�����\�b�h �������N������ <br />
   * �u*�v�̊K�i����ʕ\������ <br />
   *
   * @param args ���s������
   */
  public static void main(String[] args) {
    // �u*�v�̊K�i��10�i�쐬����
    for (int i = 1; i <= 10; i++) {
      // i��j���������Ȃ�܂Łu*�v���o�͂���
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // i��j��菬�����Ƃ����s����
      System.out.println();
    }

  }

}
