package example;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionTest {
	 //设定数据库驱动，数据库连接地址、端口、名称，用户名，密码  
    String driverName="oracle.jdbc.driver.OracleDriver";  
    String url="jdbc:oracle:thin:@localhost:1521/ORCL";  //test为数据库名称，1521为连接数据库的默认端口  
    String user="scott";   //aa为用户名  
    String password="tiger";  //123为密码  
    //数据库连接对象  
    Connection conn = null; 
    public  void getConnection(){
    	try {
			Class.forName(driverName);
			//获取数据库连接  
			conn = DriverManager.getConnection(url, user, password);
			//输出数据库连接  
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
