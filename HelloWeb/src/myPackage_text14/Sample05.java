/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text14;

/**
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
class CarException extends Exception
{
}

//車クラス
class Car
{
  private int num;
  private double gas;

  public Car()
  {
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }
  public void setCar(int n,double g) throws CarException
  {
    if(g < 0){
      CarException e = new CarException();
      throw e;
    }
    else{
      num = n;
      gas = g;
      System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }
  }
  public void show()
  {
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }
}


public class Sample05 {

  /**
   * （メソッド論理名） <br />
   * 例外の送出 <br />
   * @param args 起動因数
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Car car1 = new Car();
    try{
      car1.setCar(1234, -10.0);
    }
    catch(CarException e){
      System.out.println(e + "が送出されました。");
    }
    car1.show();
  }

}
