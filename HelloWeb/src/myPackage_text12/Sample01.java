/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */
package myPackage_text12;

/**
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
//�̂���̃C���^�[�t�F�C�X
interface iVehicle
{
  void vshow();
}
//�ޗ��C���^�[�t�F�C�X
interface iMaterial
{
  void mshow();
}

//�ԃN���X
class Car2 implements iVehicle,iMaterial
{
  private int num;
  private double gas;

public Car2(int n, double g)
{
  num = n;
  gas = g;
  System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
}

public void vshow()
{
  System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
  System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
}
public void mshow()
{
  System.out.println("�Ԃ̍ގ��͓S�ł��B");
}


}

//��s�@�N���X
class Plane2 implements iVehicle,iMaterial
{
private int flight;

public Plane2(int f)
{
  flight = f;
  System.out.println("��" + flight + "�̔�s�@���쐬���܂����B");
}

public void vshow()
{
  System.out.println("��s�@�̕ւ�" + flight + "�ł��B");
}

public void mshow()
{
  System.out.println("��s�@�̍ގ��͓S�ł��B");
}


}

//�̂���̃N���X
abstract class Vehicle
{
  protected int speed;
  public void setSpeed(int s)
  {
    speed = s;
    System.out.println("���x��" + speed + "�ɂ��܂����B");
  }

  abstract void show();
}


//�ԃN���X
class Car extends Vehicle
{
  private int num;
  private double gas;

  public Car(int n, double g)
  {
    num = n;
    gas = g;
    System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
  }

  public void show()
  {
    System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
    System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
    System.out.println("���x��" + speed + "�ł��B");
  }
}

//��s�@�N���X
class Plane extends Vehicle
{
  private int flight;

  public Plane(int f)
  {
    flight = f;
    System.out.println("��" + flight + "�̔�s�@���쐬���܂����B");
  }

  public void show()
  {
    System.out.println("��s�@�̕ւ�" + flight + "�ł��B");
    System.out.println("���x��" + speed + "�ł��B");
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

    Vehicle[] vc;
    vc = new Vehicle[2];

    vc[0] = new Car(1234,20.5);
    vc[0].setSpeed(60);

    vc[1] = new Plane(232);
    vc[1].setSpeed(500);

    for(int i=0; i<vc.length; i++)
    {
      vc[i].show();
    }
  }

}
