/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text14;

import java.io.*;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample09 {

  /**
   * �i���\�b�h�_�����j <br />
   * �t�@�C��������͂��� <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    try{
      BufferedReader br = new BufferedReader(new FileReader("test2.txt"));

      int[] test = new int[8];
      String str;

      for(int i=0; i<test.length; i++){
        str = br.readLine();
        test[i] = Integer.parseInt(str);
      }

      int max = test[0];
      int min = test[1];
      for(int i=0; i<test.length; i++){
        if(max < test[i])
          max = test[i];
        if(min > test[i])
          min = test[i];
        System.out.println(test[i]);
      }

      System.out.println("�ō��_��" + max + "�ł��B");
      System.out.println("�Œ�_��" + min + "�ł��B");

      br.close();
    }
    catch(IOException e){
      System.out.println("���o�̓G���[�ł��B");
    }
  }

}
