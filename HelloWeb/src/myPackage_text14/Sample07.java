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
public class Sample07 {

  /**
   * �i���\�b�h�_�����j <br />
   * �t�@�C���ɏo�͂��� <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    try{
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));

      pw.println("Hello!");
      pw.println("GoodBye!");
      System.out.println("�t�@�C���ɏ������݂܂����B");

      pw.close();
    }
    catch(IOException e){
      System.out.println("���o�̓G���[�ł��B");
    }
  }

}
