package Day6;

public class ArrayProcTest {

	public static void main(String[] args) {

		int[] list = {1, 2, 3, 4, 5}; // 5���� �迭�� 1~5���� 
		ArrayProc obj = new ArrayProc(); // ArrayProc class�� ��ȯ
		for (int i = 0; i < list.length; i++) // 
			System.out.print(list[i]+" ");
		System.out.println(" ");
		obj.inc(list); // ����� ArrayProc Ŭ������ �Լ��� �ҷ��� ����. +1�� ����.

		for (int i = 0; i < list.length; i++)
			System.out.print(list[i]+" ");
	}

}
