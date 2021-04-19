import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("stream1.txt");
		// 바이트 스트림 파일을 출력하기 위한 객체 fos 생성
		
		for(int i = 0; i < 20; i++) {
			fos.write(i);
		}
		fos.close();
		System.out.println("ByteSreamFile을 생성");
	}
}