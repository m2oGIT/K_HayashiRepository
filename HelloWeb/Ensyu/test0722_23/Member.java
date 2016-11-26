/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0722_23;

/**
 * �Ј����N���X <br />
 * �Ј����i�Ј�No�A���A���j�����ƂɈȉ��̏���������B <br />
 * �Ј����̐ݒ� <br />
 * �Ј����̉�ʕ\�� <br />
 * ���������`�F�b�N<br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */

public class Member {
  // �Ј�No
  private String id;
  // ���O
  private String firstName;
  // ��
  private String secondName;

  /**
   * �Ј����̐ݒ� <br />
   * �Ј����i�Ј�No�A���A���j��ݒ肷��B <br />
   *
   * @param id_X �Ј�No <br />
   * @param firstName_X �� <br />
   * @param secondName_X �� <br />
   */
  public Member(String id_X, String firstName_X, String secondName_X) {
    this.id = id_X;
    this.firstName = firstName_X;
    this.secondName = secondName_X;
  }

  /**
   * �Ј����̕\�� <br />
   * �Ј����i�Ј�No�A���A���A�����j��\������B <br />
   */
  public void showinfo() {
    System.out.println("�Ј�No�F" + this.id);
    System.out.println("���@�@�F" + this.secondName);
    System.out.println("���@�@�F" + this.firstName);
    System.out.println("�����@�F" + this.secondName + " " + this.firstName);
    System.out.println("");
  }

  /**
   * ���������`�F�b�N <br />
   * ���Ɛ������ꂼ�ꓙ���������肷��B <br />
   *
   * @param mem �Ј���� <br />
   */
  public void checkName(Member mem) {
    if (secondName.equals(mem.secondName) && firstName.equals(mem.firstName)) {
      System.out.println("�Ј�No=[" + this.id + "]�ƁA" + "�Ј�No=[" + mem.id + "]�͓��������ł�");
    } else {
      System.out.println("�Ј�No=[" + this.id + "]�ƁA" + "�Ј�No=[" + mem.id + "]�͓��������ł͂���܂���");
    }
  }

  // �ȉ���R�Œǉ�
  /**
   * ���̎擾 <br />
   * �����擾����B <br />
   *
   * @return this.firstName ��
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * ���̐ݒ� <br />
   * ����ݒ肷��B <br />
   *
   * @param firstName_X ��
   */
  public void setFirstName(String firstName_X) {
    this.firstName = firstName_X;
  }

  /**
   * �Ј�No�̎擾 <br />
   * �Ј�No���擾����B <br />
   *
   * @return this.id �Ј�No
   */
  public String getId() {
    return this.id;
  }

  /**
   * �Ј�No�̐ݒ� <br />
   * �Ј�No��ݒ肷��B <br />
   *
   * @param id_X �Ј�No
   */
  public void setId(String id_X) {
    this.id = id_X;
  }

  /**
   * ���̎擾 <br />
   * �����擾����B <br />
   *
   * @return this.secondName ��
   */
  public String getSecondName() {
    return this.secondName;
  }

  /**
   * ���̐ݒ� <br />
   * ����ݒ肷��B <br />
   *
   * @param secondName_X ��
   */
  public void setSecondName(String secondName_X) {
    this.secondName = secondName_X;
  }
}
