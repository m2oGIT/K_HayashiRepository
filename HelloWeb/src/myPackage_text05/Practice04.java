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
public class Practice04{

  /**
   * �����l���画�f���ďo�̓��b�Z�[�W��ς��� <br />
   * �L�[�{�[�h���琮���l����͂��A�ꍇ�ɉ����ă��b�Z�[�W��ύX���� <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("0�`10�܂ł̐�������͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    int res = Integer.parseInt(str);

    if(res >= 0 && res <=10){
      System.out.println("�����ł��B");
    }
    else{
      System.out.println("�܂������ł��B");
    }


  }

}
