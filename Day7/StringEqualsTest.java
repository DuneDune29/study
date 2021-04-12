package Day7;

public class StringEqualsTest {
	
	public static void main(String[] args) {
		String s1="abcdef";
		String s2="abcdef";
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {10,20,30,40,50};
		if(s1==s2)
			System.out.println("s1과 s2는 같습니다.");
		else
			System.out.println("s1과 s2는 다릅니다.");
		
		if(s1.equals(s2))
			System.out.println("s1과 s2는 같습니다.");
		else
			System.out.println("s1과 s2는 다릅니다.");
		
		if(array1==array2)
			System.out.println("array1과 array2는 같습니다.");
		else
			System.out.println("array1과 array2는 다릅니다.");
	}

}
