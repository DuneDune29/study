class C1 {
	static int x;
	static int y;
}
class C2 extends C1 { // 클래스 변수도 상속됨
	static String x;
}
class Ex02 {
	public static void main(String[] args) {
		C2.x = "알기쉽게 해설한 자바";
		// C1 클래스에서 선언된 int x는 가려짐(오버라이딩)
		C2.y = 20000;
		C1.x = 30000;
		System.out.println("클래스 변수 C2.x : " + C2.x);
		System.out.println("클래스 변수 C2.y(C1 상속) : " + C2.y);
		System.out.println("클래스 변수 C1.x : " + C1.x);
	}
}