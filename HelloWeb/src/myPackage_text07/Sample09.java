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
public class Sample09 {

  /**
   * �z��̓��e���\�[�g���� <br />
   * �i�����j <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args)  throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] test = new int[5];
    System.out.println(test.length + "�l�̓_������͂��Ă��������B");

    for(int i=0; i<test.length; i++){
      String str = br.readLine();
      test[i] = Integer.parseInt(str);
    }
    for(int s=0; s<test.length-1; s++){
      for(int t=s+1;t<test.length; t++){
        if(test[t] > test[s]){
          int tmp = test[t];
          test[t] = test[s];
          test[s] = tmp;
        }
      }
    }

    for(int j=0; j<test.length; j++){
      System.out.println((j+1) + "�Ԗڂ̐l�̓_����" + test[j] + "�ł��B");
    }
    }
}
