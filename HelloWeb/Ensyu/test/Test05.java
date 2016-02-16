/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test;

/**
 * コンソール表示 <br />
 * コンソールに表示する <br />
 * 更新履歴 yyyy/mm/dd （更新者）：新規作成 <br />
 */
public class Test05 {

  /**
   * メインメソッド 処理を起動します。 <br />
   * 複数の文字列を起動時引数に渡して、コンソールに表示する <br />
   *
   * @param args 起動時引数
   */
  public static void main(String[] args) {
    // 起動時引数で与えた任意の文字列を表示する
    System.out.println(args[0]);
    System.out.println(args[1]);
  }

}
