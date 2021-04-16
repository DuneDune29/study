class Pa1 {
	void show() {
		System.out.println("상위클래스 show() 오버라이딩");
	}
}
class Ch1 extends Pa1 {
	void show() {
		System.out.println("하위클래스 show()");
	}
}
public class Ex05 {
	public static void main(String[] args) {
		Ch1 over = new Ch1();
		over.show();
	}
}