import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		String s = "�����ϴ� �ڹ�, ����ִ� �ڹ�, ��ſ� �ڹ�, �ų��� �ڹ�";
		Scanner scanner = new Scanner(s);
		scanner.useDelimiter("�ڹ�, "); // �и��ڸ� ����
		while (scanner.hasNext())
			System.out.println(scanner.next());
		
		s = "1  fish  2  fish  red  fish  blue  fish";
		scanner = new Scanner(s).useDelimiter("\\s*fish\\s*");
		// "\\s*" �� 0�� �̻��� �����̽�(����)�� �ǹ�
		System.out.println(scanner.nextInt());
		System.out.println(scanner.nextInt());
		System.out.println(scanner.next());
		System.out.println(scanner.next());
		scanner.close();
	}
}