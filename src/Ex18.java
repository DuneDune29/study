interface A4 {
	void display(String s);
}
class C3 implements A4 {
	public void display(String s) {
		System.out.println("클래스 C1 객체 이용 : " + s);
	}
}
class C4 implements A4 {
	public void display(String s) {
		System.out.println("클래스 C2 객체 이용 : " + s);
	}
}
class C5 implements A4 {
	public void display(String s) {
		System.out.println("클래스 C3 객체 이용 : " + s);
	}
}
public class Ex18 {
	public static void main(String[] args) {
		A4 memo;
		memo = new C3();
		memo.display("안녕하세요? ");
		memo = new C4();
		memo.display("알기쉽게 해설한 자바.");
		memo = new C5();
		memo.display("자바를 자바봅시다. ");
	}
}