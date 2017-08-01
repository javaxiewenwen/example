package com.cn.xww.dbcp;

import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;


public class JdbcPool implements DataSource{
	/**
	  * @Field: listConnections
	  *         ʹ��LinkedList������������ݿ����ӣ�
	  *        ����ҪƵ����дList���ϣ���������ʹ��LinkedList�洢���ݿ����ӱȽϺ���
	 */ 
	private static LinkedList<Connection> listConnections = new LinkedList<Connection>();
	
	static{
         //�ھ�̬������м���db.properties���ݿ������ļ�
          InputStream in = JdbcPool.class.getClassLoader().getResourceAsStream("jdbc.properties");
          Properties prop = new Properties();
          try {
              prop.load(in);
              String driver = prop.getProperty("jdbc.driverClassName");
              String url = prop.getProperty("jdbc.url");
              String username = prop.getProperty("jdbc.username");
              String password = prop.getProperty("jdbc.password");
              //���ݿ����ӳصĳ�ʼ����������С
              int jdbcPoolInitSize =Integer.parseInt(prop.getProperty("jdbc.jdbcPoolInitSize"));
              //�������ݿ�����
              Class.forName(driver);
              for (int i = 0; i < jdbcPoolInitSize; i++) {
                  Connection conn = DriverManager.getConnection(url, username, password);
                  System.out.println("��ȡ��������" + conn);
                  //����ȡ�������ݿ����Ӽ��뵽listConnections�����У�listConnections���ϴ�ʱ����һ����������ݿ����ӵ����ӳ�
                  listConnections.add(conn);
              }
              
          } catch (Exception e) {
              throw new ExceptionInInitializerError(e);
          }
      }

	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public Connection getConnection() throws SQLException {
		System.out.println("������====");
		 //������ݿ����ӳ��е����Ӷ���ĸ�������0
	      if (listConnections.size()>0) {
	         //��listConnections�����л�ȡһ�����ݿ�����
	         final Connection conn = listConnections.removeFirst();
	         System.out.println("listConnections���ݿ����ӳش�С��" + listConnections.size());
	         //����Connection����Ĵ������
	         return (Connection) Proxy.newProxyInstance(JdbcPool.class.getClassLoader(), new Class[]{Connection.class}, new InvocationHandler(){
	             public Object invoke(Object proxy, Method method, Object[] args)
	                     throws Throwable {
	                 if(!method.getName().equals("close")){
	                     return method.invoke(conn, args);
	                 }else{
	                     //������õ���Connection�����close�������Ͱ�conn�������ݿ����ӳ�
	                     listConnections.add(conn);
	                     System.out.println(conn + "������listConnections���ݿ����ӳ��ˣ���");
	                     System.out.println("listConnections���ݿ����ӳش�СΪ" + listConnections.size());
	                     return null;
	                 }
	             }
	         });
	     }else {
	         throw new RuntimeException("�Բ������ݿ�æ");
	     }
	}

	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
