/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample07 {

  /**
   * if ~ else if ~ else 　論理演算子で条件を記述<br />
   * （説明） <br />
   * @param args 起動因数
   * @throws IOException 入力
   */
  public static void main(String[] args) throws IOException{
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("あなたは男性ですか？");
    System.out.println("YまたはNを入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    char res = str.charAt(0);

    if(res == 'Y' || res == 'y'){
      System.out.println("あなたは男性ですね。");
    }
    else if(res == 'N' || res == 'n'){
      System.out.println("あなたは女性ですね。");
    }
    else{
      System.out.println("YまたはNを入力してください。");
    }
  }

}
