class Pa1 {
	void show() {
		System.out.println("����Ŭ���� show() �������̵�");
	}
}
class Ch1 extends Pa1 {
	void show() {
		System.out.println("����Ŭ���� show()");
	}
}
public class Ex05 {
	public static void main(String[] args) {
		Ch1 over = new Ch1();
		over.show();
	}
}