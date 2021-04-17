public class Ex09 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abd");
		String str3 = "abc";

		System.out.println(str1 == str2);
		System.out.println(str2 == str3);

		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
} 