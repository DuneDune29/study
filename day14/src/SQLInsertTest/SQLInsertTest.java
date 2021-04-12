package SQLInsertTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLInsertTest {

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
			// 14�� ���н� ��

		} catch (SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		} // 16�� ���н� ��

		return con;
	}

	public static void main(String[] args) {
		addBook("Artificial Intellegence", "Addison Wesley", "2021", 35000);
	}

	private static void addBook(String title, String publisher, String year, int price) {
		Connection con = makeConnection();
		try {
			Statement stmt = con.createStatement();
			String s = "INSERT INTO books (title, publisher, year, price) VALUES ";
			s += "('" + title + "','" + publisher + "','" + year + "','" + price + "')";
			System.out.println(s);
			int i = stmt.executeUpdate(s);
			if (i == 1)
				System.out.println("���ڵ� �߰� ����");
			else
				System.out.println("���ڵ� �߰� ����");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}