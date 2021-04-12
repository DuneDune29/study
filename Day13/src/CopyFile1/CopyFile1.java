package CopyFile1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {

	public static void main(String[] args) throws IOException {

		//input.txt ���Ͽ� ����� ���� �Է� ��Ʈ���� ����
		
		FileInputStream in = null;
		FileOutputStream out = null;
	
		// output.txt ���Ͽ� ����� ���� ��� ��Ʈ���� ����
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			
	//�ϳ��� ����Ʈ�� ���� ���� read()�� ����ϰ� �ϳ��� ����Ʈ�� �� ���� write()�� ���
			
			int c;
			
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if(in != null)
				in.close();
			if(out != null)
				out.close();
		}
	}
}