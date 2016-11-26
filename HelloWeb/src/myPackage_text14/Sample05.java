/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text14;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
class CarException extends Exception
{
}

//�ԃN���X
class Car
{
  private int num;
  private double gas;

  public Car()
  {
    num = 0;
    gas = 0.0;
    System.out.println("�Ԃ��쐬���܂����B");
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
      System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
    }
  }
  public void show()
  {
    System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
    System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
  }
}


public class Sample05 {

  /**
   * �i���\�b�h�_�����j <br />
   * ��O�̑��o <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    Car car1 = new Car();
    try{
      car1.setCar(1234, -10.0);
    }
    catch(CarException e){
      System.out.println(e + "�����o����܂����B");
    }
    car1.show();
  }

}
