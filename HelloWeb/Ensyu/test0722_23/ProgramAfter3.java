/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0722_23;

/**
 * �Ј����̉�ʕ\���ƕύX <br />
 * �Ј�����ݒ肵�A��ʂɕ\������B <br />
 * �܂��Ј����̕ύX�A�擾���s�Ȃ��B <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */

public class ProgramAfter3 {

  /**
   * �Ј����̉�ʕ\���ƕύX <br />
   * �Ј����i�Ј�No�A���O�A���j��ݒ肵�A��ʂɕ\������B <br />
   * �܂��Ј����̕ύX�A�擾���s�Ȃ��B <br />
   * �i���L�v���O�����ł͖��O�̕ύX�Ǝ擾���s�Ȃ��Ă���j
   *
   * @param args �N��������
   */
  public static void main(String[] args) {
    // �Ј��N���X
    Member member1 = new Member("00001", "��Y", "���");

    // �Ј�����\��
    member1.showinfo();

    // ���O��\��
    System.out.println("���O�A�ύX�O�F" + member1.getFirstName());
    // ���O��ύX
    member1.setFirstName("�Ԏq");
    // ���O��\��
    System.out.println("���O�A�ύX��F" + member1.getFirstName());
    System.out.println();

    // �Ј�����\��
    member1.showinfo();

  }
}
