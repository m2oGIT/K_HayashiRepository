/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package myPackage_text06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �i�N���X�_�����j <br />
 * �i�����j <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Practice02 {

  /**
   * �e�X�g�_�����v <br />
   * �L�[�{�[�h����e�X�g�̓_������͂����A���̍��v�_���o�͂��� <br />
   *
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException {
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("�e�X�g�̓_������͂��Ă��������B�i0�ŏI���j");

    int sum = 0;
    int res = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    do {

      String str = br.readLine();

      res = Integer.parseInt(str);

      if (res > 0) {
        sum = sum + res;
      }
    } while (res != 0);

    System.out.println("�e�X�g�̍��v�_��" + sum + "�ł��B");
  }

}
