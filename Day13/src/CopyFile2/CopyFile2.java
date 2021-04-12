package CopyFile2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {
	// input.txt 파일에 연결된 파일 입력 스트림을 생성
	public static void main(String[] args) throws IOException {


		FileReader inputStream = null;
		// output.txt 파일에 연결된 파일 출력 스트림을 생성
		FileWriter outputStream = null;

		try {

// 하나의 문자를 읽을 때는 read()를 사용하고 하나의 문자를 쓸 때는 write()를 사용

			
			inputStream = new FileReader("input.txt");
			outputStream = new FileWriter("output.txt");


			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}