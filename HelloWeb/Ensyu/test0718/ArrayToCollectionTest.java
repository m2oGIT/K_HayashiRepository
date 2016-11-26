/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * �ő�l�擾���� <br />
 * �R���\�[�����A������5����͂����A�ő�l���R���\�[���o�͂��� <br />
 * �������A�����ȊO�̓��͂��������ꍇ�́A�G���[���b�Z�[�W��\�����A�������I������ <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */
public class ArrayToCollectionTest {

  /**
   * ���C�����\�b�h �������N������ <br />
   * �R���\�[�����A������5����͂����A�ő�l���R���\�[���o�͂��� <br />
   * �������A�����ȊO�̓��͂��������ꍇ�́A�G���[���b�Z�[�W��\�����A�������I������ <br />
   *
   * @param args ���s������
   * @throws IOException IO�G���[
   */
  public static void main(String[] args) throws IOException {
    // ���͎w����\��
    System.out.println("������5����͂��Ă��������B");
    System.out.println();

    // ���͓��e��ǂݍ��ނ��߂̃o�b�t�@�[
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // ���͓��e���i�[����z��
    ArrayList<Integer> array = new ArrayList<Integer>();

    // ������5�����
    for (int i = 0; i < 5; i++) {
      // ���͓��e��str�Ɋi�[
      String str = br.readLine();

      // ���͓��e�������̎��A�z��Ɋi�[
      // ���͓��e�������ȊO�̎��A�G���[���b�Z�[�W��\�����A�������I��
      try {
        array.add(Integer.parseInt(str));
      } catch (NumberFormatException e) {
        System.out.println("�����ł͂���܂���B�������I�����܂��B");
      }
    }

    // �ő�l
    int max = 0;
    // �ő�l�����߂�
    for (int i = 0; i < array.size(); i++) {
      if (max < array.get(i)) {
        max = array.get(i);
      }
    }
    // �ő�l��\��
    System.out.println("�ő�l��" + max);

    // ��2���ǉ��̎���
    // ���v�l
    int sum = 0;
    // ���͂���5�̐��������v����
    for (int i = 0; i < array.size(); i++) {
      sum += array.get(i);
    }

    // ���v�l��\��
    System.out.println("���v�l��" + sum);

    // ���ϒl
    double ave = 0.0;
    // ���͂���5�̐����̕��ϒl�����߂�
    ave = sum / array.size();
    // ���ϒl��\��
    System.out.println("���ϒl��" + ave);

  }

}