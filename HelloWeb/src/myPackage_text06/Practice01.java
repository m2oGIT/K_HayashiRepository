/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text06;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Practice01 {

  /**
   * 1〜10までの偶数を出力 <br />
   * （説明） <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("1〜10までの偶数を出力します。");

    for(int i=1; i<=10; i++){
      if(i%2==0){
        System.out.println(i);
      }
    }

  }

}
