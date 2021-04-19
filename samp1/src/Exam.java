import java.util.Arrays;

public class Exam {
	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		arrayPrint("초기 배열 : ", a); // 배열 출력 메소드 호출
		Arrays.fill(a, 3, 5, 33); // 배열의 3 ~ 4번 요소를 33으로 채움
		arrayPrint("fill() 수행후 : ", a);
		Arrays.sort(a); // 배열의 요소들을 정렬
		arrayPrint("sort() 수행후 : ", a);
		System.out.println("33은 배열의 " + Arrays.binarySearch(a, 33) + "번 요소");
		System.out.println("-3은 배열의 " + Arrays.binarySearch(a, -3) + "번 요소");
		// 배열에 없는 값을 탐색하는 경우 '-값'
		System.out.println("53은 배열의 " + Arrays.binarySearch(a, 53) + "번 요소");
		int[] b = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("배열a와 배열b가 같은가 : " + Arrays.equals(a, b));
	}
	static void arrayPrint(String s, int[] a) {
		System.out.print(s);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}