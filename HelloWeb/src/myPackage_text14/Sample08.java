/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text14;

import java.io.*;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample08 {

  /**
   * �i���\�b�h�_�����j <br />
   * �t�@�C��������͂��� <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    try{
      BufferedReader br = new BufferedReader(new FileReader("test1.txt"));

      String str1 =br.readLine();
      String str2 =br.readLine();

      System.out.println("�t�@�C���ɏ������܂�Ă���2�̕������");
      System.out.println(str1 + "�ł��B");
      System.out.println(str2 + "�ł��B");

      br.close();
    }
    catch(IOException e){
      System.out.println("���o�̓G���[�ł��B");
    }
  }

}
