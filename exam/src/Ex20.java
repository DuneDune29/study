public class Ex20 {
	public static void main(String[] args) {
		int num = 123;
		char x = 'A';
		float f = 3.14F;
		
		String a = Integer.toString(num);
		String b = Character.toString(x);
		String c = Float.toString(f);
		String str1 = a + 123;
		String str2 = c + 3.14;
		
		System.out.println(a + ", " + b + ", " + c);
		System.out.println(str1 + ", " + str2);
	}
}