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
public class Practice03 {

  /**
   * 2�̐������r���A�ꍇ�ɉ����ă��b�Z�[�W��ς��� <br />
   * �L�[�{�[�h����2�̐����l����͂��A�ꍇ�ɉ����ă��b�Z�[�W��ύX���� <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("2�̐�������͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();

    int num1 = Integer.parseInt(str1);
    int num2 = Integer.parseInt(str2);

    if(num1 == num2){
      System.out.println("2�̐��͓����l�ł��B");
    }
    else if(num1 < num2){
      System.out.println(num1 + "���" + num2 + "�̂ق����傫���l�ł��B");
    }
    else{
      System.out.println(num2 + "���" + num1 + "�̂ق����傫���l�ł��B");
    }
  }

}
