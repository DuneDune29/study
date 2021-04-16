class AA1 {
	double d1;
	AA1() {
		System.out.println("클래스 AA1 생성자");
		d1 = 10 * 10;
	}
}
class AA2 extends AA1{
	double d2;
	AA2() {
		System.out.println("클래스 AA2 생성자");
		d2 = 10 * 10 * 10;
	}
}
class AA3 extends AA2{
	double d3;
	AA3() {
		System.out.println("클래스 AA3 생성자");
		d3 = 10 * 10 * 10 * 10;
	}
}
public class Ex07 {
	public static void main(String[] args) {
		AA3 super1 = new AA3();
		System.out.println("10의 2제곱 : " + super1.d1);
		System.out.println("10의 3제곱 : " + super1.d2);
		System.out.println("10의 4제곱 : " + super1.d3);
	}
}