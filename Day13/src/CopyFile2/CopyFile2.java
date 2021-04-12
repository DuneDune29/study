package CopyFile2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {
	// input.txt ���Ͽ� ����� ���� �Է� ��Ʈ���� ����
	public static void main(String[] args) throws IOException {


		FileReader inputStream = null;
		// output.txt ���Ͽ� ����� ���� ��� ��Ʈ���� ����
		FileWriter outputStream = null;

		try {

// �ϳ��� ���ڸ� ���� ���� read()�� ����ϰ� �ϳ��� ���ڸ� �� ���� write()�� ���

			
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