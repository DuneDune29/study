class AB1 {
	int i, j;

	
	public AB1() {  } // default ������
}
class AB2 extends AB1 {
	int k;
}
class AB3 extends AB2{
	int l;
}
public class Ex10 {
	public static void main(String[] args) {
		AB1 a = new AB1();
		AB2 b = new AB2();
		AB3 c = new AB3();
		if (a instanceof AB1) System.out.println("a�� AB1 Ŭ������ ��ü");
		if (b instanceof AB2) System.out.println("b�� AB2 Ŭ������ ��ü");
		if (c instanceof AB3) System.out.println("c�� AB3 Ŭ������ ��ü");
		if (c instanceof AB1) System.out.println("c�� AB1 Ŭ������ ��ü : ����ȯ");
		if (a instanceof AB3) System.out.println("a�� AB3 Ŭ������ ��ü : ����ȯ");
		else  System.out.println("a�� AB3 Ŭ������ ��ü�� �ƴ� : ����ȯ �Ұ�");
	}
}