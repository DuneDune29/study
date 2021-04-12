package Day7;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("abc");// 새로운 객채를 생성하기때문에 false나옴
		//String str1 = "abc"; // 주소가 같은 문자열이기에 true나옴
		String str2 = new String("abc");
		//String str1 = "abc"; // 

		System.out.println(str1 == str2); // 두 스트링 인스턴스의 주소 값은 다름
		System.out.println(str1.equals(str2)); // String 클래스의 equals 메소드가 재정의 됨 

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println(i1 == i2); // 두 정수 인스턴스의 주소 값은 다름
		System.out.println(i1.equals(i2)); // Integer 클래스의 equals 메소드가 재정의 됨
	}
}
// ==은 주소까지 같아야 true. equals는 상관없이 같다고 나오네
// new 는 객채를 새로 생성하여 주소값이 다름