import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(2222);
			while (true) { // ������ �Ǳ� ���� ���� ����
				Socket s = ss.accept();
				// Ŭ���̾�Ʈ�� ��û�� �߻��ϸ� Socket ��ü s�� ����
				OutputStream os = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				// �����͸� ����ϱ� ���� ��Ʈ�� ��ü ����
				for (int i = 1; i <= 10; i++)
					dos.writeInt(i);
				s.close();
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}