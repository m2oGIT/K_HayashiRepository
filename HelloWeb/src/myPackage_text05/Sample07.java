/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample07 {

  /**
   * if ~ else if ~ else �@�_�����Z�q�ŏ������L�q<br />
   * �i�����j <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("���Ȃ��͒j���ł����H");
    System.out.println("Y�܂���N����͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    char res = str.charAt(0);

    if(res == 'Y' || res == 'y'){
      System.out.println("���Ȃ��͒j���ł��ˁB");
    }
    else if(res == 'N' || res == 'n'){
      System.out.println("���Ȃ��͏����ł��ˁB");
    }
    else{
      System.out.println("Y�܂���N����͂��Ă��������B");
    }
  }

}
