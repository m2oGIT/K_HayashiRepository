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
public class Practice05 {

  /**
   * �g���Ƒ̏d����� <br />
   * �i�����j <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("�g���Ƒ̏d����͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();

    Double height = Double.parseDouble(str1);
    Double weight = Double.parseDouble(str2);

    System.out.println("�g����" + height + "�Z���`�ł��B");
    System.out.println("�̏d��" + weight + "�L���ł��B");

  }

}
