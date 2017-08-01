package com.cn.xww.dbcp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sun.applet.Main;

public class JdbcUtil {
	
	/**
     * @Field: pool
     *          ���ݿ����ӳ�
     */ 
     private static JdbcPool pool = new JdbcPool();
     
     /**
     * @Method: getConnection
     * @Description: �����ݿ����ӳ��л�ȡ���ݿ����Ӷ���
     * @Anthor:�°�����
     * @return Connection���ݿ����Ӷ���
     * @throws SQLException
     */ 
     public static Connection getConnection() throws SQLException{
         return pool.getConnection();
     }
     
     /**
     * @Method: release
     * @Description: �ͷ���Դ��
     * �ͷŵ���Դ����Connection���ݿ����Ӷ��󣬸���ִ��SQL�����Statement���󣬴洢��ѯ�����ResultSet����
     * @Anthor:�°�����
     *
     * @param conn
     * @param st
     * @param rs
     */ 
     public static void release(Connection conn,Statement st,ResultSet rs){
         if(rs!=null){
             try{
                 //�رմ洢��ѯ�����ResultSet����
                 rs.close();
             }catch (Exception e) {
                 e.printStackTrace();
             }
             rs = null;
         }
         if(st!=null){
             try{
                 //�رո���ִ��SQL�����Statement����
                 st.close();
             }catch (Exception e) {
                 e.printStackTrace();
             }
         }
         
         if(conn!=null){
             try{
                 //�ر�Connection���ݿ����Ӷ���
                 conn.close();
             }catch (Exception e) {
                 e.printStackTrace();
             }
         }
     }
     public static void main(String[] args) {
		try {
			new  JdbcUtil().release(getConnection(), null, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
