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
public class Practice02 {

  /**
   * ���ŏo�̓��b�Z�[�W��ς��� <br />
   * �L�[�{�[�h���琮���l����͂��A�ꍇ�ɉ����ă��b�Z�[�W��ύX���� <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("��������͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    int num = Integer.parseInt(str);

    int res = num % 2;

    if(res == 0){
      System.out.println(num + "�͋����ł��B");
    }
    else{
      System.out.println(num + "�͊�ł��B");
    }


  }

}
