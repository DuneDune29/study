import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		
		do {
			System.out.print("�Է� (�Է� ����� Q) : ");
			//�Է��� ���� ���� ������ �о� �´�.
			input = scan.nextLine();
			System.out.println("�Է� ���� " + input);
		} while (!input.equalsIgnoreCase("Q"));
		
		System.out.println("���α׷��� ����");
	}
}
