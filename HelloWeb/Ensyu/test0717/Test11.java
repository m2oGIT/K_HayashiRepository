/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0717;

import java.math.BigDecimal;

/**
 * �v�Z���� <br />
 * 0.1��10�񑫂�����A10�{�ɂ������ʂ�\������ <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */
public class Test11 {

  /**
   * ���C�����\�b�h �������N������ <br />
   * 0.1��10�񑫂�����A10�{�ɂ������ʂ�\������ <br />
   *
   * @param args ���s������
   */
  public static void main(String[] args) {
    // �v�Z����
    BigDecimal ans = new BigDecimal("0.0");
    // ���l�u0.1�v
    BigDecimal p1 = new BigDecimal("0.1");
    // ���l�u10�v
    BigDecimal ten = new BigDecimal("10");

    // 0.1��10�񑫂�
    for (int i = 1; i <= 10; i++) {
      ans = ans.add(p1);
    }

    // 0.1��10�񑫂������ʂ�10�{�ɂ���
    ans = ans.multiply(ten);

    // �v�Z���ʂ��o�͂���
    System.out.println("0.1��10�񑫂�����A10�{�ɂ������ʁF" + ans);
  }

}
