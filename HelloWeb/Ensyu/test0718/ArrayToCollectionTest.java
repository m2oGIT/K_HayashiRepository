/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 最大値取得処理 <br />
 * コンソールより、整数を5回入力させ、最大値をコンソール出力する <br />
 * ただし、整数以外の入力があった場合は、エラーメッセージを表示し、処理を終了する <br />
 * 更新履歴 yyyy/mm/dd （更新者）：新規作成 <br />
 */
public class ArrayToCollectionTest {

  /**
   * メインメソッド 処理を起動する <br />
   * コンソールより、整数を5回入力させ、最大値をコンソール出力する <br />
   * ただし、整数以外の入力があった場合は、エラーメッセージを表示し、処理を終了する <br />
   *
   * @param args 実行時引数
   * @throws IOException IOエラー
   */
  public static void main(String[] args) throws IOException {
    // 入力指示を表示
    System.out.println("整数を5回入力してください。");
    System.out.println();

    // 入力内容を読み込むためのバッファー
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 入力内容を格納する配列
    ArrayList<Integer> array = new ArrayList<Integer>();

    // 整数を5回入力
    for (int i = 0; i < 5; i++) {
      // 入力内容をstrに格納
      String str = br.readLine();

      // 入力内容が整数の時、配列に格納
      // 入力内容が整数以外の時、エラーメッセージを表示し、処理を終了
      try {
        array.add(Integer.parseInt(str));
      } catch (NumberFormatException e) {
        System.out.println("整数ではありません。処理を終了します。");
      }
    }

    // 最大値
    int max = 0;
    // 最大値を求める
    for (int i = 0; i < array.size(); i++) {
      if (max < array.get(i)) {
        max = array.get(i);
      }
    }
    // 最大値を表示
    System.out.println("最大値は" + max);

    // 問2より追加の実装
    // 合計値
    int sum = 0;
    // 入力した5つの整数を合計する
    for (int i = 0; i < array.size(); i++) {
      sum += array.get(i);
    }

    // 合計値を表示
    System.out.println("合計値は" + sum);

    // 平均値
    double ave = 0.0;
    // 入力した5つの整数の平均値を求める
    ave = sum / array.size();
    // 平均値を表示
    System.out.println("平均値は" + ave);

  }

}
