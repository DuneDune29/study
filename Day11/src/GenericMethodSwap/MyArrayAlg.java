package GenericMethodSwap;

public class MyArrayAlg {
	public static <T> void swap(T[] a, int i, int j) { // <T>는 제네릭을 표현
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
