/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample06 {

  /**
   * �i���\�b�h�_�����j <br />
   * ��ʁE�L�[�{�[�h������o�͂��� <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    System.out.println("���������͂��Ă��������B");

    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      System.out.println(str + "�����͂���܂����B");
    }
    catch(IOException e){
      System.out.println("���o�̓G���[�ł��B");
    }
  }

}
