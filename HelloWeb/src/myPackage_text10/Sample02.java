/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample02 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    System.out.println("�p������͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    String stru = str.toUpperCase();
    String strl = str.toLowerCase();

    System.out.println("�啶���ɕϊ������" + stru + "�ł��B");
    System.out.println("�������ɕϊ������" + strl + "�ł��B");
  }

}
