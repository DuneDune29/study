interface A {
	final int CONS = 5;
	public void display(String s);
}
class A1 implements A {
	int a = 10;
	public void display(String s) {
		System.out.println("display 메소드 구현 " + s);
	}
}
public class Ex16 {
	public static void main(String[] args) {
		A ob = new A1();
		ob.display("테스트1");
		System.out.println("A의 상수 값은 " + ob.CONS);
		// System.out.println("A1의 a 값 출력" + ob.a);
		// 인터페이스 타입의 객체는 인터페이스에서 선언된 상수와 메소드에서만 접근 가능
		A1 ob2 = new A1();
		ob2.display("테스트2");
		System.out.println("A의 상수 값은 " + ob2.CONS);
		System.out.println("A1의 a 값 출력 " + ob2.a);
	}
}