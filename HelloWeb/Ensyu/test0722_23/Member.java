/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0722_23;

/**
 * 社員情報クラス <br />
 * 社員情報（社員No、名、姓）をもとに以下の処理をする。 <br />
 * 社員情報の設定 <br />
 * 社員情報の画面表示 <br />
 * 同姓同名チェック<br />
 * 更新履歴 yyyy/mm/dd （更新者）：新規作成 <br />
 */

public class Member {
  // 社員No
  private String id;
  // 名前
  private String firstName;
  // 姓
  private String secondName;

  /**
   * 社員情報の設定 <br />
   * 社員情報（社員No、名、姓）を設定する。 <br />
   *
   * @param id_X 社員No <br />
   * @param firstName_X 名 <br />
   * @param secondName_X 姓 <br />
   */
  public Member(String id_X, String firstName_X, String secondName_X) {
    this.id = id_X;
    this.firstName = firstName_X;
    this.secondName = secondName_X;
  }

  /**
   * 社員情報の表示 <br />
   * 社員情報（社員No、姓、名、姓名）を表示する。 <br />
   */
  public void showinfo() {
    System.out.println("社員No：" + this.id);
    System.out.println("姓　　：" + this.secondName);
    System.out.println("名　　：" + this.firstName);
    System.out.println("姓名　：" + this.secondName + " " + this.firstName);
    System.out.println("");
  }

  /**
   * 同姓同名チェック <br />
   * 名と姓がそれぞれ等しいか判定する。 <br />
   *
   * @param mem 社員情報 <br />
   */
  public void checkName(Member mem) {
    if (secondName.equals(mem.secondName) && firstName.equals(mem.firstName)) {
      System.out.println("社員No=[" + this.id + "]と、" + "社員No=[" + mem.id + "]は同姓同名です");
    } else {
      System.out.println("社員No=[" + this.id + "]と、" + "社員No=[" + mem.id + "]は同姓同名ではありません");
    }
  }

  // 以下問３で追加
  /**
   * 名の取得 <br />
   * 名を取得する。 <br />
   *
   * @return this.firstName 名
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * 名の設定 <br />
   * 名を設定する。 <br />
   *
   * @param firstName_X 名
   */
  public void setFirstName(String firstName_X) {
    this.firstName = firstName_X;
  }

  /**
   * 社員Noの取得 <br />
   * 社員Noを取得する。 <br />
   *
   * @return this.id 社員No
   */
  public String getId() {
    return this.id;
  }

  /**
   * 社員Noの設定 <br />
   * 社員Noを設定する。 <br />
   *
   * @param id_X 社員No
   */
  public void setId(String id_X) {
    this.id = id_X;
  }

  /**
   * 姓の取得 <br />
   * 姓を取得する。 <br />
   *
   * @return this.secondName 姓
   */
  public String getSecondName() {
    return this.secondName;
  }

  /**
   * 姓の設定 <br />
   * 姓を設定する。 <br />
   *
   * @param secondName_X 姓
   */
  public void setSecondName(String secondName_X) {
    this.secondName = secondName_X;
  }
}
