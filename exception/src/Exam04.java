public class Exam04 {
	public static void main(String[] args) {
		try {
			System.out.println("�Ű������� ���� �� ���� ��");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(" a = " + a + " b = " + b);
			System.out.println(" a�� b�� ���� �� = " + (a / b));
			System.out.println("������ ����");
		} catch (Exception e) {
			System.out.println("==================================");
			System.out.println("Exception ���� ��� ���� ó�� ��ƾ : ");
			System.out.println(e + " ���� �߻�");
		} finally {
			System.out.println("==================================");
			System.out.println("���� ó���� ������ finally ���� ����");
		}
	}
}