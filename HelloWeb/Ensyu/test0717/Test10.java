/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0717;

/**
 * 加算処理 <br />
 * 渡された2種類の整数の間の数をすべて合計する <br />
 * 更新履歴 yyyy/mm/dd （更新者）：新規作成 <br />
 */
public class Test10 {

  /**
   * メインメソッド 処理を起動します。 <br />
   * 渡された2種類の整数の間の数をすべて合計する <br />
   *
   * @param args 実行時引数
   */
  public static void main(String[] args) {
    // 実行時引数をString型からint型へ型変換する
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    // 合計の表示
    System.out.println(args[0] + "～" + args[1] + "までの合計は" + goukei(num1, num2) + "です。");
  }

  /**
   * 渡された2種類の整数の間の数をすべて合計する <br />
   *
   * @param n1 実行時引数
   * @param n2 実行時引数
   * @return sum 合計
   */
  public static int goukei(int n1, int n2) {
    // 合計
    int sum = 0;

    // n1～n2までの数値をループで回して、加算する
    for (int i = n1; i <= n2; i++) {
      sum += i;
    }

    // 合計した値を返す
    return sum;
  }

}
