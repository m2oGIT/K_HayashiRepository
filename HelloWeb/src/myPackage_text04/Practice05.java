/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Practice05 {

  /**
   * 5�Ȗڂ̃e�X�g�̍��v�_�ƕ��ϓ_ <br />
   * �L�[�{�[�h������͂���5�Ȗڂ̃e�X�g�̓_�����獇�v�_�ƕ��ϓ_�����߂� <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("�Ȗ�1�`5�̓_������͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();
    String str3 = br.readLine();
    String str4 = br.readLine();
    String str5 = br.readLine();

    int kamoku1 = Integer.parseInt(str1);
    int kamoku2 = Integer.parseInt(str2);
    int kamoku3 = Integer.parseInt(str3);
    int kamoku4 = Integer.parseInt(str4);
    int kamoku5 = Integer.parseInt(str5);

    int sum = kamoku1+kamoku2+kamoku3+kamoku4+kamoku5;
    double ave = (double)sum/5;

    System.out.println("5�Ȗڂ̍��v�_��" + sum + "�ł��B");
    System.out.println("5�Ȗڂ̕��ϓ_��" + ave + "�ł��B");



  }

}
