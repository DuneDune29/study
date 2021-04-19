import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("stream1.txt");
		// 바이트 스트림 입력을 위한 객체 fis 생성

		int i;
		while ((i = fis.read()) != -1) {
			System.out.println(i);
		}
		System.out.println("ByteStream을 File로부터 입력");
		fis.close();
	}
}