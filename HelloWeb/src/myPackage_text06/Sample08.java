/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text06;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Sample08 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    boolean bl = false;
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        if(bl==false){
          System.out.print("*");
          bl = true;
        }
        else{
          System.out.print("-");
          bl=false;
        }
      }
      System.out.print("\n");
    }

  }

}
