/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text03;

import java.io.*;
/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample04 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    System.out.println("���������͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    System.out.println(str + "�����͂���܂����B");
  }

}
