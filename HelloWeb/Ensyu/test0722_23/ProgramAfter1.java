/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0722_23;

/**
 * 社員情報の画面表示と同姓同名チェック <br />
 * 社員情報の画面表示と同姓同名チェックを行なう。 <br />
 * 更新履歴 yyyy/mm/dd （更新者）：新規作成 <br />
 */

public class ProgramAfter1 {

  /**
   * 社員情報の画面表示と同姓同名チェック <br />
   * 社員情報（社員No、名前、姓）を一人ずつ設定し、画面表示を行なう。 <br />
   * また同姓同名チェックを行い、判定結果を画面表示する。 <br />
   *
   * @param args 起動時引数
   */

  public static void main(String[] args) {
    // 社員No
    String id1 = "00001";
    // 名
    String firstName1 = "一郎";
    // 姓
    String secondName1 = "鈴木";
    // 社員No
    String id2 = "00002";
    // 名
    String firstName2 = "一郎";
    // 姓
    String secondName2 = "鈴木";
    // 社員No
    String id3 = "00003";
    // 名
    String firstName3 = "三郎";
    // 姓
    String secondName3 = "鈴木";

    // 社員情報を表示（一人目）
    showinfo(id1, firstName1, secondName1);
    // 社員情報を表示（二人目）
    showinfo(id2, firstName2, secondName2);
    // 社員情報を表示（三人目）
    showinfo(id3, firstName3, secondName3);

    // 同姓同名チェック（一人目と二人目）
    checkName(id1, firstName1, secondName1, id2, firstName2, secondName2);
    // 同姓同名チェック（一人目と三人目）
    checkName(id1, firstName1, secondName1, id3, firstName3, secondName3);
    // 同姓同名チェック（二人目と三人目）
    checkName(id2, firstName2, secondName2, id3, firstName3, secondName3);

  }

  /**
   * 社員情報を表示 <br />
   * 社員情報（社員No、姓、名、姓名）を表示する。 <br />
   *
   * @param id 社員No
   * @param firstName 名
   * @param secondName 姓
   */
  public static void showinfo(String id, String firstName, String secondName) {
    // 社員Noを表示
    System.out.println("社員No：" + id);
    // 姓を表示
    System.out.println("姓　　：" + secondName);
    // 名を表示
    System.out.println("名　　：" + firstName);
    // 姓名を表示
    System.out.println("姓名　：" + secondName + " " + firstName);
    // 改行
    System.out.println("");
  }

  /**
   * 同姓同名チェック <br />
   * 名と姓がそれぞれ等しいか判定し、判定結果を画面表示する。 <br />
   *
   * @param id_1 社員No(一人目)
   * @param firstName_1 名(一人目)
   * @param secondName_1 姓(一人目)
   * @param id_2 社員No(二人目)
   * @param firstName_2 名(二人目)
   * @param secondName_2 姓(二人目)
   */
  public static void checkName(String id_1, String firstName_1, String secondName_1,
      String id_2, String firstName_2, String secondName_2) {
    if (secondName_1.equals(secondName_2) && firstName_1.equals(firstName_2)) {
      System.out.println("社員No=[" + id_1 + "]と、" + "社員No=[" + id_2 + "]は同姓同名です");
    } else {
      System.out.println("社員No=[" + id_1 + "]と、" + "社員No=[" + id_2 + "]は同姓同名ではありません");
    }
  }
}
