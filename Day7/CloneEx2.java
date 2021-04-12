package Day7;

import java.util.Arrays;

public class CloneEx2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		// 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
		int[] arrClone = arr.clone();
		arrClone[0] = 6; // arr배열 첫째칸을 6으로 선언.

		System.out.println(Arrays.toString(arr)); // toString. 배열을 문자열로 바꿔줌
		System.out.println(Arrays.toString(arrClone));
	}
}