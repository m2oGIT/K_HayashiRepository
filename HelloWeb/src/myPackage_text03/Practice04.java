/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Practice04 {

  /**
   * �~�����̒l��₤ <br />
   * �~��������� <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    System.out.println("�~�����̒l�͂����ł����H");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    double pi = Double.parseDouble(str);

    System.out.println("�~�����̒l��" + pi + "�ł��B");



  }

}
