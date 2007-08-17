package person.liusy.lsyjb.db.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectManager {

	
	private static Connection conn ;
	private ConnectManager(){
		
	}
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		if(conn!=null && !conn.isClosed())
			return conn;
		String className = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/lsyjpdb2";
		String username = "root";
		String password = "root";
		Class.forName(className);
		conn = DriverManager.getConnection(url,username,password);
		return conn;
	}
	public static void closeConnection() throws SQLException{
		if(conn != null)
			conn.close();
		conn = null;
	}
	
}
