class AA1 {
	double d1;
	AA1() {
		System.out.println("Ŭ���� AA1 ������");
		d1 = 10 * 10;
	}
}
class AA2 extends AA1{
	double d2;
	AA2() {
		System.out.println("Ŭ���� AA2 ������");
		d2 = 10 * 10 * 10;
	}
}
class AA3 extends AA2{
	double d3;
	AA3() {
		System.out.println("Ŭ���� AA3 ������");
		d3 = 10 * 10 * 10 * 10;
	}
}
public class Ex07 {
	public static void main(String[] args) {
		AA3 super1 = new AA3();
		System.out.println("10�� 2���� : " + super1.d1);
		System.out.println("10�� 3���� : " + super1.d2);
		System.out.println("10�� 4���� : " + super1.d3);
	}
}