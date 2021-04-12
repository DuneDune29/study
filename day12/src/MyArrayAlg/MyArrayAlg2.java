package MyArrayAlg;

class MyArrayAlg {
	public static <T extends Comparable> T getMax(T[] a) {
		if(a == null || a.length == 0)
			return null;
		T largest = a[0];
		for (int i = 1; i<a.length; i++)
			if(largest.compareTo(a[i]) < 0)
				largest = a[i];
		return largest;
	}
}

public class MyArrayAlg2 {
	public static void main(String[] args) {
		int[] list = { 1, 2, 3 };
		
		//String[] list = { "xyz", "abc", "def" };
		//String max = MyArrayAlg.getMax(list);
		Integer max = MyArrayAlg.getMax(list);
		System.out.println(max);
	}
}