class Pa {
	void show(String str) {
		System.out.println("����Ŭ���� show(String str) " + str);
	}
}
class Ch extends Pa {
	void show() {
		System.out.println("����Ŭ���� show()");
	}
}
public class Ex04 {
	public static void main(String[] args) {
		Ch over = new Ch();
		over.show("��� �����ε�");
		over.show();
	}
}