/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0722_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ������̕\������ <br />
 * �R���\�[��������͂��ꂽ�����s�̕���������ߍ��݁A <br />
 * ���炩���ߒ�`���ꂽ�I�������iend�j�����͂��ꂽ�ꍇ�ɁA�ꊇ�ŏo�͂��鏈�����쐬����B <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */
public class ConsoleInTest {

  /**
   * ������̕\������ <br />
   * �R���\�[��������͂��ꂽ�����s�̕���������ߍ��݁A <br />
   * ���炩���ߒ�`���ꂽ�I�������iend�j�����͂��ꂽ�ꍇ�ɁA�ꊇ�ŏo�͂��鏈�����쐬����B <br />
   *
   * @param args �N��������
   * @throws IOException IO�G���[
   */
  public static void main(String[] args) throws IOException {
    // ���͎w������ʂɕ\������
    System.out.println("���������͂��Ă��������B");
    System.out.println("end�̓��͂ŏI�����܂��B");
    System.out.println();

    // �R���\�[�����當�����ǂݍ��ނ��߂̃o�b�t�@�[
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // ���͂����������str�ɓǂݍ���
    String str = br.readLine();
    // ���͂����������sb�ɗ��ߍ��ނ��߂̃o�b�t�@�[
    StringBuffer sb = new StringBuffer();

    // ���͂���������𗭂ߍ���
    // ���͂���������end�̏ꍇ�A���߂�������̏o�͂��s�Ȃ�
    while (!str.equals("end")) {
      // �������sb�̍Ō���ɒǉ�����
      sb.append(str);
      // ���͂����������str�ɓǂݍ���
      str = br.readLine();
    }

    // ���߂�������̏o��
    System.out.println("���߂���������o�͂��܂��B" + sb);

  }

}
