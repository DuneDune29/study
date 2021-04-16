class Pa {
	void show(String str) {
		System.out.println("상위클래스 show(String str) " + str);
	}
}
class Ch extends Pa {
	void show() {
		System.out.println("하위클래스 show()");
	}
}
public class Ex04 {
	public static void main(String[] args) {
		Ch over = new Ch();
		over.show("상속 오버로딩");
		over.show();
	}
}