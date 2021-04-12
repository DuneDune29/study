package Day6;

public class ArrayProcTest {

	public static void main(String[] args) {

		int[] list = {1, 2, 3, 4, 5}; // 5개의 배열에 1~5까지 
		ArrayProc obj = new ArrayProc(); // ArrayProc class를 소환
		for (int i = 0; i < list.length; i++) // 
			System.out.print(list[i]+" ");
		System.out.println(" ");
		obj.inc(list); // 연결된 ArrayProc 클래스에 함수를 불러와 적용. +1씩 해줌.

		for (int i = 0; i < list.length; i++)
			System.out.print(list[i]+" ");
	}

}
