/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0722_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 文字列の表示処理 <br />
 * コンソールから入力された複数行の文字列をため込み、 <br />
 * あらかじめ定義された終了文字（end）が入力された場合に、一括で出力する処理を作成する。 <br />
 * 更新履歴 yyyy/mm/dd （更新者）：新規作成 <br />
 */
public class ConsoleInTest {

  /**
   * 文字列の表示処理 <br />
   * コンソールから入力された複数行の文字列をため込み、 <br />
   * あらかじめ定義された終了文字（end）が入力された場合に、一括で出力する処理を作成する。 <br />
   *
   * @param args 起動時引数
   * @throws IOException IOエラー
   */
  public static void main(String[] args) throws IOException {
    // 入力指示を画面に表示する
    System.out.println("文字列を入力してください。");
    System.out.println("endの入力で終了します。");
    System.out.println();

    // コンソールから文字列を読み込むためのバッファー
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 入力した文字列をstrに読み込む
    String str = br.readLine();
    // 入力した文字列をsbに溜め込むためのバッファー
    StringBuffer sb = new StringBuffer();

    // 入力した文字列を溜め込む
    // 入力した文字列がendの場合、溜めた文字列の出力を行なう
    while (!str.equals("end")) {
      // 文字列をsbの最後尾に追加する
      sb.append(str);
      // 入力した文字列をstrに読み込む
      str = br.readLine();
    }

    // 溜めた文字列の出力
    System.out.println("溜めた文字列を出力します。" + sb);

  }

}
