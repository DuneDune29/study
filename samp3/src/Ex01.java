import java.io.IOException;
import java.io.PrintWriter;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(System.out);
		// ǥ�� ���(����� ���)�� �ǹ��ϴ�
		// System.out(PrintWriter ��ü)�� �̿�
		
		pw.print("�˱⽱�� �ؼ��� �ڹ�! ");
		pw.println('A');
		pw.println(500 + 500);
		pw.println(40000L);
		pw.println(12.34f);
		pw.println(12.34);
		pw.println(new Integer("1999"));
		pw.close();
	}
}