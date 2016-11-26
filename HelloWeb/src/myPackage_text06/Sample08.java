/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text06;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample08 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
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
