interface A2 {
	void ameth1 ();
	void ameth2 ();
}
interface B {
	void bmeth1 ();
}
interface C extends A2, B {
	void cmeth1 ();
}
class InterfaceClass implements C {
	public void ameth1() {
		System.out.println("ameth1() �޼ҵ��� ����");
	}
	public void ameth2() {
		System.out.println("ameth2() �޼ҵ��� ����");
	}
	public void bmeth1() {
		System.out.println("bmeth1() �޼ҵ��� ����");
	}
	public void cmeth1() {
		System.out.println("cmeth1() �޼ҵ��� ����");
	}
}
public class Ex17 {
	public static void main(String[] args) {
		InterfaceClass ic = new InterfaceClass();
		ic.ameth1();
		ic.ameth2();
		ic.bmeth1();
		ic.cmeth1();
	}
}