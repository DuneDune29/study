interface A {
	final int CONS = 5;
	public void display(String s);
}
class A1 implements A {
	int a = 10;
	public void display(String s) {
		System.out.println("display �޼ҵ� ���� " + s);
	}
}
public class Ex16 {
	public static void main(String[] args) {
		A ob = new A1();
		ob.display("�׽�Ʈ1");
		System.out.println("A�� ��� ���� " + ob.CONS);
		// System.out.println("A1�� a �� ���" + ob.a);
		// �������̽� Ÿ���� ��ü�� �������̽����� ����� ����� �޼ҵ忡���� ���� ����
		A1 ob2 = new A1();
		ob2.display("�׽�Ʈ2");
		System.out.println("A�� ��� ���� " + ob2.CONS);
		System.out.println("A1�� a �� ��� " + ob2.a);
	}
}