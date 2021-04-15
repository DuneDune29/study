public class Ex14 {
	public static void main(String[] args) {
		String s1 = "Java Korea"; // 단축초기화로 생성
		String s2 = new String("Java Korea"); // new 연산자 사용
		String s3 = s2.intern(); // s2문자열을 canonical 문자열로 전환
		String s4 = "Java Corea"; // 단축초기화로 생성
		
		System.out.println("String 레퍼런스 변수가 참조하는 인스턴스가 같은지 비교");
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1 == s4 : " + (s1 == s4));
		
		System.out.println("String 데이터 값(내용)이 같은지 비교");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.length());		
	}
}