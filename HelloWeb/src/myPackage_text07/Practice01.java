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
public class Practice01 {

  /**
   * �e���̓_���ƍō��_���o�͂��� <br />
   * �i�����j <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("5�l�̃e�X�g�̓_������͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] test= new int[5];

    for(int i=0; i<5; i++){
      String str = br.readLine();
      int num = Integer.parseInt(str);
      test[i] = num;
    }

    for(int i=0; i<5; i++){
      System.out.println((i+1) + "�Ԗڂ̐l�̓_����" + test[i] + "�ł��B");
    }

    int max=0;

    for(int i=0; i<5; i++){
      if(max < test[i]){
        max = test[i];
      }
    }

    System.out.println("�ō��_��" + max + "�_�ł��B");

  }

}
