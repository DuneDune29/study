import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientSide {
	public static void main(String[] args) { 
		try {
			String server = "127.0.0.1"; // localhost
			int port = 2222;
			Socket c = new Socket(server, port);
			// 지정된 server와 port를 이용하여 Socket 객체 생성
			InputStream is = c.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			// 소켓 c로부터 입력을 위한 스트림을 생성
			for (int i = 1; i <= 10; i++) {
				int j = dis.readInt();
				System.out.println("서버로부터 받은 데이터 " + j + " 출력");
			}
			c.close();
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}