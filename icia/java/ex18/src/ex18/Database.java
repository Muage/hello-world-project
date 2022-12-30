package ex18;

import java.sql.*;

public class Database {
	public static Connection getConnection() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "account";
		String password = "pass";
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
//			System.out.println("���Ӽ���");
		} catch (Exception e) {
			System.out.println("���ӿ���:" + e.toString());
		}
		return con;
	}
}