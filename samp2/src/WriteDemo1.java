import java.io.FileWriter;

public class WriteDemo1 {
	public static void main(String[] args) throws Exception {
		String source = "����־�� ��μ� ������ ���� ���\n"
				+ " ������ ����Ѵٴ� ����\n"
				+ " ����� �������� ��ħ�� �´´ٴ� ���Դϴ�.\n";
		char intxt[] = new char[source.length()];
		source.getChars(0, source.length(), intxt, 0);
		// �Է� ���ڿ��� intxt ���� �迭�� ����
		FileWriter fw = new FileWriter("data1.txt");
		fw.write(intxt);
		// ���� �迭�� ������ ���Ͽ� ���
		fw.close();
	}
}