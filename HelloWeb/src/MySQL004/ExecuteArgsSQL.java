package MySQL004;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.io.*;

import org.apache.jasper.tagplugins.jstl.core.If;


/**
 * DB�A�N�Z�b�T�̎g�����iStatement�j <br />
 * Statement�N���X���g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class ExecuteArgsSQL {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ExecuteArgsSQL() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // Statement�N���X�͍ł��V���v����DB�A�N�Z�X�N���X�B
    // �������A�Z�L�����e�B��̐Ǝ㐫������A�Ɩ��v���O�����ł̎g�p�͐�������Ȃ��B
    // ��{�I�ɂ͐Ǝ㐫�����P����PreparedStatement�N���X���g�p���邱�ƁB

    // DB�֘A�C���X�^���X�𐶐��B
    Statement stmt = null;
    Connection conn = null;
    // ResultSet�͌������ʊi�[�p�̃��C�u�����N���X�B
    ResultSet rs = null;
    int count = 0;
    String sqlSelect = null;
    String sqlInsert = null;

    // SQL���𕶎���ŋL�q����B
    // �ꕔ��SQL����DB���i���Ƃɕ��@���قȂ�ꍇ������̂ŁA�v���ӁB
    //String sqlSelect = "SELECT * FROM moeiwast_eiwatest_db01.test01_hayashi ";
    //String sqlSelect = args[0];
        //String sqlInsert = "insert into moeiwast_eiwatest_DB01.testTable "
    //    + "( id, name, createdate, client, address ) "
    //    + "values ( 22, '����������', '2015/11/05', 'N/A', 'N/A' )";

    if ( args[0].startsWith( "SELECT" )){
      sqlSelect = args[0];
    } else {
      sqlInsert = args[0];
    }

    // �ڑ���DB�̎w�蕶����iDB���i���ƂɌ�����^�j�B
    String url = "jdbc:mysql://localhost:3306/moeiwast_eiwatest_db01";

    try {
      // �h���C�o�iopt/mysql-connector-java-5.1.36-bin.jar�j�����[�h����B
      // eclipse�̃v���W�F�N�g���v���p�e�B�[���r���h�p�X�����C�u��������h���C�ojar�̊i�[���ݒ肵�Ă������ƁB
      Class.forName( "com.mysql.jdbc.Driver" ).newInstance();

      // MySQL�̏ꍇ�A�ȉ��̂悤�ɕ����R�[�h�w����܂ސڑ�����
      // Properties�N���X�ɃZ�b�g����Connection�N���X�ɓn���B
      Properties props = new Properties();
      props.put( "user", "root" );
      props.put( "password", "root" );
      props.put( "useUnicode", "true" ); // �ȗ�����Ɠ��{�ꂪ������������B
      props.put( "characterEncoding", "SJIS" ); // �ȗ�����Ɠ��{�ꂪ������������B

      // �ڑ��������ɁA�R�l�N�V�����𐶐��B
      conn = DriverManager.getConnection( url, props );

      // �R�l�N�V��������X�e�[�g�����g�iSQL���s�p�I�u�W�F�N�g�j�𐶐��B
      stmt = conn.createStatement();

      // SQL�����s�B
      // �Q�ƌn�iSelect�j�ƍX�V�n�Ń��\�b�h���قȂ�B
      if ( args[0].startsWith("SELECT") ){
        rs = stmt.executeQuery( sqlSelect );
      } else {
        count = stmt.executeUpdate( sqlInsert );
      }
      //rs = stmt.executeQuery( sqlSelect )
      // count = stmt.executeUpdate( sqlInsert );

      // �������ʂ�\������B�iexecuteQuery���s���j
      // ResultSet�͕\�`���̃I�u�W�F�N�g�B
      // �f�t�H���g��"0�s��(�f�[�^�Ȃ�)"���w���Ă���Ars.next()�����s����x��1�s�i�ށB
      if ( rs != null ) {
        while ( rs.next() ) {

          // �J�����̌^�ɍ��킹��getInt()/getString�Œl�����o���B
          System.out.println( rs.getBigDecimal( "STAFF_NO" ) );
          System.out.println( rs.getString( "OFFICE_CD" ) );
          System.out.println( rs.getString( "STAFF_NAME" ) );
          System.out.println( rs.getInt( "WORK_TIME" ) );
          System.out.println( rs.getDate( "CREATE_DATE" ) );
          System.out.println( "" );
        }
      }

      // �X�V������\������B�iexecuteUpdate���s���j
      if ( count != 0 ) {
        System.out.println( "�X�V���������܂����B" + count + " �����X�V���܂����B" );
      }


      // Stream�Ɠ��l�A�����Ŗ����I�ɃN���[�Y�������L�q����̂�����@�B
      // �������ʂ̃N���[�Y�B
      if ( rs != null ) {
        rs.close();
      }
      // �X�e�[�g�����g���N���[�Y����B
      stmt.close();

    // �G���[�������̓G���[�̓��e��\���B
    } catch ( ClassNotFoundException e ) {
      System.out.println( "ClassNotFoundException:" + e.getMessage() );
    } catch ( SQLException e ) {
      System.out.println( "SQLException:" + e.getMessage() );
    } catch ( Exception e ) {
      System.out.println( "Exception:" + e.getMessage() );

    } finally {
      try {
        // �R�l�N�V�������N���[�Y�B
        if ( conn != null ) {
          conn.close();
        }
      } catch ( SQLException e ) {
        System.out.println( "SQLException:" + e.getMessage() );
      }
    }

    /** �g�p���郉�C�u�����N���X�̎�ނ������ۈËL��������߁A�T���v�������ɃR�s�[�쐬�ł����Ȃ��B **/
  }
}
