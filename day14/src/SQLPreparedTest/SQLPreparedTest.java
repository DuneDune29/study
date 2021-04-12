package SQLPreparedTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLPreparedTest {

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

	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();

		String query = "SELECT books.title, books.price FROM books WHERE publisher = ?";

		java.sql.PreparedStatement stmt = con.prepareStatement(query);
		stmt.setString(1, "Addison Wesley");
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			String title = rs.getString("title");
			int price = rs.getInt("price");
			System.out.println(title + " " + price);
		}
	}
}