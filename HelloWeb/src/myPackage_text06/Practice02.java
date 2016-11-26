/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package myPackage_text06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * （クラス論理名） <br />
 * （説明） <br />
 * 更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Practice02 {

  /**
   * テスト点数合計 <br />
   * キーボードからテストの点数を入力させ、その合計点を出力する <br />
   *
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException {
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("テストの点数を入力してください。（0で終了）");

    int sum = 0;
    int res = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    do {

      String str = br.readLine();

      res = Integer.parseInt(str);

      if (res > 0) {
        sum = sum + res;
      }
    } while (res != 0);

    System.out.println("テストの合計点は" + sum + "です。");
  }

}
