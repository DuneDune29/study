public class Exam05 {
	public static void main(String[] args) {
		try {
			String c = null;
			System.out.println("���ڿ� �� : " + c.toString());
		} catch (Exception e) {
			System.out.println(">> e <<");
			System.out.println(e);
			System.out.println(">> e.toString() <<");
			System.out.println(e.toString());
			System.out.println(">> e.getMessage() <<");
			System.out.println(e.getMessage());
			// �߻��� ���� Ŭ������ �ν��Ͻ��� ����� �޽����� ����
			System.out.println(">> e.printStackTrace() <<");
			e.printStackTrace();
			// ���� �߻� ����� ȣ�� ���ÿ� �־��� �޼ҵ��� ������ ���� �޽����� ���
		}
	}
}