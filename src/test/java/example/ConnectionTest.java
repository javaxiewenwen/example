package example;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionTest {
	 //�趨���ݿ����������ݿ����ӵ�ַ���˿ڡ����ƣ��û���������  
    String driverName="oracle.jdbc.driver.OracleDriver";  
    String url="jdbc:oracle:thin:@localhost:1521/ORCL";  //testΪ���ݿ����ƣ�1521Ϊ�������ݿ��Ĭ�϶˿�  
    String user="scott";   //aaΪ�û���  
    String password="tiger";  //123Ϊ����  
    //���ݿ����Ӷ���  
    Connection conn = null; 
    public  void getConnection(){
    	try {
			Class.forName(driverName);
			//��ȡ���ݿ�����  
			conn = DriverManager.getConnection(url, user, password);
			//������ݿ�����  
			System.out.println(conn);
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}  
    }
    public static void main(String[] args) {
    	new ConnectionTest().getConnection();
	}
}
