/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0717;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���s�����\������ <br />
 * ���s����������yyyy/mm/dd HH:MM:SS �ŕ\������ <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */
public class Test12 {

  /**
   * ���C�����\�b�h �������N������ <br />
   * ���s����������yyyy/mm/dd HH:MM:SS �ŕ\������ <br />
   *
   * @param args ���s������
   */
  public static void main(String[] args) {
    // ���t
    Date d = new Date();
    // ���t�̃t�H�[�}�b�g
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy'/'MM'/'dd'/' HH:mm:ss ");

    // ���s������\������
    System.out.println("���s������" + sdf1.format(d) + "�ł��B");
  }

}
