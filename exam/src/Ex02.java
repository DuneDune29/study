class C1 {
	static int x;
	static int y;
}
class C2 extends C1 { // Ŭ���� ������ ��ӵ�
	static String x;
}
class Ex02 {
	public static void main(String[] args) {
		C2.x = "�˱⽱�� �ؼ��� �ڹ�";
		// C1 Ŭ�������� ����� int x�� ������(�������̵�)
		C2.y = 20000;
		C1.x = 30000;
		System.out.println("Ŭ���� ���� C2.x : " + C2.x);
		System.out.println("Ŭ���� ���� C2.y(C1 ���) : " + C2.y);
		System.out.println("Ŭ���� ���� C1.x : " + C1.x);
	}
}