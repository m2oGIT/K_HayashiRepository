/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text10;

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
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   * @throws IOException ����
   */
  public static void main(String[] args) throws IOException{
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    System.out.println("���������͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();

    char sounyu ='a';
    System.out.println("a�̑}���ʒu�𐮐��œ��͂��Ă��������B");

    String str2 = br.readLine();
    int iti = Integer.parseInt(str2);

    StringBuffer sb = new StringBuffer(str1);
    sb.insert(iti, sounyu);

    System.out.println(sb + "�ɂȂ�܂����B");

  }

}
