/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text07;

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
   * �z��v�f�̐�����͂��� <br />
   * �i�����j <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("�e�X�g�̎󌱎Ґ�����͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int num = Integer.parseInt(str);

    int[] test;
    test = new int[num];

    System.out.println("�l�����̓_������͂��Ă��������B");

    for(int i=0; i<num; i++){
      str = br.readLine();
      int tmp = Integer.parseInt(str);
      test[i]= tmp;
    }
    for(int i=0; i<num; i++){
      System.out.println((i+1) + "�Ԗڂ̐l�̓_����" + test[i] + "�ł��B");
    }


  }

}
