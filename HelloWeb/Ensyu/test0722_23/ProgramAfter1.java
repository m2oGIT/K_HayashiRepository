/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0722_23;

/**
 * �Ј����̉�ʕ\���Ɠ��������`�F�b�N <br />
 * �Ј����̉�ʕ\���Ɠ��������`�F�b�N���s�Ȃ��B <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */

public class ProgramAfter1 {

  /**
   * �Ј����̉�ʕ\���Ɠ��������`�F�b�N <br />
   * �Ј����i�Ј�No�A���O�A���j����l���ݒ肵�A��ʕ\�����s�Ȃ��B <br />
   * �܂����������`�F�b�N���s���A���茋�ʂ���ʕ\������B <br />
   *
   * @param args �N��������
   */

  public static void main(String[] args) {
    // �Ј�No
    String id1 = "00001";
    // ��
    String firstName1 = "��Y";
    // ��
    String secondName1 = "���";
    // �Ј�No
    String id2 = "00002";
    // ��
    String firstName2 = "��Y";
    // ��
    String secondName2 = "���";
    // �Ј�No
    String id3 = "00003";
    // ��
    String firstName3 = "�O�Y";
    // ��
    String secondName3 = "���";

    // �Ј�����\���i��l�ځj
    showinfo(id1, firstName1, secondName1);
    // �Ј�����\���i��l�ځj
    showinfo(id2, firstName2, secondName2);
    // �Ј�����\���i�O�l�ځj
    showinfo(id3, firstName3, secondName3);

    // ���������`�F�b�N�i��l�ڂƓ�l�ځj
    checkName(id1, firstName1, secondName1, id2, firstName2, secondName2);
    // ���������`�F�b�N�i��l�ڂƎO�l�ځj
    checkName(id1, firstName1, secondName1, id3, firstName3, secondName3);
    // ���������`�F�b�N�i��l�ڂƎO�l�ځj
    checkName(id2, firstName2, secondName2, id3, firstName3, secondName3);

  }

  /**
   * �Ј�����\�� <br />
   * �Ј����i�Ј�No�A���A���A�����j��\������B <br />
   *
   * @param id �Ј�No
   * @param firstName ��
   * @param secondName ��
   */
  public static void showinfo(String id, String firstName, String secondName) {
    // �Ј�No��\��
    System.out.println("�Ј�No�F" + id);
    // ����\��
    System.out.println("���@�@�F" + secondName);
    // ����\��
    System.out.println("���@�@�F" + firstName);
    // ������\��
    System.out.println("�����@�F" + secondName + " " + firstName);
    // ���s
    System.out.println("");
  }

  /**
   * ���������`�F�b�N <br />
   * ���Ɛ������ꂼ�ꓙ���������肵�A���茋�ʂ���ʕ\������B <br />
   *
   * @param id_1 �Ј�No(��l��)
   * @param firstName_1 ��(��l��)
   * @param secondName_1 ��(��l��)
   * @param id_2 �Ј�No(��l��)
   * @param firstName_2 ��(��l��)
   * @param secondName_2 ��(��l��)
   */
  public static void checkName(String id_1, String firstName_1, String secondName_1,
      String id_2, String firstName_2, String secondName_2) {
    if (secondName_1.equals(secondName_2) && firstName_1.equals(firstName_2)) {
      System.out.println("�Ј�No=[" + id_1 + "]�ƁA" + "�Ј�No=[" + id_2 + "]�͓��������ł�");
    } else {
      System.out.println("�Ј�No=[" + id_1 + "]�ƁA" + "�Ј�No=[" + id_2 + "]�͓��������ł͂���܂���");
    }
  }
}
