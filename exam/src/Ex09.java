class Th {
	int i, j;
	Th(int a, int b){
		i = a;		j = b;
	}
	void show() {
		System.out.println("����Ŭ���� show()");
	}
}
class Fo extends Th{
	int k;
	Fo(int a, int b, int c){
		super(a, b);
		k = c;
	}
	void show() {
		System.out.println("����Ŭ���� show()");
		System.out.println("super�� �̿��� ����Ŭ���� �޼ҵ� ȣ��");
		super.show();
	}
}
public class Ex09 {
	public static void main(String[] args) {
		Fo over1 = new Fo(10, 20, 30);
		System.out.println("i, j, k : " 
				+ over1.i + ", " + over1.j + ", " + over1.k);
		over1.show();
	}
}