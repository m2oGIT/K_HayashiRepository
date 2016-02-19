/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0717;

/**
 * 加算処理 <br />
 * 1～100までの数値をループで回して、加算する <br />
 * 更新履歴 yyyy/mm/dd （更新者）：新規作成 <br />
 */
public class Test07 {

  /**
   * メインメソッド 処理を起動します。 <br />
   * 1～100までの数値をループで回して、加算する <br />
   *
   * @param args 実行時引数
   */
  public static void main(String[] args) {
    // 合計
    int sum = 0;
    // 1～100までの数値をループで回して、加算する
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    // 合計の表示
    System.out.println("1～100までの合計は" + sum + "です。");
  }

}
