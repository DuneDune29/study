class B1 {
	int x;
}
class B2 extends B1 {
	String x;
}
class Ex01 {
	public static void main(String[] args) {
		B2 b2 = new B2();
		b2.x = "�ڹ� ��� extends";
		// B1 Ŭ�������� ����� int x�� ������(�������̵�)
		// ���� b2.x = 50�� �����Ѵٸ� ���� �߻�
		System.out.println("b2.x : " + b2.x);
		B1 b1 = new B1();
		b1.x = 5000;
		System.out.println("b1.x : " + b1.x);
	}
}