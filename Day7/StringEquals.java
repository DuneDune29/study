package Day7;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("abc");// ���ο� ��ä�� �����ϱ⶧���� false����
		//String str1 = "abc"; // �ּҰ� ���� ���ڿ��̱⿡ true����
		String str2 = new String("abc");
		//String str1 = "abc"; // 

		System.out.println(str1 == str2); // �� ��Ʈ�� �ν��Ͻ��� �ּ� ���� �ٸ�
		System.out.println(str1.equals(str2)); // String Ŭ������ equals �޼ҵ尡 ������ �� 

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println(i1 == i2); // �� ���� �ν��Ͻ��� �ּ� ���� �ٸ�
		System.out.println(i1.equals(i2)); // Integer Ŭ������ equals �޼ҵ尡 ������ ��
	}
}
// ==�� �ּұ��� ���ƾ� true. equals�� ������� ���ٰ� ������
// new �� ��ä�� ���� �����Ͽ� �ּҰ��� �ٸ�