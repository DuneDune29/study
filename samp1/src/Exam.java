import java.util.Arrays;

public class Exam {
	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		arrayPrint("�ʱ� �迭 : ", a); // �迭 ��� �޼ҵ� ȣ��
		Arrays.fill(a, 3, 5, 33); // �迭�� 3 ~ 4�� ��Ҹ� 33���� ä��
		arrayPrint("fill() ������ : ", a);
		Arrays.sort(a); // �迭�� ��ҵ��� ����
		arrayPrint("sort() ������ : ", a);
		System.out.println("33�� �迭�� " + Arrays.binarySearch(a, 33) + "�� ���");
		System.out.println("-3�� �迭�� " + Arrays.binarySearch(a, -3) + "�� ���");
		// �迭�� ���� ���� Ž���ϴ� ��� '-��'
		System.out.println("53�� �迭�� " + Arrays.binarySearch(a, 53) + "�� ���");
		int[] b = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("�迭a�� �迭b�� ������ : " + Arrays.equals(a, b));
	}
	static void arrayPrint(String s, int[] a) {
		System.out.print(s);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}