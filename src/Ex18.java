interface A4 {
	void display(String s);
}
class C3 implements A4 {
	public void display(String s) {
		System.out.println("Ŭ���� C1 ��ü �̿� : " + s);
	}
}
class C4 implements A4 {
	public void display(String s) {
		System.out.println("Ŭ���� C2 ��ü �̿� : " + s);
	}
}
class C5 implements A4 {
	public void display(String s) {
		System.out.println("Ŭ���� C3 ��ü �̿� : " + s);
	}
}
public class Ex18 {
	public static void main(String[] args) {
		A4 memo;
		memo = new C3();
		memo.display("�ȳ��ϼ���? ");
		memo = new C4();
		memo.display("�˱⽱�� �ؼ��� �ڹ�.");
		memo = new C5();
		memo.display("�ڹٸ� �ڹٺ��ô�. ");
	}
}