package Day7;

public class StringEqualsTest {
	
	public static void main(String[] args) {
		String s1="abcdef";
		String s2="abcdef";
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {10,20,30,40,50};
		if(s1==s2)
			System.out.println("s1�� s2�� �����ϴ�.");
		else
			System.out.println("s1�� s2�� �ٸ��ϴ�.");
		
		if(s1.equals(s2))
			System.out.println("s1�� s2�� �����ϴ�.");
		else
			System.out.println("s1�� s2�� �ٸ��ϴ�.");
		
		if(array1==array2)
			System.out.println("array1�� array2�� �����ϴ�.");
		else
			System.out.println("array1�� array2�� �ٸ��ϴ�.");
	}

}
