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
public class Practice03 {

  /**
   * ���Ȃ��͉��΂ł����H <br />
   * �΂���͂���B <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    System.out.println("���Ȃ��͉��΂ł����H");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    int num = Integer.parseInt(str);

    System.out.println("���Ȃ���" + num + "�΂ł��B");


  }

}
