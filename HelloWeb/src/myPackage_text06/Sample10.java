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
public class Sample10 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    System.out.println("���т���͂��Ă��������B(1�`5)");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int res = Integer.parseInt(str);

    switch(res){
      case 1:
      case 2:
        System.out.println("������������΂�܂��傤�B");
        break;
      case 3:
      case 4:
        System.out.println("���̒��q�ł���΂�܂��傤�B");
        break;
      case 5:
        System.out.println("�����ւ�D�G�ł��B");
        break;
      default:
        System.out.println("1�`5�܂ł̐��т���͂��Ă��������B");
        break;
    }


  }

}
