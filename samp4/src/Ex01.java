import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress Address = InetAddress.getLocalHost();
		// getLocalHost() �޼ҵ�� static���� ����� Ŭ���� �޼ҵ�
		System.out.println("���� ��ǻ���� �̸� : " + Address.getHostName());
		System.out.println("���� ��ǻ���� IP �ּ� : " + Address.getHostAddress());
		Address = InetAddress.getByName("java.sun.com");
		System.out.println("java.sun.com ��ǻ���� �̸��� IP �ּ� : " + Address);
		InetAddress SW[] = InetAddress.getAllByName("www.naver.com");
		for (int i = 0; i < SW.length; i++)
			System.out.println(SW[i]);
	}
}