import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("stream1.txt");
		// ����Ʈ ��Ʈ�� ������ ����ϱ� ���� ��ü fos ����
		
		for(int i = 0; i < 20; i++) {
			fos.write(i);
		}
		fos.close();
		System.out.println("ByteSreamFile�� ����");
	}
}