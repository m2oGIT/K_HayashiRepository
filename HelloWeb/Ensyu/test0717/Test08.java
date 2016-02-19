/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0717;

/**
 * 加算処理 <br />
 * 1～100までの数値をループで回す。奇数の場合、加算する <br />
 * 更新履歴 yyyy/mm/dd （更新者）：新規作成 <br />
 */
public class Test08 {

  /**
   * メインメソッド 処理を起動します。 <br />
   * 1～100までの数値をループで回す。奇数の場合、加算する <br />
   *
   * @param args 実行時引数
   */
  public static void main(String[] args) {
    // 合計
    int sum = 0;
    // 1～100までの数値をループで回す
    for (int i = 1; i <= 100; i++) {
      // 奇数の場合、加算する
      if (i % 2 == 1) {
        sum += i;
      }
    }
    // 合計を表示
    System.out.println("1～100までの奇数の合計は" + sum + "です。");
  }

}
