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
public class Practice05 {

  /**
   * �f������ <br />
   * �L�[�{�[�h���琮������͂����A���̐����f���ł��邩�ǂ����𔻒肷�� <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("2�ȏ�̐�������͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int num = Integer.parseInt(str);

    for(int i=2; i<=num; i++){
      if(i == num){
        System.out.println(num + "�͑f���ł��B");
      }
      else if(num%i == 0){
        System.out.println(num + "�͑f���ł͂���܂���B");
        break;
      }
    }

  }

    /*
    System.out.println("2�ȏ�̐�������͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int res = Integer.parseInt(str);

    boolean bl = false;

    for(int i=2; i<res; i++){
      if(res%i == 0){
        bl = true;
        break;
      }
    }

    if(bl == false){
      System.out.println(res + "�͑f���ł��B");
    }
    else{
        System.out.println(res + "�͑f���ł͂���܂���B");
    }
  }
  */

}
