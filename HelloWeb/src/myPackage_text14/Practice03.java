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
public class Practice03 {

  /**
   * �i���\�b�h�_�����j <br />
   * �t�@�C��������͂��� <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    if(args.length != 1){
      System.out.println("�t�@�C�����𐳂����w�肵�Ă��������B");
      System.exit(1);
    }
    try{
      BufferedReader br = new BufferedReader(new FileReader(args[0]));

      String str;
      while((str =br.readLine()) != null){
        System.out.println(str);
      }
      br.close();
    }
    catch(IOException e){
      System.out.println("���o�̓G���[�ł��B");
    }
  }

}
