/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0717;

/**
 * 「*」の階段 <br />
 * 「*」の階段を画面表示する <br />
 * 更新履歴 yyyy/mm/dd （更新者）：新規作成 <br />
 */
public class Test13 {

  /**
   * メインメソッド 処理を起動する <br />
   * 「*」の階段を画面表示する <br />
   *
   * @param args 実行時引数
   */
  public static void main(String[] args) {
    // 「*」の階段を10段作成する
    for (int i = 1; i <= 10; i++) {
      // iとjが等しくなるまで「*」を出力する
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // iがjより小さいとき改行する
      System.out.println();
    }

  }

}
