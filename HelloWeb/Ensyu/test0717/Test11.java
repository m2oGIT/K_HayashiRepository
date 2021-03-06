/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0717;

import java.math.BigDecimal;

/**
 * 計算処理 <br />
 * 0.1を10回足した後、10倍にした結果を表示する <br />
 * 更新履歴 yyyy/mm/dd （更新者）：新規作成 <br />
 */
public class Test11 {

  /**
   * メインメソッド 処理を起動する <br />
   * 0.1を10回足した後、10倍にした結果を表示する <br />
   *
   * @param args 実行時引数
   */
  public static void main(String[] args) {
    // 計算結果
    BigDecimal ans = new BigDecimal("0.0");
    // 数値「0.1」
    BigDecimal p1 = new BigDecimal("0.1");
    // 数値「10」
    BigDecimal ten = new BigDecimal("10");

    // 0.1を10回足す
    for (int i = 1; i <= 10; i++) {
      ans = ans.add(p1);
    }

    // 0.1を10回足した結果を10倍にする
    ans = ans.multiply(ten);

    // 計算結果を出力する
    System.out.println("0.1を10回足した後、10倍にした結果：" + ans);
  }

}
