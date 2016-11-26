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
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �����E�N���������̏������ݏ��� <br />
 * /practice/run/file/text.txt�Ƃ����t�@�C���ɑ΂��A <br />
 * ���s���ɗ^����������ƁA���s���̓�����ǉ������ŏ������ޏ������쐬����B <br />
 * �܂�����N���X���ɁA��L�̑Ώۃt�@�C����ǂݍ��݁A���e���R���\�[���ɕ\�����鏈�����쐬����B <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */
public class FileReadWriteTest {

  /**
   * �����E�N���������̏������ݏ��� <br />
   * /practice/run/file/text.txt�Ƃ����t�@�C���ɑ΂��A <br />
   * ���s���ɗ^����������ƁA���s���̓�����ǉ������ŏ������ޏ������쐬����B <br />
   * �܂�����N���X���ɁA��L�̑Ώۃt�@�C����ǂݍ��݁A���e���R���\�[���ɕ\�����鏈�����쐬����B <br />
   *
   * @param args �N��������
   */
  public static void main(String[] args) {

    // �t�@�C���ɏ�������
    PrintWriter pw = null;
    try {
      // �t�@�C���ɒǉ��ŏ�������
      pw = new PrintWriter(new BufferedWriter(new FileWriter(
          "C:\\workspace44\\HelloWeb\\practice\\run\\file\\text.txt", true)));

      // ���t
      Date d = new Date();
      // ���t�̃t�H�[�}�b�g
      SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy'/'MM'/'dd'/' HH:mm:ss ");

      // ���s���̓�������������
      pw.println(sdf1.format(d) + args[0]);
    } catch (IOException e) {
      System.out.println("�o�̓G���[�ł��B");
    } finally {
      // �t�@�C�������
      pw.close();
    }

    // �t�@�C���̓��e��ǂݍ��ނ��߂̃o�b�t�@�[
    BufferedReader br = null;
    try {
      // �t�@�C����ǂݍ���
      br = new BufferedReader(new FileReader(
          "C:\\workspace44\\HelloWeb\\practice\\run\\file\\text.txt"));
      // �t�@�C���̓��e��ǂݍ���
      String str;
      // �t�@�C���̓��e���R���\�[���ɕ\������
      while ((str = br.readLine()) != null) {
        System.out.println(str);
      }
    } catch (IOException e) {
      System.out.println("���̓G���[�ł��B");
    } finally {
      // �t�@�C�������
      try {
        br.close();
      } catch (IOException e) {
        System.out.println("�t�@�C���N���[�Y�ŃG���[�ł��B");
      }
    }

  }

}
