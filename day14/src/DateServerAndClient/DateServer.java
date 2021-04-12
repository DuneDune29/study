package DateServerAndClient;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9109);
		// 실행하면 서버소켓이 등록되어서 그런건지 다시 실행하면 안됨.
		// 프로그램을 종료햇다 켜서 하거나 서버소켓에 있는 숫자를 변경해서 하거나 하면됨.
		try {
			while(true) {
				Socket socket = ss.accept();
				try {
					PrintWriter out = new PrintWriter(socket.getOutputStream(),
							true);
					out.println(new Date().toString());
				} finally {
					socket.close();
				}
			}
		} finally {
			ss.close();
		}
	}
}