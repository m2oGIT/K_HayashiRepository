/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text04;

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
   * �O�p�`�̖ʐόv�Z <br />
   * �L�[�{�[�h������͂����O�p�`�̍����ƒ�ӂ̒�������ʐς����߂� <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("�O�p�`�̍����ƒ�ӂ���͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();

    int height = Integer.parseInt(str1);
    int weight = Integer.parseInt(str2);

    double menseki = (double)height*weight/2;

    System.out.println("�O�p�`�̖ʐς�" + menseki + "�ł��B");


  }

}
