import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("stream1.txt");
		// ����Ʈ ��Ʈ�� �Է��� ���� ��ü fis ����

		int i;
		while ((i = fis.read()) != -1) {
			System.out.println(i);
		}
		System.out.println("ByteStream�� File�κ��� �Է�");
		fis.close();
	}
}