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
public class Sample03 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    System.out.println("���������͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();

    System.out.println("������������͂��Ă��������B");

    String str2 = br.readLine();
    char ch = str2.charAt(0);

    int num = str1.indexOf(ch);

    if(num != -1)
      System.out.println(str1 + "��" + (num +1) + "�ԖڂɁu" + ch + "�v��������܂����B" );
    else
      System.out.println(str1 + "�Ɂu" + ch + "�v�͂���܂���B" );

  }

}
