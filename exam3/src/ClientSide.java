import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientSide {
	public static void main(String[] args) { 
		try {
			String server = "127.0.0.1"; // localhost
			int port = 2222;
			Socket c = new Socket(server, port);
			// ������ server�� port�� �̿��Ͽ� Socket ��ü ����
			InputStream is = c.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			// ���� c�κ��� �Է��� ���� ��Ʈ���� ����
			for (int i = 1; i <= 10; i++) {
				int j = dis.readInt();
				System.out.println("�����κ��� ���� ������ " + j + " ���");
			}
			c.close();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}