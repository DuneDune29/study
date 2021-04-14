class Overload {
	void test() {
		System.out.println("매개변수 없음");
	}
	void test(int a, int b) {
		System.out.println("매개변수 int " + a + "와 int " + b);
	}
	double test(double a) {
		System.out.println("매개변수 double " + a);
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
		// 자동 형변환을 거쳐 void test(double a)를 실행
		System.out.println("ob.test(100) 결과 : " + result);
		result = ob.test(4.2);
		System.out.println("ob.test(4.2) 결과 : " + result);
	}
}