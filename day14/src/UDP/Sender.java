package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
	public static void main(String[] args) throws IOException{

		DatagramSocket socket = null;
		socket = new DatagramSocket();
		String s = "�츮�� ������ �츮 ����� �����̴�.\n";
		byte[] buf = s.getBytes();

		InetAddress address = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 5000);
		// �����ּҿ� ��Ʈ�ѹ�
		
		socket.send(packet);
		socket.close();
	}
}