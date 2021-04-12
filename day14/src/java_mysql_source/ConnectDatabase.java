package java_mysql_source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost/book_db";
		String id = "root";
		String password = "apmsetup";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
			//14�� ���н� ��
			
		} catch (SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		} //16�� ���н� ��
		
		return con;
	}

	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
	}
}