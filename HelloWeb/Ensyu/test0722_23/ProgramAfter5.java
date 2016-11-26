/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0722_23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * �o�̓t�@�C���ҏW���� <br />
 * ���̓t�@�C���̎Ј�����ǂݎ��A���X�g�Ɋi�[����B <br />
 * ���X�g�Ɋi�[�����Ј��������ƂɁA�o�̓t�@�C���ɏo�͂���B <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */
public class ProgramAfter5 {

  /**
   * �o�̓t�@�C���ҏW���� <br />
   * ���̓t�@�C������1�s���ǂݎ��A�t�@�C���̍Ō�ɂȂ�܂ŁA���X�g�Ɋi�[����B <br />
   * ���X�g�Ɋi�[�����Ј��������ƂɁA�o�̓t�@�C���ɏo�͂���B <br />
   *
   * @param args �N��������
   */
  public static void main(String[] args) {

    try {
      // ���̓t�@�C�����w�肷��B
      BufferedReader br = new BufferedReader(new FileReader("input.txt"));

      // ���̓t�@�C���̓ǂݎ���
      String str;
      // �Ј���񃊃X�g
      List<Member> list = new ArrayList<Member>();

      // ���̓t�@�C������1�s���ǂݎ��A�t�@�C���̍Ō�ɂȂ�܂ŁA���X�g�Ɋi�[����
      while ((str = br.readLine()) != null) {
        String[] cols = str.split(",");
        list.add(new Member(cols[0], cols[1], cols[2]));
      }
      // ���̓t�@�C�����N���[�Y����
      br.close();

      // �o�̓t�@�C��
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

      // ���X�g�Ɋi�[�����Ј��������ƂɁA�o�̓t�@�C���ɏo�͂���
      for (int i = 0; i < list.size(); i++) {
        pw.print("�s���F[" + (i + 1) + "] ");
        pw.print("�Ј�No�F[" + list.get(i).getId() + "] ");
        pw.println("���O�F[" + list.get(i).getSecondName() + "�@" + list.get(i).getFirstName() + "]");
      }

      // �o�̓t�@�C�����N���[�Y����
      pw.close();

    } catch (IOException e) {
      System.out.println("���o�̓G���[�ł�");
    }

  }

}
