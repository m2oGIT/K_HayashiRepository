/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0717;

/**
 * ���Z���� <br />
 * �n���ꂽ2��ނ̐����̊Ԃ̐������ׂč��v���� <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */
public class Test10 {

  /**
   * ���C�����\�b�h �������N�����܂��B <br />
   * �n���ꂽ2��ނ̐����̊Ԃ̐������ׂč��v���� <br />
   *
   * @param args ���s������
   */
  public static void main(String[] args) {
    // ���s��������String�^����int�^�֌^�ϊ�����
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    // ���v�̕\��
    System.out.println(args[0] + "�`" + args[1] + "�܂ł̍��v��" + goukei(num1, num2) + "�ł��B");
  }

  /**
   * �n���ꂽ2��ނ̐����̊Ԃ̐������ׂč��v���� <br />
   *
   * @param n1 ���s������
   * @param n2 ���s������
   * @return sum ���v
   */
  public static int goukei(int n1, int n2) {
    // ���v
    int sum = 0;

    // n1�`n2�܂ł̐��l�����[�v�ŉ񂵂āA���Z����
    for (int i = n1; i <= n2; i++) {
      sum += i;
    }

    // ���v�����l��Ԃ�
    return sum;
  }

}
