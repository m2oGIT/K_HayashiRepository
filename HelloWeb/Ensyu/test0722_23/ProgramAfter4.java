/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package test0722_23;

import java.util.ArrayList;
import java.util.List;

/**
 * �Ј�����z�񂩂烊�X�g�֊i�[ <br />
 * String�z��̃f�[�^���Ј���񃊃X�g�Ɋi�[���A�ݒ肵������\������B <br />
 * �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�V�K�쐬 <br />
 */
public class ProgramAfter4 {

  /**
   * �Ј�����z�񂩂烊�X�g�֊i�[ <br />
   * String�z��̃f�[�^���Ј���񃊃X�g�Ɋi�[����B <br />
   * �܂��Ј���񃊃X�g�ɐݒ肵������\������B <br />
   *
   * @param args �N��������
   */
  public static void main(String[] args) {
    // �Ј����
    String[][] array = {
        {
            "00001", "��Y", "���"
        },
        {
            "00002", "��Y", "���"
        },
        {
            "00003", "�O�Y", "���"
        }
    };

    // �Ј���񃊃X�g
    List<Member> list = new ArrayList<Member>();

    // ���X�g�ɒǉ�
    for (int i = 0; i < array.length; i++) {
      list.add(new Member(array[i][0], array[i][1], array[i][2]));
    }

    // ���X�g�ɐݒ肵������\��
    for (int i = 0; i < list.size(); i++) {
      list.get(i).showinfo();
    }
  }

}
