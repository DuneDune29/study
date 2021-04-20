import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(2222);
			while (true) { // 데몬이 되기 위한 무한 루프
				Socket s = ss.accept();
				// 클라이언트의 요청이 발생하면 Socket 객체 s를 생성
				OutputStream os = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				// 데이터를 출력하기 위한 스트림 객체 생성
				for (int i = 1; i <= 10; i++)
					dos.writeInt(i);
				s.close();
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}