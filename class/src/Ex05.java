class Overload {
	void test() {
		System.out.println("�Ű����� ����");
	}
	void test(int a, int b) {
		System.out.println("�Ű����� int " + a + "�� int " + b);
	}
	double test(double a) {
		System.out.println("�Ű����� double " + a);
		return a * 2;
	}
}
public class Ex05 {
	public static void main(String[] args) {
		Overload ob = new Overload();
		double result;
		ob.test();
		ob.test(5, 10);
		result = ob.test(100);
		// �ڵ� ����ȯ�� ���� void test(double a)�� ����
		System.out.println("ob.test(100) ��� : " + result);
		result = ob.test(4.2);
		System.out.println("ob.test(4.2) ��� : " + result);
	}
}