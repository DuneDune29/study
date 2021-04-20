import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress Address = InetAddress.getLocalHost();
		// getLocalHost() 메소드는 static으로 선언된 클래스 메소드
		System.out.println("로컬 컴퓨터의 이름 : " + Address.getHostName());
		System.out.println("로컬 컴퓨터의 IP 주소 : " + Address.getHostAddress());
		Address = InetAddress.getByName("java.sun.com");
		System.out.println("java.sun.com 컴퓨터의 이름과 IP 주소 : " + Address);
		InetAddress SW[] = InetAddress.getAllByName("www.naver.com");
		for (int i = 0; i < SW.length; i++)
			System.out.println(SW[i]);
	}
}