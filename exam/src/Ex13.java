public class Ex13 {
	public static void main(String[] args) {
		char a[] = { 'C', 'o', 'm', 'p', 'u', 't', 'e', 'r' };
		String s1 = new String(a);
		String s2 = new String(a, 3, 2);
		String s3 = new String("배우기 쉬운 자바");
		String s4 = "canonical 문자열" ;
		// 문자열 객체를 생성하기 위해 직접 문자열 지정
		// 이러한 초기화를 단축(shorthand) 초기화라 하며,
		// canonical 문자열이라 한다.
		System.out.println("문자열 s1 : " + s1);
		System.out.println("문자열 s1의 길이 : " + s1.length());
		System.out.println("문자열 s2 : " + s2);
		System.out.println("문자열 s3 : " + s3);
		System.out.println("문자열 s4 : " + s4);
	}
}