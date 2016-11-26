/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text06;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Practice03 {

  /**
   * 九九の表 <br />
   * タブを使って、九九の表を出力する <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    for(int i=1; i<10; i++){
      for (int j=1; j<10; j++){
        System.out.print(i*j + "\t");
      }
      System.out.print("\n");
    }

  }

}
