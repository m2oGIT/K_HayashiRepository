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
public class Practice05 {

  /**
   * 1����5�܂ł�5�i�K�̐��т���͂����A�ꍇ�ɉ����ă��b�Z�[�W��ς��� <br />
   * �L�[�{�[�h����1����5�܂ł�5�i�K�̐��т���͂��A�ꍇ�ɉ����ă��b�Z�[�W��ύX���� <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("���т���͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    int num = Integer.parseInt(str);

    switch (num){
      case 1 :
        System.out.println("�����Ƃ���΂�܂��傤�B");
        break;
      case 2 :
        System.out.println("������������΂�܂��傤�B");
        break;
      case 3 :
        System.out.println("����ɏ���߂����܂��傤�B");
        break;
      case 4 :
        System.out.println("�����ւ�悭�ł��܂����B");
        break;
      case 5 :
        System.out.println("�����ւ�D�G�ł��B");
        break;
    }
  }

}
