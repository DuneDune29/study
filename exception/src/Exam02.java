public class Exam02 {
	public static void main(String[] args) {
		try {
			String c = null;
			System.out.println(" ���ڿ� ���� : " + c.toString());
		} catch (NullPointerException e) {
			System.out.println("���ܰ� �߻��Ͽ� Exception ��ü�� ����");
			System.out.println(e);
		}
		System.out.println("���� ����");
	}
}