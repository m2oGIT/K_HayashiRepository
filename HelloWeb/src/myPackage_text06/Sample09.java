/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample09 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    System.out.println("���ԖڂŃ��[�v�𒆎~���܂����H(1�`10)");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

    for(int i=1;i<=10;i++){
      System.out.println(i + "�Ԗڂ̏����ł��B");
      if(i == res)
        break;
    }

  }

}
