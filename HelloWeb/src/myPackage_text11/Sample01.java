/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text11;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */

//�ԃN���X
class Car
{
  protected int num;
  protected double gas;

  public Car()
  {
    num = 0;
    gas = 0.0;
    System.out.println("�Ԃ��쐬���܂����B");
  }

  public Car(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
  }

  public void setCar(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
  }

  public String toString()
  {
    String str = "�i���o�[" + num + "�K�\������" + gas + "�̎�";
    return str;
  }


  public void show()
  {
    System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
    System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
  }
}

//���[�V���O�J�[�N���X
class RacingCar extends Car
{
  private int course;

  public RacingCar()
  {
    course = 0;
    System.out.println("���[�V���O�J�[���쐬���܂����B");
  }

  public RacingCar(int n,double g,int c)
  {
    super(n,g);
    course = c;
    System.out.println("�R�[�X�ԍ�" + course + "�̃��[�V���O�J�[���쐬���܂����B");
  }

  public void setCourse(int c)
  {
    course = c;
    System.out.println("�R�[�X�ԍ���" + course + "�ɂ��܂����B");
  }

  public void show()
  {
    System.out.println("���[�V���O�J�[�̃i���o�[��"+ num + "�ł��B");
    System.out.println("�K�\�����ʂ�"+ gas + "�ł��B");
    System.out.println("�R�[�X�ԍ���"+ course + "�ł��B");

  }

}


public class Sample01 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args �N������
   */
  public static void main(String[] args) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    RacingCar rccar1;
    rccar1 = new RacingCar();

    rccar1.setCar(1234, 20.5);
    rccar1.setCourse(5);

  }

}
