/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text14;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Sample04 {

  /**
   * （メソッド論理名） <br />
   * 例外処理（try〜catch〜finally〜） <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    try{
      int[] test;
      test = new int[5];

      System.out.println("test[10]に値を代入します。");

      test[10] = 80;
      System.out.println("test[10]に80を代入しました。");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("配列の要素をこえています。");
      System.out.println(e + "という例外が発生しました。");
    }

    System.out.println("無事終了しました。");

  }

}
